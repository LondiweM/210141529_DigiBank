package service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.DigiBankEntities;

/**
 * Session Bean implementation class DigiBankEJB
 */
@Stateless
@LocalBean
public class DigiBankEJB {
	@PersistenceContext
	private EntityManager em;
  
    public DigiBankEJB() {
        // TODO Auto-generated constructor stub
    }
    public void AddNew(DigiBankEntities digibankentity)
    {
    	System.out.println("Adding Yees");
    	em.persist(digibankentity);
    }
    public List<DigiBankEntities> findTransactions() {
    	List<DigiBankEntities> transdetails = em.createQuery("Select e from digibank_table e"
    			,DigiBankEntities.class).getResultList();
    	return transdetails;
    }
}
