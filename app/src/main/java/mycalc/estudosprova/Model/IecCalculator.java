package mycalc.estudosprova.Model;

public class IecCalculator {

    float qtd;

    public IecCalculator(float v) {
        this.qtd = v;
    }

    public float getQtd() {
        return qtd;
    }

    public void setQtd(float qtd) {
        this.qtd = qtd;
    }

    public Float resultIec(){
        return (qtd/1024);
    }



}
