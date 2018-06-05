import { Component } from '@angular/core';
import { FormGroup, FormBuilder } from '@angular/forms';

@Component({
  selector: 'home',
  templateUrl: './home.component.html',
  styleUrls: ['./../app.component.css']
})
export class HomeComponent {
  
  searchForm: FormGroup;
  searchBar1: string;

  testMessage: string;

  constructor(private fb: FormBuilder) {}

  onClick() {
    this.testMessage = this.searchBar1;
  }
}
