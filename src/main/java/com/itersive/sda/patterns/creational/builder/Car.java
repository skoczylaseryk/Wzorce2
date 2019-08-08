package com.itersive.sda.patterns.creational.builder;

public class Car {
    private String name;
    private String owner;
    private Double price;
    private Integer age;

    public CarBuilder builder() {
        return new CarBuilder();
    }

    private Car(CarBuilder builder) {
        this.name = builder.name;
        this.owner = builder.owner;
        this.price = builder.price;
        this.age = builder.age;
    }

    public static class CarBuilder {
        private String name;
        private String owner;
        private Double price;
        private Integer age;

        public Car build() {
            return new Car(this);
        }

        public CarBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public CarBuilder withOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public CarBuilder withPrice(Double price) {
            this.price = price;
            return this;
        }

        public CarBuilder withAge(int age) {
            this.age = age;
            return this;
        }
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getAge() {
        return age;
    }
}
