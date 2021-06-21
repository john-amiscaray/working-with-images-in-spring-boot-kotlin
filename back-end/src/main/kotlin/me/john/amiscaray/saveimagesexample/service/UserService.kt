package me.john.amiscaray.saveimagesexample.service

import me.john.amiscaray.saveimagesexample.dao.UserRepo
import me.john.amiscaray.saveimagesexample.entities.User
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile

@Service
class UserService(private val userRepo: UserRepo) {

    fun setProfilePicture(id: Long, file: MultipartFile){

        val user : User = userRepo.findById(id).orElseThrow()
        user.profilePicture = file.bytes
        userRepo.save(user)

    }

    fun getProfilePicture(id: Long): ByteArray{

        val user: User = userRepo.findById(id).orElseThrow()
        return user.profilePicture

    }

}