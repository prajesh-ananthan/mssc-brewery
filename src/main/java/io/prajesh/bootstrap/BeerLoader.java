package io.prajesh.bootstrap;

import io.prajesh.domain.Beer;
import io.prajesh.repositories.BeerRepository;
import io.prajesh.web.enums.BeerStyleEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author Prajesh Ananthan
 * Created on 26/9/2019.
 */

@Component
public class BeerLoader implements CommandLineRunner {

  @Autowired
  private BeerRepository beerRepository;

  @Override
  public void run(String... args) throws Exception {
    loadBeerObjects();


  }

  private void loadBeerObjects() {
    if (beerRepository.count() == 0) {

      Beer b1 = Beer.builder()
          .beerName("Mango Bobs")
          .beerStyle(BeerStyleEnum.IPA.name())
          .minOnHand(12)
          .price(new BigDecimal("12.95"))
          .upc(5344584738L)
          .build();

      Beer b2 = Beer.builder()
          .beerName("Galaxy Cat")
          .beerStyle(BeerStyleEnum.PALE_ALE.name())
          .minOnHand(12)
          .price(new BigDecimal("12.95"))
          .upc(5344584538L)
          .build();

      Beer b3 = Beer.builder()
          .beerName("Pinball Porter")
          .beerStyle(BeerStyleEnum.PALE_ALE.name())
          .minOnHand(12)
          .price(new BigDecimal("12.95"))
          .upc(5344589738L)
          .build();

      beerRepository.save(b1);
      beerRepository.save(b2);
      beerRepository.save(b3);


      System.out.println("Loaded beers => " + beerRepository.count());

    }
  }
}
