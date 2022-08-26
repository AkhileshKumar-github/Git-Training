package com.sopra;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ExampleSerivceMockTest {
	@Mock
	private ExampleRepositoryImpl exampleRepo;
	@InjectMocks
	private ExampleServiceImpl helloService    = new ExampleServiceImpl();
	
	@BeforeEach
	void setMockOutput() {
		when(exampleRepo.get()).thenReturn("hello Mockito from Repository");
	}
	@DisplayName("test mock helloService + helloRepository")
	@Test
	void testGet() {
		assertE("hello Mockito from Repository",helloService.get());
	}

}
