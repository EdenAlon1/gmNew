package com.google.android.apps.messaging.ui.search.homeview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.google.android.apps.messaging.R;
import defpackage.crly;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ZeroStateSearchHomeView extends ScrollView {
    public ZeroStateContentGroupsView a;
    public crly b;
    public ZeroStateContentGridLayout c;

    public ZeroStateSearchHomeView(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ZeroStateContentGroupsView) findViewById(R.id.zero_state_content_groups);
        this.b = new crly(this, R.id.zero_state_content_grid_layout, R.id.zero_state_content_grid_layout);
    }

    public ZeroStateSearchHomeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ZeroStateSearchHomeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
