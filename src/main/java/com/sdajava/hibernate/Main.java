package com.sdajava.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Created by artur on 05.11.2017.
 */
public class Main {

    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();
            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);

        }

    }
    public static Session getSession() throws HibernateException {
        return  ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws  Exception {
        Session session = ourSessionFactory.openSession();
        Transaction tx = null;

    }
}
