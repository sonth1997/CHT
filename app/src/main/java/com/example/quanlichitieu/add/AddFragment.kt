package com.example.quanlichitieu.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.quanlichitieu.R
import com.example.quanlichitieu.word.WordFragment
import kotlinx.android.synthetic.main.fragment_add.*

class AddFragment : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add,container,false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        floatingActionButton.setOnClickListener {
            val transaction = childFragmentManager.beginTransaction()
            val fragment = WordFragment()
            transaction.replace(R.id.action_addFragment_to_trendFragment,fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}