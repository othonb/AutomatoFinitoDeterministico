package modelo;

import java.util.ArrayList;

public class Automato {
    
    private Estado estadoInicial;
    
    private ArrayList <Estado> estadosFinais;
    
    private ArrayList <Estado> estados;

    public Estado getEstadoInicial() {
        return estadoInicial;
    }

    public void setEstadoInicial(Estado estadoInicial) {
        this.estadoInicial = estadoInicial;
    }

    public ArrayList<Estado> getEstadosFinais() {
        return estadosFinais;
    }

    public void setEstadosFinais(ArrayList<Estado> estadosFinais) {
        this.estadosFinais = estadosFinais;
    }

    public ArrayList<Estado> getEstados() {
        return estados;
    }

    public void setEstados(ArrayList<Estado> estados) {
        this.estados = estados;
    }
    
    
    
}
