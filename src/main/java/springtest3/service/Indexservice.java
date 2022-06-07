package springtest3.service;

import org.springframework.stereotype.Service;

@Service
public class Indexservice {//자바 로직 실행되는 클래스

    //1.생성
    public void create(String name, String phone, String memo){
        System.out.println("저장 서비스호출");
    }

    //2.호출
    public void read(){
        System.out.println("호출 서비스호출");
    }

    //3. 수정
    public void update(){
        System.out.println("수정 서비스호출");
    }

    //4. 삭제
    public void delete(){
        System.out.println("삭제 서비스호출");
    }
}
