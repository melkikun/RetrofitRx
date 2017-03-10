package com.example.it01.retrofitrx.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by IT01 on 3/8/2017.
 */

public class MasterDrawing {
    @SerializedName("head_mark")
    @Expose
    private String headMark;
    @SerializedName("entry_date")
    @Expose
    private String entryDate;
    @SerializedName("comp_type")
    @Expose
    private String compType;
    @SerializedName("weight")
    @Expose
    private String weight;
    @SerializedName("surface")
    @Expose
    private String surface;
    @SerializedName("profile")
    @Expose
    private String profile;
    @SerializedName("project_name")
    @Expose
    private String projectName;
    @SerializedName("length")
    @Expose
    private String length;
    @SerializedName("total_qty")
    @Expose
    private String totalQty;
    @SerializedName("subcont_status")
    @Expose
    private String subcontStatus;
    @SerializedName("dwg_status")
    @Expose
    private String dwgStatus;
    @SerializedName("rev")
    @Expose
    private String rev;
    @SerializedName("distribution_count")
    @Expose
    private String distributionCount;
    @SerializedName("rev_subj")
    @Expose
    private Object revSubj;
    @SerializedName("gr_weight")
    @Expose
    private String grWeight;
    @SerializedName("dwg_typ")
    @Expose
    private String dwgTyp;
    @SerializedName("entry_sign")
    @Expose
    private Object entrySign;
    @SerializedName("comp_type_lvl2")
    @Expose
    private Object compTypeLvl2;
    @SerializedName("ppic_check")
    @Expose
    private String ppicCheck;
    @SerializedName("ppic_check_sign")
    @Expose
    private Object ppicCheckSign;
    @SerializedName("ppic_check_id")
    @Expose
    private String ppicCheckId;
    @SerializedName("remark")
    @Expose
    private Object remark;
    @SerializedName("type_bld")
    @Expose
    private String typeBld;
    @SerializedName("master_drawing_id")
    @Expose
    private String masterDrawingId;
    @SerializedName("add_remark")
    @Expose
    private Object addRemark;
    @SerializedName("input_type")
    @Expose
    private String inputType;

    public MasterDrawing() {
    }

    public MasterDrawing(String headMark, String entryDate, String compType, String weight, String surface, String profile, String projectName, String length, String totalQty, String subcontStatus, String dwgStatus, String rev, String distributionCount, Object revSubj, String grWeight, String dwgTyp, Object entrySign, Object compTypeLvl2, String ppicCheck, Object ppicCheckSign, String ppicCheckId, Object remark, String typeBld, String masterDrawingId, Object addRemark, String inputType) {
        this.headMark = headMark;
        this.entryDate = entryDate;
        this.compType = compType;
        this.weight = weight;
        this.surface = surface;
        this.profile = profile;
        this.projectName = projectName;
        this.length = length;
        this.totalQty = totalQty;
        this.subcontStatus = subcontStatus;
        this.dwgStatus = dwgStatus;
        this.rev = rev;
        this.distributionCount = distributionCount;
        this.revSubj = revSubj;
        this.grWeight = grWeight;
        this.dwgTyp = dwgTyp;
        this.entrySign = entrySign;
        this.compTypeLvl2 = compTypeLvl2;
        this.ppicCheck = ppicCheck;
        this.ppicCheckSign = ppicCheckSign;
        this.ppicCheckId = ppicCheckId;
        this.remark = remark;
        this.typeBld = typeBld;
        this.masterDrawingId = masterDrawingId;
        this.addRemark = addRemark;
        this.inputType = inputType;
    }

    public String getHeadMark() {
        return headMark;
    }

    public void setHeadMark(String headMark) {
        this.headMark = headMark;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getCompType() {
        return compType;
    }

    public void setCompType(String compType) {
        this.compType = compType;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(String totalQty) {
        this.totalQty = totalQty;
    }

    public String getSubcontStatus() {
        return subcontStatus;
    }

    public void setSubcontStatus(String subcontStatus) {
        this.subcontStatus = subcontStatus;
    }

    public String getDwgStatus() {
        return dwgStatus;
    }

    public void setDwgStatus(String dwgStatus) {
        this.dwgStatus = dwgStatus;
    }

    public String getRev() {
        return rev;
    }

    public void setRev(String rev) {
        this.rev = rev;
    }

    public String getDistributionCount() {
        return distributionCount;
    }

    public void setDistributionCount(String distributionCount) {
        this.distributionCount = distributionCount;
    }

    public Object getRevSubj() {
        return revSubj;
    }

    public void setRevSubj(Object revSubj) {
        this.revSubj = revSubj;
    }

    public String getGrWeight() {
        return grWeight;
    }

    public void setGrWeight(String grWeight) {
        this.grWeight = grWeight;
    }

    public String getDwgTyp() {
        return dwgTyp;
    }

    public void setDwgTyp(String dwgTyp) {
        this.dwgTyp = dwgTyp;
    }

    public Object getEntrySign() {
        return entrySign;
    }

    public void setEntrySign(Object entrySign) {
        this.entrySign = entrySign;
    }

    public Object getCompTypeLvl2() {
        return compTypeLvl2;
    }

    public void setCompTypeLvl2(Object compTypeLvl2) {
        this.compTypeLvl2 = compTypeLvl2;
    }

    public String getPpicCheck() {
        return ppicCheck;
    }

    public void setPpicCheck(String ppicCheck) {
        this.ppicCheck = ppicCheck;
    }

    public Object getPpicCheckSign() {
        return ppicCheckSign;
    }

    public void setPpicCheckSign(Object ppicCheckSign) {
        this.ppicCheckSign = ppicCheckSign;
    }

    public String getPpicCheckId() {
        return ppicCheckId;
    }

    public void setPpicCheckId(String ppicCheckId) {
        this.ppicCheckId = ppicCheckId;
    }

    public Object getRemark() {
        return remark;
    }

    public void setRemark(Object remark) {
        this.remark = remark;
    }

    public String getTypeBld() {
        return typeBld;
    }

    public void setTypeBld(String typeBld) {
        this.typeBld = typeBld;
    }

    public String getMasterDrawingId() {
        return masterDrawingId;
    }

    public void setMasterDrawingId(String masterDrawingId) {
        this.masterDrawingId = masterDrawingId;
    }

    public Object getAddRemark() {
        return addRemark;
    }

    public void setAddRemark(Object addRemark) {
        this.addRemark = addRemark;
    }

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }
}
