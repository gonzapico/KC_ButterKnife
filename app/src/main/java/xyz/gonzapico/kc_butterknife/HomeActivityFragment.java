package xyz.gonzapico.kc_butterknife;

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
import butterknife.OnTextChanged;

/**
 * A placeholder fragment containing a simple view.
 */
public class HomeActivityFragment extends Fragment {

  private final static String TAG = "Fragment";

  private Button btnScroll;


  @BindView(R.id.tvWelcome) TextView tvWelcome;
  @OnTextChanged(value = R.id.etWelcome,
      callback = OnTextChanged.Callback.AFTER_TEXT_CHANGED)
  void afterEmailInput(Editable editable) {
    tvWelcome.setText(editable.toString());
  }

  @BindString(R.string.welcome_message) String welcomeMsg;

  public HomeActivityFragment() {
  }

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_home, container, false);
    ButterKnife.bind(this, view);
    tvWelcome.setText(welcomeMsg);
    btnScroll = (Button) getActivity().findViewById(R.id.btnScroll);
    btnScroll.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        // TODO add method to go to the scroll activity
      }
    });
    return view;
  }
}
