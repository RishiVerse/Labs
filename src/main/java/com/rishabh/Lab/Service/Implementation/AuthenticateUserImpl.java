//package com.rishabh.Lab.Service.Implementation;
//
//import com.rishabh.Lab.DTO.UserLoginDto;
//import com.rishabh.Lab.DTO.UserRegisterDto;
//import com.rishabh.Lab.Entity.User;
//import com.rishabh.Lab.Repository.UserRepo;
//import com.rishabh.Lab.Service.Interfaces.AuthenticateUser;
//import lombok.AllArgsConstructor;
//import org.modelmapper.ModelMapper;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.HashSet;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//@AllArgsConstructor
//public class AuthenticateUserImpl implements AuthenticateUser {
//
//    ModelMapper modelMapper;
//    UserRepo userRepo;
//    AuthenticationManager authenticationManager;
//    PasswordEncoder passwordEncoder;
//    @Override
//    public UserRegisterDto Register(UserRegisterDto userRegisterDto) {
//
//        User user= new User(userRegisterDto.getUsername(), userRegisterDto.getEmail(), passwordEncoder.encode(userRegisterDto.getPasswordHash()), userRegisterDto.getFirstname(), userRegisterDto.getLastname(),new HashSet<>());
//System.out.println("hello world");
//        userRepo.save(user);
//        return modelMapper.map(user, UserRegisterDto.class);
//    }
//
//    @Override
//    public String Login(UserLoginDto userLoginDto) {
//        Authentication authentication=authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userLoginDto.getUsernameOrEmail(),userLoginDto.getPassword()));
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//
//        return "Login Success";
//    }
//
//    @Override
//    public List<User> getUser() {
//
//        return userRepo.findAll();
//    }
//
//
//}
