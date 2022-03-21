package com.company;

import com.company.homeTask.Phone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Phone[] phones = {new Phone("+375298456235","iPhone",300),
                          new Phone("+375446598423","Samsung", 245),
                          new Phone("+375336200123","Huawei",290)};

        System.out.println(Phone.receiveCall("Марк"));
        System.out.println(Phone.receiveCall("Марк",phones[0].getNumber()));

        System.out.println();

        Phone.sendMessage(phones[0].getNumber(),phones[1].getNumber(),phones[2].getNumber());
    }
}
