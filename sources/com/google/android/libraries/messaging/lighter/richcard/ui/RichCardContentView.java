package com.google.android.libraries.messaging.lighter.richcard.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import defpackage.dzya;
import defpackage.dzyk;
import defpackage.fdql;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RichCardContentView extends FrameLayout implements dzya {
    public RichCardContentView(Context context) {
        this(context, null);
    }

    @Override // defpackage.dzya
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        throw null;
    }

    public RichCardContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RichCardContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        dzyk.a(getContext(), fdql.e());
        dzyk.a(getContext(), fdql.d());
        getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_content_start_end_padding);
    }
}
