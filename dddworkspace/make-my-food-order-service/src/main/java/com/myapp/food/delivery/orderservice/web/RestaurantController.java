package com.myapp.food.delivery.orderservice.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.food.delivery.orderservice.domain.Restaurant;
import com.myapp.food.delivery.orderservice.domain.RestaurantRepository;

@RestController
@RequestMapping(path = "/restaurants")
public class RestaurantController {

  @Autowired
  private RestaurantRepository restaurantRepository;

  @RequestMapping(path="/{restaurantId}", method= RequestMethod.GET)
  public ResponseEntity<GetRestaurantResponse> getRestaurant(@PathVariable long restaurantId) {
    return null;
}
}