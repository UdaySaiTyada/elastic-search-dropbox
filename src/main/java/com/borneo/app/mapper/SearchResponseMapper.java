//package com.borneo.app.mapper;
//
//import com.borneo.app.data.entity.AdminEntity;
//import com.borneo.app.data.response.AdminResponse;
//import com.borneo.app.utils.StringUtilities;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
//
//@Component
//@Qualifier("searchResponseMapper")
//public class SearchResponseMapper implements Mapper<AdminEntity, AdminResponse>
//{
//
//    @Override
//    public AdminEntity toEntity(AdminResponse adminResponse) {
//        return null;
//    }
//
//    @Override
//    public AdminResponse toPojo(AdminEntity adminEntity)
//    {
//        AdminResponse adminResponse = new AdminResponse();
//        adminResponse.setId(adminEntity.getId());
//        adminResponse.setFirstName(adminEntity.getFirstName());
//        adminResponse.setLastName(adminEntity.getLastName());
//        adminResponse.setName(StringUtilities.getFullName(adminEntity.getFirstName(), adminEntity.getLastName()));
//        adminResponse.setEmail(adminEntity.getEmail());
//        adminResponse.setMobileNumber(adminEntity.getMobileNumber());
//        adminResponse.setProfilePicture(adminEntity.getProfilePicture());
//        adminResponse.setSubrole(adminEntity.getSubrole());
//        return adminResponse;
//    }
//}
