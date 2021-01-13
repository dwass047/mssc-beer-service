package com.pathak.bimal.msscbeerservice.web.mappers;

import com.pathak.bimal.msscbeerservice.domain.Beer;
import com.pathak.bimal.msscbeerservice.web.model.BeerDto;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
@DecoratedWith(BeerMapperDecorator.class)
public interface BeerMapper {
    BeerDto beerToBeerDto (Beer beer);

    Beer beerDtoToBeer(BeerDto dto);


}
