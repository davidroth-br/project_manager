package com.montrealcollege.projectmanager.dao;

import com.montrealcollege.projectmanager.model.Projects;
import com.montrealcollege.projectmanager.model.Tasks;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class ProjectsDAOImpl implements ProjectsDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void createProject(Projects project) {

    }

    @Override
    public List<Projects> listProjects() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Projects> criteriaQuery = criteriaBuilder.createQuery(Projects.class);
        Root<Projects> root = criteriaQuery.from(Projects.class);
        criteriaQuery.select(root);

        Query<Projects> query = session.createQuery(criteriaQuery);
        return query.list();
    }

    @Override
    public Projects displayProject(Integer id) {
        return null;
    }

    @Override
    public void updateProject(Projects project) {

    }

    @Override
    public void deleteProject(Projects project) {

    }
}
