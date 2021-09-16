package br.edu.ifpb;

public class Person {
    public String name, sex;
    public int age;
    public double weight;
    public boolean isBreastfeeding, isPregnant, isFever, isDonor, isChildbirthOK ;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isBreastfeeding() {
        return isBreastfeeding;
    }

    public void setBreastfeeding(boolean breastfeeding) {
        isBreastfeeding = breastfeeding;
    }

    public boolean isPregnant() {
        return isPregnant;
    }

    public void setPregnant(boolean pregnant) {
        isPregnant = pregnant;
    }

    public boolean isFever() {
        return isFever;
    }

    public void setFever(boolean fever) {
        isFever = fever;
    }

    public boolean isDonor() {
        return isDonor;
    }

    public void setDonor(boolean donor) {
        isDonor = donor;
    }

    public boolean isChildbirthOK() {
        return isChildbirthOK;
    }

    public void setChildbirthOK(boolean childbirthOK) {
        isChildbirthOK = childbirthOK;
    }
}
