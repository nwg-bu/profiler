import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Http, HttpModule } from '@angular/http';

import { Module } from '../Models/module.model';

const httpOptions = {
	headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class ModuleService {
	constructor(private http: HttpClient) {}

	private moduleUrl = '/api';

	public getModules() {
		return this.http.get<Module[]>(this.moduleUrl + "/all");
	}
}