package ru.leroymerlin.tech;

import io.gatling.app.Gatling;
import io.gatling.core.config.GatlingPropertiesBuilder;
import ru.leroymerlin.tech.simulations.TestSimulation;

public class GatlingRunner {
    public static void main(String[] args) {
        GatlingPropertiesBuilder propertiesBuilder = new GatlingPropertiesBuilder();
        propertiesBuilder.simulationClass(TestSimulation.class.getName());
        Gatling.fromMap(propertiesBuilder.build());
    }
}



