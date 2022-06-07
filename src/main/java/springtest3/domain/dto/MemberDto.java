package springtest3.domain.dto;

import lombok.*;

@Getter //get메소드제공
@Setter //set메소드제공
@AllArgsConstructor //풀생성자 제공
@NoArgsConstructor
@ToString
@Builder
public class MemberDto {


    public Integer no;

    public String name;

    public String phone;

    public String memo;

    //설계 관련 api : 롬복 : 생성자,get,set,빌더,tostring() 등 어노테이션 제공



}
