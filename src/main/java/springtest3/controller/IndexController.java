package springtest3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springtest3.service.Indexservice;

@Controller
public class IndexController {

    //RESTFUL 정의
        //1. 자원(URL) 2.행위(HTTP Method) 3. 표현
        //2. 행위 (HTTP Method)
            //                      CRUD 차이[멱등성 = 기록하냐안하냐]
            //1. @PostMapping       C       X[보안O 속도 느림 ]   등록 (회원가입,로그인...
            //2. @GetMapping        R       O
            //3. @PutMapping        U       O
            //4. @DeleteMapping     D       O

            // * 여러번 호출했을 때 POST는 호출할때마다 데이터 새로 생성
            // * AJAX -----> SPRING CONTROLLER
            //   AJAX method : POST ----> @PostMapping
            //   AJAX method : GET ----> @GetMapping
            //   AJAX method : PUT ----> @PutMapping
           //   AJAX method : DELETE ----> @DeleteMapping


    @GetMapping("/")
    public String index() {return "main";}

    //static Indexservice indexservice = new Indexservice();
    @Autowired//자동 빈 생성 = 빈생성자 이용한 메모리 할당 , new 사용하지않아도 메모리 할당
    Indexservice indexservice;

    @PostMapping("/create")
    @ResponseBody
    public String create(@RequestParam("name")String name) {

        indexservice.create();
        return "저장성공";
    }

    @GetMapping("/read")
    @ResponseBody
    public String read() {

        indexservice.read();
        return "불러오기성공";
    }

    @PutMapping("/update")
    @ResponseBody
    public String update() {

        indexservice.update();
        return "수정성공";
    }


    @DeleteMapping("/delete")
    @ResponseBody
    public String delete() {

        indexservice.delete();
        return "삭제성공";
    }

}
