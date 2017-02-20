package dernik.recyclerviewdatabinding.ui.activities;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import dernik.recyclerviewdatabinding.databinding.OverViewDataBinding;
import dernik.recyclerviewdatabinding.viewModels.ItemViewModel;
import dernik.recyclerviewdatabinding.R;
import dernik.recyclerviewdatabinding.ui.adapter.RecyclerViewAdapter;
import dernik.recyclerviewdatabinding.viewModels.OverViewViewModel;

public class MainActivity extends AppCompatActivity {
    public final String TAG = getClass().getSimpleName();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        OverViewDataBinding binding = DataBindingUtil.setContentView(this, R.layout.fragment_overview);
        OverViewViewModel viewModel = new OverViewViewModel();
        binding.setOverViewViewModel(viewModel);
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
