// ei class "database table" represent kore.
package com.pollob.springflow.model;

// JPA(Java Persistence API) er annotation use korar jonno. ex: Entity, Id, Table
import jakarta.persistence.*;

// Eta Spring k bole ei class DatabaseTable hobe. Jodi ei annotation na dei tahole table create hobe na.
@Entity
// "@Entity" thakai ei class akhon Database Entity.
public class Student { 

	// "Id" bujhai ei field ta primary key hobe.
    @Id
     /*
     * Ei annotation mane value automatically generate hobe.
     * "strategy" bujhai kon rules a value generate hobe.
     * "GenerationType.IDENTITY" eit bujhai Database nije Id generate korbe, "Hibernate/JPA" er responsibility na.
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    /* 
     * Ei variable bahire theke access kora jabe na, etai Encapsulation.
     * "Long" dilam jate id=null jeno hoy, id=0 na hoy. karon id=0 hole spring bujhte pare na id "0" new object naki id=0.
     */
    private Long id;

    private String name;
    private String department;

    // Getter
    public Long getId() {
        return id;
    }

    /*
     * Ei method String return korbe.
     * agei setter method use kore Student-class er "name" variable a value set kore rakhchi.
     * Student class er "name" variable er sei value return korchi.
     */
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    // Setter
    public void setId(Long id) {
        this.id = id;
    }

    /*
     * value set korchi tai kono return type korbo na tai "void" use korlam.
     * String name: "String" data-Type and "name" parameter
     * "this.name" holo student class er variable.
     * paramerer a asa "name" value, student class er "name" variable a set/store hobe.
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}