package com.example.restcountries.parse;

import com.fasterxml.jackson.annotation.*;
import java.util.List;
import java.util.Map;

public class Country {
    private Name name;
    private List<String> tld;
    private String cca2;
    private String ccn3;
    private String cca3;
    private Boolean independent;
    private Status status;
    private boolean unMember;
    private Currencies currencies;
    private Idd idd;
    private List<String> capital;
    private List<String> altSpellings;
    private Region region;
    private String subregion;
    private Map<String, String> languages;
    private Map<String, Translation> translations;
    private List<Double> latlng;
    private boolean landlocked;
    private double area;
    private Demonyms demonyms;
    private String flag;
    private Maps maps;
    private long population;
    private Car car;
    private List<String> timezones;
    private List<Continent> continents;
    private Flags flags;
    private CoatOfArms coatOfArms;
    private StartOfWeek startOfWeek;
    private CapitalInfo capitalInfo;
    private PostalCode postalCode;
    private String cioc;
    private List<String> borders;
    private String fifa;
    private Map<String, Double> gini;

    @JsonProperty("name")
    public Name getName() { return name; }
    @JsonProperty("name")
    public void setName(Name value) { this.name = value; }

    @JsonProperty("tld")
    public List<String> getTLD() { return tld; }
    @JsonProperty("tld")
    public void setTLD(List<String> value) { this.tld = value; }

    @JsonProperty("cca2")
    public String getCca2() { return cca2; }
    @JsonProperty("cca2")
    public void setCca2(String value) { this.cca2 = value; }

    @JsonProperty("ccn3")
    public String getCcn3() { return ccn3; }
    @JsonProperty("ccn3")
    public void setCcn3(String value) { this.ccn3 = value; }

    @JsonProperty("cca3")
    public String getCca3() { return cca3; }
    @JsonProperty("cca3")
    public void setCca3(String value) { this.cca3 = value; }

    @JsonProperty("independent")
    public Boolean getIndependent() { return independent; }
    @JsonProperty("independent")
    public void setIndependent(Boolean value) { this.independent = value; }

    @JsonProperty("status")
    public Status getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(Status value) { this.status = value; }

    @JsonProperty("unMember")
    public boolean getUnMember() { return unMember; }
    @JsonProperty("unMember")
    public void setUnMember(boolean value) { this.unMember = value; }

    @JsonProperty("currencies")
    public Currencies getCurrencies() { return currencies; }
    @JsonProperty("currencies")
    public void setCurrencies(Currencies value) { this.currencies = value; }

    @JsonProperty("idd")
    public Idd getIdd() { return idd; }
    @JsonProperty("idd")
    public void setIdd(Idd value) { this.idd = value; }

    @JsonProperty("capital")
    public List<String> getCapital() { return capital; }
    @JsonProperty("capital")
    public void setCapital(List<String> value) { this.capital = value; }

    @JsonProperty("altSpellings")
    public List<String> getAltSpellings() { return altSpellings; }
    @JsonProperty("altSpellings")
    public void setAltSpellings(List<String> value) { this.altSpellings = value; }

    @JsonProperty("region")
    public Region getRegion() { return region; }
    @JsonProperty("region")
    public void setRegion(Region value) { this.region = value; }

    @JsonProperty("subregion")
    public String getSubregion() { return subregion; }
    @JsonProperty("subregion")
    public void setSubregion(String value) { this.subregion = value; }

    @JsonProperty("languages")
    public Map<String, String> getLanguages() { return languages; }
    @JsonProperty("languages")
    public void setLanguages(Map<String, String> value) { this.languages = value; }

    @JsonProperty("translations")
    public Map<String, Translation> getTranslations() { return translations; }
    @JsonProperty("translations")
    public void setTranslations(Map<String, Translation> value) { this.translations = value; }

    @JsonProperty("latlng")
    public List<Double> getLatlng() { return latlng; }
    @JsonProperty("latlng")
    public void setLatlng(List<Double> value) { this.latlng = value; }

    @JsonProperty("landlocked")
    public boolean getLandlocked() { return landlocked; }
    @JsonProperty("landlocked")
    public void setLandlocked(boolean value) { this.landlocked = value; }

    @JsonProperty("area")
    public double getArea() { return area; }
    @JsonProperty("area")
    public void setArea(double value) { this.area = value; }

    @JsonProperty("demonyms")
    public Demonyms getDemonyms() { return demonyms; }
    @JsonProperty("demonyms")
    public void setDemonyms(Demonyms value) { this.demonyms = value; }

    @JsonProperty("flag")
    public String getFlag() { return flag; }
    @JsonProperty("flag")
    public void setFlag(String value) { this.flag = value; }

    @JsonProperty("maps")
    public Maps getMaps() { return maps; }
    @JsonProperty("maps")
    public void setMaps(Maps value) { this.maps = value; }

    @JsonProperty("population")
    public long getPopulation() { return population; }
    @JsonProperty("population")
    public void setPopulation(long value) { this.population = value; }

    @JsonProperty("car")
    public Car getCar() { return car; }
    @JsonProperty("car")
    public void setCar(Car value) { this.car = value; }

    @JsonProperty("timezones")
    public List<String> getTimezones() { return timezones; }
    @JsonProperty("timezones")
    public void setTimezones(List<String> value) { this.timezones = value; }

    @JsonProperty("continents")
    public List<Continent> getContinents() { return continents; }
    @JsonProperty("continents")
    public void setContinents(List<Continent> value) { this.continents = value; }

    @JsonProperty("flags")
    public Flags getFlags() { return flags; }
    @JsonProperty("flags")
    public void setFlags(Flags value) { this.flags = value; }

    @JsonProperty("coatOfArms")
    public CoatOfArms getCoatOfArms() { return coatOfArms; }
    @JsonProperty("coatOfArms")
    public void setCoatOfArms(CoatOfArms value) { this.coatOfArms = value; }

    @JsonProperty("startOfWeek")
    public StartOfWeek getStartOfWeek() { return startOfWeek; }
    @JsonProperty("startOfWeek")
    public void setStartOfWeek(StartOfWeek value) { this.startOfWeek = value; }

    @JsonProperty("capitalInfo")
    public CapitalInfo getCapitalInfo() { return capitalInfo; }
    @JsonProperty("capitalInfo")
    public void setCapitalInfo(CapitalInfo value) { this.capitalInfo = value; }

    @JsonProperty("postalCode")
    public PostalCode getPostalCode() { return postalCode; }
    @JsonProperty("postalCode")
    public void setPostalCode(PostalCode value) { this.postalCode = value; }

    @JsonProperty("cioc")
    public String getCioc() { return cioc; }
    @JsonProperty("cioc")
    public void setCioc(String value) { this.cioc = value; }

    @JsonProperty("borders")
    public List<String> getBorders() { return borders; }
    @JsonProperty("borders")
    public void setBorders(List<String> value) { this.borders = value; }

    @JsonProperty("fifa")
    public String getFifa() { return fifa; }
    @JsonProperty("fifa")
    public void setFifa(String value) { this.fifa = value; }

    @JsonProperty("gini")
    public Map<String, Double> getGini() { return gini; }
    @JsonProperty("gini")
    public void setGini(Map<String, Double> value) { this.gini = value; }
}
