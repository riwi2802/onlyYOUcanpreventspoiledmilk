package org.launchcode.spoiledmilk.data;

import org.launchcode.spoiledmilk.models.PurchaseEntry;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseRepository extends CrudRepository <PurchaseEntry, Integer> {
}
