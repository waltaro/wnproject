package com.walterngo.wnproject.data.sampleapi

import com.walterngo.wnproject.data.sampleapi.model.SampleData

class SampleApiClient {

    fun getSample(): SampleData {
        return SampleData("Hello World")
    }
}