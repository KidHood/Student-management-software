package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Provinces implements Serializable{
	private int provinceID;
	private String nameProvince;
	
	public Provinces(int provinceID, String nameProvince) {
		this.provinceID = provinceID;
		this.nameProvince = nameProvince;
	}

	public int getProvinceID() {
		return provinceID;
	}

	public void setProvinceID(int provinceID) {
		this.provinceID = provinceID;
	}

	public String getNameProvince() {
		return nameProvince;
	}

	public void setNameProvince(String nameProvince) {
		this.nameProvince = nameProvince;
	}

	@Override
	public String toString() {
		return "Provinces [provinceID=" + provinceID + ", nameProvince=" + nameProvince + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nameProvince, provinceID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Provinces other = (Provinces) obj;
		return Objects.equals(nameProvince, other.nameProvince) && provinceID == other.provinceID;
	}
	
	 public static ArrayList<Provinces> getListProvinces(){
		 String[] arr_Province = {
				 "An Giang",
				 "Bà Rịa – Vũng Tàu",
				 "Bạc Liêu",
				 "Bắc Giang",
				 "Bắc Kạn",
				 "Bắc Ninh",
				 "Bến Tre",
				 "Bình Dương",
				 "Bình Định",
				 "Bình Phước",
				 "Bình Thuận",
				 "Cà Mau",
				 "Cao Bằng",
				 "Cần Thơ",
				 "Đà Nẵng",
				 "Đắk Lắk",
				 "Đắk Nông",
				 "Điện Biên",
				 "Đồng Nai",
				 "Đồng Tháp",
				 "Gia Lai",
				 "Hà Giang",
				 "Hà Nam",
				 "Hà Nội",
				 "Hà Tĩnh",
				 "Hải Dương",
				 "Hải Phòng",
				 "Hậu Giang",
				 "Hòa Bình",
				 "Thành phố Hồ Chí Minh",
				 "Hưng Yên",
				 "Khánh Hòa",
				 "Kiên Giang",
				 "Kon Tum",
				 "Lai Châu",
				 "Lạng Sơn",
				 "Lào Cai",
				 "Lâm Đồng",
				 "Long An",
				 "Nam Định",
				 "Nghệ An",
				 "Ninh Bình",
				 "Ninh Thuận",
				 "Phú Thọ",
				 "Phú Yên",
				 "Quảng Bình",
				 "Quảng Nam",
				 "Quảng Ngãi",
				 "Quảng Ninh",
				 "Quảng Trị",
				 "Sóc Trăng",
				 "Sơn La",
				 "Tây Ninh",
				 "Thái Bình",
				 "Thái Nguyên",
				 "Thanh Hóa",
				 "Thừa Thiên Huế",
				 "Tiền Giang",
				 "Trà Vinh",
				 "Tuyên Quang",
				 "Vĩnh Long",
				 "Vĩnh Phúc",
				 "Yên Bái",
		 };
		 ArrayList<Provinces> listProvinces =  new ArrayList<Provinces>();
		 int i = 0;
		 for(String nameProvince : arr_Province) {
			 Provinces t =  new Provinces(i, nameProvince);
			 listProvinces.add(t);
			 i++;
		 }
		 return listProvinces;
	 }

	public static Provinces getProvinceById(int birthPlace) {
		return Provinces.getListProvinces().get(birthPlace);
	}

	public static Provinces getProvinceByName(String namePro) {
		ArrayList<Provinces> listPro =  Provinces.getListProvinces();
		for (Provinces provinces : listPro) {
			if(provinces.getNameProvince().equalsIgnoreCase(namePro))
				return provinces;
		}
		return null;
	}
	
}
