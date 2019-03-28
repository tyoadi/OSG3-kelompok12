package com.example.osg_kelompok12.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "actor")
data class ResultsItem(
	@PrimaryKey(autoGenerate = true)
	@ColumnInfo(name = "id")
	var id: Int?,

	@ColumnInfo(name = "homeworld")
	@field:SerializedName("homeworld")
	var homeworld: String?,

	@ColumnInfo(name = "gender")
	@field:SerializedName("gender")
	var gender: String?,

	@ColumnInfo(name = "skin_color")
	@field:SerializedName("skin_color")
	var skinColor: String?,

	@ColumnInfo(name = "edited")
	@field:SerializedName("edited")
	var edited: String?,

	@ColumnInfo(name = "created")
	@field:SerializedName("created")
	var created: String?,

	@ColumnInfo(name = "mass")
	@field:SerializedName("mass")
	var mass: String?,

	@ColumnInfo(name = "url")
	@field:SerializedName("url")
	var url: String?,

	@ColumnInfo(name = "hair_color")
	@field:SerializedName("hair_color")
	var hairColor: String,

	@ColumnInfo(name = "birth_year")
	@field:SerializedName("birth_year")
	var birthYear: String?,

	@ColumnInfo(name = "eye_color")
	@field:SerializedName("eye_color")
	var eyeColor: String?,

	@ColumnInfo(name = "name")
	@field:SerializedName("name")
	var name: String?,

	@ColumnInfo(name = "height")
	@field:SerializedName("height")
	var height: String?,

	@field:SerializedName("films")
	var films: List<String>?,

	@field:SerializedName("vehicles")
	var vehicles: List<String>?,

	@field:SerializedName("species")
	var species: List<String>?,

	@field:SerializedName("starships")
	var starships: List<String>?
): Parcelable