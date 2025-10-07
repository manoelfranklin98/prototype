public class BaseInimigo {
    private String tipo;
    private int vida;
    private double dano;
    private int velocidade;

    public BaseInimigo(String tipo,int vida, double dano, int velocidade) {
        this.tipo = tipo;
        this.vida = vida;
        this.dano = dano;
        this.velocidade = velocidade;

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public double getDano() {
        return dano;
    }

    public void setDano(double dano) {
        this.dano = dano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void exibirInfo() {
        System.out.println("Tipo: " + tipo + "\nVida: " + vida + "\nDano: " + dano + "\nVelocidade: " + velocidade);
    }
}
