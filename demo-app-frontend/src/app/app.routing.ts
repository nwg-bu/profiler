// import { ModuleWithProviders  } from '@angular/core';
import { NgModule } 			from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } 		from './Components/home.component';
import { ResultComponent }		from './Components/result.component';
import { AllComponent }			from './Components/all.component';

const appRoutes: Routes = [
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full'
  },
  {
    path: 'home',
    component: HomeComponent
  },
  {
	  path: 'result',
	  component: ResultComponent
  },
  {
	  path: 'all',
	  component: AllComponent
  }
];

@NgModule({
	imports: [ RouterModule.forRoot(appRoutes) ],
	exports: [ RouterModule ]
})

export class AppRoutingModule {}
// export const routing: ModuleWithProviders = RouterModule.forRoot(appRoutes);
