package com.montrealcollege.projectmanager.dao;

import com.montrealcollege.projectmanager.model.Tasks;
import com.montrealcollege.projectmanager.model.Users;
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
public class TasksDAOImpl implements TasksDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void createTask(Tasks task) {

    }

    @Override
    public List<Tasks> listTasks() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Tasks> criteriaQuery = criteriaBuilder.createQuery(Tasks.class);
        Root<Tasks> root = criteriaQuery.from(Tasks.class);
        criteriaQuery.select(root);

        Query<Tasks> query = session.createQuery(criteriaQuery);
        return query.list();
    }

    @Override
    public Tasks displayTask(Integer id) {
        return null;
    }

    @Override
    public void updateTask(Tasks task) {

    }

    @Override
    public void deleteTask(Tasks task) {

    }
}
