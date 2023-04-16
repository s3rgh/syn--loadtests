package ru.leroymerlin.tech.simulations;

import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;

import static io.gatling.javaapi.core.CoreDsl.*;
import static ru.leroymerlin.tech.base.Protocol.httpProtocol;
import static ru.leroymerlin.tech.scenario.FirstTestScenario.testScenario;
import ru.tinkoff.gatling.influxdb.Annotations;

public class TestSimulation extends Simulation implements Annotations {

    public static ScenarioBuilder scn = scenario("Scenario Name").exec(testScenario);

    {
        setUp(
                scn.injectOpen(
                        nothingFor(4),
                        atOnceUsers(10),
                        rampUsers(10).during(5),
                        constantUsersPerSec(20).during(15),
                        constantUsersPerSec(20).during(15).randomized(),
                        rampUsersPerSec(10).to(20).during(10),
                        rampUsersPerSec(10).to(20).during(10).randomized(),
                        stressPeakUsers(1000).during(20) // 8
                ).protocols(httpProtocol)
        );
    }
}
