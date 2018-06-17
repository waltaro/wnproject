package com.walterngo.wnproject.presentation.experience

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.walterngo.wnproject.R


class ExperienceFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View?
    = inflater.inflate(R.layout.fragment_experience, container, false)

}