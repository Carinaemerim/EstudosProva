package mycalc.estudosprova.Model;

public class SiCalculator {


    public SiCalculator(float v) {
        this.qtd = v;
    }

    public float getQtd() {
        return qtd;
    }

    public void setQtd(float qtd) {
        this.qtd = qtd;
    }

    float qtd;

    public float result_Si(){
        return(qtd/2);

    }
}
