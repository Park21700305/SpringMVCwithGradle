//package com.example.springmvc_practice.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//import org.springframework.web.servlet.view.JstlView;
//
///**
// * @author Ramesh Fadatare
// */
//
//// @Configuration 어노테이션은 이 클래스가 스프링 설정 클래스임을 나타낸다.
//// 이 클래스 내의 메소드들은 스프링 컨테이너가 관리하는 빈(Bean) 객체를 정의하거나
//// 설정 정보를 반환한다.
//@Configuration
//
//// @EnableWebMvc 어노테이션은 Spring MVC를 활성화한다.
//// 이것은 <mvc:annotation-driven />과 동일한 기능을 수행하여
//// DispatcherServlet과 같은 Spring MVC의 핵심 부분들을 활성화한다.
//@EnableWebMvc
//
//// @ComponentScan 어노테이션은 스프링이 컴포넌트 스캔을 수행할 기본 패키지를 지정한다.
//// 컴포넌트 스캔은 지정된 패키지와 그 하위 패키지에서 @Component, @Controller,
//// @Service, @Repository 등이 붙은 클래스를 찾아 스프링 빈으로 등록한다.
//@ComponentScan(basePackages = { "com.example.springmvc_practice" })
//public class AppConfig {
//
//    // @Bean 어노테이션은 메소드가 스프링 컨테이너에 의해 관리되는 빈 객체를 생성한다는 것을 나타낸다.
//    // 이 메소드가 반환하는 객체는 스프링의 빈으로 등록되며, 이후 이 빈을 필요로 하는 다른 컴포넌트에 주입될 수 있다.
//    @Bean
//    public InternalResourceViewResolver resolver() {
//        // InternalResourceViewResolver 인스턴스를 생성한다.
//        // 이 객체는 컨트롤러가 반환하는 뷰 이름(논리적이름)을 기반으로 실제 JSP 파일의 경로를 해석하는 역할을 한다.
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//
//        // resolver.setViewClass(JstlView.class); 라인은 JSP 파일에서 JSTL 태그를 사용할 수 있도록 설정한다.
//        // JSTL 태그는 JSP 파일에서 자바 코드를 사용하지 않고도 반복문, 조건문 등을 사용할 수 있게 해준다.
//        resolver.setViewClass(JstlView.class);
//
//        // resolver.setPrefix("/WEB-INF/views/"); 라인은 모든 뷰 이름 앞에 자동으로 붙을 경로를 설정한다.
//        // 예를 들어 컨트롤러가 "helloworld"라는 뷰 이름을 반환하면, "/WEB-INF/views/helloworld.jsp" 파일을 사용하게 된다.
//        resolver.setPrefix("/WEB-INF/views/");
//
//        // resolver.setSuffix(".jsp"); 라인은 모든 뷰 이름 뒤에 자동으로 붙을 확장자를 설정한다.
//        // 이 설정에 의해 "hello" 라는 뷰 이름은 "hello.jsp"로 해석된다.
//        resolver.setSuffix(".jsp");
//
//        // 설정된 InternalResourceViewResolver 객체를 반환한다.
//        // 이 객체는 이후 뷰를 해석할 때 사용된다.
//        return resolver;
//    }
//
//}
