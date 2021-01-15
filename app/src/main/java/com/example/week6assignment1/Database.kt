package com.example.week6assignment1


import com.example.week6assignment1.model.StudentDetails

var studentList = arrayListOf<StudentDetails>()
class Database {
    fun appendStudent(studentDetails: StudentDetails){
        studentList.add(studentDetails)
    }
    fun returnStudent():ArrayList<StudentDetails>{
        return studentList
    }
    fun deleteStudent(studentDetails: StudentDetails){
        studentList.remove(studentDetails)
    }
}