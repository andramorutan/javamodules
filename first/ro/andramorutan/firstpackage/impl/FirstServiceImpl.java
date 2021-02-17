package ro.andramorutan.firstpackage.impl;

import ro.andramorutan.firstpackage.FirstService;

public class FirstServiceImpl implements FirstService
{
  public FirstServiceImpl()
  {
    System.out.println("FirstServiceImpl.FirstServiceImpl");
  }

  @Override public void firstMethod()
  {
    System.out.println("FirstServiceImpl.firstMethod");
  }

  public void hiddenMethod()
  {
    System.out.println("FirstServiceImpl.hiddenMethod");
  }
}
