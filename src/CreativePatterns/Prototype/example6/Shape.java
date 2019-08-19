package CreativePatterns.Prototype.example6;

interface Shape extends Cloneable
{
	public Object clone();    //拷贝
	public void countArea();    //计算面积
}
