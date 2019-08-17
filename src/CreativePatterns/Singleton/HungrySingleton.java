package CreativePatterns.Singleton;

/**
 * 用饿汉单例模拟美国总统类
 */
public class HungrySingleton
{
	private static final HungrySingleton instance=new HungrySingleton("特朗普");

	private String name ;

	private HungrySingleton(String name ){
		this.name = name;
		System.out.println("大家好，我是美国总统"+this.name);
	}
	public static HungrySingleton getInstance()
	{
		return instance;
	}

	public  void  setName(String name) {
		this.name = name;
	}
	public  void getName(){
		System.out.println("我是美国总统"+this.name);
}
}
