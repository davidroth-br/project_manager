package com.montrealcollege.projectmanager.dao;

import com.montrealcollege.projectmanager.model.Projects;

import java.util.List;

public interface ProjectsDAO {

    void createProject(Projects project);

    List<Projects> listProjects();

    Projects displayProject(Integer id);

    void updateProject(Projects project);

    void deleteProject(Projects project);


}
