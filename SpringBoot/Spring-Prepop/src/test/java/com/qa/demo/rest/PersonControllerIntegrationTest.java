package com.qa.demo.rest;

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

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.demo.persistence.domain.Person;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc // Assumes that we have a functional MVC framework. 
@Sql(scripts = "classpath:person-data.sql", executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
public class PersonControllerIntegrationTest {

	@Autowired
	private MockMvc mockMVC;

	@Autowired
	private ObjectMapper mapper;

	private final Person TEST_PERSON = new Person(null, 26, "Jordan Harrison");

	private final Person TEST_SAVED_PERSON = new Person(1L, 26, "Jordan Harrison");

	@Test
	public void testCreate() throws JsonProcessingException, Exception {
		String resultString = this.mockMVC
			.perform(
				post("/person/create") // POST request for a person
				.contentType(MediaType.APPLICATION_JSON) // set content type to JSON
				.content(this.mapper.writeValueAsString(TEST_PERSON)) // set the content values as TEST_PERSON mapped to JSON
			) 
			.andExpect(status().isCreated()) // Expect a 201 (Created) HTTP request.
			.andReturn().getRequest().getContentAsString(); // Get what returned from the request as a string.

		Person result = this.mapper.readValue(resultString, Person.class); // result = map the resultString into a Person object.
		assertThat(result).isEqualTo(TEST_SAVED_PERSON); // Assert that the result is equal to the values of TEST_PERSON.
	}

	@Test
	public void testReadOne() throws Exception {
		this.mockMVC.perform(get("/person/read/1")).andExpect(status().isOk())
				.andExpect(content().json(this.mapper.writeValueAsString(TEST_SAVED_PERSON)));

	}

	@Test
	public void testZZZ() throws Exception {
		final List<Person> PEOPLE = new ArrayList<>();
		PEOPLE.add(TEST_SAVED_PERSON);

		final String resultString = this.mockMVC
				.perform(request(HttpMethod.GET, "/person/readAll").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andReturn().getResponse().getContentAsString();

		List<Person> results = Arrays.asList(mapper.readValue(resultString, Person[].class));
		assertThat(results).contains(this.TEST_PERSON).hasSize(3);
	}

	@Test
	public void testUpdate() throws Exception {
		final Person newPerson = new Person(null, 26, "Chris Perrins");
		String resultString = this.mockMVC
				.perform(put("/person/update/3").contentType(MediaType.APPLICATION_JSON)
						.content(this.mapper.writeValueAsString(newPerson)))
				.andExpect(status().isAccepted()).andReturn().getRequest().getContentAsString();

		Person result = this.mapper.readValue(resultString, Person.class);
		assertThat(result).isEqualTo(newPerson);
	}

	@Test
	public void testDelete() throws Exception {
		this.mockMVC.perform(delete("/person/delete/2")).andExpect(status().isNoContent());
	}
}
