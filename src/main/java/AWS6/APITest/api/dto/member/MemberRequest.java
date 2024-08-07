package AWS6.APITest.api.dto.member;

import lombok.Data;

@Data
public class MemberRequest {

    private String memberId;
    private String memberPw;
    private String memberName;
}
