package com.st.domain;

import java.io.Serializable;

public class announcement implements Serializable {
    private String aname;

    private String deparment;

    private String kind;

    private String person;

    private static final long serialVersionUID = 1L;

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment == null ? null : deparment.trim();
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind == null ? null : kind.trim();
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person == null ? null : person.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aname=").append(aname);
        sb.append(", deparment=").append(deparment);
        sb.append(", kind=").append(kind);
        sb.append(", person=").append(person);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        announcement other = (announcement) that;
        return (this.getAname() == null ? other.getAname() == null : this.getAname().equals(other.getAname()))
            && (this.getDeparment() == null ? other.getDeparment() == null : this.getDeparment().equals(other.getDeparment()))
            && (this.getKind() == null ? other.getKind() == null : this.getKind().equals(other.getKind()))
            && (this.getPerson() == null ? other.getPerson() == null : this.getPerson().equals(other.getPerson()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAname() == null) ? 0 : getAname().hashCode());
        result = prime * result + ((getDeparment() == null) ? 0 : getDeparment().hashCode());
        result = prime * result + ((getKind() == null) ? 0 : getKind().hashCode());
        result = prime * result + ((getPerson() == null) ? 0 : getPerson().hashCode());
        return result;
    }
}