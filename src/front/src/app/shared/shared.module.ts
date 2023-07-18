import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MaterialModule } from './material/material.module';
import { LoginheaderComponent } from './components/loginheader/loginheader.component';
import { FooterComponent } from './components/footer/footer.component';
import { LogoComponent } from './components/logo/logo.component';



@NgModule({
  declarations: [
    LoginheaderComponent,
    FooterComponent,
    LogoComponent,
  ],
  imports: [
    CommonModule,
    MaterialModule
  ],
  exports: [
    LoginheaderComponent,
    FooterComponent,
    LogoComponent
  ]
})
export class SharedModule { }
