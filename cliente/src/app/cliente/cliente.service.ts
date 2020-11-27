import { ClienteModel, EstadoModel } from './model/cliente-model';
import { ClienteRepository } from './repository/cliente-repository';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  estados: any[] = [];

  constructor(private repository: ClienteRepository) { }

  getAllEstados() {    
    this.repository.getAllEstados().toPromise().then(resposta => {
      this.estados.push({ label: resposta.nome, value: resposta.id });
    });  
  }

}
