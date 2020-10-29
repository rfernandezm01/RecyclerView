package com.company.recyclerview;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class ElementosRepositorio {

    MutableLiveData<List<Elemento>> elementos = new MutableLiveData<>(new ArrayList<>());

    ElementosRepositorio(){
        anyadir(new Elemento("hola", "que tal estas"));
        anyadir(new Elemento("adios", "que tal esdfadsatas"));
        anyadir(new Elemento("buenas", "que taldsfaf estas"));
        anyadir(new Elemento("goodbye", "que tal est dsfasd  dsfas"));
    }

    void anyadir(Elemento elemento){
        List<Elemento> list = elementos.getValue();
        list.add(elemento);    // if (list != null)
        elementos.setValue(list);
    }

    void eliminar(int posicion) {
        List<Elemento> list = elementos.getValue();
        list.remove(posicion);
        elementos.setValue(list);
    }
}
