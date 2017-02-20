package dernik.recyclerviewdatabinding.viewModels;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import dernik.recyclerviewdatabinding.R;

/**
 * Created by Nik on 20.02.2017.
 */

public class OverViewViewModel {
    public String header = "asda";
    public RecyclerView recyclerView;
    private ObservableList<ItemViewModel> items;

    public List<ItemViewModel> getItems() {
        if(items == null)
        {
            loadItems();
        }
        return items;
    }

    public void setItems(ObservableList<ItemViewModel> items) {
        this.items = items;
    }

    private List<ItemViewModel> loadItems()
    {
        items = new ObservableArrayList<>();
        for(int i = 0; i < 10; i++)
        {
            ItemViewModel model = new ItemViewModel();
            model.itemName = "Item "+i;
            model.imgSrcId.set(R.drawable.secret);
            items.add(model);
        }
        return items;
    }
}
