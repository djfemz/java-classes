package mavericks.chapter14.examples;

public class Example2 {

    public static void main(String[] args) {
        String s1 = "John";
        String s2 = "James";
        String s3 = "Jane";
        String s4 = "Jamie";
        String s5 = "Joy";
        String s6 = "Ayomide";
        String s7 = "Izuchukwu";
        String s8 = "Izunna";
        String s9 = "Dayo";
        String s10 = "Toheeb";
        String s11 = "Toheeb";

        System.out.println("John compared to Jane ==> "+s1.compareTo(s3)); //14
        System.out.println("James compared to Jamie ==> "+s2.compareTo(s4));//-4
        System.out.println("Joy compared to Ayomide ==> "+s5.compareTo(s6));//-4
        System.out.println("Izuchukwu compared to Izunna ==> "+s7.compareTo(s8));//-11
        System.out.println("Dayo compared to Toheeb ==> "+s9.compareTo(s10));//-16
        System.out.println("Toheeb compared to Toheeb ==> "+s10.compareTo(s11));//0

    }
}
