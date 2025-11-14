package com.file.springboot_file.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.file.springboot_file.entity.Attachment;
import com.file.springboot_file.model.Academic;
import com.file.springboot_file.model.ResponseData;
import com.file.springboot_file.service.fileService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class Controller {

	private final fileService service;
	
	private static final Logger log = LoggerFactory.getLogger(Controller.class);
	
	@PostMapping("/upload")
	public ResponseData uploadFile(@RequestParam("file") MultipartFile file) {
		
		Attachment attachment=null;
		String downloadURL="";
		attachment =service.saveAttachment(file);
		
		downloadURL= ServletUriComponentsBuilder.fromCurrentContextPath()
				.path("/download/")
				.path(String.valueOf(attachment.getId()))
				.toUriString();
		
		return new ResponseData(attachment.getFileName(),
			downloadURL,
			file.getContentType(),
			file.getSize());
		
	}
	
	
	
	@GetMapping("/download/{id}")
	public ResponseEntity<Resource> downloadFile(@PathVariable Integer id) {

	    Attachment attachment = service.getAttachment(id);

	    return ResponseEntity.ok()
	            .contentType(MediaType.parseMediaType(attachment.getFileType()))
	            .header(HttpHeaders.CONTENT_DISPOSITION,"attachment; "
	            		+ "filename=\"" + attachment.getFileName() + "\"")
	            .body(new ByteArrayResource(attachment.getData()));
	}

	
	
	@GetMapping("/{id}")
	public Academic  getacademic(@PathVariable int id) {
		log.info("getting the academic details");
		return service.getacademic(id);
	}
	
	
	@GetMapping("/kafka")
	public void sendMessage() {
		service.sendMessage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}