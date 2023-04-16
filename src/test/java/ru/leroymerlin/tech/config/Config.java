package ru.leroymerlin.tech.config;

import static ru.tinkoff.gatling.javaapi.SimulationConfig.getStringParam;

class Config {
    String dataBaseUrl = getStringParam("database.host");
    String dataBaseUser = getStringParam("database.user");
    String dataBasePassword = getStringParam("database.password");
    String dataBaseUsersTable = getStringParam("database.table");
}
