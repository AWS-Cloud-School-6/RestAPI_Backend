package AWS6.APITest.service;

import AWS6.APITest.entity.Member;
import AWS6.APITest.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor        //의존성 자동 인식
public class MemberService {

    private final MemberRepository memberRepository;

    public Member createMember(Member member){
        Member member1 = memberRepository.save(member);
        return member1;
    }
}
