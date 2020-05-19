package com.redhat.coolstore.cart.rest;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.HealthEndpoint;
import org.springframework.boot.actuate.health.Health;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HealthCheckEndpoint {
	@Autowired
	   private HealthEndpoint health;
	 @GetMapping("/health")
	   public Health getHealth() {
	      return health.invoke();}
	 
	 
}
