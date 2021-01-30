package com.company.hilt_lecture.di

import com.company.hilt_lecture.di.qualifier.ActivityHash
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(ActivityComponent::class)
object ActivityModule {

    @ActivityHash
    @Provides
    fun provideHash() = hashCode().toString()
}