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

    @OneToMany
    @JoinColumn(name ="employer_id")
    private List<Job> jobs = new ArrayList<>();

    public Employer(){}

    @NotBlank(message = "Must not be blank")
    @Size(min = 3,max = 75)
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
