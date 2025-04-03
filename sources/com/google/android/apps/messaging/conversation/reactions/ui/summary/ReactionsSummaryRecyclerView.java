package com.google.android.apps.messaging.conversation.reactions.ui.summary;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.enru;
import defpackage.vil;
import defpackage.vjd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ReactionsSummaryRecyclerView extends vil {
    public static final enru ac = enru.c("com/google/android/apps/messaging/conversation/reactions/ui/summary/ReactionsSummaryRecyclerView");
    public vjd ad;

    public ReactionsSummaryRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int dimensionPixelSize = ((int) (getResources().getDisplayMetrics().heightPixels * 0.8d)) - getResources().getDimensionPixelSize(R.dimen.reaction_summary_margin);
        int i3 = getResources().getDisplayMetrics().widthPixels;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.reaction_summary_margin);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3 - (dimensionPixelSize2 + dimensionPixelSize2), 1073741824), View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, Integer.MIN_VALUE));
    }
}
