import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatIconModule } from '@angular/material/icon';
import { MatInputModule } from '@angular/material/input';
import { MatToolbarModule } from '@angular/material/toolbar';



@NgModule({
  declarations: [
  ],
  imports: [
    CommonModule
  ],
  exports:[
    MatInputModule,
    MatToolbarModule,
    MatIconModule
  ]
})
export class MaterialModule { }
