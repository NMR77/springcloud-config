package com.myapp.food.delivery.orderservice.service;

import io.eventuate.tram.events.publisher.TramEventsPublisherConfiguration;
import io.eventuate.tram.sagas.participant.SagaCommandDispatcher;
import io.eventuate.tram.sagas.participant.SagaParticipantConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.myapp.food.delivery.common.CommonConfiguration;

@Configuration
@Import({SagaParticipantConfiguration.class, TramEventsPublisherConfiguration.class, CommonConfiguration.class})
public class OrderCommandHandlersConfiguration {

  @Bean
  public OrderCommandHandlers orderCommandHandlers() {
    return new OrderCommandHandlers();
  }

  @Bean
  public SagaCommandDispatcher orderCommandHandlersDispatcher(OrderCommandHandlers orderCommandHandlers) {
    return new SagaCommandDispatcher("orderService", orderCommandHandlers.commandHandlers());
  }

}
