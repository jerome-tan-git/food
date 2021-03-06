package com.asso.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import util.ObjectToClass;

import com.asso.dao.ExamDao;
import com.asso.dao.UserDao;
import com.asso.model.Exam;
import com.asso.model.ExamItem;
import com.asso.model.ExamRef;
import com.asso.model.Member;
import com.asso.model.MemberInfo;
import com.asso.model.User;

@Component("examDao")//��ʼ��userDao
public class ExamDaoImpl implements ExamDao {
	
	private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    @Resource
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
	private ExamItem loadExamItemsWithExamItemId(int eid) {				
		List<ExamItem> items = new ArrayList<ExamItem>();		
		 Session s = sessionFactory.openSession(); 
//		Session s = sessionFactory.getCurrentSession(); 
//	     s.beginTransaction();
	     
	     String hql = "from examitem where id=?";      
	     Query query = s.createQuery(hql); 
	     query.setString(0, ""+eid); 
			
	     items = query.list();    
	     s.close();
		 
	     System.out.println("Get examItem list size="+items.size());	
		return items.get(0);//prevent null
	}
	
	private List<ExamRef> loadExamRefsWithExamItemid(int itemid) {		
		List<ExamRef> refs = new ArrayList<ExamRef>();		
		 Session s = sessionFactory.openSession(); 
//		Session s = sessionFactory.getCurrentSession(); 
//	     s.beginTransaction();
	     
	     String hql = "from ExamRef where itemid=?";      
	     Query query = s.createQuery(hql); 
	     query.setString(0, ""+itemid);			
	     refs = query.list();    
	     s.close();
		 
	     System.out.println("Get item="+itemid+", examrefs list size="+refs.size());
	     return refs;
	}
	private int getExamidByGroupid(int groupid){
		 int eid = 0;
	     Session s = sessionFactory.openSession(); 
//			Session s = sessionFactory.getCurrentSession(); 
//		 s.beginTransaction();
		
	     Query query = s.createQuery("select id from exam e where e.groupid = ?")
			    		.setParameter(0, groupid);
        List<Object> list = query.list();  
        s.close();
			    
	     if(list.size() > 0) {
			  eid = (Integer) list.get(0);
			  System.out.println(groupid + " : " +eid);
	     }else
	    	 System.out.println("No examid selected...");		 
		 return eid;
	}
	
	private List<Integer> getItemidsByExamid(int eid){
		List<Integer> itemids = new ArrayList<Integer>();
	     Session s = sessionFactory.openSession(); 
//			Session s = sessionFactory.getCurrentSession(); 
	     Query query = s.createQuery("select id from examitem er where er.examid = ?")
			    		.setParameter(0, eid);
       List<Object> list = query.list();  
       s.close();
			    
	     if(list.size() > 0) {
	    	 for(Object o:list){
			   int itemid = (Integer) o;
			  System.out.println(itemid + " : " +eid);
			  itemids.add(itemid);
	    	 }
	     }else
	    	 System.out.println("No examid selected...");		 
		 return itemids;
		
	}
	
