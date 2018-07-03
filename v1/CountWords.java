public class CountWords{
  public static void main(String[] args){
    System.out.println("hello world");
    if (args.length > 0){
      System.out.println("I found parameters!");
      for (String a : args){
        System.out.println(a);
      }
    }
  }

}
