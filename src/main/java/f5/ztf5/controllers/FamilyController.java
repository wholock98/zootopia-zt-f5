package f5.ztf5.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import f5.ztf5.models.Familia;
import f5.ztf5.services.FamiliaService;

@RestController
// @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/familias")
public class FamilyController {

    @Autowired
    private FamiliaService familiaService;

    @GetMapping
    public List<Familia> getFamilias() {
        return familiaService.getAllFamilies();
    }

    @GetMapping(path = "/{id}")
    public void getFamilyById(@PathVariable("id") Long id) {
        familiaService.getFamilyById(id);
    }

}
