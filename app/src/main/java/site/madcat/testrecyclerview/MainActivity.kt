package site.madcat.testrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import site.madcat.testrecyclerview.domain.Obj
import site.madcat.testrecyclerview.domain.Repo
import java.util.*

class MainActivity : AppCompatActivity() {
    var repo: Repo=Repo()
    private lateinit var recyclerView: RecyclerView
    private val adapter=HomeAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fillRecyclerView()
        initRecyclerView()
    }

    fun initRecyclerView() {
        recyclerView=findViewById(R.id.recycler_view)
        recyclerView.setLayoutManager(LinearLayoutManager(baseContext))
        recyclerView.setAdapter(adapter)
        adapter.setData(repo.cash)

        // itemClick
        adapter!!.setOnKotlinItemClickListener(object : HomeAdapter.IKotlinItemClickListener {
            override fun onItemClickListener(position: Int) {
               var st=repo.cash.get(position).id.toString()
            }
        })
    }

    private fun fillRecyclerView() {
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw1", "1243"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw2", "1234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw3", "1294"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw4", "1834"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw5", "2234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw6", "3234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw7", "4234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw8", "6234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw1", "1243"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw2", "1234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw3", "1294"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw4", "1834"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw5", "2234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw6", "3234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw7", "4234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw8", "6234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw1", "1243"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw2", "1234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw3", "1294"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw4", "1834"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw5", "2234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw6", "3234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw7", "4234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw8", "6234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw1", "1243"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw2", "1234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw3", "1294"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw4", "1834"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw5", "2234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw6", "3234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw7", "4234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw8", "6234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw1", "1243"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw2", "1234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw3", "1294"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw4", "1834"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw5", "2234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw6", "3234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw7", "4234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw8", "6234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw1", "1243"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw2", "1234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw3", "1294"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw4", "1834"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw5", "2234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw6", "3234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw7", "4234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw8", "6234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw1", "1243"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw2", "1234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw3", "1294"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw4", "1834"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw5", "2234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw6", "3234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw7", "4234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw8", "6234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw1", "1243"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw2", "1234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw3", "1294"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw4", "1834"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw5", "2234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw6", "3234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw7", "4234"))
        repo.addObj(Obj(UUID.randomUUID().toString(), "qwerw8", "6234"))
    }
}

