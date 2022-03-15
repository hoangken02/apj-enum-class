package com.kenIT;
enum Level{
    Low,
    Medium,
    High
}
public class Main {

    public static void main(String[] args) {
	Level level = Level.Medium;
    switch (level){
        case Low:
            System.out.println("Low Level");
            break;
        case Medium:
            System.out.println("Medium Level");
            break;
        case High:
            System.out.println("High Level");
            break;
    }

        for (Level levels:
             Level.values()) {
            System.out.println(levels);
        }
    }
}
