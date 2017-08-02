package com.walterngo.wnproject.domain.implementation

import com.walterngo.wnproject.data.sampleapi.model.SampleData
import com.walterngo.wnproject.domain.mapper.SampleDataMapper
import com.walterngo.wnproject.domain.model.Sample

class SampleMapper: SampleDataMapper {

    override fun map(sample: SampleData): Sample {
        return Sample(sample.message)
    }
}