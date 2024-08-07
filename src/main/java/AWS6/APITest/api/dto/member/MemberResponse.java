package AWS6.APITest.api.dto.member;

import AWS6.APITest.entity.Member;
import lombok.Data;

@Data
public class MemberResponse {

    private String memberId;
    private String memberPw;
    private String memberName;

    public MemberResponse(Member member) {
        this.memberId = member.getMemberId();
        this.memberPw = member.getMemberPw();
        this.memberName = member.getMemberName();
    }

    public static MemberResponse toDto(Member member) {
        return new MemberResponse(member);
    }
}
