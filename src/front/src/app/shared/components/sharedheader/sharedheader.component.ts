import { Component } from'@angular/core';

@Component({
  selector: 'app-shadedheader',
  templateUrl: './sharedheader.component.html',
  styleUrls: ['./sharedheader.component.scss']
})

export class SharedheaderComponent {
  mostrar: Boolean = false;
    mensaje: String = 'Hola, me estas leyendo';
    mensaje_enlace: String = 'Mostrar';

    mostrarOcultar() {

        if (this.mostrar) {
            this.mostrar = false;
            this.mensaje_enlace = 'Mostrar';
        }else {
            this.mostrar = true;
            this.mensaje_enlace = 'Ocultar';
        }
    }
 
}








