package com.montrealcollege.projectmanager.dao;

import com.montrealcollege.projectmanager.model.Tasks;

import java.util.List;

public interface TasksDAO {

    void createTask(Tasks task);

    List<Tasks> listTasks();

    Tasks displayTask(Integer id);

    void updateTask(Tasks task);

    void deleteTask(Tasks task);


}
