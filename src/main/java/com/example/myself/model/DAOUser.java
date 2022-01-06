package com.example.myself.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user")
@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class DAOUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String username;
	@Column
	@JsonIgnore
	private String password;

	@ManyToMany(fetch = FetchType.EAGER)
	private Set<Role> roles;


}