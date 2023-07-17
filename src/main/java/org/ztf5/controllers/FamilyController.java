package org.ztf5.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ztf5.models.Familia;
import org.ztf5.services.FamiliaService;

@RestController
// @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/Familia")
public class FamilyController {
    
    @Autowired
    private FamiliaService familiaService;

    @GetMapping("/familias")
    public List<Familia> getFamilias(){
        return familiaService.getAllFamilies();
    }
    @GetMapping("/familias/{id}")
    public void getFamilyById(@PathVariable("id") Long id){
        familiaService.getFamilyById(id);
    }


}
