package com.busanit501.androidlabtest501.miniProject.test0710.kdk1115_mini.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.busanit501.androidlabtest501.databinding.ActivityKdkCh11Viewpager2TestFragmentMainBinding
import com.busanit501.androidlabtest501.databinding.FragmentKdkch112Binding

class KdkCh11Fragment2 : Fragment() {

    // 순서2, 프래그먼트 만들기. 뼈대 샘플 코딩 많이 지움..

    lateinit var binding: FragmentKdkch112Binding
    lateinit var TAG: String

    // 생명주기 확인을 위한, 로그 달기.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TAG = "Ch11OneFragment"
        Log.d(TAG,"생명주기 onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKdkch112Binding.inflate(layoutInflater,container,false)

        Log.d(TAG,"생명주기 onCreateView")
//        return inflater.inflate(R.layout.fragment_ch11_one, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"생명주기 onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"생명주기 onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"생명주기 onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"생명주기 onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"생명주기 onDestroy")
    }


}