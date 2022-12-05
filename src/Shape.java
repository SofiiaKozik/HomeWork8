public class Shape implements Figure{
    public String name;

    @Override
    public void drawFigure() {
        System.out.println(name);
    }
}
