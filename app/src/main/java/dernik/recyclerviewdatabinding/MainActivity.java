package dernik.recyclerviewdatabinding;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public final String TAG = getClass().getSimpleName();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(new RecyclerViewAdapter(this, getData()));
    }

    private List<ItemViewModel> getData(){
        List<ItemViewModel> data = new ArrayList<>();
        for(int i = 0; i < 10; i++)
        {
            ItemViewModel model = new ItemViewModel();
            model.itemName = "Item "+i;
            model.imgSrcId.set(R.drawable.secret);
            data.add(model);
        }
        return data;
    }
}
