import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Module } from '../Models/module.model';
import { ModuleService } from '../Services/module.service';


@Component({
  selector: 'all',
  templateUrl: './all.component.html',
  styleUrls: ['./../app.component.css']
})


export class AllComponent implements OnInit {
  
  modules: Module[];
  
  constructor(private router: Router, private moduleService: ModuleService) {}

  ngOnInit() {
    this.moduleService.getModules()
      .subscribe( data => { this.modules = data;
      });
  };
  
}
