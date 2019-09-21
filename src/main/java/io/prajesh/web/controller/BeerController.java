package io.prajesh.web.controller;

import io.prajesh.web.model.BeerDto;
import io.prajesh.web.services.BeerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author Prajesh Ananthan Created on 16/9/2019.
 */

@Slf4j
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

  @Autowired
  private BeerService beerService;

  @GetMapping("/{beerId}")
  public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {
    log.debug(">>> Request UUID : " + beerId.toString());
    return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<BeerDto> saveNewBeer(@RequestBody BeerDto beerDto) {

    // TODO
    return new ResponseEntity<>(HttpStatus.CREATED);
  }

  @PutMapping
  public ResponseEntity<BeerDto> updateBeerById(@PathVariable("beerId") UUID beerId,
                                                @RequestBody BeerDto beerDto) {

    // todo impl
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}
