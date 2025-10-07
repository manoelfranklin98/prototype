public class ZumbiPrototype implements IinimigoPrototype{
    private BaseInimigo baseInimigo;

    public ZumbiPrototype(String tipo, int vida, double dano, int velocidade) {
        this.baseInimigo = new BaseInimigo(tipo, vida, dano, velocidade);
    }

    @Override
    public BaseInimigo clonarInimigo() {
        return new BaseInimigo(
                baseInimigo.getTipo(),
                baseInimigo.getVida(),
                baseInimigo.getDano(),
                baseInimigo.getVelocidade()
        );
    }
}