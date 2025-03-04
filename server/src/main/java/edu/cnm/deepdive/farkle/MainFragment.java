package edu.cnm.deepdive.farkle;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.android.AndroidEntryPoint;


@AndroidEntryPoint
public class MainFragment extends Fragment {

  private FarkleViewModel viewModel;

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    viewModel = new ViewModelProvider(this).get(FarkleViewModel.class);
    // Use the viewModel and other injected dependencies
  }
}
