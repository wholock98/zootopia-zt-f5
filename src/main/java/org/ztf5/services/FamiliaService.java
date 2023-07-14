package org.ztf5.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ztf5.models.Familia;
import org.ztf5.repositories.FamiliaRepository;

@Service
public class FamiliaService {
    
    @Autowired
    FamiliaRepository familiaRepository;

    public List<Familia> getAllFamilies(){
        return (List<Familia>) familiaRepository.findAll();
    }

    public void getFamilyById(Long id){
        familiaRepository.findById(id);
    }

}
