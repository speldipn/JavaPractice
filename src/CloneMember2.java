import java.util.Arrays;

/**
 * @author Oh, Joon young
 * @since 2018-01-25
 **/
class Car {
    public String model;

    public Car(String model) {
        this.model = model;
    }
}

public class CloneMember2 {
    public String name;
    public int age;
    public int[] scores;
    public Car car;


    public CloneMember2(String name, int age, int[] scores, Car car) {
        this.name = name;
        this.age = age;
        this.scores = scores;
        this.car = car;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        CloneMember2 cloned = (CloneMember2)super.clone();
        cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
        cloned.car = new Car(this.car.model);
        return cloned;
    }

    public CloneMember2 getMember() {
        CloneMember2 cloned = null;
        try {
            cloned = (CloneMember2)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }

    public static void main(String[] args) {
        CloneMember2 original = new CloneMember2("홍길동", 25, new int[]{90, 90}, new Car("소나타"));

        CloneMember2 cloned = original.getMember();
        cloned.scores[0] = 100;
        cloned.car.model = "그렌져";

        System.out.println("[복제 객체의 필드값]");
        System.out.println("name: " + cloned.name);
        System.out.println("age: " + cloned.age);
        System.out.println("scores: {");
        for (int i = 0; i < cloned.scores.length; i++) {
            System.out.println(cloned.scores[i]);
            System.out.println((i == (cloned.scores.length-1))? ":" : ",");
        }
        System.out.println("}");
        System.out.println("car: " + cloned.car.model);

        System.out.println();

        System.out.println("[원본 객체의 필드값]");
        System.out.println("name: " + original.name);
        System.out.println("age: " + original.age);
        System.out.println("scores: {");
        for (int i = 0; i < original.scores.length; i++) {
            System.out.println(original.scores[i]);
            System.out.println((i == original.scores.length) ? ":" : ",");
        }
        System.out.println("}");
        System.out.println("car: " + original.car.model);
    }
}
