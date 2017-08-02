package com.walterngo.wnproject.domain.repository

import com.walterngo.wnproject.domain.model.Sample

interface SampleRepository {
    fun getSample(): Sample
}