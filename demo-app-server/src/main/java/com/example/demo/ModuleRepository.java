package com.example.demo;

import java.util.List;
import org.springframework.data.repository.Repository;


public interface ModuleRepository extends Repository<Module, Integer> {

    void delete(Module module);

    List<Module> findAll();

    Module findByIdNum(int idNum);

    Module save(Module module);
}
