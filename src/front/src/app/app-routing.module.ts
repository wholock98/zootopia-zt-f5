import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditAnimalViewComponent } from './views/edit-animal-view/edit-animal-view.component';

import { LoginheaderComponent } from './shared/components/loginheader/loginheader.component';

const routes: Routes = [
  {
    path: '',
    component: LoginheaderComponent
  },
  { path: 'animals/edit', component: EditAnimalViewComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
