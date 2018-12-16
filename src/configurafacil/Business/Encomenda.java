/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurafacil.Business;

/**
 *
 * @author utilizador
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Encomenda {
    private int id;
    private String carro;
    private List <String> configuração;
    
    public Encomenda() {
        this.id = 0;
        this.carro = "";
        this.configuração = new ArrayList<String>();
    }
    
    public Encomenda(int id, String carro, List<String> quotas){
        this.id = id;
        this.carro = carro;
        this.configuração = new ArrayList<String>();
        if (configuração != null) this.configuração = quotas.stream().collect(Collectors.toList());
    }
    
    public Encomenda(Encomenda e){
        this.id = e.getId();
        this.carro = e.getCarro();
        this.configuração = e.getConfig();
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getCarro(){
        return this.carro;
    }
    
    public List<String> getConfig(){
        return this.configuração.stream().collect(Collectors.toList());
    }
    
    public void addToConfiguração(String c){
        this.configuração.add(c);
    }
    
    public void removeDaConfiguração(String c){
        this.configuração.remove(c);
    }
    
    
    public void addCarro(String carro){
        this.carro = carro;
    }
    
    public void setConfig(ArrayList<String> c){
        this.configuração = c.stream().collect(Collectors.toList());
    }
    
    public boolean equals(Object o) {
        boolean b=false;

        if (o!= null && o instanceof Encomenda) {
            Encomenda e = (Encomenda)o;
            b = this.carro.equals(e.getCarro());
        }
        return b;
    }
    
    public Object clone() {
        return new Encomenda(this);
    }

    //Falta imprimir a lista dos arrays
    public String toString() {
        StringBuffer sb = new StringBuffer("Encomenda(");
        sb.append(this.carro);
        return sb.toString();
    }
}
