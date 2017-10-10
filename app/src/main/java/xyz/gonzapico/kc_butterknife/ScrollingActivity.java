package xyz.gonzapico.kc_butterknife;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ScrollingActivity extends AppCompatActivity {

  private RecyclerView rvScrolling;
  private Toolbar toolbar;
  private FloatingActionButton fab;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_scrolling);

    bindViews();

    setSupportActionBar(toolbar);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    setUpRecyclerView();
  }

  private void bindViews(){
    toolbar = (Toolbar) findViewById(R.id.toolbar);
    fab = (FloatingActionButton) findViewById(R.id.fab);
    rvScrolling = (RecyclerView) findViewById(R.id.rvScroll);
  }

  private void setUpRecyclerView(){
    // use this setting to improve performance if you know that changes
    // in content do not change the layout size of the RecyclerView
    rvScrolling.setHasFixedSize(true);

    // use a linear layout manager
    rvScrolling.setLayoutManager(new LinearLayoutManager(this));

    // specify an adapter (see also next example)
    rvScrolling.setAdapter(new ScrollingAdapter(this));
  }
}
