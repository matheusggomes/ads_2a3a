/* IMC = peso / (altura * altura)
abaixo de 18.5 = Desnutrição
entre 18.5 e 25 = Peso normal
entre 25 e 30 = Sobrepeso
entre 30 e 35 = Obesidade I
entre 35 e 40 = Obesidade II
acima de 40 = Obesidade III
*/
let retorno_imc = calcularIMC(100, 1.80)
console.log(retorno_imc)
classificarIMC(retorno_imc)

function calcularIMC(argPeso, argAltura){
    let imc 
    imc = argPeso / (argAltura ** 2)
    //console.log(imc)
    return imc
}

function classificarIMC(argIMC){
    if (argIMC < 18.5) {
        console.log('Desnutrição')
    }
    else if (argIMC < 25) {
        console.log('Peso normal')
    }
    else if (argIMC < 30) {
        console.log('Sobrepeso')
    }
    else if (argIMC < 35) {
        console.log('Obesidade I')
    }
    else if (argIMC < 40) {
        console.log('Obesidade II')
    }
    else {
        console.log('Obesidade III')
    }
}