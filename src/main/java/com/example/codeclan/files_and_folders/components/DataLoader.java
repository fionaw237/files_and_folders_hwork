package com.example.codeclan.files_and_folders.components;

import com.example.codeclan.files_and_folders.models.File;
import com.example.codeclan.files_and_folders.models.Folder;
import com.example.codeclan.files_and_folders.models.User;
import com.example.codeclan.files_and_folders.repositories.FileRepository;
import com.example.codeclan.files_and_folders.repositories.FolderRepository;
import com.example.codeclan.files_and_folders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User user = new User("Fiona");
        userRepository.save(user);

        Folder folder = new Folder("Home", user);
        folderRepository.save(folder);

        Folder folder2 = new Folder("Documents", user);
        folderRepository.save(folder2);

        File file = new File("test", ".java", 10, folder);
        fileRepository.save(file);

        File file2 = new File("pic", ".jpg", 10, folder2);
        fileRepository.save(file2);

        File file3 = new File("text", ".txt", 10, folder2);
        fileRepository.save(file3);
    }
}