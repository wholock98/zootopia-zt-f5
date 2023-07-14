package org.ztf5.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.ztf5.models.Familia;

public interface FamiliaRepository extends  JpaRepository<Familia, Long>{
    
}
