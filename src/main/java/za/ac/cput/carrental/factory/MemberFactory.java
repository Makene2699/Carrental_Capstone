package za.ac.cput.carrental.factory;

//Stephanie Tola Oluwafemi Lewu
// Student Number: 230211216
// 28 June 2026

import za.ac.cput.carrental.domain.Member;
import za.ac.cput.carrental.util.Helper;

public class MemberFactory {
   public static Member createMember(String name,
                                     String licenseNumber,
                                     String phoneNumber,
                                     String accountStatus){
       return new Member.Builder()
               .setMemberId(Helper.generateId())
               .setName(name)
               .setLicenseNumber(licenseNumber)
               .setPhoneNumber(phoneNumber)
               .setAccountStatus(accountStatus)
               .build();
   }
}
