package in.ineuron.main;


import org.hibernate.Session;


import in.ineuron.model.Department;

import in.ineuron.util.HibernateUtil;

public class RetreivalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = null;
		
		
		
		try {
			session =HibernateUtil.getSession();
	        Department dept = session.get(Department.class, "IPL-16");
	        System.out.println(dept);
				
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}finally {
			
				
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}

}
