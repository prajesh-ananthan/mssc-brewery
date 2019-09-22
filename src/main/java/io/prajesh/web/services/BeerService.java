package io.prajesh.web.services;

import io.prajesh.web.model.BeerDto;
import java.util.UUID;

/**
 * @author Prajesh Ananthan Created on 16/9/2019.
 */

public interface BeerService {

  BeerDto getBeerById(UUID beerId);
  BeerDto saveNewBeer(BeerDto beerDto);
  BeerDto updateBeer(UUID uuid, BeerDto beerDto);

}
