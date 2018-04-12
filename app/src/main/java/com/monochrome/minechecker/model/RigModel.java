
package com.monochrome.minechecker.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RigModel {

    @SerializedName("rigs")
    @Expose
    public Rigs rigs;
    @SerializedName("total_hash")
    @Expose
    public Double totalHash;
    @SerializedName("alive_gpus")
    @Expose
    public Integer aliveGpus;
    @SerializedName("total_gpus")
    @Expose
    public Integer totalGpus;
    @SerializedName("alive_rigs")
    @Expose
    public Integer aliveRigs;
    @SerializedName("total_rigs")
    @Expose
    public Integer totalRigs;
    @SerializedName("current_version")
    @Expose
    public String currentVersion;
    @SerializedName("avg_temp")
    @Expose
    public Double avgTemp;
    @SerializedName("capacity")
    @Expose
    public String capacity;
    @SerializedName("per_info")
    @Expose
    public PerInfo perInfo;

}
