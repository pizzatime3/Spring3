package springtest3.domain.dto;

import lombok.*;

import springtest3.domain.entity.MemberEntity;

@Getter     // get메소드 제공
@Setter     // set메소드 제공
@AllArgsConstructor // 풀 생성자 제공
@NoArgsConstructor // 빈 생성자 제공
@ToString // Tostring 메소드 제공
@Builder    // 객체 생성시 안전성 보장 builder 메소드 제공
public class MemberDto {
    public Integer no;
    public String name;
    public String phone;
    public String memo;
    // 설계 관련 API : 롬복 : 생성자,get,set,빌더,tostring() 등 어노테이션 제공

    // 1. dto -> entitiy 변환 메소드
    public MemberEntity changeEntiity(){
        MemberEntity memberEntitiy =MemberEntity.builder()
                .name( this.name)
                .phone( this.phone)
                .memo( this.memo)
                . build();
        return memberEntitiy;
    }
}
