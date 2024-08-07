package AWS6.APITest.api.controller;

import AWS6.APITest.entity.Member;
import AWS6.APITest.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;

    @PostMapping
    public void createMember(@RequestBody String memberId,
                             @RequestBody String memberPw,
                             @RequestBody String memberName){
        Member member = new Member(memberId,memberPw,memberName);
        memberService.createMember(member);
    }

}
