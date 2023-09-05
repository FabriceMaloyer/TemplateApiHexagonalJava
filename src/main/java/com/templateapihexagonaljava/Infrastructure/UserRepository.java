package com.templateapihexagonaljava.Infrastructure;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
@Transactional
public class UserRepository implements IUserRepository{
    private final SessionFactory sessionFactory;
    @Autowired
    public UserRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public UUID save(User user) {
        // Open a Hibernate session

        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        // Save the user object to the database
       UUID result = (UUID) session.save(user);
        tx1.commit();
        return result;
    }

    @Override
    public com.templateapihexagonaljava.Domain.User getuser(String userName) {
        try{
            Session session = sessionFactory.openSession();

            Query query= session.createQuery("from User where userName= :params");
            query.setParameter("params", userName);
            User user = (User) query.uniqueResult();

            return User.toDomain(user);
        }
        catch (Exception e){
            return null;
        }
    }

    @Override
    public List<com.templateapihexagonaljava.Domain.User> getAllUser() {
        try{
            Session session = sessionFactory.openSession();

            List<User> users =  session.createQuery("SELECT a FROM User a", User.class).getResultList();
            List<com.templateapihexagonaljava.Domain.User> response = new ArrayList<>();
            for (User item: users) {
                response.add(User.toDomain(item));
            }
            return response;
        }
        catch (Exception e){
            return null;
        }
    }
}
