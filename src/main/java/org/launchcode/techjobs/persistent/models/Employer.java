package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.*;
@Entity
public class Employer extends AbstractEntity {
    @OneToMany(mappedBy = "employers")
    @JoinColumn (name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

    public Employer() {

        this.jobs = new ArrayList<Job>();
    }
    @NotNull
    @NotBlank
    @Size (min=4, max=60, message="Variable must be between 4 and 60 characters.")
    private String location;
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }
}
