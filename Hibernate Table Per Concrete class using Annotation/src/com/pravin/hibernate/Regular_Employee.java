package com.pravin.hibernate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TPC_UNION_ANNOTATION_REG_EMP")
@AttributeOverrides({ @AttributeOverride(column = @Column(name = "id"), name = "id"),
	@AttributeOverride(column = @Column(name = "name"), name = "name") })
public class Regular_Employee extends Employee {
    @Column(name = "salary")
    private float salary;
    @Column(name = "bonus")
    private int bonus;

    public float getSalary() {
	return salary;
    }

    public void setSalary(float salary) {
	this.salary = salary;
    }

    public int getBonus() {
	return bonus;
    }

    public void setBonus(int bonus) {
	this.bonus = bonus;
    }

}
