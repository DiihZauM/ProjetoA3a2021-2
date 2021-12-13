import javax.swing.JOptionPane;

public class Cliente {
    
    private String NomeCli;
    private String email;
    private String Senha;
    private String Telefone;
    private String Endereco;
    private String CPF;

    public Cliente (String email, String Senha){
    this.email = email;
    this.Senha = Senha;
}

    Cliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public String getNomeCli() {
        return NomeCli;
    }
    public void setNome(String Nome) {
        this.NomeCli = Nome;
    }
    public String getemail() {
        return email;
    }
    public void setLogin(String email) {
        this.email = email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEndereco() {
        return Endereco;
    }
    
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }
    
       public String getCPF() {
        return CPF;
    }
    
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    
 
   public Cliente Login(String email, String Senha){ 
    return null;
   }
   
   public Cliente Cadastro(String Nome, String email, String Senha,  String Telefone, String Endereco, String CPF){
   return null;
   }
}
