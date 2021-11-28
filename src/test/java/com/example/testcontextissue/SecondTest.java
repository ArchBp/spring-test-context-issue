package com.example.testcontextissue;

import com.example.testcontextissue.config.EmbeddedSftpServer;
import com.example.testcontextissue.config.SftpTestConfig;
import com.example.testcontextissue.processing.BatchProcessing;
import org.junit.jupiter.api.Test;
import org.springframework.batch.test.context.SpringBatchTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBatchTest
@EnableAutoConfiguration // SO I DON'T NEED TO MANUALLY CONFIGURE A DATASOURCE
@ContextConfiguration(classes = {SftpTestConfig.class, BatchProcessing.class})
class SecondTest {

	@Autowired
	EmbeddedSftpServer embeddedSftpServer;


	@Test
	void contextLoads() {
	}

}
