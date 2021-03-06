/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oma.lukulista.domain.tekija;

import java.io.Serializable;
import java.util.List;
import oma.lukulista.domain.Nimellinen;
import oma.lukulista.domain.teos.Teos;

/**
 * Sisältää tekijän attribuutit sekä listan teoksista.
 */
public interface Tekija extends Nimellinen, Serializable {

    void lisaaTeos(Teos teos);

    void poistaTeos(Teos teos);

    List<Teos> getTeokset();
}
