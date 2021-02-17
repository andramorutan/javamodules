package ro.andramorutan.thirdpackage;

import ro.andramorutan.firstpackage.AnotherService;

public class ThirdService implements AnotherService
{
  public ThirdService()
  {
    System.out.println("ThirdService.ThirdService");
  }

  @Override public void anotherMethod()
  {
    System.out.println("ThirdService.anotherMethod");
  }
}
