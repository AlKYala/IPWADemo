package com.example.ipwademo.IPWA1.Kapitel3.Thema3;

public class Band {



    private String name;
    private String saenger;
    private String gitarrist;
    private String bassist;
    private String drummer;

    public Band(String name, String saenger, String gitarrrist, String bassist, String drummer) {
        this.setName(name);
        this.setSaenger(saenger);
        this.setGitarrist(gitarrrist);
        this.setBassist(bassist);
        this.setDrummer(drummer);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSaenger() {
        return saenger;
    }

    public void setSaenger(String saenger) {
        this.saenger = saenger;
    }

    public String getGitarrist() {
        return gitarrist;
    }

    public void setGitarrist(String gitarrist) {
        this.gitarrist = gitarrist;
    }

    public String getBassist() {
        return bassist;
    }

    public void setBassist(String bassist) {
        this.bassist = bassist;
    }

    public String getDrummer() {
        return drummer;
    }

    public void setDrummer(String drummer) {
        this.drummer = drummer;
    }

    public String toString() {
        return String.format("Band: %s, Saenger: %s, Gitarrist: %s, Bassist: %s, Drummer: %s", this.name, this.saenger,
                this.gitarrist, this.bassist, this.drummer);
    }
}
