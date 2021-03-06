/*
Copyright 2018 Expedia Group, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package com.homeaway.dropwizard.bundle.resilience4j.configuration;

import java.util.List;

import javax.annotation.Nullable;
import javax.validation.Valid;

import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;

/**
 * Resilience4j configuration
 */
public class Resilience4jConfiguration {

    /**
     * Describes configuration for Circuit Breaker
     */
    @Nullable
    @Valid
    private List<CircuitBreakerConfiguration> circuitBreakers;

    public CircuitBreakerRegistry circuitBreakerRegistry;

    @Nullable
    public List<CircuitBreakerConfiguration> getCircuitBreakers() {
        return circuitBreakers;
    }

    public void setCircuitBreakers(@Nullable List<CircuitBreakerConfiguration> circuitBreakers) {
        this.circuitBreakers = circuitBreakers;
    }

    public CircuitBreakerRegistry getCircuitBreakerRegistry() {
        return circuitBreakerRegistry;
    }

    public void setCircuitBreakerRegistry(CircuitBreakerRegistry circuitBreakerRegistry) {
        this.circuitBreakerRegistry = circuitBreakerRegistry;
    }
}
