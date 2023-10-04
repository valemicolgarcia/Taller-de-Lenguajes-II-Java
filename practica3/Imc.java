public class Imc{
    
    //variables de instancia
    private float peso;
    private float altura;
    
    public Imc (){

    }

    public Imc (float altura, float peso){
        this.altura = altura;
        this.peso =peso;
    }

    //getters y setters
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    //metodo calculo (devuelve el valor del imc)
    public float calculo (){
        float imc = peso / (altura * altura);
        return imc;
    }

    //SOBRECARGA --> dos metodos con el mismo nombre pero que difieren en la firma
    public float calculo (long peso, long altura){
        float imc = peso / (altura * altura);
        return imc;
    }
    

}

