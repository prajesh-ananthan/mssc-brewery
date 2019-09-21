package io.prajesh.web.controller;

import io.prajesh.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author Prajesh Ananthan Created on 16/9/2019.
 */

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

  @GetMapping("/{beerId}")
  public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {

    // TODO
    return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
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
