
package circunferencia;
 

public class Circunferencia {
    public float radio;

    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    public Circunferencia() {
    }
    
    public float getArea(){
        float area = PI * this.radio * this.radio;
        return area;
    }
    
    public float getLongitud(){
        float Longitud = 2 * PI * this.radio;
        return Longitud;
    }
    public float getvolumen(){
        float volumen = 4 * PI * this.radio * this.radio * this.radio/3;
        return volumen;
    }
    
   
}


    