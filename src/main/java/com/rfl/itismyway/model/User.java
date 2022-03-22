package com.rfl.itismyway.model;

import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Setter
public class User extends AbstractPersistable<Integer> {
    private String name;
    private String email;
    private String password;
    private Date registered;
    private boolean enabled;
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), uniqueConstraints =
            {@UniqueConstraint(columnNames = {"user_id", "role"}, name = "user_roles_unique")})
            @Column(name = "role")
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Role> roles;
}
