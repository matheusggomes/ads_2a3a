class Conta{ //classe mãe
    constructor(){
        this.saldo = 0;
    }

    get Saldo(){return this.saldo;}
    set Saldo(pSaldo){this.saldo = pSaldo;}
}

class Corrente extends Conta { //classe filha
    constructor(pLimite){
        super();
        this.Limite = pLimite;
    }
    get Limite(){return this.limite;}
    set Limite(pLimite){this.limite = pLimite;}
}

var obj_cc = new Corrente(1000);
obj_cc.saldo = 500; // utiliza o metodo saldo da classe mãe
console.log(obj_cc);