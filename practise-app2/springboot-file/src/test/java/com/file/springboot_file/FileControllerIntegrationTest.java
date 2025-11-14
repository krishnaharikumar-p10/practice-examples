package com.file.springboot_file;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.multipart;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.file.springboot_file.entity.Attachment;
import com.file.springboot_file.repo.fileRepository;
import com.file.springboot_file.service.fileService;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class FileControllerIntegrationTest {

	@Autowired
	MockMvc mockMvc;
	
	@Autowired 
	fileService service;
	
	@Autowired 
	fileRepository repo;
	


	 
	 @Test
	 public void uploadTest() throws Exception {
		 
		 MockMultipartFile file = new MockMultipartFile("file", "file.txt","text","welcome to springboot".getBytes());
		 
		 mockMvc.perform(multipart("/upload").file(file))
		 .andExpect(jsonPath("$.fileName").value("file.txt"))
		 .andExpect(jsonPath("$.fileType").value("text"))
		 .andExpect(jsonPath("$.fileSize").value(file.getSize()))
		 .andExpect(jsonPath("$.downloadURL").isNotEmpty());
		 
	 }
	 
	 @Test
	 public void download() throws Exception {
		 
		 MockMultipartFile file = new MockMultipartFile("file", "file.txt","text/plain","welcome to springboot".getBytes());
		 
		Attachment attachment = new Attachment();
		attachment.setFileName(file.getOriginalFilename());
		attachment.setFileType(file.getContentType());
		attachment.setData(file.getBytes());
		Attachment savedFile =repo.save(attachment);

		
		mockMvc.perform(get("/download/{id}", savedFile.getId()))
        .andExpect(status().isOk())
        .andExpect(content().contentType("text/plain"))
        .andExpect(content().bytes("welcome to springboot".getBytes()))
        .andExpect(header().string("Content-Disposition", "attachment; filename=\"file.txt\""));
	
			
		}
		 
		 
		 
		 
	 
}
	 
