package classe;

import java.util.Objects;

public class User {
    String nome;

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }

    String email;
    public boolean equals(Object obj){

        if(obj instanceof User){
            User outro = (User) obj;
            boolean nomeIgual= Objects.equals(outro.nome, this.nome);
            boolean emailIgual= outro.email.equals(this.email);
            return nomeIgual && emailIgual;
        }
        return false;
    }
}
