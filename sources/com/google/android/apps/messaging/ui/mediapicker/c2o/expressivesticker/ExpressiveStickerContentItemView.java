package com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.cxqk;
import defpackage.dccs;
import defpackage.elay;
import defpackage.elbx;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ExpressiveStickerContentItemView extends dccs {
    public cxqk a;
    public elbx b;

    public ExpressiveStickerContentItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.selectable.SelectableContentItemView, defpackage.dcal
    public final int a() {
        return 1;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.selectable.SelectableContentItemView, android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new elay(this.b, "ExpressiveStickerContentItemView::onClick", this.a.a(this.n)));
    }
}
