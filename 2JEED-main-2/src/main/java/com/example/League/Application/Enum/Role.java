package com.example.League.Application.Enum;

public enum Role {
    JOURNALISTE,
    MEMBER_LEAGUE;

    public String getPrefixedRole() {
        return "ROLE_" + this.name();
    }
}