package ru.leroymerlin.tech.simulations;

import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;

import static io.gatling.javaapi.core.CoreDsl.atOnceUsers;
import static io.gatling.javaapi.core.CoreDsl.scenario;
import static ru.leroymerlin.tech.base.Protocol.httpProtocol;
import static ru.leroymerlin.tech.scenario.FirstTestScenario.testScenario;
import ru.tinkoff.gatling.influxdb.Annotations;

public class TestSimulation extends Simulation implements Annotations {

    public static ScenarioBuilder scn = scenario("Scenario Name").exec(testScenario);

    {
        setUp(
                scn.injectOpen(atOnceUsers(1)).protocols(httpProtocol)
        );
    }
}
