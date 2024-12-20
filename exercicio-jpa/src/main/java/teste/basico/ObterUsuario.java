package teste.basico;

import modelo.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ObterUsuario {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-cod3r");
        //em casos de mais de 1 banco de dados pode criar varios emf
        EntityManager em = emf.createEntityManager();

        Usuario usuario = em.find(Usuario.class, 1L);//se faz necessario passar i o id+L de LONG
        System.out.println("Nome: " + usuario.getNome());
        em.close();
        emf.close();
    }
}
