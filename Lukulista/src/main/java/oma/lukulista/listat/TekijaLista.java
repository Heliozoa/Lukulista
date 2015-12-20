/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oma.lukulista.listat;

import java.util.ArrayList;
import java.util.List;
import oma.lukulista.tekija.Tekija;
import oma.lukulista.teos.Teos;

/**
 *
 * @author authority
 */
public class TekijaLista implements Lista<Tekija>{
    
    private List<Tekija> tekijat;
    
    public TekijaLista(){
        tekijat = new ArrayList<>();
    }

    @Override
    public void lisaa(Tekija t) {
        tekijat.add(t);
    }

    @Override
    public Tekija haeNimella(String nimi) {
        for(Tekija t : tekijat){
            if(t.getNimi().equals(nimi)){
                return t;
            }
        }
        
        return null;
    }
    
    @Override
    public int getKoko(){
        return tekijat.size();
    }
    
    public List<Tekija> getLista(){
        return tekijat;
    }
}
