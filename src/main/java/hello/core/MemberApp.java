package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
        //이게 스프링컨테이너라고 보면 됨.
//        모든 객체들을 관리해줌.parameter를 넣어줘야함.
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        //기본적으로 받아올 때 메서드 이름으로 받아옴.두번쨰는 반환받을 클래스 타입.
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        Member member = new Member(1L, "memberA", Grade.VIP);//ctrl alt v
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = "+member.getName());
        System.out.println("find Member = " + findMember.getName());
    }
}
