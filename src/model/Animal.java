package model;

public class Animal {
    public int age, weight;
    public  String running, eating;

    public String getRunning(){
        return running;
    }
    public String getEating(){
        return eating;
    }
    public int getWeight(){
        return weight;
    }
    public int getAge(){
        return age;
    }

    public void setRunning(String speed){
        this.running = speed;
    }
    public void setEating(String eat){ this.eating = eat;}
    public void setAge(int age){
        this.age = age;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
}
