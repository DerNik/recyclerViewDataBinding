package dernik.recyclerviewdatabinding.ui.fragments;

import android.app.Fragment;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dernik.recyclerviewdatabinding.R;
import dernik.recyclerviewdatabinding.databinding.OverViewDataBinding;
import dernik.recyclerviewdatabinding.viewModels.OverViewViewModel;

/**
 * Created by Nik on 20.02.2017.
 */

public class OverViewFragment extends Fragment {
    OverViewViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable  ViewGroup container, @Nullable  Bundle savedInstanceState) {
        OverViewDataBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_overview, container, false);
        View view = binding.getRoot();
        viewModel = new OverViewViewModel();
        binding.setOverViewViewModel(viewModel);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
