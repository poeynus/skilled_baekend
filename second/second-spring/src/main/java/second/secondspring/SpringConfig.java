package second.secondspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import second.secondspring.repository.MemberRepository;
import second.secondspring.repository.MemoryMemberRepository;
import second.secondspring.service.MemberService;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
