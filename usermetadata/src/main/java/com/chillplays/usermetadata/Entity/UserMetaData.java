package com.chillplays.usermetadata.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "User")
public class UserMetaData {
    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String email;
    private String uniqueId;


}
