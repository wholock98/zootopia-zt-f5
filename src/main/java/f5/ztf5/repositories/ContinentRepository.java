package f5.ztf5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import f5.ztf5.models.Continent;

public interface ContinentRepository extends JpaRepository<Continent, Long>{
    
}
