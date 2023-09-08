package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
// @Component 애노테이션이 붙은 클래스를 스프링 빈으로 등록함
@ComponentScan(
        // basePackages = "hello.core.member", //member 하위패키지만 스캔함, 여러 시작위치를 지정할 수 있음, 디폴트는 해당 패키지 하위
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)

)
public class AutoAppConfig {

    /*
    @Bean
    MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    */

}
