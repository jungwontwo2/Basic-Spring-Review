package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("fixDiscountPolicy")   Qualifier랑 Primary랑 같이 나오면 더 자세하고 수동인 Qualifier가 우선권 가짐
public class FixDiscountPolicy implements DiscountPolicy {
    private int discountFixAmount=1000;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade()== Grade.VIP){
            return discountFixAmount;
        }else {
        return 0;
        }
    }
}
