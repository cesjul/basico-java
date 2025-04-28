package classes;

public class Usuario {
    String name;
    String email;

    
    public boolean equals(Object obj) {
        
        Usuario other = (Usuario) obj;

        boolean sameName = this.name.equals(other.name);
        boolean sameEmail = this.email.equals(other.email);

        return sameName && sameEmail;
    }
}
