module ro.andramorutan.forthModule {
  requires ro.andramorutan.thirdModule;
  provides ro.andramorutan.firstpackage.AnotherService with ro.andramorutan.forthpackage.ForthService;
}