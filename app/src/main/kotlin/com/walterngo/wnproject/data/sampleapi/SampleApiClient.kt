package com.walterngo.wnproject.data.sampleapi

import com.walterngo.wnproject.data.sampleapi.model.SampleData

class SampleApiClient {

    fun getSampleData(): SampleData {
        return SampleData("Hello World")
    }
}