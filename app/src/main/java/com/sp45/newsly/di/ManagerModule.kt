package com.sp45.newsly.di

import com.sp45.newsly.data.manager.LocalUserMangerImpl
import com.sp45.newsly.domain.manager.LocalUserManager
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class ManagerModule {

    @Binds
    @Singleton
    abstract fun bindLocalUserManger(localUserMangerImpl: LocalUserMangerImpl) : LocalUserManager
}