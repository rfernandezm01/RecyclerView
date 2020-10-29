package com.company.recyclerview;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

public class ElementosViewModel extends AndroidViewModel {

    ElementosRepositorio elementosRepositorio;

    public ElementosViewModel(@NonNull Application application) {
        super(application);

        elementosRepositorio = new ElementosRepositorio();
    }


    MutableLiveData<List<Elemento>> obtenerListaElementos(){
        return elementosRepositorio.elementos;
    }

    void anyadirElemento(Elemento elemento){
        elementosRepositorio.anyadir(elemento);
    }

    void eliminarElemento(int posicion){
        elementosRepositorio.eliminar(posicion);
    }
}
