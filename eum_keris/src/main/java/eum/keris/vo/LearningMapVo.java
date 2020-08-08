package eum.keris.vo;

import java.util.Arrays;
import java.util.List;

public class LearningMapVo {
	
	private String schulCd;
	private String gradeCd; 
	private String subjectCd;
	private int unit01Seq;
	private int unit02Seq;
	private int unit03Seq;
	private String unit01Name;
	private String unit02Name;
	private String unit03Name;
	private String chasiName;
	private String tag;
	
	
	public String getSchulCd() {
		return schulCd;
	}
	public void setSchulCd(String schulCd) {
		this.schulCd = schulCd;
	}
	public String getGradeCd() {
		return gradeCd;
	}
	public void setGradeCd(String gradeCd) {
		this.gradeCd = gradeCd;
	}
	public String getSubjectCd() {
		return subjectCd;
	}
	public void setSubjectCd(String subjectCd) {
		this.subjectCd = subjectCd;
	}
	public int getUnit01Seq() {
		return unit01Seq;
	}
	public void setUnit01Seq(int unit01Seq) {
		this.unit01Seq = unit01Seq;
	}
	public int getUnit02Seq() {
		return unit02Seq;
	}
	public void setUnit02Seq(int unit02Seq) {
		this.unit02Seq = unit02Seq;
	}
	public int getUnit03Seq() {
		return unit03Seq;
	}
	public void setUnit03Seq(int unit03Seq) {
		this.unit03Seq = unit03Seq;
	}
	public String getUnit01Name() {
		return unit01Name;
	}
	public void setUnit01Name(String unit01Name) {
		this.unit01Name = unit01Name;
	}

	public String getUnit02Name() {
		return unit02Name;
	}
	public void setUnit02Name(String unit02Name) {
		this.unit02Name = unit02Name;
	}
	public String getUnit03Name() {
		return unit03Name;
	}
	public void setUnit03Name(String unit03Name) {
		this.unit03Name = unit03Name;
	}
	public String getChasiName() {
		return chasiName;
	}
	public void setChasiName(String chasiName) {
		this.chasiName = chasiName;
	}

	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	@Override
	public String toString() {
		return "InfoVo [schulCd=" + schulCd + ", gradeCd=" + gradeCd + ", subjectCd=" + subjectCd + ", unit01Seq="
				+ unit01Seq + ", unit02Seq=" + unit02Seq + ", unit03Seq=" + unit03Seq + ", unit01Name=" + unit01Name
				+ ", unit02Name=" + unit02Name + ", unit03Name=" + unit03Name + ", chasiName=" + chasiName + ", tag="
				+ tag + "]";
	}


	
	
	
}
