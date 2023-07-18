package f5.ztf5.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import f5.ztf5.models.Continent;
import f5.ztf5.services.ContinentService;

@RestController
@RequestMapping("/continentes")
public class ContinentController {
    
    @Autowired
    ContinentService continentService;

    @GetMapping
    public List<Continent> getContinents(){
        return continentService.getAllContinents();
    }

    @GetMapping(path="/{id}")
    public void getContinentById(@PathVariable("id") Long id){
        continentService.getContinentById(id);
    }

}
