package com.walterngo.wnproject.injection

import com.walterngo.wnproject.data.sampleapi.SampleApiClient
import com.walterngo.wnproject.domain.implementation.SampleImplementation
import com.walterngo.wnproject.domain.implementation.SampleMapper
import com.walterngo.wnproject.domain.repository.SampleRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideSampleImplementation(): SampleRepository {
        return SampleImplementation(SampleApiClient(), SampleMapper())
    }

}