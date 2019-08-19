package CreativePatterns.Prototype.example2;

import javax.swing.*;

class SunWukong extends JPanel implements Cloneable
{
	private static final long serialVersionUID = 5543049531872119328L;
	public SunWukong()
	{
		JLabel l1=new JLabel(new ImageIcon("D:\\Dev\\design_patterns\\src\\CreativePatterns\\Prototype\\images\\Wukong.jpg"));
		//建议使用绝对路径
		this.add(l1);
	}
	public Object clone()
	{
		SunWukong w=null;
		try
		{
			w=(SunWukong)super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("拷贝悟空失败!");
		}
		return w;
	}
}