	@Override
	public void save(Exam exam) {
		 Session s = sessionFactory.openSession(); 
//			Session s = sessionFactory.getCurrentSession(); 
		     s.beginTransaction();
		     s.save(exam);
		     s.getTransaction().commit();
	}	
	@Override
	public void save(ExamItem examitem) {
		 Session s = sessionFactory.openSession(); 
//			Session s = sessionFactory.getCurrentSession(); 
		     s.beginTransaction();
		     s.save(examitem);
		     s.getTransaction().commit();
	}
	@Override
	public void save(List<ExamRef> refs) {
		for(ExamRef ref:refs){
			Session s = sessionFactory.openSession(); 
//			Session s = sessionFactory.getCurrentSession(); 
		     s.beginTransaction();
		     s.save(ref);
		     s.getTransaction().commit();
		}		
	}
	@Override
	public void update(ExamItem examitem) {
		Session s = sessionFactory.openSession(); 
//		Session s = sessionFactory.getCurrentSession(); 
	     s.beginTransaction();
	     s.update(examitem);
	     s.getTransaction().commit();
	}
	@Override
	public void update(ExamRef ref) {
		Session s = sessionFactory.openSession(); 
//		Session s = sessionFactory.getCurrentSession(); 
		s.beginTransaction();
		s.update(ref);
		s.getTransaction().commit();		
	}
	@Override
	public void update(List<ExamRef> refs) {
		for(ExamRef ref:refs)
			this.update(ref);
	}
	@Override
	public void delete(ExamItem examitem) {
		Session s = sessionFactory.openSession(); 
//		Session s = sessionFactory.getCurrentSession(); 
		s.beginTransaction();
		s.delete(examitem);		
		s.getTransaction().commit();		
	}
	@Override
	public void delete(ExamRef ref) {
		Session s = sessionFactory.openSession(); 
//		Session s = sessionFactory.getCurrentSession(); 
		s.beginTransaction();
		s.delete(ref);		
		s.getTransaction().commit();		
	}
	@Override
	public void deleteRefs(ExamItem examitem) {		
		List<ExamRef> refs = this.loadExamRefsWithExamItemid(examitem.getId());		
		for(ExamRef ref:refs)			
			this.delete(ref);
	}
	@Override
	public List<ExamRef> loadExamRefById(int _id) {
		Session s = sessionFactory.openSession();
//		Session s = sessionFactory.getCurrentSession(); 
	    String hql = "from ExamRef where id=?";      
        Query query = s.createQuery(hql); 
        query.setString(0, ""+_id); 
        List<ExamRef> ref = query.list();
//        for(ExamRef o : ref){   
//            System.out.println(o.toString());
//        }   		
        s.close();
	    return ref;
	}
	@Override
	public List<ExamRef> loadReflistByItemId(int _id) {
		Session s = sessionFactory.openSession();
//		Session s = sessionFactory.getCurrentSession(); 
	    
	    String hql = "from ExamRef where itemid=?";      
        Query query = s.createQuery(hql); 
        query.setString(0, ""+_id);        
        List<ExamRef> ref = query.list();
        System.out.println("Get reflist size="+ref.size());
        for(ExamRef o : ref){   
            System.out.println(">>>"+o.toString());
        }   		
	    s.close();
	    return ref;
	}
	
	@Override
	public List<ExamItem> loadExamItemById(int _id) {
		Session s = sessionFactory.openSession();
//		Session s = sessionFactory.getCurrentSession(); 
	    String hql = "from ExamItem where id=?";      
        Query query = s.createQuery(hql); 
        query.setString(0, ""+_id); 
        List<ExamItem> item = query.list();
//        for(ExamItem o : item){   
//            System.out.println(o.toString());
//        }   		
        s.close();
	    return item;
	}
	@Override
	public List<ExamItem> loadExamItemByQ(String _question) {
		Session s = sessionFactory.openSession();
//		Session s = sessionFactory.getCurrentSession(); 
	    String hql = "from ExamItem where question=?";      
        Query query = s.createQuery(hql); 
        query.setString(0, ""+_question); 
        List<ExamItem> item = query.list();
//        for(ExamItem o : item){   
//            System.out.println(o.toString());
//        }   		
        s.close();
	    return item;
	}
	@Override
	public List<ExamItem> loadExamItemByCatId(int cid) {
		Session s = sessionFactory.openSession();
//		Session s = sessionFactory.getCurrentSession(); 
	    String hql = "from ExamItem where category=?";      
        Query query = s.createQuery(hql); 
        query.setString(0, ""+cid); 
        List<ExamItem> items = query.list();
//        for(ExamItem o : items){   
//            System.out.println(o.toString());
//        }   		
        s.close();
	    return items;
	}
	@Override
	public List<ExamItem> loadExamItemByExamId(int eid) {
		Session s = sessionFactory.openSession();
//		Session s = sessionFactory.getCurrentSession(); 
//	    s.beginTransaction();
	    
	    String hql = "from ExamItem where examid=?";      
        Query query = s.createQuery(hql); 
        query.setString(0, ""+eid); 
        List<ExamItem> items = query.list();
//        for(ExamItem o : items){   
//            System.out.println(o.toString());
//        }   		
        s.close();
	    return items;
	}
	
	@Override
	public HashMap<ExamItem, List<ExamRef>> loadItemsByGroupid(int groupid) {
		HashMap<ExamItem, List<ExamRef>> itemmap =  new HashMap<ExamItem, List<ExamRef>>();		
		int eid = this.getExamidByGroupid(groupid);
		List<Integer> itemids = this.getItemidsByExamid(eid);
		for(Integer itemid:itemids){
			itemmap.put((ExamItem) this.loadExamItemsWithExamItemId(itemid),
					this.loadExamRefsWithExamItemid(itemid));			
		}		
		return itemmap;
	}
	


}
