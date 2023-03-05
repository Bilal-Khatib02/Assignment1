package com.example.ass1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ass1.databinding.ActivityMainBinding
import com.google.firebase.firestore.DocumentChange
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreException
import com.google.firebase.firestore.Query
import com.google.firebase.firestore.QuerySnapshot
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.firestore.model.Document
import com.google.firebase.ktx.Firebase
import java.util.EventListener


class MainActivity : AppCompatActivity() {
   // private lateinit var recyclerView: RecyclerView
    //private lateinit var userArrayList: ArrayList<User>
     //private lateinit var myAdapter: MyAdapter
    var db = Firebase.firestore

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
/*
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        userArrayList = arrayListOf()
        myAdapter = MyAdapter(userArrayList)

        recyclerView.adapter = myAdapter

*/
        binding.save.setOnClickListener {
            var userName = binding.username.text.toString()
            var number = binding.number.text.toString()
            var address = binding.address.text.toString()

            val person = hashMapOf(
                "userName" to userName,
                "number" to number,
                "address" to address
            )
            db.collection("Person")
                .add(person)
                .addOnSuccessListener { documentReference ->
                    Toast.makeText(
                        applicationContext,
                        "User Add Success ${documentReference.id}",
                        Toast.LENGTH_LONG
                    ).show()
                }
                .addOnFailureListener { e ->
                    Toast.makeText(applicationContext, "User Add Failure $e", Toast.LENGTH_LONG)
                        .show()

                }
            // binding.showUsers.setOnClickListener {
           // EventChangedListener()
            // }
        }
    }
}
/*
    private fun EventChangedListener() {
        db = FirebaseFirestore.getInstance()
        db.run {
            collection("Person").orderBy("address", Query.Direction.ASCENDING)
                .addSnapshotListener(object :
                    com.google.firebase.firestore.EventListener<QuerySnapshot> {
                    override fun onEvent(
                        value: QuerySnapshot?,
                        error: FirebaseFirestoreException?
                    ) {
                        if (error != null) {
                            Log.e("Firestore Error", error.message.toString())
                            return
                        }
                        for (dc: DocumentChange in value?.documentChanges!!) {
                            if (dc.type == DocumentChange.Type.ADDED) {
                                userArrayList.add(dc.document.toObject(User::class.java))

                            }

                        }
                        myAdapter.notifyDataSetChanged()

                    }
                })
        }}}
*/








