module ro.andramorutan.thirdModule {
  requires transitive ro.andramorutan.firstmodule;
  provides ro.andramorutan.firstpackage.AnotherService with ro.andramorutan.thirdpackage.ThirdService;
}