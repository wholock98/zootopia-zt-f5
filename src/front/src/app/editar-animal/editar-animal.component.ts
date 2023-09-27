import { Component } from '@angular/core';
import { MatNativeDateModule } from '@angular/material/core';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import {MatSelectModule} from '@angular/material/select';

@Component({
  selector: 'app-editar-animal',
  templateUrl: './editar-animal.component.html',
  styleUrls: ['./editar-animal.component.scss'],
  standalone: true,
  imports : [MatFormFieldModule, MatInputModule, MatDatepickerModule, MatNativeDateModule, MatSelectModule] ,
})
export class EditarAnimalComponent {
name: any;
continents: string[] = ['Asia', 'Europa', 'Africa', 'America del Norte', 'America del Sur', 'Oceania', 'Antartida'];


}

