public class Driver 
{
    // Order of Name, Number of Chapters, Summary
	public static void main(String[] args)
	{
		// p = Person("Mike", "Litman", 21)
        Book p = new Book("Genesis", 50, "the Origin story of all things and early days of mankind.");
        Book p2 = new Book("Psalms.", 150, "poetry written by King David as wisdom for all people");
        Book p3 = new Book("Exodus", 40, "the end days of the world and what will happen then.");
		p.display();
        p2.display();
        p3.display();
		System.out.println(p.getBname());

	}
}