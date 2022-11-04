package org.campus02.thenewsocialmedia;

public class MaybeCreditcardNumber {
    private String maybeCreditCardNumber;
    private AccessRoles needeAccesRole;

    public MaybeCreditcardNumber(String maybeCreditCardNumber) {
        this.maybeCreditCardNumber = maybeCreditCardNumber;
        this.needeAccesRole = AccessRoles.ExternalUser;
    }

    public void deliverValue(AccessRoles accessor){
        switch(accessor){
            case Self:
                System.out.println(maybeCreditCardNumber);
                break;
            case BestFriend:
                System.out.println("forbidden");
        }


    }
}

