package org.mk.healthcheck.health;


import java.time.Duration;
import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
	static LocalDateTime startTime = LocalDateTime.now();
	
	@RequestMapping("/health")
	public HealthItem health() {
		return new HealthItem(true, Duration.between(startTime, LocalDateTime.now()));
	}

}
