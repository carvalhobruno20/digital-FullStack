/****Exercicio 03****/
function anoNovo(callback){
    setTimeout( function(){
      for(let i = 10; i > 0; i--){
        console.log(i);
      }  
      callback();
    }, 2000 );
  }
  
  function executar(){
    console.log(' Feliz Ano Novo!!!');
  } 
anoNovo(executar);