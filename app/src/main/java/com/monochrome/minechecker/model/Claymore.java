
package com.monochrome.minechecker.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Claymore {

    @SerializedName("hash")
    @Expose
    public Integer hash;
    @SerializedName("per_alive_gpus")
    @Expose
    public Integer perAliveGpus;
    @SerializedName("per_total_gpus")
    @Expose
    public Integer perTotalGpus;
    @SerializedName("per_alive_rigs")
    @Expose
    public Integer perAliveRigs;
    @SerializedName("per_total_rigs")
    @Expose
    public Integer perTotalRigs;
    @SerializedName("per_hash-gpu")
    @Expose
    public String perHashGpu;
    @SerializedName("per_hash-rig")
    @Expose
    public String perHashRig;
    @SerializedName("current_time")
    @Expose
    public Integer currentTime;

}
