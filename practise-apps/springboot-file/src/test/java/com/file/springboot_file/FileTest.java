package com.file.springboot_file;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.file.springboot_file.entity.Attachment;
import com.file.springboot_file.model.ResponseData;
import com.file.springboot_file.repo.fileRepository;

@SpringBootTest
@AutoConfigureMockMvc
public class FileTest {
	
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	ObjectMapper mapper;
	
	@Autowired
	private fileRepository repo;
	
	@Test
	void testUploadFile() throws Exception {
		
		MockMultipartFile file = new MockMultipartFile( "file","file.txt","text/plain","springboot".getBytes());
		
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.multipart("/upload")
				.file(file))
				.andExpect(jsonPath("$.fileName").value("file.txt"))
				.andExpect(jsonPath("$.fileType").value("text/plain"))
				.andReturn();
		
		ResponseData response = mapper.readValue(result.getResponse().getContentAsString(),ResponseData.class);
		
		String downloadURL = response.getDownloadURL();
		
		String id=downloadURL.substring(downloadURL.lastIndexOf("/")+1);
		
		Attachment savedFile = repo.findById(Integer.parseInt(id)).orElseThrow();
		
		assertArrayEquals("springboot".getBytes(),savedFile.getData());
		
	}
		
}
	
	
	
	

