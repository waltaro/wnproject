package com.walterngo.wnproject.presentation.main

import android.os.Bundle
import com.walterngo.wnproject.R
import com.walterngo.wnproject.domain.repository.SampleRepository
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var sampleRepository: SampleRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(sampleRepository.getSample().message)
    }
}
