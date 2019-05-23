package org.socc.molecave

import com.google.gson.JsonParser
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders


class BasicTest : AbstractTest() {

	@Autowired
	lateinit var moleRepo: MoleRepository

	@Before
	public override fun setUp() {
		super.setUp()
	}

	@Test
	@Throws(Exception::class)
	fun getProductsList() {

		val mvcResult = mvc!!.perform(MockMvcRequestBuilders.get("/test")
				.accept(MediaType.APPLICATION_JSON_VALUE)).andReturn()

		val status = mvcResult.response.status
		assertEquals(200, status)
		val content = mvcResult.response.contentAsString

		val parser = JsonParser()
		val j = parser.parse(content).asJsonObject

		println(content)

		assertEquals(j.get("a").asString, "Hello")
		assertEquals(j.get("b").asString, "World")
		assertEquals(j.get("c").asJsonArray.get(0).asInt, 1)
		assertEquals(j.get("c").asJsonArray.get(1).asInt, 2)
		assertEquals(j.get("c").asJsonArray.get(2).asString, "!!")

	}

	@Test
	fun makeMole() {

		val mole = Mole(234, "TestMole")

		moleRepo.save(mole)

	}
}