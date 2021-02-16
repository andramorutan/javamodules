# javamodules

The purpose of the project is to test Java Platform Module System (JPMS), also known as Java Modules.

## Reasons for Java Modularity
- breaking the monolith as Java platform is now composed of modules </br>
  `java --list-modules` to see the list of modules
- strong encapsulation (prior to Java 9 public was too _public_)
  
## Module
https://www.oracle.com/corporate/features/understanding-java-9-modules.html :
The key new language element is the module—a uniquely named, reusable group of related packages, as well as resources (such as images and XML files) and a module descriptor specifying

- the module’s name
- the module’s dependencies (that is, other modules this module depends on)
- the packages it explicitly makes available to other modules (all other packages in the module are implicitly unavailable to other modules)
- the services it offers
- the services it consumes
- to what other modules it allows reflection


### Module Declarations

Modules are declared by `module-info.java` file located at the root of the module.
The module's name should be reverse dns. </br>
`module modulename { 
}`
#### Exports
`exports` directive specifies what packages other modules can use </br>
Usage: `exports exportedPackageName`
See: first/module-info.java & second/module-info.java

#### Exports ... to
`exports ... to` directive specifies what packages a specific module can use
Usage: `exports exportedPackageName to moduleThatCanUseThePackage` 
! As the provider of the module needs to be aware of the consumers this is strongly not recommended
See: first/module-info.java & third/module-info.java

#### Requires
`requires` directive specifies the modules needed by the current module  </br>
Usage: `requires requiredModuleName`
See: second/module-info.java 

#### Requires transitive
`requires transitive requiredAndFurtherExposedModuleName` - directive used to specify the modules needed by the current module that are provided to the consumer of the current module
See: third/module-info.java forth/module-info.java

#### Requires static
`requires static requiredAndOptionallyFurtherExposedModuleName` directive specifies an optional dependency. It is compile-time dependecy

#### Uses

#### Provides with

#### Open

#### Opens

## Next steps: Mavenize this app