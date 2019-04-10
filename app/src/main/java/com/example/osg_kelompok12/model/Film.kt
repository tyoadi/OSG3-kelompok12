package com.example.osg_kelompok12.model

import com.google.gson.annotations.SerializedName

data class Film(

	@field:SerializedName("edited")
	val edited: String? = null,

	@field:SerializedName("director")
	val director: String? = null,

	@field:SerializedName("created")
	val created: String? = null,

	@field:SerializedName("vehicles")
	val vehicles: List<String?>? = null,

	@field:SerializedName("opening_crawl")
	val openingCrawl: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("characters")
	val characters: List<String?>? = null,

	@field:SerializedName("episode_id")
	val episodeId: Int? = null,

	@field:SerializedName("planets")
	val planets: List<String?>? = null,

	@field:SerializedName("release_date")
	val releaseDate: String? = null,

	@field:SerializedName("starships")
	val starships: List<String?>? = null,

	@field:SerializedName("species")
	val species: List<String?>? = null,

	@field:SerializedName("producer")
	val producer: String? = null
)