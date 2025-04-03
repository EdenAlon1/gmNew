package com.google.android.apps.messaging.ui.mediapicker.c2o.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.FullscreenGalleryItemView;
import defpackage.dcai;
import defpackage.dcal;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FullscreenGalleryItemView extends LinearLayout implements dcal {
    public dcai a;

    public FullscreenGalleryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.dcal
    public final int a() {
        return 8;
    }

    @Override // defpackage.dcal
    public final void b(dcai dcaiVar) {
        this.a = dcaiVar;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new View.OnClickListener() { // from class: dceu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FullscreenGalleryItemView fullscreenGalleryItemView = FullscreenGalleryItemView.this;
                dcai dcaiVar = fullscreenGalleryItemView.a;
                if (dcaiVar != null) {
                    dcaiVar.a(fullscreenGalleryItemView);
                }
            }
        });
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i2, i2);
    }
}
