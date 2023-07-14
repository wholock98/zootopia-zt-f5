package org.ztf5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ztf5.models.Animal;


public interface AnimalRepository extends JpaRepository<Animal, Long> {}
