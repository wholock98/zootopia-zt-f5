package f5.ztf5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import f5.ztf5.models.Animal;


public interface AnimalRepository extends JpaRepository<Animal, Long> {}
