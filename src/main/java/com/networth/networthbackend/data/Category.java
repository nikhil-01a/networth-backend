package com.networth.networthbackend.data;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "nw_category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "user_id")
    private long userId;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "type")
    private String type; // ENUM
    @Column(name = "active")
    private Boolean active;
    @Column(name = "priority")
    private String priority; //ENUM
    @Column(name = "budget_amount")
    private BigDecimal budgetAmount;
    @Column(name = "goal_amount")
    private BigDecimal goalAmount;
    @Column(name = "alert")
    private Boolean alert;
    @Column(name = "threshold")
    private BigDecimal threshold;
    @Column(name = "recurring")
    private Boolean recurring;
    @Column(name = "frequency")
    private String frequency; //ENUM
    @Column(name = "currency")
    private String currency; // ENUM
    @Column(name = "tax_related")
    private Boolean taxRelated;
    @Column(name = "transaction_history",columnDefinition = "jsonb")
    private String transactionHistory; // Change to class
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "end_date")
    private Date endDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy hh:mm:ss a z", timezone = "EST")
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "cre_date", updatable = false)
    private Timestamp createDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy hh:mm:ss a z",timezone = "EST")
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "mod_date")
    private Timestamp modifiedDate;

}
