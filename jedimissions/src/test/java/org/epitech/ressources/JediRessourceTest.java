package org.epitech.ressources;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.ws.rs.core.MediaType;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import java.time.LocalDate;
import java.util.UUID;

import org.epitech.model.Jedi;
import org.epitech.model.Rank;

@QuarkusTest
class JediResourceTest {
    @Test
    void getJedisShouldBeOk() {
        given()
                .when().get("/api/v1/jedis")
                .then()
                .statusCode(200);
    }

    @Test
    void putJediWithNoIdInPathShouldBeKO() {
        given()
                .contentType(MediaType.APPLICATION_JSON)
                .when().put("/api/v1/jedis")
                .then()
                .statusCode(405);
    }

    @Test
    void putJediWithIdButJediNullShouldBeOk() {
        given()
                .contentType(MediaType.APPLICATION_JSON)
                .when().put("/api/v1/jedis/ff40705b-4322-44ed-a3f9-81cc03c13a60")
                .then()
                .statusCode(400);
    }

    @Test
    void putJediWithIdAndJediIdDifferentShouldBeKo() {
        Jedi yoda = new Jedi(UUID.randomUUID(), "yoda", "?", Rank.GRAND_MASTER, true, LocalDate.of(100, 2, 1));
        given()
                .contentType(MediaType.APPLICATION_JSON)
                .body(yoda)
                .when().put("/api/v1/jedis/ff40705b-4322-44ed-a3f9-81cc03c13a60")
                .then()
                .statusCode(400);
    }

    @Test
    void putJediWithIdAndJediShouldBeOk() {
        UUID yodaId = UUID.randomUUID();
        Jedi yoda = new Jedi(yodaId, "yoda", "?", Rank.GRAND_MASTER, true, LocalDate.of(100, 2, 1));
        given()
                .contentType(MediaType.APPLICATION_JSON)
                .body(yoda)
                .when().put("/api/v1/jedis/" + yodaId)
                .then()
                .statusCode(200);
    }
}