package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.firestore.firestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Firebase.firestore.collection("obras").add(mapOf(
            "nome" to "nomeobra2",
            "autor" to "autor",
            "data" to "datahoje"

        ))

        Firebase.firestore.collection("obras")
            .document("wVne7ij8yFzn63NJww0o").get().result.data

    }
}