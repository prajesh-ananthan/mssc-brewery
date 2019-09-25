package io.prajesh.web.controller;

import io.prajesh.web.model.BeerDto;
import io.prajesh.web.services.BeerService;

import java.util.UUID;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

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
  public ResponseEntity handlePost(@RequestBody BeerDto beerDto) {
    BeerDto savedBeer = beerService.saveNewBeer(beerDto);
    HttpHeaders httpHeaders = new HttpHeaders();
    httpHeaders.add("Location", "/api/v1/beer/" + savedBeer.getId().toString());

    return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
  }

  @PutMapping
  public ResponseEntity<BeerDto> handlePut(@PathVariable("beerId") UUID beerId,
      @RequestBody BeerDto beerDto) {

    beerService.updateBeer(beerId, beerDto);

    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

  @DeleteMapping("{beerId}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deleteBeer(@PathVariable("beerId") UUID beerId) {
    beerService.deleteBeerById(beerId);
  }
}
