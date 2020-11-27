import { MessageService } from 'primeng/api';
import { TemplateModule } from './template/template.module';
import { SegurancaModule } from './seguranca/seguranca.module';
import { ClienteModule } from './cliente/cliente.module';
import { BrowserModule, Title } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import {ToastModule} from 'primeng/toast';
import {ConfirmDialogModule} from 'primeng/confirmdialog';
import {ConfirmationService} from 'primeng/api';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent
  ],  
  imports: [
    BrowserModule,
    AppRoutingModule,
    ClienteModule,
    SegurancaModule,
    TemplateModule,
    ToastModule,
    ConfirmDialogModule    
  ],
  providers: [
    MessageService,
    Title,
    ConfirmationService    
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
