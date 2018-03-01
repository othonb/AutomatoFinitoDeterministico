package modelo;

import java.util.ArrayList;

public class Estado {
    
    private Integer idEstado;
    
    private String nomeEstado;
    
    private String descricaoEstado;
    
    private ArrayList <Transicao> listaTransicao;

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public String getDescricaoEstado() {
        return descricaoEstado;
    }

    public void setDescricaoEstado(String descricaoEstado) {
        this.descricaoEstado = descricaoEstado;
    }

    public ArrayList<Transicao> getListaTransicao() {
        return listaTransicao;
    }

    public void setListaTransicao(ArrayList<Transicao> listaTransicao) {
        this.listaTransicao = listaTransicao;
    }
    
    
    
}
