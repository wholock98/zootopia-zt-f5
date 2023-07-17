import { Component } from '@angular/core';

@Component({
  selector: 'app-editar-animal',
  templateUrl: './editar-animal.component.html',
  styleUrls: ['./editar-animal.component.scss']
})
export class EditarAnimalComponent {
name: any;
continente= ['Asia', 'Europa', 'Africa', 'America del Norte', 'America del Sur', 'Oceania', 'Antartida']
}
