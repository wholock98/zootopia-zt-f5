package org.ztf5.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.ztf5.models.Animal;

@Repository
public interface AnimalRepository extends CrudRepository<Animal, Long> {}
