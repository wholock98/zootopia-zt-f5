package f5.ztf5.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import f5.ztf5.models.Familia;
import f5.ztf5.repositories.FamiliaRepository;

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
