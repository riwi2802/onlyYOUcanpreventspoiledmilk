package org.launchcode.spoiledmilk.data;

import org.launchcode.spoiledmilk.models.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Integer> {
}
