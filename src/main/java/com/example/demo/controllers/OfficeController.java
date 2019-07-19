package com.example.demo.controllers;

import com.example.demo.entitys.Employees;
import com.example.demo.entitys.Office;
import com.example.demo.repositories.EmployeesRepository;
import com.example.demo.repositories.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping(path="/office")
public class OfficeController {


    public class OfficeControler {
        @Autowired
        private OfficeRepository officeRepository;

        public OfficeControler() {
        }

        @PostMapping("add/{id}")
        @ResponseBody
        public Office create(@PathVariable(name = "id") Long id,
                             @RequestParam(name = "city") String city,
                             @RequestParam(name = "adress") String adress){
            return officeRepository.save(new Office(id,city,adress));
        }


        @PatchMapping("update/{id}")
        @ResponseBody
        public Office update(@PathVariable(name = "id") Long id,
                             @RequestParam(name = "city") String city,
                             @RequestParam(name = "adress") String adress){
            return officeRepository.save(new Office(id,city,adress));
        }

        @DeleteMapping("/delete/{id}")
        @ResponseBody
        public void delete(@PathVariable(name="id") Long id) {
            officeRepository.deleteById(id);
        }
    }

}
