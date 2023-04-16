package ru.leroymerlin.tech.base;

import io.gatling.javaapi.http.HttpProtocolBuilder;
import static io.gatling.javaapi.http.HttpDsl.http;

public class Protocol {

    public static HttpProtocolBuilder httpProtocol = http
            .baseUrl("https://reqres.in/api")
            .acceptHeader("application/json")
            .doNotTrackHeader("1")
            .acceptLanguageHeader("en-US,en;q=0.5")
            .acceptEncodingHeader("gzip, deflate")
            .userAgentHeader("Mozilla/5.0 (Windows NT 5.1; rv:31.0) Gecko/20100101 Firefox/31.0");
}
