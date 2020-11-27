import { ClienteComponent } from './../cliente/cliente-form/cliente.component';
import { FileUploadModule } from 'primeng/fileupload';
import { InputMaskModule } from 'primeng/inputmask';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { DropdownModule } from 'primeng/dropdown';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TableModule } from 'primeng/table';

import { ClienteRoutingModule } from './cliente-routing.module';
import { ClienteTableComponent } from './cliente-table/cliente-table.component';
import { ButtonModule } from 'primeng/button';
import { InputTextModule } from 'primeng/inputtext';


@NgModule({
  declarations: [
    ClienteComponent,
    ClienteTableComponent
  ],
  exports:[
    ClienteComponent
  ],
  imports: [
    CommonModule,
    ClienteRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    DropdownModule,
    BrowserAnimationsModule,
    InputMaskModule,
    FileUploadModule,
    TableModule, 
    ButtonModule, 
    InputTextModule
  ],
  providers: [
    
  ],
})
export class ClienteModule { }
