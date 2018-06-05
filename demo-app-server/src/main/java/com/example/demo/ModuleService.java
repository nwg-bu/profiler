package com.example.demo;

import java.util.List;

//import javax.transaction.Transactional;
//import org.springframework.data.repository.CrudRepository;


//This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
//CRUD refers Create, Read, Update, Delete

//@Transactional
//public interface ModuleService extends CrudRepository<Module, Integer> {
//
//	public Module findByIdNum(int idNum);
//	
//	public List<Module> findAll();
//	
//}

public interface ModuleService {
	
	List<Module> findAll();
	
	Module findByIdNum(int idNum);
	
	Module create(Module module);
	
	Module delete(int idNum);
	
	Module update(Module module);
}