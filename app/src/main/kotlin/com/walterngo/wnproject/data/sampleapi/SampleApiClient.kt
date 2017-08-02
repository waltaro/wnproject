package com.walterngo.wnproject.data.sampleapi

import com.walterngo.wnproject.domain.model.Sample

class SampleApiClient {

    fun getSample(): Sample {
        return Sample("Hello World")
    }
}