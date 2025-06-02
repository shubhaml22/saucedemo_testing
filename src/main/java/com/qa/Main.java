package com.qa;

import com.qa.tests.*;
import org.checkerframework.checker.units.qual.C;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        ValidLoginTest login=new ValidLoginTest();
//        login.login();
//        InvalidLoginTest login=new InvalidLoginTest();
//        login.login();
//        AddtoCard ap=new AddtoCard();
//        ap.addproduct();
//        AddMultipleProduct apm=new AddMultipleProduct();
//        apm.addproduct();
//        RemoveItems ri=new RemoveItems();
//        ri.remove_i();
//        CheckOutStep_1 co1=new CheckOutStep_1();
//        co1.checkOut1();
//        checkOutStep_2 co2=new checkOutStep_2();
//        co2.checkOut2();
//        LogoutTest lo=new LogoutTest();
//        lo.logout();
//        sortProduct sp=new sortProduct();
//        sp.s_product();
        VerifyTittleAndHeading verify=new VerifyTittleAndHeading();
        verify.verify();

    }
}
