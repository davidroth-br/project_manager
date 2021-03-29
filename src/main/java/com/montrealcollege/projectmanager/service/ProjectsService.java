package com.montrealcollege.projectmanager.service;

import com.montrealcollege.projectmanager.dao.ProjectsDAO;
import com.montrealcollege.projectmanager.model.Projects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectsService {

        @Autowired
        ProjectsDAO projectsDAO;

        public void addProject(Projects project) {
            projectsDAO.createProject(project);
        }

        public List<Projects> showProjects() {
            return projectsDAO.listProjects();
        }

}
