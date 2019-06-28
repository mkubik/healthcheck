package org.mk.healthcheck.health;

import java.time.temporal.TemporalAmount;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data class HealthItem {
	private boolean state = true; 
	private TemporalAmount uptime;
}
