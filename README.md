# Spring_study
> 코드로 배우는 스프링 부트, 웹 MVC, DVB, DB 접근 기술 (김영환, 인프런)
## 프로젝트 생성
https://start.spring.io/ 사이트에서 기본적인 템플릿을 구축하고 IntelliJ를 이용하여 프로젝트를 생성한다.
### start.spring.io를 사용할때 유의할점

- Project : Gradle - Groovy를 선택한다. *(maven 도 쓰이긴 하지만 Gradle이 더 최신 기술임.)*
- Language : Java
- Spring Boot : 가장 최신 릴리즈
- Project Metadata
  - Group : 원하는 이름
  - Artifact : 프로젝트 이름
  - Name : 프로젝트 이름과 같음
  - Description : 설명
  - Package name : 자동생성
  - Packaging : Jar
  - Java : 21
- Dependencies : 프레임워크에서 사용하고자 하는 모듈
  - Spring Web : 웹앱 개발 모듈
  - Thymeleaf : html 템플릿 엔진 ( 뷰 엔진 similar EJS? )

## 라이브러리 살펴보기
직접 불러온 라이브러리의 양은 많지 않지만 자동적으로 외부 라이브러리로 들어온다.
Gradle이 패키지 매니져이다. 따라서 의존관계에 있는 모든 라이브러리를 가져온다. (npm과 유사)

### 스프링 부트 라이브러리
- spring-boot-starter-web
  - spring-boot-starter-tomcat : 웹서버
  - spring-webmvc : 스프링 웹 MVC
- spring-boot-starter-thymeleaf : 타임리프 템플릿 엔진(View)
  - spring-boot
    - spring-core
  - spring-boot-starter-logging 로그 관련(현업에서는 log로 남긴다. println은 잘 안쓴다.)
    - slf4j, logback : 인터페이스 실제로그를 어떤 구현체로 할것인가 성능 굿 지원하는것도 많음

### 테스트 라이브러리
- spring-boot-starter-test
  - junit5 : 테스트 프레임워크
  - mockito : 목 라이브러리
  - assertj : 테스트 코드를 좀 더 편하게 작성하게 도와주는 라이브러리
  - spring-test : 스프링 통합 테스트 지원

> **Welcome Page**<br>
Spring Boot supports both static and templated welcome pages. It first looks for an index.html file in the configured static content locations. If one is not found, it then looks for an index template. If either is found, it is automatically used as the welcome page of the application.
This only acts as a fallback for actual index routes defined by the application. The ordering is defined by the order of HandlerMapping beans which is by default the following:
RouterFunctionMapping