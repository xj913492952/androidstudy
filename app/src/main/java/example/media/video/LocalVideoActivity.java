package example.media.video;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.style.base.BaseRecyclerViewAdapter;
import com.style.config.FileDirConfig;
import com.style.framework.R;
import com.style.lib.media.video.PlayVideoActivity;

import java.io.File;
import java.util.ArrayList;

public class LocalVideoActivity extends AppCompatActivity {
    LocalVideoAdapter adapter;
    ArrayList<File> videoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_video);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        videoList = new ArrayList<>();
        adapter = new LocalVideoAdapter(this, videoList);
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new BaseRecyclerViewAdapter.OnItemClickListener<File>() {
            @Override
            public void onItemClick(int position, File data) {
                Intent i = new Intent();
                i.putExtra("path", data.getAbsolutePath());
                i.setClass(LocalVideoActivity.this, PlayVideoActivity.class);
                startActivity(i);
            }
        });
        getData();
    }

    public void getData() {
        String path = FileDirConfig.DIR_VIDEO;

        File[] allFiles = new File(path).listFiles();
        if (allFiles != null)
            for (int i = 0; i < allFiles.length; i++) {
                File file = allFiles[i];
                if (file.isFile()) {
                    videoList.add(file);
                }
            }
            adapter.notifyDataSetChanged();
    }
}
