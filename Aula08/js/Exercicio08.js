/****Exercicio 08****/
const alunos = [
    {
        nome:"Bruno",
        serie: 9
    },
    {
        nome:"Carla",
        serie: 9
    },
    {
        nome:"Patricia",
        serie: 9
    },
    {
        nome:"Pedro Henrique",
        serie: 8
    },
    {
        nome:"Julia",
        serie: 8
    },
    {
        nome:"Jessica",
        serie: 8
    }
]

let inserirAlunos = alunos.map(inserirAlunos => {
        return inserirAlunos.serie == 8 ? inserirAlunos.nome + ": " +inserirAlunos.serie+" terão Aula de Historia" :
                                          inserirAlunos.nome + ": " +inserirAlunos.serie+" terão Aula de Fisica"
})
console.log(inserirAlunos)
