package com.example.osg_kelompok12.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "actor")
data class ResultsItem(
	@PrimaryKey(autoGenerate = true)
	val id: Int?,

	@ColumnInfo(name = "films")
	@field:SerializedName("films")
	val films: List<String>? = null,

	@ColumnInfo(name = "homeworld")
	@field:SerializedName("homeworld")
	val homeworld: String? = null,

	@ColumnInfo(name = "gender")
	@field:SerializedName("gender")
	val gender: String? = null,

	@ColumnInfo(name = "skin_color")
	@field:SerializedName("skin_color")
	val skinColor: String? = null,

	@ColumnInfo(name = "edited")
	@field:SerializedName("edited")
	val edited: String? = null,

	@ColumnInfo(name = "created")
	@field:SerializedName("created")
	val created: String? = null,

	@ColumnInfo(name = "mass")
	@field:SerializedName("mass")
	val mass: String? = null,

	@ColumnInfo(name = "vehicles")
	@field:SerializedName("vehicles")
	val vehicles: List<String>? = null,

	@ColumnInfo(name = "url")
	@field:SerializedName("url")
	val url: String? = null,

	@ColumnInfo(name = "hair_color")
	@field:SerializedName("hair_color")
	val hairColor: String? = null,

	@ColumnInfo(name = "birth_year")
	@field:SerializedName("birth_year")
	val birthYear: String? = null,

	@ColumnInfo(name = "eye_color")
	@field:SerializedName("eye_color")
	val eyeColor: String? = null,

	@ColumnInfo(name = "species")
	@field:SerializedName("species")
	val species: List<String>? = null,

	@ColumnInfo(name = "starships")
	@field:SerializedName("starships")
	val starships: List<String>? = null,

	@ColumnInfo(name = "name")
	@field:SerializedName("name")
	val name: String? = null,

	@ColumnInfo(name = "height")
	@field:SerializedName("height")
	val height: String? = null
)