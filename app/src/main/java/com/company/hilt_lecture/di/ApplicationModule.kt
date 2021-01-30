package com.company.hilt_lecture.di

import com.company.hilt_lecture.di.qualifier.AppHash
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object ApplicationModule {

    @AppHash
    @Provides
    fun provideHash() = hashCode().toString()
}