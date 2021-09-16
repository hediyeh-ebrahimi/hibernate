package model;

import java.io.Serializable;
import java.util.Objects;

public class CountryCodePk implements Serializable {
    private String countryCode;
    private String language;

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

    public CountryCodePk(String countryCode, String language) {
        this.countryCode = countryCode;
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryCodePk that = (CountryCodePk) o;
        return Objects.equals(countryCode, that.countryCode) &&
                Objects.equals(language, that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryCode, language);
    }

    @Override
    public String toString() {
        return "CountryCodePk{" +
                "countryCode='" + countryCode + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
