package teste.basico;
import modelo.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-cod3r");
        //em casos de mais de 1 banco de dados pode criar varios emf
        EntityManager em = emf.createEntityManager();

        Usuario usuario = new Usuario("João", "j@j.com");
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
