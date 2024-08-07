package AWS6.APITest.service;

import AWS6.APITest.entity.Member;
import AWS6.APITest.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor        //의존성 자동 인식
public class MemberService {

    private final MemberRepository memberRepository;

    public Member createMember(Member member){
        return memberRepository.save(member);
    }

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

}
