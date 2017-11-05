package com.sdajava.hibernate;

import com.sdajava.hibernate.entity.BooksEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;


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
        try {
            tx = session.beginTransaction();
            List<BooksEntity> books =
                    session.createQuery("FROM " +BooksEntity.class.getName()).list();
            for (BooksEntity book: books){
                System.out.println(" ");
                System.out.println(" Autor: " + book.getAuthor());
                System.out.println(" Tytyl: " + book.getTitle());
                System.out.println(" Gatunek: " + book.getCategory());
                System.out.println(" Data Wydania: " + book.getPublidhed());
                System.out.println(" Cena: " + book.getPrice());
                System.out.println(" -------------------------");
                System.out.println(" ");
            }
            tx.commit();
        }
        catch (HibernateException e) {
            if (tx!=null){
                tx.rollback();
            }
            e.printStackTrace();
        }finally {
            session.close();
        }

    }

}
