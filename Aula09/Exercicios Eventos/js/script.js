function boasVindas(){
    alert('Olá!!')
}

function alterar(){

    (document.body.getAttribute("class") == "") 
        ? document.body.setAttribute("class", "style")
        : document.body.setAttribute("class", "");
}

// function passarMouse(){
//     alert("Estou vendo a imagem!")
// }

var img = document.querySelector("#img2");
        img.addEventListener('click', function(e){
        console.log('estou clicando na imagem');
        var x = e.clientX;
        var y = e.clientY;
        var posicao = "Posição X : " + x + ", Posição Y: " + y;
        console.log(posicao);
    });

// var corpo = document.querySelector("body");
//     corpo.addEventListener('click', function(e){
//         this.style.backgroundColor = 'red'
//     });

// setTimeout(function(){
//     alert("Tempo Esgotado")},10000);

// setInterval(() => {
//     alert('Hora do Intervalo')
// },5000);