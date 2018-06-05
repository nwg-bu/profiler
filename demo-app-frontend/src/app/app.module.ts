import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

// imports
import { AppRoutingModule } from './app.routing'
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { HttpModule } from '@angular/http';

// declarations
import { AllComponent } from './Components/all.component';
import { AppComponent  }    from './app.component';
import { HomeComponent }    from './Components/home.component';
import { ResultComponent }  from './Components/result.component';

// services
import { ModuleService } from './Services/module.service';

@NgModule({
  declarations: [
    AllComponent,
    AppComponent,
    HomeComponent,
    ResultComponent
  ],
  imports: [
    AppRoutingModule,
    BrowserModule,
    FormsModule,
    HttpClientModule,
    HttpModule,
    ReactiveFormsModule
  ],
  providers: [ModuleService],
  bootstrap: [AppComponent]
})
export class AppModule { }
