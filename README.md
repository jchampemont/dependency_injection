# Dependency injection examples

This project shows some code for dependency injection using various frameworks.

All examples use the following application classes:

- `FooBarRepository` is a repository responsible for getting `"foo"` and `"bar"` strings from an imaginary database
- `FooService` is a service responsible for getting `"Foo"` from the repository
- `BarService` is a service responsible for getting `"Bar"` from the repository
- `FooBarService` is a service responsible for building `"FooBar"` by assembling `"Foo"` and `"Bar"` retrieved from their respective services
- `StringJoinerService` is a service responsible for joining two strings together

The main goal of this application is to build the string `"FooBar"` which is a really difficult task and require to use such an enterprise-grade Java application.

Each service has at least one implementation.

The `master` branch is not using any dependency injection framework.

The `spring` branch is using the latest version (at the time of writing) of the Spring Framework.

The `guice` branch is using the latest version (at the time of writing) of the Guice Framework.