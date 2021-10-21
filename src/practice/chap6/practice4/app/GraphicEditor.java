package practice.chap6.practice4.app;
import practice.chap6.practice4.base.Shape;
import practice.chap6.practice4.derived.Circle;

public class GraphicEditor {
	public static void main(String[] args) {
		Shape shape = new Circle();
		shape.draw();
	}
}