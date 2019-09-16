package io.prajesh.web.service.BeerService;

import io.prajesh.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Prajesh Ananthan
 * Created on 16/9/2019.
 */

public interface BeerService {
  public BeerDto getBeerById(UUID beerId);
}
