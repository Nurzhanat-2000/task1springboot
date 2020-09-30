package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
@Table(name="group1")


public class Group {
    @Id
    private int groupId;
    private String groupName;
}
