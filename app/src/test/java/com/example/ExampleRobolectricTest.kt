package com.example

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.example.data.local.SmartPrepSeedData
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [36])
class ExampleRobolectricTest {

    @Test
    fun `read app name from context matches IISER SmartPrep`() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val appName = context.getString(R.string.app_name)
        assertEquals("IISER SmartPrep", appName)
    }

    @Test
    fun `verify seeded curriculum covers all four PCMB subjects and IISER IAT exam`() {
        val chapters = SmartPrepSeedData.initialChapters
        val subjects = chapters.map { it.subject }.toSet()
        assertEquals(setOf("Mathematics", "Physics", "Chemistry", "Biology"), subjects)

        val questions = SmartPrepSeedData.initialQuestions
        assertTrue(questions.all { it.examSource == "IISER IAT" })
        assertTrue(questions.any { it.examSource == "IISER IAT" && it.isPyq })
        assertTrue(SmartPrepSeedData.initialMockTests.all { it.examType == "IISER IAT" })
        assertTrue(SmartPrepSeedData.initialStudyPlanTasks.isNotEmpty())
    }
}
