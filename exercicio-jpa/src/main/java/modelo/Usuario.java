package modelo;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@Entity

public class Usuario {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    //no oracle usa-se sequence no mysql auto_increment com identity
    private Long id;
    private String nome;
    private String senha;
    private String email;

    public Usuario() {
    }

    public Usuario( String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                ", senha='***'" +  // Máscara de senha
                '}';
    }

}
