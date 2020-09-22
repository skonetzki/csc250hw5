public class Book
{
  private String bName;
  private int bNumChap;
  private String bSum;

  public Book(String bName, int bNumChap, String bSum)
    {
      this.bName = bName;
      this.bNumChap = bNumChap;
      this.bSum = bSum;
    }
    
    public String getBname()
    {
      return this.bName;
    }
    
    public void display()
    {
      System.out.println("(The book: " + this.bName + " has " + this.bNumChap + " chapters and talks about " + this.bSum + ")");
    }
  }


