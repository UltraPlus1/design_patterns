package CreativePatterns.Prototype.example2;

import java.awt.*;
import javax.swing.*;

public class ProtoTypeWukong
{
	public static void main(String[] args)
	{
		JFrame jf=new JFrame("原型模式测试");
		jf.setLayout(new GridLayout(1,2));
		Container contentPane=jf.getContentPane();
		SunWukong obj1=new SunWukong();
		contentPane.add(obj1);
		SunWukong obj2=(SunWukong)obj1.clone();//克隆
		contentPane.add(obj2);
		jf.pack();
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}