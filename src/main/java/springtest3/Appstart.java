package springtest3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//스프링부터 초기세팅1.내장톰캣세팅2.mvc세팅3.Restful 세팅
public class Appstart {

    public static void main(String[] args) {
        SpringApplication.run(Appstart.class);
    }
}

/*
    패키지구조
        src
            main
                1.java : 백엔드파일
                    2.최상위패키지[웹페이지명]
                        3.controller패키지
                        3.service패키지
                        3.domain 패키지
                        3.스프링실행 클래스[*]
                    1.resources[프론트엔드/설정파일]
                        2.static[css,js,img등등파일]
                            3.js
                            3.css
                            3.img
                        2. templates[html파일]
                        2.applcation.properties[앱설정파일]

 */

/*
    설계 디자인 모델
    MVC2 : 작업파일 패키지 업무분담[JPA를 쓰는경우]
        *안전성 보장위해서 [VIEW -> CONTROLLER // CONTROLLER->SERVICE : PARAM, DTO, VO]
        //DTO : 데이터 이동 객체(이동/읽기/수정 모드) [ CONTROLLER->SERVICE 할때 일반적을 많이 씀]
        //VO : 데이터 이동 객체(읽기모드)
        //ENTITY : DB테이블과 매핑된 객체(SERVICE에서만 사용 권장)
        

    VIEW-----(AJAX DTO)------>CONTROLL ----------(DTO)----------> SERVICE----- JPA -------------> DB
    화면                         제어(VIEW <--> SERVICE)         로직         entity---(매핑)--->table
   -AJAX                                                                         entity조작 :JPARepository
        -URL : create           @(METHOD)Mapping(URL)                      DTO----->ENTITY변환
        -METHOD : get
                                SERVICE 메소드호출               기능구현 로직

    JDBC : JAVA DATABASE CONNECTION 종류
        //1.DAO [JAVAFX, JSP]
        //2.JPA [SPRING에서는 DAO대신 JPA로]
        //3. XML
        * JPA : 매핑[연결]
            //목적 : SQL최소화[ 자바개발자가 SQL반복작성 회피]
            //매핑 : ENTITY(JAVA클래스) ----> DB(테이블)

 */