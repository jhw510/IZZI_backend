package com.team.web.statistics;

import lombok.*;

import javax.persistence.*;

@Getter @Setter @Entity @ToString @NoArgsConstructor
@Table(name="statistics")
public class Statistics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="key_id") private Long keyId;
    @Column(name="daily_visit") private String dailyVisit;
    @Column(name="monthly_visit") private String monthlyVisit;
    @Column(name="yearly_visit") private String yearlyVisit;
    @Column(name="daily_profit") private String dailyProfit;
    @Column(name="monthly_profit") private String monthlyProfit;
    @Column(name="yearly_profit") private String yearlyProfit;
    @Column(name="pattern") private String pattern;

    @Builder
    private Statistics(
                       String dailyVisit,
                       String monthlyVisit,
                       String yearlyVisit,
                       String dailyProfit,
                       String monthlyProfit,
                       String yearlyProfit,
                       String pattern
                       ){
        this.dailyVisit=dailyVisit;
        this.monthlyVisit=monthlyVisit;
        this.yearlyVisit=yearlyVisit;
        this.dailyProfit=dailyProfit;
        this.monthlyProfit=monthlyProfit;
        this.yearlyProfit=yearlyProfit;
        this.pattern=pattern;
    }

}
