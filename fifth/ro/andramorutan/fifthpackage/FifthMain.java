package ro.andramorutan.fifthpackage;

import ro.andramorutan.firstpackage.AnotherService;

import java.util.ServiceLoader;

public class FifthMain
{
  public static void main(String[] args)
  {
    Iterable<AnotherService> services = ServiceLoader.load(AnotherService.class);
    for (AnotherService service : services)
    {
      service.anotherMethod();
    }
  }
}
