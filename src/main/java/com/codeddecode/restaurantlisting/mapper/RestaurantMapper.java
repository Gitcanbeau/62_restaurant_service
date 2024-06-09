package com.codeddecode.restaurantlisting.mapper;


import com.codeddecode.restaurantlisting.dto.RestaurantDTO;
import com.codeddecode.restaurantlisting.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantMapper {

    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);
//    this is how you're going to create an instance of the same interface
//     and using this instance, you're going to
//     call all the methods which we're going to write in this interface, which is the abstarct method
//    implementation of this interface will be created automatically by Spring Boot
//    which will be having all the setters/getters/mapping between the entity to DTOdata and DTOdata to entity
    Restaurant mapRestaurantDTOToRestaurant(RestaurantDTO restaurantDTO);

    RestaurantDTO mapRestaurantToRestaurantDTO(Restaurant restaurant);

}
