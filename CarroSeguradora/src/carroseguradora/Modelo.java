/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carroseguradora;

/**
 *
 * @author alunolab08
 */
public class Modelo {
    private String nomeModelo;
    private Veiculo possuido;
    
    public Modelo(String nomeModelo){
        this.nomeModelo = nomeModelo;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }
    public Veiculo getPossuido() {
        return possuido;
    }

    public void setPossuido(Veiculo possuido) {
        this.possuido = possuido;
    }
}
