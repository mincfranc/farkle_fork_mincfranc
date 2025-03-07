package edu.cnm.deepdive.farkle;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

  @Inject
  FarkleViewModel viewModel;  // Injecting your ViewModel using Hilt

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // You can now use viewModel and other injected dependencies
  }
}
