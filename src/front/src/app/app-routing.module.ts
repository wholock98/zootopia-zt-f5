import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginheaderComponent } from './shared/components/loginheader/loginheader.component';








const routes: Routes = [
  {
    path:'',
    component:LoginheaderComponent
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
