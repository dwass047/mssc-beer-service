package com.pathak.bimal.msscbeerservice.bootstrap;

import com.pathak.bimal.msscbeerservice.domain.Beer;
import com.pathak.bimal.msscbeerservice.repositiories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if(beerRepository.count()==0){
            beerRepository.save(Beer.builder()
                    .beerName("Mango Bobs")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .upc(337018383831L)
                    .price(new BigDecimal("12.95"))
                    .minOnHand(12)
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Galaxy Cat")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(200)
                    .upc(337018383832L)
                    .price(new BigDecimal("11.95"))
                    .minOnHand(12)
                    .build());
        }
    }
}
