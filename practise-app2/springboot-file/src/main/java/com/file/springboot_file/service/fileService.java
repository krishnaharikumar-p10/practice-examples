package com.file.springboot_file.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.file.springboot_file.entity.Attachment;
import com.file.springboot_file.kafka.Producer;
import com.file.springboot_file.model.Academic;
import com.file.springboot_file.repo.fileRepository;

import lombok.RequiredArgsConstructor;

@Service
public class fileService {

	private final fileRepository repo;
	
	@Autowired
	private AcademicClient client;
	
	@Autowired
	private Producer producer;
	
	public fileService(fileRepository repo) {
		this.repo=repo;
	}
	
	public  Attachment saveAttachment(MultipartFile file) {
		String fileName=StringUtils.cleanPath(file.getOriginalFilename());
		try {
			
			Attachment attachment =
					new Attachment(fileName,
							file.getContentType(),
				
							file.getBytes());
			
			return repo.save(attachment);
					
		}catch(Exception e) {
			throw new RuntimeException("Could not save File: "+ fileName);
		}
		
	}
	
	public Academic getacademic(int id) {
		return client.getDetailsbyId(id);
		
	}

	public Attachment getAttachment(Integer id) {
	    return repo.findById(id)
	               .orElseThrow(() -> new RuntimeException("Attachment not found"));	}

	public void sendMessage() {
		
		producer.sendWithoutKey("Message A");
		producer.sendWithoutKey("Message B");
		
		producer.sendKey("key1","Message C");
		producer.sendKey("key2","Message D");
		
	}


}
