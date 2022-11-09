package test;

import java.util.Objects;

public class Main {

    public static void main(String args[]){
        class Cat {
            String name ;
            Cat (String name){
                this.name = name;
            }
            public void print() {
                System.out.println("고양이 이름 출력한다." + name);
            }
        }

        class Dog {
            String name;
            Dog(String name){
                this.name = name;
            }

            public void print(Cat cat) {
                System.out.println("강아지 이름 출력한다." + cat.name);
            }
        }

        Cat cat = new Cat("냐용");
        Dog dog = new Dog("왈왈");
        cat.print();
        dog.print(cat);
//        cat.print = dog.print;
    }
}

