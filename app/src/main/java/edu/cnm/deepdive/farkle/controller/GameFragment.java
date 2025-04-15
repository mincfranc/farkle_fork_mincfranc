package edu.cnm.deepdive.farkle.controller;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import edu.cnm.deepdive.farkle.R;
import edu.cnm.deepdive.farkle.databinding.FragmentGameBinding;
import edu.cnm.deepdive.farkle.databinding.FragmentHomeBinding;
import edu.cnm.deepdive.farkle.viewmodel.GameViewModel;
import edu.cnm.deepdive.farkle.viewmodel.LoginViewModel;

public class GameFragment extends Fragment {

  private static final String TAG = HomeFragment.class.getSimpleName();
  private FragmentGameBinding binding;
  private GameViewModel viewModel;

  public GameFragment() {
    // Required empty public constructor
  }

  @Override
  public View onCreateView(
      LayoutInflater inflater,
      ViewGroup container,
      Bundle savedInstanceState) {
    binding = FragmentGameBinding.inflate(inflater, container, false);
    return binding.getRoot();
  }

  @Override
  public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
//    onclickquitbutton -> Navigation.findNavController(binding.getRoot())
//                .navigate(GameFragmentDirections.navigateToHomeFragment());

  }

  @Override
  public void onDestroyView() {
    binding = null;
    super.onDestroyView();
  }
}