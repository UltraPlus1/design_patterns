package principle;
public class LSPtest
{
	public static void main(String[] args)
	{
		Bird bird1=new Swallow();
		Bird bird2=new BrownKiwi();
		bird1.setSpeed(120);
		bird2.setSpeed(120);
		System.out.println("如果飞行300公里：");
		try
		{
			System.out.println("燕子将飞行"+bird1.getFlyTime(300)+"小时.");
			System.out.println("几维鸟将飞行"+bird2.getFlyTime(300)+"小时。");
		}
		catch(Exception err)
		{
			System.out.println("发生错误了!");
		}
	}
}
//鸟类
class Bird
{
	double flySpeed;
	public void setSpeed(double speed)
	{
		flySpeed=speed;
	}
	public double getFlyTime(double distance)
	{
		return(distance/flySpeed);
	}
}
//燕子类
class Swallow extends Bird{}
//几维鸟类
class BrownKiwi extends Bird
{
	public void setSpeed(double speed)
	{
		flySpeed=0;
	}
}