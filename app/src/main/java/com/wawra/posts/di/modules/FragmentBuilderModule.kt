package com.wawra.posts.di.modules

import com.wawra.posts.di.scopes.FragmentScoped
import com.wawra.posts.presentation.deleteDialog.DeleteDialogFragment
import com.wawra.posts.presentation.deletedPosts.DeletedPostsFragment
import com.wawra.posts.presentation.postDetails.PostDetailsFragment
import com.wawra.posts.presentation.postEdit.ImageUrlDialogFragment
import com.wawra.posts.presentation.postEdit.PostEditFragment
import com.wawra.posts.presentation.posts.PostsFragment
import com.wawra.posts.presentation.sharedDialogs.ConfirmationDialogFragment
import com.wawra.posts.presentation.sharedDialogs.ErrorDialogFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilderModule {

    @FragmentScoped
    @ContributesAndroidInjector(modules = [ViewModelModule::class])
    abstract fun contributePostsFragment(): PostsFragment?

    @FragmentScoped
    @ContributesAndroidInjector(modules = [ViewModelModule::class])
    abstract fun contributePostDetailsFragment(): PostDetailsFragment?

    @FragmentScoped
    @ContributesAndroidInjector
    abstract fun contributeErrorDialogFragment(): ErrorDialogFragment?

    @FragmentScoped
    @ContributesAndroidInjector(modules = [ViewModelModule::class])
    abstract fun contributeDeleteDialogFragment(): DeleteDialogFragment?

    @FragmentScoped
    @ContributesAndroidInjector(modules = [ViewModelModule::class])
    abstract fun contributePostEditFragment(): PostEditFragment?

    @FragmentScoped
    @ContributesAndroidInjector
    abstract fun contributeImageUrlDialogFragment(): ImageUrlDialogFragment?

    @FragmentScoped
    @ContributesAndroidInjector
    abstract fun contributeConfirmationDialogFragment(): ConfirmationDialogFragment?

    @FragmentScoped
    @ContributesAndroidInjector(modules = [ViewModelModule::class])
    abstract fun contributeDeletedPostsFragment(): DeletedPostsFragment?

}