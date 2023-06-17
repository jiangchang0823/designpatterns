package com.iss.designpatterns.chain.builderchain;

/**
 * @description: TODO
 * @author: VODE CODC
 * @create: 2023-06-11 10:39
 **/

public abstract class Handler<T> {

    protected Handler<T> next;

    public void next(Handler<T> next) {
        this.next = next;
    }

    public abstract void doHandler(Member member);

    public static class Builder<T> {

        private Handler<T> head;
        private Handler<T> tail;

        public Builder<T> addHandler(Handler<T> handler) {
            if (this.head == null) {
                this.head = handler;
                this.tail = handler;
                return this;
            }
            this.tail.next(handler);
            this.tail = handler;
            return this;
        }

        public Handler<T> build() {
            return this.head;
        }

    }

}
