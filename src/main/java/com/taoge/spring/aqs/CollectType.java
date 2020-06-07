package com.taoge.spring.aqs;

public enum CollectType {

    STU() {
        @Override
        public void get() {

        }
    };

    public abstract void get();
}
