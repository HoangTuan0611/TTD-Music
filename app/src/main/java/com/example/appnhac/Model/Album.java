package com.example.appnhac.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Album implements Serializable {

@SerializedName("IdAlbum")
@Expose
private String idAlbum;
@SerializedName("TenAlbum")
@Expose
private String tenAlbum;
@SerializedName("TencasiAlbum")
@Expose
private String tencasiAlbum;
@SerializedName("HinhanhAlbum")
@Expose
private String hinhanhAlbum;

public String getIdAlbum() {
return idAlbum;
}

public void setIdAlbum(String idAlbum) {
this.idAlbum = idAlbum;
}

public String getTenAlbum() {
return tenAlbum;
}

public void setTenAlbum(String tenAlbum) {
this.tenAlbum = tenAlbum;
}

public String getTenCaSiAlbum() {
return tencasiAlbum;
}

public void setTenCaSiAlbum(String tenCaSiAlbum) {
this.tencasiAlbum = tenCaSiAlbum;
}

public String getHinhAlbum() {
return hinhanhAlbum;
}

public void setHinhAlbum(String hinhAlbum) {
this.hinhanhAlbum = hinhAlbum;
}

}