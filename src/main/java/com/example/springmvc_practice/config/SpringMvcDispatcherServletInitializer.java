package com.example.springmvc_practice.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 이 클래스는 web.xml의 Java 기반 대안으로 사용되며,
 * Spring MVC 애플리케이션의 DispatcherServlet을 초기화하기 위한 설정을 제공한다.
 * AbstractAnnotationConfigDispatcherServletInitializer를 상속받아 사용한다.
 */
public class SpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        // getRootConfigClasses() 메서드는 애플리케이션의 root-level(전역) 설정 클래스를 반환한다.
        // "root" 애플리케이션 컨텍스트는 애플리케이션의 모든 서블릿에 공유되는 빈을 포함한다.
        // 여기서는 특별한 root 설정이 없으므로 null을 반환한다.
        return null;
    }

    /*
    쇼핑몰을 운영하는 데 필요한 특정 부서의 관리자를 선정하는 것에 비유
    쇼핑몰에는 다양한 부서가 있다: 의류, 식료품, 가전제품 등등. 이 모든 부서들이 효율적으로 운영되기 위해서는 각각의 섹션을 관리하는 전문 관리자가 필요하다.
    getServletConfigClasses() 메서드는 쇼핑몰의 '웹 컴포넌트' 부서를 위한 관리자를 선정하는 것과 같다.
    여기서 '웹 컴포넌트' 부서라는 것은, 웹 애플리케이션에서 사용자의 요청을 처리하는 부분, 즉 이전에 DispatcherServlet에서 공부했던 컨트롤러, 뷰 리졸버, 핸들러 매핑 등을 의미한다.
    AppConfig.class는 이 '웹 컴포넌트' 부서의 관리자라고 할 수 있다.
    즉, 이 클래스에는 웹 애플리케이션을 운영하는 데 필요한 모든 설정과 규칙이 정의되어 있다.
    getServletConfigClasses()는 시스템에게 "이것이 우리 웹 애플리케이션의 관리자이다.
    이 관리자가 웹 애플리케이션을 어떻게 설정하고 운영할지를 알고 있으니, 사용자의 요청을 처리할 때는 이 관리자의 지시에 따라주세요."라고 말해주는 것과 같다.
    이 메서드가 반환하는 AppConfig.class는 웹 애플리케이션의 설정을 담당하는 클래스로,
    사용자의 요청을 어떻게 처리할지, 어떤 컨트롤러를 사용할지, 뷰는 어디에 있는지 등의 정보를 스프링 프레임워크에 제공한다.
*/
    @Override
    protected Class<?>[] getServletConfigClasses() {
        // getServletConfigClasses() 메서드는 DispatcherServlet 애플리케이션 컨텍스트에 대한 설정 클래스를 반환한다.
        // 이 컨텍스트는 애플리케이션의 웹 컴포넌트에만 관련된 빈을 포함한다.
        // AppConfig.class는 웹 컨텍스트의 설정 정보를 포함하고 있다.
        return new Class[]{
                AppConfig.class
        };
    }

    /*
    DispatcherServlet은 스프링 MVC에서의 프론트 컨트롤러 패턴을 구현하며, 모든 웹 요청을 받아 적절한 처리를 위해 다른 컴포넌트로 전달하는 역할을 한다.
    이 메서드에서 "/"를 반환함으로써, 웹 애플리케이션의 모든 요청(예: 홈페이지, 사용자 프로필 페이지, 검색 결과 페이지 등)이
    DispatcherServlet을 통과하여 적절한 핸들러로 라우팅되도록 설정한다.
    * */
    @Override
    protected String[] getServletMappings() {
        // getServletMappings() 메서드는 DispatcherServlet이 매핑될 경로를 정의합니다.
        // 여기서 "/"는 애플리케이션의 기본 경로로 설정되며,
        // 이는 모든 요청이 DispatcherServlet으로 라우팅되도록 합니다.
        return new String[]{
                "/"
        };
    }
}
