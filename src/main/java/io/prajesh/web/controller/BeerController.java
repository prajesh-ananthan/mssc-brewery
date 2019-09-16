package io.prajesh.web.controller;

import io.prajesh.web.model.BeerDto;
import io.prajesh.web.service.BeerService.BeerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Prajesh Ananthan
 * Created on 16/9/2019.
 */

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

  private BeerService beerService;

  public void setBeerService(BeerService beerService) {
    this.beerService = beerService;
  }

  @GetMapping("/{beerId}")
  public ResponseEntity<BeerDto> getBeer(@PathVariable UUID beerId) {
    return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
  }
}
