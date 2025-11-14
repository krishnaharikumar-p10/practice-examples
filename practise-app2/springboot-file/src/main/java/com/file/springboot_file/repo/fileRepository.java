package com.file.springboot_file.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.file.springboot_file.entity.Attachment;

@Repository
public interface fileRepository extends JpaRepository<Attachment,Integer>{

}
