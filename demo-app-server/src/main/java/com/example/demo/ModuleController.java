package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class ModuleController {
	
	@Autowired
	private ModuleService moduleService;
	
	
	@GetMapping(path="all")
	public List<Module> findAll(){
		return moduleService.findAll();
	}
	
	@PostMapping
	public Module create(@RequestBody Module module) {
		return moduleService.create(module);
	}
	
	@GetMapping(path = {"/{idNum}"})
	public Module findByIdNum(@PathVariable("idNum") int idNum) {
		return moduleService.findByIdNum(idNum);
	}
	
	@PutMapping
	public Module update(@RequestBody Module module) {
		return moduleService.update(module);
	}
	
	@DeleteMapping(path = {"/{idNum}"})
	public Module delete(@PathVariable("idNum") int idNum) { 
		return moduleService.delete(idNum);
	}
	
//	public @ResponseBody List<Module> getAllModules() {
//		return moduleService.findAll();
//	}
	
//	@RequestMapping("/create")
//	@ResponseBody
//	public String create( String course, int partNum, String partTitle, int moduleNum, String description) {
//		String s = "";
//		try {
//			Module module = new Module( course, partNum, partTitle, moduleNum, description);
//			moduleService.save(module);
//			s = "idNum: " + String.valueOf(module.getIdNum()) + " ... ";
//			s += "course: " + module.getCourse() + " ... ";
//			s += "partTitle: " + module.getPartTitle() + " ... ";
//			s += "description: " + module.getDescription();
//			
//		} catch (Exception e) {
//			return "Error creating the module: " + e.toString();
//		}
//		return "Module successfully created with following info: " + s;
//	}
	
	
//	@RequestMapping("/get-by-idnum")
//	@ResponseBody
//	public String findByIdNum(int idNum) {
//		String m = "Course: ";
//		try {
//			Module module = moduleService.findByIdNum(idNum);
//			m += module.getCourse() + " ... ";
//			m += "Part Title: " + module.getPartTitle() + " ... ";
//			m += "Description: " + module.getDescription();
//		}
//		catch (Exception ex) {
//			return "Error: idNum not found";
//		}
//		return m;
//	}
}
