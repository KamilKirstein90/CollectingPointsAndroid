package com.kamilkirstein.collectpoints.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.kamilkirstein.collectpoints.databinding.FragmentCollectabletasksBinding

class CollectableTasksFragment : Fragment() {

    private var _binding: FragmentCollectabletasksBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(CollectableTasksViewModel::class.java)

        _binding = FragmentCollectabletasksBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // no more text view in the fragment

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}