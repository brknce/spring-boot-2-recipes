# Spring Boot 2 Recipes
<b> A Problem-Solution Approach </b><br>
This repo will focus on developing software using Spring Boot 2.1 and the supported projects like Spring Security, Spring AMQP etc.

<b> Notes </b>
<ul>
  <li>Spring @Bean annotation tells that a method produces a bean to be managed by the Spring container. It is a method-level annotation. During Java configuration ( @Configuration ), 
the method is executed and its return value is registered as a bean within a BeanFactory.</li>
  
  <li>@SpringBootApplication includes both @ComponentScan and @Configuration. This means that any @Component annotated class will be automatically detected and instantiated by Spring Boot; 
it also allows for @Bean methods to be defined to declare beans.</li>
  
  <li>Place the @SpringBootApplication annotated class in a top-level package; this way it will automatically detect all your annotated components, configuration classes, etc. defined in 
this package and all subpackages.</li>
  
  <li>With @Component annotation, Spring Boot will detect this class and create a bean instance from it. The @PostConstruct annotated method is invoked after construction.</li>
</ul>






