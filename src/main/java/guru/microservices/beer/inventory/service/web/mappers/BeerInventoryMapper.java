package guru.microservices.beer.inventory.service.web.mappers;

import guru.microservices.beer.inventory.service.domain.BeerInventory;
import guru.microservices.beer.inventory.service.web.model.BeerInventoryDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
