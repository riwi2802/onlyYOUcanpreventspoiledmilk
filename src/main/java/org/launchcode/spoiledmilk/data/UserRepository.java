package org.launchcode.spoiledmilk.data;

import org.launchcode.spoiledmilk.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);
}
