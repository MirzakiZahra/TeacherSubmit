import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Databace {
    static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    public void addTeacher(String name,String password,String username,String address){
        TeacherServlet teacherServlet=new TeacherServlet();
        teacherServlet.setName(name);
        teacherServlet.setUsername(username);
        teacherServlet.setPassWord(password);
        teacherServlet.setAddress(address);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(teacherServlet);
        transaction.commit();
        session.close();
        sessionFactory.close();



    }
}
