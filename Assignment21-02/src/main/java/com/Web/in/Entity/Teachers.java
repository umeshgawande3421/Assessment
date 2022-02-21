package com.Web.in.Entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teachers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long teachersId;
	private String teachersName;
	private String teachersSub;
	public long getTeachersId() {
		return teachersId;
	}
	public void setTeachersId(long teachersId) {
		this.teachersId = teachersId;
	}
	public String getTeachersName() {
		return teachersName;
	}
	public void setTeachersName(String teachersName) {
		this.teachersName = teachersName;
	}
	public String getTeachersSub() {
		return teachersSub;
	}
	public void setTeachersSub(String teachersSub) {
		this.teachersSub = teachersSub;
	}
	@Override
	public int hashCode() {
		return Objects.hash(teachersId, teachersName, teachersSub);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teachers other = (Teachers) obj;
		return teachersId == other.teachersId && Objects.equals(teachersName, other.teachersName)
				&& Objects.equals(teachersSub, other.teachersSub);
	}
	@Override
	public String toString() {
		return "Teachers [teachersId=" + teachersId + ", teachersName=" + teachersName + ", teachersSub=" + teachersSub
				+ "]";
	}
	public Teachers() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
