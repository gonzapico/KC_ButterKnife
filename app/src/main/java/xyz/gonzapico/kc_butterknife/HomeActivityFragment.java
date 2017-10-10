package xyz.gonzapico.kc_butterknife;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;

/**
 * A placeholder fragment containing a simple view.
 */
public class HomeActivityFragment extends Fragment {

  private final static String TAG = "Fragment";

  @OnClick(R.id.btnScroll) void openScrollActivity(View v){
    Intent intentScrolling = new Intent(mActivity, ScrollingActivity.class);
    mActivity.startActivity(intentScrolling);
  }

  @OnClick(R.id.btnPick) void openPickActivity(View v){
    Intent intentScrolling = new Intent(mActivity, PickActivity.class);
    mActivity.startActivity(intentScrolling);
  }

  @BindView(R.id.tvWelcome) TextView tvWelcome;
  @OnTextChanged(value = R.id.etWelcome,
      callback = OnTextChanged.Callback.AFTER_TEXT_CHANGED)
  void afterEmailInput(Editable editable) {
    tvWelcome.setText(editable.toString());
  }

  @BindString(R.string.welcome_message) String welcomeMsg;

  private HomeActivity mActivity;

  public HomeActivityFragment() {
  }

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_home, container, false);
    ButterKnife.bind(this, view);
    tvWelcome.setText(welcomeMsg);
    mActivity = (HomeActivity) getActivity();
    return view;
  }
}
