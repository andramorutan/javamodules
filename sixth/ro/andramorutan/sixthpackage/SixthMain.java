package ro.andramorutan.sixthpackage;

import ro.andramorutan.firstpackage.First;
import ro.andramorutan.firstpackage.FirstService;

public class SixthMain
{
  public static void main(String[] args)
  {
    System.out.println("SixthMain.main");

    useReflection();
  }

  private static void useReflection()
  {
    //  FirstServiceImpl = new FirstServiceImpl();


    try
    {
      FirstService firstService = new First().getFirstService();
      java.lang.reflect.Method method = firstService.getClass().getMethod("hiddenMethod");
      System.out.println("Method " + method);

       method.invoke(firstService);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
}
