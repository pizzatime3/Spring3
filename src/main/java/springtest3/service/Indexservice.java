package springtest3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springtest3.domain.dto.MemberDto;
import springtest3.domain.entity.MemberEntity;
import springtest3.domain.entity.MemberRepository;

@Service
public class Indexservice { // 자바 로직 실행되는 클래스

    @Autowired // 자동 빈 생성
    MemberRepository memberRepository;
    // 1. 생성
    public boolean create(MemberDto memberDto){

        System.out.println("save service");
        // 1. Dto -> entitiy 변환
        MemberEntity memberEntitiy = memberDto.changeEntiity();
        // 2. entitiy save
        int no =  memberRepository.save( memberEntitiy ).getNo(); //  저장 후에 기본키 빼오기
        // 3. 반환
        System.out.println("저장된 엔티티 번호 : " + no );

        if( no > 0  ) {  return  true;   }
        else{ return  false;  }

    }
    // 2.  호출
    public void read(){
        System.out.println("read service ");

    }
    // 3. 수정
    public void update(){
        System.out.println("update service");

    }
    // 4. 삭제
    public void delete(){
        System.out.println("delete service");

    }
}