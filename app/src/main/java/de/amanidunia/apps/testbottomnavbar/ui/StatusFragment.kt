package de.amanidunia.apps.testbottomnavbar.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import de.amanidunia.apps.testbottomnavbar.R
import de.amanidunia.apps.testbottomnavbar.databinding.FragmentStatusBinding

class StatusFragment : Fragment() {

    private lateinit var binding: FragmentStatusBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStatusBinding.inflate(inflater, container, false)
        return binding.root
    }

}