const express = require('express');

//rotas (quando o servidor for acessado, pra onde ele vai???)
const router = express.Router();
router.get('/', (req,res)=>{
    //res.send('Olá turma de ADS!!!')
    let nome = req.query.nome;
    let idade = req.query.idade;
    res.send('Olá ' + nome + ', você tem ' + idade + " anos de idade");
});

router.get('/sobre', (req,res)=>{
    res.send('Página sobre do projeto')
});

module.exports = router;