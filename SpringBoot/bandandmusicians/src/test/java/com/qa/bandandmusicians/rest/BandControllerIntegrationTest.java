package com.qa.bandandmusicians.rest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.bandandmusicians.persistence.domain.Band;
import com.qa.bandandmusicians.persistence.domain.Musician;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@ActiveProfiles(profiles = "test")
@Sql(scripts = "classpath:band-data.sql", executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
@TestInstance(Lifecycle.PER_CLASS)
public class BandControllerIntegrationTest {

    @Autowired
    private MockMvc mockMVC;

    @Autowired
    private ObjectMapper mapper;

    public Band TEST_BAND = new Band(1, "The Beatles", null);

    public Band TEST_SAVED_BAND = new Band(1, "The Beatles", null);

    public Musician TEST_MUSICIAN = new Musician(1, "John Lennon", 6, "Guitar", null);

    @BeforeAll
    public void beforeTest() {
        TEST_BAND.addToBand(TEST_MUSICIAN);
        TEST_SAVED_BAND.addToBand(TEST_MUSICIAN);
    }

    @Test
    public void testCreate() throws JsonProcessingException, Exception {
        String resultString = this.mockMVC
                .perform(
                        post("/band/create")
                                .contentType(MediaType.APPLICATION_JSON) // Sends a CREATE request for a band using the
                                                                         // request body JSON.
                                .content(this.mapper.writeValueAsString(TEST_BAND)) // Serializes the Band object into
                                                                                    // the request body.
                )
                .andExpect(status().isCreated()) // Expects a 201 HTTP request.
                .andReturn().getRequest().getContentAsString(); // Returns the request response as a string.

        Band result = this.mapper.readValue(resultString, Band.class); // Maps the resulting string into a Band object.
        assertThat(result).isEqualTo(TEST_SAVED_BAND); // Compares the returned band to the test one.
    }

    /*
     * @Test
     * public void testReadOne() throws Exception {
     * this.mockMVC.perform(get("/band/read/1")).andExpect(status().isOk())
     * .andExpect(content().json(this.mapper.writeValueAsString(TEST_SAVED_BAND)));
     * 
     * }
     * 
     * /*
     * 
     * @Test
     * public void testReadAll() throws Exception {
     * final List<Band> BANDS = new ArrayList<>();
     * BANDS.add(TEST_SAVED_BAND);
     * 
     * final String resultString = this.mockMVC
     * .perform(request(HttpMethod.GET,
     * "/person/readAll").accept(MediaType.APPLICATION_JSON))
     * .andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
     * 
     * List<Band> results = Arrays.asList(mapper.readValue(resultString,
     * Person[].class));
     * assertThat(results).contains(this.TEST_PERSON).hasSize(3);
     * }
     * 
     * @Test
     * public void testUpdate() throws Exception {
     * final Person newPerson = new Person(null, 26, "Chris Perrins");
     * String resultString = this.mockMVC
     * .perform(put("/person/update/3").contentType(MediaType.APPLICATION_JSON)
     * .content(this.mapper.writeValueAsString(newPerson)))
     * .andExpect(status().isAccepted()).andReturn().getRequest().getContentAsString
     * ();
     * 
     * Person result = this.mapper.readValue(resultString, Person.class);
     * assertThat(result).isEqualTo(newPerson);
     * }
     * 
     * @Test
     * public void testDelete() throws Exception {
     * this.mockMVC.perform(delete("/person/delete/2")).andExpect(status().
     * isNoContent());
     * }
     */
}