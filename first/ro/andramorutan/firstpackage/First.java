package ro.andramorutan.firstpackage;

import ro.andramorutan.firstpackage.impl.FirstServiceImpl;

public class First
{
  private FirstServiceImpl firstService = new FirstServiceImpl();

  public void doSomething()
  {
    getFirstService().firstMethod();
  }

  public FirstService getFirstService()
  {
    return firstService;
  }
}
