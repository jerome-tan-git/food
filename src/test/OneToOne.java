package test;


import java.sql.SQLException;

import com.asso.action.MemberBuilt;
import com.asso.action.MemberEdit;
import com.asso.action.MemberLoad;
import com.asso.action.UserLogin;
import com.asso.manager.UserManager;
import com.asso.manager.impl.UserManagerImpl;
import com.asso.model.MemberInfo;
import com.asso.model.User;
import com.maggie.ssh1.vo.UserRegisterInfo;


public class OneToOne {
	
//	private static Session session;
	
	
	public static void main(String[] args){
		
//		session = HibernateUtil.getSessionFactory().openSession();
//
//		User u = new User();
//		u.setPassword("123");
//		u.setUsername("mama");
//
//	
//		session.beginTransaction();
////		session.delete(u);
////		session.get(User.class, "123");
////		session.saveOrUpdate(p);
//		session.save(u);
//		session.getTransaction().commit();
//
////		System.out.println("User:"+u.toString());
		
		
		
		
//		User u = new User();
//		u.setPassword("121212");
//		u.setUsername("tiffany");
//		
//		UserManager um = new UserManagerImpl();
//		try {
//			if(um.exists(u)){
//				System.out.println("EXISTS?--->true");
//			}else{
//				um.add(u);
//			}
//			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		UserAction ua = new UserAction();
//		UserRegisterInfo info = new UserRegisterInfo();
//		info.setUsername("miumiu");
//		info.setPassword("55555");
//		info.setPassword1("55555");
//		ua.setuInfo(info);
//		System.out.println(ua.execute());
		
		
		
		UserLogin ua = new UserLogin();
		UserRegisterInfo info = new UserRegisterInfo();
		info.setUsername("admin");
		info.setPassword("999");		
		ua.setuInfo(info);
		System.out.println(ua.execute());
		
//		UserBuilt ua = new UserBuilt();
//		UserRegisterInfo info = new UserRegisterInfo();
//		info.setUsername("miaomiao");
//		info.setPassword("990");		
//		ua.setuInfo(info);
//		System.out.println(ua.execute());
		
//		MemberBuilt mb = new MemberBuilt();
//		UserRegisterInfo info = new UserRegisterInfo();
//		info.setUsername("ÇÇ·å");
//		info.setPassword("111");
//		mb.setuInfo(info);
//		System.out.println(mb.execute());
		
//		MemberEdit mb = new MemberEdit();
//		MemberInfo info = new MemberInfo();
//		info.setC_tel("13612121212");
//		info.setId(5);
//		info.setC_addr("ÆÖµçÂ·438ºÅ");
//		info.setC_name("Ñî¹ý");
//		mb.setmemberinfo(info);
//		System.out.println(mb.execute());
		
//		MemberLoad ml = new MemberLoad();
//		UserRegisterInfo info = new UserRegisterInfo();
//		info.setId(2);
//		ml.setuInfo(info);
//		System.out.println(ml.execute());
	
		
		
	}

}
