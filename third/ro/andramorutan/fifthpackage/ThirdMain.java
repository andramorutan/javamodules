package ro.andramorutan.fifthpackage;

import ro.andramorutan.firstpackage.FirstService;
import ro.andramorutan.firstpackage.impl.FirstServiceImpl;

public class ThirdMain
{
  public static void main(String[] args)
  {
    FirstService firstService = new FirstServiceImpl();
    firstService.firstMethod();
  }
}
