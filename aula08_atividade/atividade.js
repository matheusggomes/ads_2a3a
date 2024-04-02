class Pessoa{
    constructor(pNome, pEndereco){
        this.Nome = pNome;
        this.Endereco = pEndereco;
    }

    get Nome(){return this.nome;}
    set Nome(pNome){this.nome = pNome;}

    get Endereco(){return this.endereco;}
    set Endereco(pEndereco){this.endereco = pEndereco;}

    imprimir(){
        return "\nNome: " + this.nome 
                + "\nEndereço: " + this.endereco;
    }
}

class Juridica extends Pessoa{
    constructor(pNome, pEndereco, pCnpj, pRazaoSocial){
        super(pNome, pEndereco);
        
        this.Cnpj = pCnpj;
        this.RazaoSocial = pRazaoSocial;
    }

    get Cnpj(){return this.cnpj;}
    set Cnpj(pCnpj){this.cnpj = pCnpj;}

    get RazaoSocial(){return this.razaosocial;}
    set RazaoSocial(pRazaoSocial){this.razaosocial = pRazaoSocial;}

    imprimir(){
        return super.imprimir() 
                + "\nCNPJ: " + this.cnpj
                + "\nRazão Social: " + this.razaosocial; 
    }
}

class Fisica extends Pessoa{
    constructor(pNome, pEndereco, pCpf, pDtNascimento){
        super(pNome, pEndereco);

        this.Cpf = pCpf;
        this.DtNascimento = pDtNascimento;
    }

    get Cpf(){return this.cpf;}
    set Cpf(pCpf){this.cpf = pCpf;}

    get DtNascimento(){return this.DtNascimento;}
    set DtNascimento(pDtNascimento){this.dtnascimento = pDtNascimento;}

    imprimir(){
        return super.imprimir() 
                + "\nCPF: " + this.cpf
                + "\nData de Nascimento: " + this.dtnascimento;
    }
}

console.log("------------------")

var pessoaJuridica = new Juridica("A Soluções", "Avenida Mario Silva, 1900", "56.835.367/0001-90", "A Soluções LTDA");
console.log("Pessoa Jurídica\n" + pessoaJuridica.imprimir());

console.log("------------------")

var pessoaFisica = new Fisica("Cleber", "Rua Souza Viana, 35", "259.785.123-60", "18/02/1980");
console.log("Pessoa Física\n" + pessoaFisica.imprimir());