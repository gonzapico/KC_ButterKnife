package xyz.gonzapico.kc_butterknife;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;

/**
 * Created by gonzapico on 14/10/2017.
 */

public abstract class BaseKCActivity extends AppCompatActivity {

  public abstract int getLayoutId();

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(getLayoutId());
    ButterKnife.bind(this);
  }
}
