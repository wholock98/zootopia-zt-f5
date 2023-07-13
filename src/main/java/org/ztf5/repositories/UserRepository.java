package org.ztf5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ztf5.models.User;

public interface UserRepository extends JpaRepository<User,Long>{}
