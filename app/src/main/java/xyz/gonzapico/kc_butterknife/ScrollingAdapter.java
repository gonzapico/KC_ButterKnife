package xyz.gonzapico.kc_butterknife;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by gonzapico on 10/10/2017.
 */

public class ScrollingAdapter extends RecyclerView.Adapter<ScrollingAdapter.ViewHolder> {


  private String[] mDataset;

  // Provide a suitable constructor (depends on the kind of dataset)
  public ScrollingAdapter(Context context) {
    mDataset = context.getResources().getStringArray(R.array.scroll_data);
  }

  // Create new views (invoked by the layout manager)
  @Override
  public ScrollingAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
      int viewType) {
    // create a new view
    View v = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.row_scroll, parent, false);
    // set the view's size, margins, paddings and layout parameters
    ViewHolder vh = new ViewHolder(v);
    return vh;
  }

  // Replace the contents of a view (invoked by the layout manager)
  @Override
  public void onBindViewHolder(ViewHolder holder, int position) {
    // - get element from your dataset at this position
    // - replace the contents of the view with that element
    holder.mTvCard.setText(mDataset[position]);

  }

  // Return the size of your dataset (invoked by the layout manager)
  @Override
  public int getItemCount() {
    return mDataset.length;
  }

  // Provide a reference to the views for each data item
  // Complex data items may need more than one view per item, and
  // you provide access to all the views for a data item in a view holder
  public static class ViewHolder extends RecyclerView.ViewHolder {
    // each data item is just a string in this case
    public TextView mTvCard;
    public ViewHolder(View v) {
      super(v);
      mTvCard = (TextView) v.findViewById(R.id.tvRowCard);
    }
  }
}

