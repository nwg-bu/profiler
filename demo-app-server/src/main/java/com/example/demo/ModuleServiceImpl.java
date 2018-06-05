package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ModuleServiceImpl implements ModuleService{
	
	@Autowired
	private ModuleRepository repo;
	
	@Override
	public Module create(Module module) {
		return repo.save(module);
	}
	
	@Override
	public Module delete(int idNum) {
		Module module = findByIdNum(idNum);
		if(module != null) {
			repo.delete(module);
		}
		return module;
	}
	
	@Override
	public Module update(Module module) {
		return null;
	}
	
	@Override
	public Module findByIdNum(int idNum) {
		return repo.findByIdNum(idNum);
	}
	
	@Override
	public List<Module>findAll() {
		return repo.findAll();
	}
}
