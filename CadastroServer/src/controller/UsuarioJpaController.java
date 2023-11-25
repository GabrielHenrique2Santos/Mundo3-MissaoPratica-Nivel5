/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author Gabriel
 */


public class UsuarioJpaController {
    
    private EntityManager em;

    
    public UsuarioJpaController(EntityManager em) {
        this.em = em;
    }

    public Usuario findUsuario(String usuario, String senha) {
        try {
         
            Query query = em.createQuery("SELECT u FROM Usuario u WHERE u.login = :login AND u.senha = :senha");
            query.setParameter("login", usuario);
            query.setParameter("senha", senha);

          
            return (Usuario) query.getSingleResult();
        } catch (NoResultException e) {
            
            return null;
        }
    }
}
}
