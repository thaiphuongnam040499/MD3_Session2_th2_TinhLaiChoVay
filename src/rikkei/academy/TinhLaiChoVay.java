package rikkei.academy;

import java.util.Scanner;

public class TinhLaiChoVay {
    public static void main(String[] args) {
        double money = 1.0;
        int month =1;
        double interestRate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so tien vay:");
        money = scanner.nextDouble();
        System.out.println("Nhap so thang vay:");
        month = scanner.nextInt();
        System.out.println("Nhap lai suat hang nam:");
        interestRate = scanner.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Tong lai suat: " +totalInterest);
    }
}
