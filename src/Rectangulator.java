public class Rectangulator
{
	public static void main(String	[] args)
	{
		int length = Integer.parseInt(args[0]);
		int width = Integer.parseInt(args[1]);

		Rectangle myRect = new Rectangle(length, width);

		String output = String.format("Length :%d  Width:%d  Area:%d  ", myRect.length, myRect.width, myRect.getArea());
		System.out.println(output);
	}
}
