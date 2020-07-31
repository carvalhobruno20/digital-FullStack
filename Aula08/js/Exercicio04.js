/****Exercicio 04****/

const callPromise = new Promise((resolve) => {
    setTimeout( function(){
        resolve(' Feliz Ano Novo!!!');
      }, 2000 )
})

const felizPromise = new Promise((resolve) => {
    for(let i = 10; i >= 0; i--)
    resolve(console.log(i));
})


.then(function() {return callPromise})
    
.then(function(res) {return console.log(res)});