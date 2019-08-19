package CreativePatterns.Prototype.example6;

import java.util.HashMap;

class ProtoTypeManager
{
	private HashMap<String, Shape> ht=new HashMap<String,Shape>();
	public ProtoTypeManager()
	{
		ht.put("Circle",new Circle());
		ht.put("Square",new Square());
	}
	public void addshape(String key,Shape obj)
	{
		ht.put(key,obj);
	}
	public Shape getShape(String key)
	{
		Shape temp=ht.get(key);
		return (Shape) temp.clone();
	}
}