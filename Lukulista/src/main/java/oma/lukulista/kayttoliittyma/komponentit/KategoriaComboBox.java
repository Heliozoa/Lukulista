/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oma.lukulista.kayttoliittyma.komponentit;

import javax.swing.JComboBox;
import oma.lukulista.domain.enumit.Kategoria;

/**
 * Drop-down lista joka sisältää kaikki eri kategoriat.
 */
public class KategoriaComboBox extends JComboBox {

    public KategoriaComboBox() {
        for (Kategoria k : Kategoria.values()) {
            addItem(k);
        }
    }
}
