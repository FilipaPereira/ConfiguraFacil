/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurafacil.Business;

import configurafacil.Database.EncomendaDAO;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author utilizador
 */
public class GestaoEncomenda {
    private EncomendaDAO encomendas;
    
    public GestaoEncomenda(){
        this.encomendas = new EncomendaDAO();
    }
    
    public Map<Integer,Encomenda> getEncomendas(){
        Map<Integer,Encomenda> e = new HashMap<>();
        for(Map.Entry<Integer,Encomenda> entry: this.encomendas.entrySet()){
            e.put(entry.getKey(), entry.getValue());
        }
        return e;
    }
    
    public void addEncomenda(Encomenda e){
        this.encomendas.put(e.getId(),e);
    }
    
    public void removeEncomenda(Encomenda e){
        this.encomendas.remove(e.getId());
    }
    public void removeEncomenda2(int id){
        this.encomendas.remove(id);        
    }
    
}
