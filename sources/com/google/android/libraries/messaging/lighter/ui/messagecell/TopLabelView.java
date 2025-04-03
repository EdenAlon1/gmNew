package com.google.android.libraries.messaging.lighter.ui.messagecell;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.dzyd;
import defpackage.fdql;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class TopLabelView extends LinearLayout {
    public final TextView a;
    private final ImageView b;

    public TopLabelView(Context context) {
        this(context, null);
    }

    public final void a(int i) {
        this.b.setVisibility(i);
    }

    public TopLabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopLabelView(Context context, AttributeSet attributeSet, int i) {
        super(dzyd.a(context, fdql.i()), attributeSet, i);
        inflate(getContext(), R.layout.top_label_layout, this);
        this.b = (ImageView) findViewById(R.id.top_label_bot_icon);
        this.a = (TextView) findViewById(R.id.top_label_text);
        setPadding(getPaddingLeft(), getResources().getDimensionPixelSize(R.dimen.top_label_padding_top), getPaddingRight(), getResources().getDimensionPixelSize(R.dimen.top_label_padding_bottom));
    }
}
