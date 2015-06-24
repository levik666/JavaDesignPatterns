package com.levik.patterns.string;

public class RevertString {

    private StringBuilder builder;

    public RevertString(String text) {
        this.builder = new StringBuilder(text);
    }

    public String revert(){
        return builder.reverse().toString();
    }

    public String revertMySelf(){
        String text = builder.toString();

        if(text.isEmpty()){
            return text;
        }

        String reverse = "";
        for(int index = text.length() - 1; index>=0; index--){
            reverse +=  text.charAt(index);
        }

        return reverse;
    }

    @Override
    public String toString() {
        return "RevertString{" +
                "builder=" + builder +
                '}';
    }

    public static void main(String[] args) {
        final RevertString revertString = new RevertString("Hello World");

        System.out.println("Current text " + revertString);

        System.out.println("My method " + revertString.revertMySelf());
        System.out.println("Builder method " + revertString.revert());
    }
}
