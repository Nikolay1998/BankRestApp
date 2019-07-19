package com.example.demo.controllers;

import com.example.demo.repositories.EmployeesRepository;
import com.example.demo.entitys.Employees;
import com.example.demo.repositories.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping(path="/employees")

public class EmployeesControler {
    @Autowired
    private EmployeesRepository emloyeesRepository;

    @Autowired
    private OfficeRepository officeRepository;
    public EmployeesControler() {
    }

    @GetMapping("/withLargeSalary")
    @ResponseBody
    public Iterable<Employees> show(){
        Iterable<Employees> employeesIterable = emloyeesRepository.findEmployeesWithLargeSalary();
        return employeesIterable;
    }

    @PostMapping("add/{id}")
    @ResponseBody
    public Employees create(@PathVariable(name = "id") Long id,
                         @RequestParam(required = false, name = "name") String name,
                         @RequestParam(required = false, name = "salary") String salary,
                         @RequestParam(required = false, name = "date") String date,
                         @RequestParam(required = false, name = "office_id") Long office_id){
        System.out.println(id + "" + name + " " + salary + "" + date + "" + office_id);
        return emloyeesRepository.save(new Employees(id,name, Double.valueOf(salary), date, office_id));
    }


    @PatchMapping("/update/{id}")
    @ResponseBody
    public Employees update(@PathVariable(name = "id") Long id,
                            @RequestParam(required = false, name = "name") String name,
                            @RequestParam(required = false, name = "salary") String salary,
                            @RequestParam(required = false, name = "date") String date,
                            @RequestParam(required = false, name = "office_id") Long office_id){
        System.out.println(id + "" + name + " " + salary + "" + date + "" + office_id);
        return emloyeesRepository.save(new Employees(id,name, Double.valueOf(salary), date, office_id));
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable(name="id") Long id) {
        emloyeesRepository.deleteById(id);
    }
}
