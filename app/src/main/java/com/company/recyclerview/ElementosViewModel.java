package com.company.recyclerview;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

public class ElementosViewModel extends AndroidViewModel {

    ElementosRepositorio elementosRepositorio;

    MutableLiveData<List<Elemento>> listaElementos = new MutableLiveData<>();

    public ElementosViewModel(@NonNull Application application) {
        super(application);

        elementosRepositorio = new ElementosRepositorio();

        listaElementos.setValue(elementosRepositorio.elementos);
    }

    MutableLiveData<List<Elemento>> obtener(){
        return listaElementos;
    }

    void insertar(Elemento elemento){
        elementosRepositorio.insertar(elemento, new ElementosRepositorio.Callback() {
            @Override
            public void cuandoFinalice(List<Elemento> elementos) {
                listaElementos.setValue(elementos);
            }
        });
    }

    void eliminar(Elemento elemento){
        elementosRepositorio.eliminar(elemento, new ElementosRepositorio.Callback() {
            @Override
            public void cuandoFinalice(List<Elemento> elementos) {
                listaElementos.setValue(elementos);
            }
        });
    }

    void actualizar(Elemento elemento, float valoracion){
        elementosRepositorio.actualizar(elemento, valoracion);
    }
}
