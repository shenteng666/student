package com.st.domain;

import java.io.Serializable;

public class Grade implements Serializable {
    private Integer id;

    private String name;

    private String cClass;

    private Double math;

    private Double chinese;

    private Double english;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getcClass() {
        return cClass;
    }

    public void setcClass(String cClass) {
        this.cClass = cClass == null ? null : cClass.trim();
    }

    public Double getMath() {
        return math;
    }

    public void setMath(Double math) {
        this.math = math;
    }

    public Double getChinese() {
        return chinese;
    }

    public void setChinese(Double chinese) {
        this.chinese = chinese;
    }

    public Double getEnglish() {
        return english;
    }

    public void setEnglish(Double english) {
        this.english = english;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", cClass=").append(cClass);
        sb.append(", math=").append(math);
        sb.append(", chinese=").append(chinese);
        sb.append(", english=").append(english);
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
        Grade other = (Grade) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getcClass() == null ? other.getcClass() == null : this.getcClass().equals(other.getcClass()))
            && (this.getMath() == null ? other.getMath() == null : this.getMath().equals(other.getMath()))
            && (this.getChinese() == null ? other.getChinese() == null : this.getChinese().equals(other.getChinese()))
            && (this.getEnglish() == null ? other.getEnglish() == null : this.getEnglish().equals(other.getEnglish()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getcClass() == null) ? 0 : getcClass().hashCode());
        result = prime * result + ((getMath() == null) ? 0 : getMath().hashCode());
        result = prime * result + ((getChinese() == null) ? 0 : getChinese().hashCode());
        result = prime * result + ((getEnglish() == null) ? 0 : getEnglish().hashCode());
        return result;
    }
}