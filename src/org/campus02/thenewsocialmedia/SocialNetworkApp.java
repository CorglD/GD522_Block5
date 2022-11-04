package org.campus02.thenewsocialmedia;

public class SocialNetworkApp {

    public static void main(String[] args) {
        Profil susi = new Profil("susi.sorglos@email.com", 29, "Susi Sorglos", "5316", 3900);
        susi.printProfile(AccessRoles.Platform);
        Profil max = new Profil("max.mustermann@enail.com", 30, "Max Mustermann", "54111", 3901);
        max.printProfile(AccessRoles.Self);
        susi.setBestFriend(max);
        susi.printProfile(AccessRoles.RegisteredUser);
    }
}
