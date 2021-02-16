package ro.andramorutan.thirdpackage;

import ro.andramorutan.firstpackage.FirstService;
import ro.andramorutan.firstpackage.impl.FirstServiceImpl;

public class Main
{
  public static void main(String[] args)
  {
    FirstService firstService = new FirstServiceImpl();
    firstService.firstMethod();
  }
}
