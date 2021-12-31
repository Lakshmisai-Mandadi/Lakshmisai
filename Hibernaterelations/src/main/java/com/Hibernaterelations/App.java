package com.Hibernaterelations;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
public class App 
{
    public static void main( String[] args )
    {
    	Employee emp = new Employee();
    	emp.setEmp_id(1);
    	emp.setEmp_name("jack");
        
        Drivinglicence dl = new Drivinglicence();
        dl.setDlic_no("7U57KP");        
        dl.setE(emp);
        
        Configuration config = new Configuration().configure().addAnnotatedClass(Drivinglicence.class).addAnnotatedClass(Employee.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        SessionFactory sf = config.buildSessionFactory(reg);
        Session session = sf.openSession(); 
        
        session.beginTransaction();
        
        session.save(emp);
        session.save(dl);
        
        session.getTransaction().commit();    
        
    }
}
