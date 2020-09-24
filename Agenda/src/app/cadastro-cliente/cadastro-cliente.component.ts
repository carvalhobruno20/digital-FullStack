import { Estado } from './estado';
import { ClienteService } from './../cliente.service';
import { Component, OnInit } from '@angular/core';
import { SelectItem } from 'primeng/api/selectitem';

@Component({
  selector: 'app-cadastro-cliente',
  templateUrl: './cadastro-cliente.component.html',
  styleUrls: ['./cadastro-cliente.component.css']
})

export class CadastroClienteComponent implements OnInit {

  estados: Estado[];

  estadoSelecionado: Estado;  

  cliente = {id: '', nome: '', sobrenome: '', telefone: '', dataNasc: '', 
            cpf: '', rg: '', email: ''};

  constructor(private clienteService: ClienteService) { 
  
    
   }

  ngOnInit(): void {
    this.clienteService.listarEstados().subscribe(resposta =>
       this.estados = resposta as any);
  }

  adicionar() {
    console.log(this.cliente.dataNasc);
    this.clienteService.adicionar(this.cliente).subscribe(() => {
     
      this.cliente = {id: '', nome: '', sobrenome: '',telefone: '', dataNasc: '', 
      cpf: '', rg: '', email: ''};
      
      console.log("Dados inseridos com sucesso!");
    });
  }

}
