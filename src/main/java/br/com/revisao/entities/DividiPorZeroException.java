package br.com.revisao.entities;

public class DividiPorZeroException extends ArithmeticException{

    public DividiPorZeroException(String msg) {
        super(msg);
    }
}
