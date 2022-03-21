package com.company.homeTask;

public class Phone {

    private String number;
    private String model;
    private int weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber(){
        return this.number;
    }

    public String getModel(){
        return this.model;
    }

    public int getWeight(){
        return this.weight;
    }

    public static String receiveCall(String name) {
        return "Вам звонит " + name;
    }

    public static String receiveCall(String namne, String numer) {
        return "Вам звонит " + namne + " (" + numer + ")";
    }

    public static void sendMessage(String ...numbers){
        System.out.println("Рассылка сообщения будет по данным номерам:");
        for(String number : numbers){
            System.out.println(number);
        }
    }
}
