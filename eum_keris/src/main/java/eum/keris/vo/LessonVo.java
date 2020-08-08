package eum.keris.vo;

import java.sql.Date;

public class LessonVo {
	
	private int lessonPlanSeq;
	private String schulCd;
	private int highPlanSeq;
	private int yearCd;
	private String gradeCd;
	private String termCd;
	private String subjectCd;
	private int subjectSortNum;
	private String localCd;
	private String publisherCd;
	private int publisherSortNum;
	private String lessonTypeCd;
	private String statCd;
	private String regId;
	private Date regDate;
	private String editId;
	private Date editDate;
	private String nonsubjectYn;
	private String freeYn;
	private String subjectCdEn;
	private String subjectCdZh;
	private String subjectCdJa;
	
	
	public int getLessonPlanSeq() {
		return lessonPlanSeq;
	}
	public void setLessonPlanSeq(int lessonPlanSeq) {
		this.lessonPlanSeq = lessonPlanSeq;
	}
	public String getSchulCd() {
		return schulCd;
	}
	public void setSchulCd(String schulCd) {
		this.schulCd = schulCd;
	}
	public int getHighPlanSeq() {
		return highPlanSeq;
	}
	public void setHighPlanSeq(int highPlanSeq) {
		this.highPlanSeq = highPlanSeq;
	}
	public int getYearCd() {
		return yearCd;
	}
	public void setYearCd(int yearCd) {
		this.yearCd = yearCd;
	}
	public String getGradeCd() {
		return gradeCd;
	}
	public void setGradeCd(String gradeCd) {
		this.gradeCd = gradeCd;
	}
	public String getTermCd() {
		return termCd;
	}
	public void setTermCd(String termCd) {
		this.termCd = termCd;
	}
	public String getSubjectCd() {
		return subjectCd;
	}
	public void setSubjectCd(String subjectCd) {
		this.subjectCd = subjectCd;
	}
	public int getSubjectSortNum() {
		return subjectSortNum;
	}
	public void setSubjectSortNum(int subjectSortNum) {
		this.subjectSortNum = subjectSortNum;
	}
	public String getLocalCd() {
		return localCd;
	}
	public void setLocalCd(String localCd) {
		this.localCd = localCd;
	}
	public String getPublisherCd() {
		return publisherCd;
	}
	public void setPublisherCd(String publisherCd) {
		this.publisherCd = publisherCd;
	}
	public int getPublisherSortNum() {
		return publisherSortNum;
	}
	public void setPublisherSortNum(int publisherSortNum) {
		this.publisherSortNum = publisherSortNum;
	}
	public String getLessonTypeCd() {
		return lessonTypeCd;
	}
	public void setLessonTypeCd(String lessonTypeCd) {
		this.lessonTypeCd = lessonTypeCd;
	}
	public String getStatCd() {
		return statCd;
	}
	public void setStatCd(String statCd) {
		this.statCd = statCd;
	}
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getEditId() {
		return editId;
	}
	public void setEditId(String editId) {
		this.editId = editId;
	}
	public Date getEditDate() {
		return editDate;
	}
	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}
	public String getNonsubjectYn() {
		return nonsubjectYn;
	}
	public void setNonsubjectYn(String nonsubjectYn) {
		this.nonsubjectYn = nonsubjectYn;
	}
	public String getFreeYn() {
		return freeYn;
	}
	public void setFreeYn(String freeYn) {
		this.freeYn = freeYn;
	}
	public String getSubjectCdEn() {
		return subjectCdEn;
	}
	public void setSubjectCdEn(String subjectCdEn) {
		this.subjectCdEn = subjectCdEn;
	}
	public String getSubjectCdZh() {
		return subjectCdZh;
	}
	public void setSubjectCdZh(String subjectCdZh) {
		this.subjectCdZh = subjectCdZh;
	}
	public String getSubjectCdJa() {
		return subjectCdJa;
	}
	public void setSubjectCdJa(String subjectCdJa) {
		this.subjectCdJa = subjectCdJa;
	}
	@Override
	public String toString() {
		return "LessonVo [lessonPlanSeq=" + lessonPlanSeq + ", schulCd=" + schulCd + ", highPlanSeq=" + highPlanSeq
				+ ", yearCd=" + yearCd + ", gradeCd=" + gradeCd + ", termCd=" + termCd + ", subjectCd=" + subjectCd
				+ ", subjectSortNum=" + subjectSortNum + ", localCd=" + localCd + ", publisherCd=" + publisherCd
				+ ", publisherSortNum=" + publisherSortNum + ", lessonTypeCd=" + lessonTypeCd + ", statCd=" + statCd
				+ ", regId=" + regId + ", regDate=" + regDate + ", editId=" + editId + ", editDate=" + editDate
				+ ", nonsubjectYn=" + nonsubjectYn + ", freeYn=" + freeYn + ", subjectCdEn=" + subjectCdEn
				+ ", subjectCdZh=" + subjectCdZh + ", subjectCdJa=" + subjectCdJa + "]";
	}
	
	
	
	
	

}
