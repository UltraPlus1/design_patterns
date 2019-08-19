package CreativePatterns.Prototype.example6;

public class ProtoTypeShape {
	public static void main(String[] args) {
		ProtoTypeManager pm = new ProtoTypeManager();
		Shape circle = pm.getShape("Circle");
		Shape square = pm.getShape("Square");
		circle.countArea();
		square.countArea();
	}
}
