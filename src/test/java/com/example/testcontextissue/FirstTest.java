package com.example.testcontextissue;

import com.example.testcontextissue.config.EmbeddedSftpServer;
import com.example.testcontextissue.config.SftpTestConfig;
import com.example.testcontextissue.processing.BatchProcessing;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.test.context.SpringBatchTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {SftpTestConfig.class})
class FirstTest {

	@Autowired
	EmbeddedSftpServer embeddedSftpServer;

	@Test
	void contextLoads() {
	}

}
