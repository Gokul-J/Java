public class Beer_Bottles_song {
	public static void main(String[] args)
	{
		int beer = 99;
		while(beer>0)
		{
			if(beer>1)
			{
				System.out.println(beer+" bottles of beer on the wall," +beer +" bottles of beer");
				beer--;
				System.out.println("Take one down and pass it around, " +beer+" bottles of beer on the wall");
				System.out.println("");
			}
			else
			{
				System.out.println("1 bottle of beer on the wall, 1 bottle of beer");
				System.out.println("Take one down and pass it around, no more bottles of beer on the wall");
				beer--;
				System.out.println("");
			}
		}
		System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
		System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall");
	}

}


