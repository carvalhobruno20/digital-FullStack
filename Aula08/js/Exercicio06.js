/****Exercicio 06****/

let array =[5.3, 4.7, 8.5, 7.1, 6.4, 9.2, 9.8, 5.5, 7.4, 7.0];
let nota = array.filter(function(numero) {
    return (numero >= 7);
});
console.log(nota)