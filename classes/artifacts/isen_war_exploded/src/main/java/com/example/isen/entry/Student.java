package com.example.isen.entry;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.id
     *
     * @mbggenerated Fri Dec 14 17:13:49 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.student_id
     *
     * @mbggenerated Fri Dec 14 17:13:49 CST 2018
     */
    private Integer studentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.name
     *
     * @mbggenerated Fri Dec 14 17:13:49 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.age
     *
     * @mbggenerated Fri Dec 14 17:13:49 CST 2018
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.sex
     *
     * @mbggenerated Fri Dec 14 17:13:49 CST 2018
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.isOk
     *
     * @mbggenerated Fri Dec 14 17:13:49 CST 2018
     */
    private Date isok;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.birthday
     *
     * @mbggenerated Fri Dec 14 17:13:49 CST 2018
     */
    private Date birthday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.modifiry_tm
     *
     * @mbggenerated Fri Dec 14 17:13:49 CST 2018
     */
    private Date modifiryTm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table student
     *
     * @mbggenerated Fri Dec 14 17:13:49 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.id
     *
     * @return the value of student.id
     *
     * @mbggenerated Fri Dec 14 17:13:49 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.id
     *
     * @param id the value for student.id
     *
     * @mbggenerated Fri Dec 14 17:13:49 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.student_id
     *
     * @return the value of student.student_id
     *
     * @mbggenerated Fri Dec 14 17:13:49 CST 2018
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.student_id
     *
     * @param studentId the value for student.student_id
     *
     * @mbggenerated Fri Dec 14 17:13:49 CST 2018
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.name
     *
     * @return the value of student.name
     *
     * @mbggenerated Fri Dec 14 17:13:49 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.name
     *
     * @param name the value for student.name
     *
     * @mbggenerated Fri Dec 14 17:13:49 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.age
     *
     * @return the value of student.age
     *
     * @mbggenerated Fri Dec 14 17:13:49 CST 2018
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.age
     *
     * @param age the value for student.age
     *
     * @mbggenerated Fri Dec 14 17:13:49 CST 2018
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.sex
     *
     * @return the value of student.sex
     *
     * @mbggenerated Fri Dec 14 17:13:49 CST 2018
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.sex
     *
     * @param sex the value for student.sex
     *
     * @mbggenerated Fri Dec 14 17:13:49 CST 2018
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.isOk
     *
     * @return the value of student.isOk
     *
     * @mbggenerated Fri Dec 14 17:13:49 CST 2018
     */
    public Date getIsok() {
        return isok;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.isOk
     *
     * @param isok the value for student.isOk
     *
     * @mbggenerated Fri Dec 14 17:13:49 CST 2018
     */
    public void setIsok(Date isok) {
        this.isok = isok;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.birthday
     *
     * @return the value of student.birthday
     *
     * @mbggenerated Fri Dec 14 17:13:49 CST 2018
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.birthday
     *
     * @param birthday the value for student.birthday
     *
     * @mbggenerated Fri Dec 14 17:13:49 CST 2018
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.modifiry_tm
     *
     * @return the value of student.modifiry_tm
     *
     * @mbggenerated Fri Dec 14 17:13:49 CST 2018
     */
    public Date getModifiryTm() {
        return modifiryTm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.modifiry_tm
     *
     * @param modifiryTm the value for student.modifiry_tm
     *
     * @mbggenerated Fri Dec 14 17:13:49 CST 2018
     */
    public void setModifiryTm(Date modifiryTm) {
        this.modifiryTm = modifiryTm;
    }
}