package dao;

import model.Donor;
import util.HibernateUtil;
import org.hibernate.Session;
import java.util.List;

public class DonorDAO {
    public void saveDonor(Donor donor) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.persist(donor);
            session.getTransaction().commit();
        }
    }

    public List<Donor> getAllDonors() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Donor", Donor.class).list();
        }
    }

    public Donor getDonor(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Donor.class, id);
        }
    }

    public void updateDonor(Donor donor) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.merge(donor);
            session.getTransaction().commit();
        }
    }

    public void deleteDonor(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            Donor donor = session.get(Donor.class, id);
            if (donor != null) {
                session.remove(donor);
            }
            session.getTransaction().commit();
        }
    }
}
