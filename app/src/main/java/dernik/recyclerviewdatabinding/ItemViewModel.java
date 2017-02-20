package dernik.recyclerviewdatabinding;

import android.databinding.ObservableInt;

/**
 * Created by Nik on 20.02.2017.
 */

public class ItemViewModel {
    public String itemName;
    public final ObservableInt imgSrcId = new ObservableInt();
}
