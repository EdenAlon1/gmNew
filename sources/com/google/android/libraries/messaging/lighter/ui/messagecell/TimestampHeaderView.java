package com.google.android.libraries.messaging.lighter.ui.messagecell;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.dzyd;
import defpackage.eabw;
import defpackage.fdql;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class TimestampHeaderView extends FrameLayout {
    public static final long a = TimeUnit.MINUTES.toMillis(1);
    public TextView b;
    public long c;
    private final Runnable d;

    public TimestampHeaderView(Context context) {
        this(context, null);
    }

    public TimestampHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bubbleCellStyle);
        postDelayed(this.d, a);
    }

    public TimestampHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(dzyd.a(context, fdql.i()), attributeSet, i);
        this.d = new eabw(this);
        inflate(getContext(), R.layout.bubble_cell_tombstone_layout, this);
        this.b = (TextView) findViewById(R.id.timestamp_header);
    }
}
