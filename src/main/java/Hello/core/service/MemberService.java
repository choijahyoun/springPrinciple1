package Hello.core.service;

import Hello.core.Member.Member;

public interface MemberService {
    void join(Member member);

    Member findMember(Long memberId);
}
