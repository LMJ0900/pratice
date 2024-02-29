package view;

import Controller.AccountController;

import java.util.Scanner;

public class AccountView {
    public static void main(Scanner sc) {
        AccountController accountController = new AccountController();
        System.out.println("[메뉴] 0-종료\n " +
                "1-계좌생성\n " +
                "2-입금\n " +
                "3-출금\n " +
                "4-잔고 확인\n " +
                "5-계좌 삭제\n" +
                "6-accountList ");
        switch (sc.next()){
            case "0" :
                System.out.println("종료");
                return;
            case "1" :
                System.out.println("계좌생성");
                System.out.println(accountController.createAccount(sc));
                break;
            case "2" :
                System.out.println("입금");
                System.out.println(accountController.deposit(sc));
                break;
            case "3" :
                System.out.println("출금");
                System.out.println(accountController.withdraw(sc));
                break;
            case "4" :
                System.out.println("잔고 확인");
                System.out.println(accountController.getBalance(sc));
                break;
            case "5" :
                System.out.println("계좌 삭제");
                System.out.println(accountController.cancelAccount(sc));
                break;
            case "6" :
                System.out.println("accountList");
                System.out.println(accountController.getAccount(sc));
                break;
        }
    }
}
