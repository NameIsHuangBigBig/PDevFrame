package hbb.example.test.recyclerview

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import hbb.example.test.algorithm.Algorithm
import hbb.example.test.databinding.ActivityMainRecyclerviewBinding
import hbb.example.test.download.base.DownCoroutines
import hbb.example.test.recyclerview.adapter.TestAdapter
import hbb.example.test.recyclerview.bean.MultiBean

/**
 * <pre>
 *   author: hjh
 *   time  : 2020/9/27
 *   desc  :
 * </pre>
 *
 */
class MainActivity  : AppCompatActivity(){

    private val mainBinding: ActivityMainRecyclerviewBinding by lazy {
        ActivityMainRecyclerviewBinding.inflate(layoutInflater)
    }

    val list= ArrayList<MultiBean>()

    override fun onCreate(savedInstanceState: Bundle?) {

        setContentView(mainBinding.root)
        super.onCreate(savedInstanceState)
        list.add(MultiBean(true,"1",""))
        list.add(MultiBean(false,"2",""))
        list.add(MultiBean(true,"3",""))
        list.add(MultiBean(false,"4",""))
        list.add(MultiBean(true,"5",""))
        list.add(MultiBean(false,"6",""))
        list.add(MultiBean(true,"7",""))
        list.add(MultiBean(false,"8",""))
        list.add(MultiBean(false,"9",""))
        list.add(MultiBean(false,"10",""))
        list.add(MultiBean(true,"11",""))
        list.add(MultiBean(false,"12",""))
        list.add(MultiBean(true,"13",""))
        list.add(MultiBean(true,"14",""))
        list.add(MultiBean(true,"13",""))
        list.add(MultiBean(true,"14",""))
        list.add(MultiBean(true,"13",""))
        list.add(MultiBean(true,"14",""))
        list.add(MultiBean(true,"13",""))
        list.add(MultiBean(true,"14",""))
        list.add(MultiBean(true,"13",""))
        list.add(MultiBean(true,"14",""))
        list.add(MultiBean(true,"13",""))
        list.add(MultiBean(true,"14",""))
        list.add(MultiBean(true,"13",""))
        list.add(MultiBean(true,"14",""))
        list.add(MultiBean(true,"13",""))
        list.add(MultiBean(true,"14",""))
        list.add(MultiBean(true,"13",""))
        list.add(MultiBean(true,"14",""))
        list.add(MultiBean(false,"8",""))
        list.add(MultiBean(false,"9",""))
        list.add(MultiBean(false,"10",""))
        list.add(MultiBean(false,"8",""))
        list.add(MultiBean(false,"9",""))
        list.add(MultiBean(false,"10",""))
        list.add(MultiBean(false,"8",""))
        list.add(MultiBean(false,"9",""))
        list.add(MultiBean(false,"10",""))
        list.add(MultiBean(false,"8",""))
        list.add(MultiBean(false,"9",""))
        list.add(MultiBean(false,"10",""))
        list.add(MultiBean(false,"8",""))
        list.add(MultiBean(false,"9",""))
        list.add(MultiBean(false,"10",""))
        list.add(MultiBean(false,"8",""))
        list.add(MultiBean(false,"9",""))
        list.add(MultiBean(false,"10",""))
        list.add(MultiBean(false,"8",""))
        list.add(MultiBean(false,"9",""))
        list.add(MultiBean(false,"10",""))
        list.add(MultiBean(false,"8",""))
        list.add(MultiBean(false,"9",""))
        list.add(MultiBean(false,"10",""))
        list.add(MultiBean(false,"8",""))
        list.add(MultiBean(false,"9",""))
        list.add(MultiBean(false,"10",""))
        list.add(MultiBean(false,"8",""))
        list.add(MultiBean(false,"9",""))
        list.add(MultiBean(false,"10",""))
        list.add(MultiBean(false,"8",""))
        list.add(MultiBean(false,"9",""))
        list.add(MultiBean(false,"10",""))
        list.add(MultiBean(false,"8",""))
        list.add(MultiBean(false,"9",""))
        list.add(MultiBean(false,"10",""))
        mainBinding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = TestAdapter(list,this)
        mainBinding.recyclerView.adapter = adapter
        mainBinding.btn.setOnClickListener {
           DownCoroutines().startDownLoad()
        }
        mainBinding.recyclerView.addItemDecoration(StickItemDecoration(this))

        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
            requestPermissions(arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.MOUNT_UNMOUNT_FILESYSTEMS),1001)
        }
        Algorithm().mergeSort(intArrayOf(99,0,12,34,88,65,44))

    }
}