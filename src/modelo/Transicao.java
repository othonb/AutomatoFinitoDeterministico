package modelo;

public class Transicao {
    
    private Integer idTransicao;
    
    private String nomeTransicao;
    
    private String descricaoTransicao;
    
    private Estado estadoSaida;
    
    private Character simboloLido;

    public Integer getIdTransicao() {
        return idTransicao;
    }

    public void setIdTransicao(Integer idTransicao) {
        this.idTransicao = idTransicao;
    }

    public String getNomeTransicao() {
        return nomeTransicao;
    }

    public void setNomeTransicao(String nomeTransicao) {
        this.nomeTransicao = nomeTransicao;
    }

    public String getDescricaoTransicao() {
        return descricaoTransicao;
    }

    public void setDescricaoTransicao(String descricaoTransicao) {
        this.descricaoTransicao = descricaoTransicao;
    }

    public Estado getEstadoSaida() {
        return estadoSaida;
    }

    public void setEstadoSaida(Estado estadoSaida) {
        this.estadoSaida = estadoSaida;
    }

    public Character getSimboloLido() {
        return simboloLido;
    }

    public void setSimboloLido(Character simboloLido) {
        this.simboloLido = simboloLido;
    }
    
    
}
