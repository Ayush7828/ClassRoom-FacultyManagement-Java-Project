package com.tka.entity;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "class_schedules")
public class ClassSchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "subject_id", nullable = false)
	private int subjectId;

	@Column(name = "classroom_id", nullable = false)
	private int classroomId;

	@Column(name = "day_of_week", nullable = false)
	private String dayOfWeek;

	@Column(name = "start_time", nullable = false)
	private Time startTime;

	@Column(name = "end_time", nullable = false)
	private Time endTime;

	public ClassSchedule(int subjectId, int classroomId, String dayOfWeek, Time startTime, Time endTime) {
		super();
		this.subjectId = subjectId;
		this.classroomId = classroomId;
		this.dayOfWeek = dayOfWeek;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public ClassSchedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(int classroomId) {
		this.classroomId = classroomId;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "ClassSchedule [id=" + id + ", subjectId=" + subjectId + ", classroomId=" + classroomId + ", dayOfWeek="
				+ dayOfWeek + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}

}
