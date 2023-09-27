import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatInputModule } from '@angular/material/input';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatIconModule } from '@angular/material/icon';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { EditAnimalViewComponent } from './views/edit-animal-view/edit-animal-view.component';
import { LoginformComponent } from './components/loginform/loginform.component';
import { EditarAnimalComponent } from "./editar-animal/editar-animal.component";
import { SharedModule } from "./shared/shared.module";


@NgModule({
    declarations: [
        AppComponent,
        EditAnimalViewComponent,
        LoginformComponent,
    ],
    providers: [],
    bootstrap: [AppComponent],
    imports: [
        BrowserModule,
        AppRoutingModule,
        BrowserAnimationsModule,
        MatInputModule,
        MatToolbarModule,
        MatIconModule,
        MatFormFieldModule,
        MatDatepickerModule,
        EditarAnimalComponent,
        SharedModule,
    ]
})
export class AppModule { }
