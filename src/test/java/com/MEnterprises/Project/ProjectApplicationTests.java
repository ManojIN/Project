package com.MEnterprises.Project;

import com.example.helloworld.HelloWorldController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest(classes = HelloWorldController.class)
@AutoConfigureMockMvc
class ProjectApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	@Test
	void TestEndpoint() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/").
				contentType(MediaType.APPLICATION_JSON)).
				andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Hello, World!"));
	}

}
