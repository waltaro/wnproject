package com.walterngo.wnproject.domain.implementation

import com.walterngo.wnproject.data.sampleapi.SampleApiClient
import com.walterngo.wnproject.domain.model.Sample
import com.walterngo.wnproject.domain.repository.SampleRepository

class SampleImplementation(private val sampleApiClient: SampleApiClient,
                           private val sampleMapper: SampleMapper) : SampleRepository {

    override fun getSample(): Sample {
        return sampleMapper.map(sampleApiClient.getSample())
    }
}