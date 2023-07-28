package com.example.soleseeker;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EllipseIndicatorAdapter extends RecyclerView.Adapter<EllipseIndicatorAdapter.EllipseIndicatorViewHolder> {

    private int itemCount;
    private int selectedPosition = 0;

    public EllipseIndicatorAdapter(int itemCount) {
        this.itemCount = itemCount;
    }

    @NonNull
    @Override
    public EllipseIndicatorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ellipse_indicator_item, parent, false);
        return new EllipseIndicatorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EllipseIndicatorViewHolder holder, int position) {
        holder.indicatorDot.setSelected(position == selectedPosition);

        // Apply size and margins for the indicator dots (Modify values as needed)
        int indicatorSize = 20; // Size in pixels
        int indicatorMargin = 10; // Margin in pixels

        ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) holder.indicatorDot.getLayoutParams();
        params.width = indicatorSize;
        params.height = indicatorSize;

        if (position == 0) {
            params.setMarginStart(0);
            params.setMarginEnd(indicatorMargin);
        } else if (position == itemCount - 1) {
            params.setMarginStart(indicatorMargin);
            params.setMarginEnd(0);
        } else {
            params.setMarginStart(indicatorMargin);
            params.setMarginEnd(indicatorMargin);
        }

        holder.indicatorDot.setLayoutParams(params);
    }

    @Override
    public int getItemCount() {
        return itemCount;
    }

    public void setSelectedPosition(int position) {
        selectedPosition = position;
        notifyDataSetChanged();
    }

    static class EllipseIndicatorViewHolder extends RecyclerView.ViewHolder {
        ImageView indicatorDot;

        public EllipseIndicatorViewHolder(@NonNull View itemView) {
            super(itemView);
            indicatorDot = itemView.findViewById(R.id.indicatorDot);
        }
    }
}
