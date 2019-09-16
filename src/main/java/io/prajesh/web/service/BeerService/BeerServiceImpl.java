package io.prajesh.web.service.BeerService;

import io.prajesh.web.model.BeerDto;

import java.util.UUID;

/**
 * @author Prajesh Ananthan
 * Created on 16/9/2019.
 */
public class BeerServiceImpl implements BeerService {
  @Override
  public BeerDto getBeerById(UUID beerId) {
    return new BeerDto(); // TODO: Fix builder
  }
}
