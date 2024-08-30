package com.example.testkotlinapplication.login

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager
import com.example.testkotlinapplication.R
import com.google.android.material.tabs.TabLayout


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LoginDialogFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginDialogFragment : DialogFragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        val builder: AlertDialog.Builder = AlertDialog.Builder(activity)
        // Get the layout inflater
        // Get the layout inflater
        val inflater = requireActivity().layoutInflater
        val v: View = inflater.inflate(R.layout.fragment_login_dialog, container, false)

        var viewpager_login = v.findViewById<ViewPager>(R.id.viewpager_login)
        //viewpager_login与适配器关联
        viewpager_login.adapter= LoginAdapter(parentFragmentManager)


        var table_layout = v.findViewById<TabLayout>(R.id.table_layout)
//将table_layout与viewPager_login关联
        table_layout.setupWithViewPager(viewpager_login)

//table_layout与viewPager_login关联后 文字的添加  数量大是采用数组
        table_layout.getTabAt(0)?.text="Login"
        table_layout.getTabAt(1)?.text="Sign up"
        // Inflate the layout for this fragment
        return v
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment LoginDialogFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            LoginDialogFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }

    }
}