package com.example.DAO;

import java.util.List;

import org.hibernate.NonUniqueResultException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.example.demo.LoginController;
import com.example.entity.User;

public class LoginDAO {
SessionFactory factory = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory(); 

public void postUser(User user) {
Session session = factory.getCurrentSession();
session.beginTransaction();
session.save(user);
session.getTransaction().commit();
}

public boolean checkUser(User user) {
	Session session = factory.getCurrentSession();
	session.beginTransaction();
	if(session.createQuery("from users where userName='"+user.getUserName()+"' AND password='"+user.getPassword()+"'").uniqueResult() != null)
	 return true;
	return false;
}
}