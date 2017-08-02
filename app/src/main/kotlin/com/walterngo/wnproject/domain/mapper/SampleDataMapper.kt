package com.walterngo.wnproject.domain.mapper

import com.walterngo.wnproject.data.sampleapi.model.SampleData
import com.walterngo.wnproject.domain.model.Sample

interface SampleDataMapper {
    fun map(sample: SampleData): Sample
}