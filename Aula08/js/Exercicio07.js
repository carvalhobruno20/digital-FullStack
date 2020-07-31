/****Exercicio 07****/

let obj = [
    {
        nome: "cerveja",
        preco: 10
    },
    {
        nome: "Picanha",
        preco: 25
    },
    {
        nome: "Pizza",
        preco: 15
    }
]

let resultado = obj.reduce(function(soma, valor) {
    return soma + valor.preco;
},0);
console.log("A Soma Total dos Produtos é " +"R$"+resultado );
