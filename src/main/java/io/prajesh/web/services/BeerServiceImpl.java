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
                .beerName("Galaxy Cat")
                .beerStyle("Palo Ato")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public BeerDto updateBeer(UUID uuid, BeerDto beerDto) {
        return BeerDto.builder()
                .id(uuid).build();
    }
}
