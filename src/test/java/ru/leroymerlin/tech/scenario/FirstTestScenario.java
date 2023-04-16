package ru.leroymerlin.tech.scenario;

import io.gatling.javaapi.core.ChainBuilder;

import static io.gatling.javaapi.core.CoreDsl.exec;
import static io.gatling.javaapi.http.HttpDsl.http;

public class FirstTestScenario {

    public static ChainBuilder testScenario = exec(http("First test").get("/users"));
}
