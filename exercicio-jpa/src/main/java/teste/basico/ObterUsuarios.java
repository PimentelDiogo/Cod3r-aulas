package teste.basico;

import modelo.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ObterUsuarios {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-cod3r");
        //em casos de mais de 1 banco de dados pode criar varios emf
        EntityManager em = emf.createEntityManager();

        String jpql = "select u from Usuario u";
        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
        query.setMaxResults(10);

        List<Usuario> usuarios = query.getResultList();

        for(Usuario usuario : usuarios){
            System.out.println("Nome: " + usuario.getNome());
        }
        em.getTransaction().begin();
        em.createQuery(jpql).getResultList().forEach(System.out::println);//forma reduzida
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
