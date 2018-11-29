/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurafácil;

/**
 *
 * @author jessica
 */
public class Utilizador {
    private String nome;
    private String tipo; // 0-> administrador 1-> funcionario do stand 2-> funcionario da fabrica
    private String password;
    
    public Utilizador(){
        this.nome = "";
        this.tipo = "";
        this.password = "";
    }
    
    public Utilizador(String nome, String tipo, String password){
        this.nome = nome;
        this.tipo = tipo;
        this.password = password;
    }
    
    public Utilizador(Utilizador u){
        this.nome = u.getNome();
        this.tipo = u.getTipo();
        this.password = u.getPassword();
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
     public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("O utilizador ");
        sb.append(this.nome);
        sb.append(" é ");
        sb.append(this.tipo);
        sb.append(" .\n");

        return sb.toString();
    }
    
    public boolean equals (Object o) {
        if (this == o)
            return true;
        if ((o == null) || (this.getClass() != o.getClass()))
            return false;
        Utilizador u = (Utilizador) o;
        return u.getNome().equals(this.nome) && u.getTipo().equals(this.tipo) 
                && u.getPassword().equals(this.password);
    }
}
