package com.montrealcollege.projectmanager.service;

import com.montrealcollege.projectmanager.dao.UsersDAO;
import com.montrealcollege.projectmanager.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

        @Autowired
        UsersDAO usersDAO;

        public void addTask(Users user) {
            usersDAO.createUser(user);
        }

        public List<Users> showTasks() {
            return usersDAO.listUsers();
        }
    
}
