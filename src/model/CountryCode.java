package model;

import javax.persistence.*;

@Entity
@Table(name = "country_code")
@IdClass(CountryCodePk.class)
public class CountryCode {

    @Id
    @Column(name = "country_code")
    private String countryCode;

    @Id
    @Column(name = "language")
    private String language;

    @Column(name = "description")
    private String description;

    public CountryCode() {
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
