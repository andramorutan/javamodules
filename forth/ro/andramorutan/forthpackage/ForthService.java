package ro.andramorutan.forthpackage;

import ro.andramorutan.firstpackage.AnotherService;

public class ForthService implements AnotherService
{
  private ForthService()
  {
    System.out.println("ForthService.ForthService");
  }

  public static ForthService provider()
  {
    System.out.println("ForthService.provider");
    return new ForthService();
  }

  @Override public void anotherMethod()
  {
    System.out.println("ForthService.anotherMethod");
  }
}
