package com.example.demo.controllers;

import com.example.demo.entitys.Office;
import com.example.demo.repositories.TarifsRepository;
import com.example.demo.entitys.Tarifs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/tarifs")
public class TarifController {
    @Autowired
    private TarifsRepository tarifRepository;


    public TarifController() {
    }

    @GetMapping
    @ResponseBody
    public Iterable<Tarifs> show(){
        Iterable<Tarifs> tarifOptional = tarifRepository.findAll();
        return tarifOptional;
    }

    @PostMapping("add/{id}")
    @ResponseBody
    public Tarifs create(@PathVariable(name = "id") Long id,
                         @RequestParam(name = "percent") String percent,
                         @RequestParam(name = "term") int term,
                        @RequestParam(name = "minAmount") Long minAmount,
                        @RequestParam(name = "citizenship") int citizenship)
    {
        return tarifRepository.save(new Tarifs(id, Double.valueOf(percent),term,minAmount,citizenship));
    }


    @PatchMapping("update/{id}")
    @ResponseBody
    public Tarifs update(@PathVariable(name = "id") Long id,
                         @RequestParam(name = "percent") String percent,
                         @RequestParam(name = "term") int term,
                         @RequestParam(name = "minAmount") Long minAmount,
                         @RequestParam(name = "citizenship") int citizenship)
    {
        return tarifRepository.save(new Tarifs(id, Double.valueOf(percent),term,minAmount,citizenship));
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable(name="id") Long id) {
        tarifRepository.deleteById(id);
    }
}
