import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MaterialModule } from './material/material.module';
import { LoginheaderComponent } from './components/loginheader/loginheader.component';
import { FooterComponent } from './components/footer/footer.component';
import { LogoComponent } from './components/logo/logo.component';
import { SharedheaderComponent } from './components/sharedheader/sharedheader.component';


@NgModule({
  declarations: [
    LoginheaderComponent,
    FooterComponent,
    LogoComponent,

  ],

    SharedheaderComponent
   ],

  imports: [
    CommonModule,
    MaterialModule
  ],
  exports: [
    LoginheaderComponent,
    FooterComponent,
    LogoComponent,
    SharedheaderComponent
   
  
  ],
})
export class SharedModule { }
