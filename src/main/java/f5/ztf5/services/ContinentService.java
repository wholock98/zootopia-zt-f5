package f5.ztf5.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import f5.ztf5.models.Continent;
import f5.ztf5.repositories.ContinentRepository;

@Service
public class ContinentService {
    
    @Autowired
    ContinentRepository continentRepository;

    public List<Continent> getAllContinents(){
        return (List<Continent>) continentRepository.findAll();
    }

    public void getContinentById(Long id){
        continentRepository.findById(id);
    }

}
