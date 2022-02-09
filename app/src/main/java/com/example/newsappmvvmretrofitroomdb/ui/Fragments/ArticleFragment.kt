package com.example.newsappmvvmusingkotlin.ui.Fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.newsappmvvmretrofitroomdb.R
import com.example.newsappmvvmusingkotlin.NewsActivity
import com.example.newsappmvvmusingkotlin.ui.NewsViewModel

class ArticleFragment : Fragment(R.layout.fragment_article) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       viewModel=(activity as NewsActivity).viewModel
    }


}