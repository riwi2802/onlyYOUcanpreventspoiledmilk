package org.launchcode.spoiledmilk.data;

import org.launchcode.spoiledmilk.models.Store;
import org.springframework.data.repository.CrudRepository;

public interface StoreRepository extends CrudRepository <Store, Integer> {
}
