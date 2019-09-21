package io.prajesh.web.services;

import io.prajesh.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Prajesh Ananthan Created on 16/9/2019.
 */

@Service
public class BeerServiceImpl implements BeerService {

  public BeerDto getBeerById(UUID beerId) {
    return BeerDto.builder()
        .id(UUID.randomUUID())
        .build();
  }
}
