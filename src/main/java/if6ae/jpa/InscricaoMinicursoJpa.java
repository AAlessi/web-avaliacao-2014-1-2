/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if6ae.jpa;


import if6ae.entity.Minicurso;

import if6ae.entity.Minicurso_;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import utfpr.persistence.controller.JpaController;

/**
 *
 * @author a1015591
 */
public class InscricaoMinicursoJpa extends JpaController {
    
    
    public InscricaoMinicursoJpa(){
        
    }


    
    public List<Minicurso> findCurso(int numero) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Minicurso> cq = cb.createQuery(Minicurso.class);
            Root<Minicurso> rt = cq.from(Minicurso.class);
            cq.where(cb.equal(rt.get(Minicurso_.codigo), numero));
            TypedQuery<Minicurso> q = em.createQuery(cq);
            return q.getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
     public List<Minicurso> findAll() {
        EntityManager em = null;
        try {
            em = getEntityManager();
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Minicurso> cq = cb.createQuery(Minicurso.class);
            Root<Minicurso> rt = cq.from(Minicurso.class);
            TypedQuery<Minicurso> q = em.createQuery(cq);
            return q.getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
