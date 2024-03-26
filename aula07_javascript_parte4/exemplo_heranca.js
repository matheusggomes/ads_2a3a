class Conta{
    constructor(){
        this.saldo = 0;
    }

    get Saldo(){return this.saldo;}
    set Saldo(pSaldo){this.saldo = pSaldo;}
}

var obj_conta = new Conta();
console.log(obj_conta.saldo);