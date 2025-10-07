
public class Main {
    public static void main(String[] args) {
       IinimigoPrototype zumbi = new ZumbiPrototype("Zumbi", 10, 10, 10);
       IinimigoPrototype  dragao = new DragaoPrototype("dragao", 15, 15, 15);

       BaseInimigo zumbiClone1 = zumbi.clonarInimigo();
       BaseInimigo zumbiClone2 = zumbi.clonarInimigo();
       zumbiClone1.exibirInfo();
       zumbiClone2.exibirInfo();

       BaseInimigo dragaoClone1 = dragao.clonarInimigo();
       BaseInimigo dragaoClone2 = dragao.clonarInimigo();
       dragaoClone1.exibirInfo();
       dragaoClone2.exibirInfo();
    }
}