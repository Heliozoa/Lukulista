/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oma.lukulista.teos;

import oma.lukulista.listat.Kokoelma;
import oma.lukulista.listat.Nimellinen;
import oma.lukulista.tekija.Tekija;

/**
 *
 * @author sasami-san
 */
public interface Teos extends Nimellinen{
    void setTekija(Tekija tekija);
    Tekija getTekija();
    
    void setKategoria(Kategoria kategoria);
    Kategoria getKategoria();
    
    void lisaaTagi(Tagi tagi);
    void poistaTagi(Tagi tagi);
    Kokoelma<Tagi> getTagit();
    
    void setArvosana(Arvosana arvosana);
    Arvosana getArvosana();
}
