package hvkproducao.com.br.contact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val  rvList: RecyclerView by lazy {
        findViewById<RecyclerView>(R.id.rv_List)
    }

    private val adapter = ContactAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindViews()
        updateList()
    }
    private fun bindViews(){
        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
    }

    private fun updateList(){
        adapter.updateList(
            arrayListOf(
                Contact(
                    "Helvisklei Mendes",
                    "(00) 0000 - 0000",
                    "img.png"
                ),
                Contact(
                    "Pedro Silva",
                    "(00) 0000 - 0000",
                    "img.png"
                )
            )
        )

    }
}