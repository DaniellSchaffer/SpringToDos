/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springtodos.dao.impl;

import co.edu.utb.softeng.springtodos.entity.ToDo;
import co.edu.utb.softeng.springtodos.dao.ToDoDao;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author william
 */
@Repository //Imports the DAOs into the DI container;makes the unchecked exceptions (thrown from DAO methods) eligible for translation into Spring DataAccessException.
public class ToDoDaoImpl implements ToDoDao{
    
    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public ToDo getById(Long id) {
        
        Session session = sessionFactory.getCurrentSession();
        return (ToDo)session.createCriteria(ToDo.class).add(Restrictions.idEq(id)).uniqueResult();
        
    }
    
    @Override
    public List<ToDo> getAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createCriteria(ToDo.class).list();
        
    }
    
    
}
