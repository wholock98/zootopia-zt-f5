package org.ztf5.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.ztf5.models.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{}
