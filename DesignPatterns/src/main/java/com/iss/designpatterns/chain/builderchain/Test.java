package com.iss.designpatterns.chain.builderchain;

/**
 * @description: TODO
 * @author: VODE CODC
 * @create: 2023-06-11 10:58
 **/

public class Test {

    public static void main(String[] args) {
        Member member = new Member();
        member.setUsername("admin");
        member.setPassword("admin");
        Handler.Builder<Member> builder = new Handler.Builder<>();
        builder.addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler());
        Handler<Member> handler = builder.build();
        handler.doHandler(member);
    }

}
