package com.walterngo.wnproject.presentation.main

import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.walterngo.wnproject.R
import com.walterngo.wnproject.domain.repository.SampleRepository
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var sampleRepository: SampleRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(sampleRepository.getSample().message)
        bottomNavigationView.setupWithNavController(findNavController(R.id.mainFragment))
    }
}
