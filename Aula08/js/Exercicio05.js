/****Exercicio 05****/

const felizPromiseAsync = new Promise((resolve) => {
    for(let i = 10; i >= 0; i--)
    resolve(console.log(i));
})

const callPromiseAsync = new Promise((resolve) => {
    setTimeout( function(){
        resolve(' Feliz Ano Novo!!!');
      }, 2000 )
})



const asyncFunction = async () => {
    try{
        await felizPromiseAsync;
        console.log( await callPromiseAsync);
    }
    catch(err){
        console.log(err);
    }
}

asyncFunction();