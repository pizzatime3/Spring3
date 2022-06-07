package springtest3.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MemberEntity {

    @Id//pk설정
    @GeneratedValue(strategy = GenerationType.IDENTITY)//
    Integer

}
