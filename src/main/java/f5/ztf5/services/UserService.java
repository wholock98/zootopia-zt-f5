package f5.ztf5.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import f5.ztf5.models.User;
import f5.ztf5.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    UserRepository userRepository;

    public void getUserById(Long id){
        userRepository.findById(id);
    }

    public List<User> getAllUsers(){
       return (List<User>) userRepository.findAll();
    }

}
