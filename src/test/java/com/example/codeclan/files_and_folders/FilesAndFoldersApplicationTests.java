package com.example.codeclan.files_and_folders;

import com.example.codeclan.files_and_folders.models.User;
import com.example.codeclan.files_and_folders.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesAndFoldersApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

}
