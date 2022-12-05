public class Board {
    public static void draw(Shape figura) {
        figura.drawFigure();
    }

    public static void main(String[] args) {
        Shape figure1 = new Square();
        draw(figure1);
        Shape figure2 = new Star();
        draw(figure2);
    }
}
