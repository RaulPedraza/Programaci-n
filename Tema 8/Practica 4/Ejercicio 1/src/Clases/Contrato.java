
package Clases;


public class Contrato {
    private String tipoContrato;

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public Contrato() {
    }

    public Contrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
}
