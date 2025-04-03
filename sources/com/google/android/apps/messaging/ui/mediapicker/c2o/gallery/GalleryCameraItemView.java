package com.google.android.apps.messaging.ui.mediapicker.c2o.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryCameraItemView;
import defpackage.dcai;
import defpackage.dcal;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GalleryCameraItemView extends FrameLayout implements dcal {
    public dcai a;

    public GalleryCameraItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.dcal
    public final int a() {
        return 3;
    }

    @Override // defpackage.dcal
    public final void b(dcai dcaiVar) {
        this.a = dcaiVar;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new View.OnClickListener() { // from class: dcfb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GalleryCameraItemView galleryCameraItemView = GalleryCameraItemView.this;
                dcai dcaiVar = galleryCameraItemView.a;
                if (dcaiVar != null) {
                    dcaiVar.a(galleryCameraItemView);
                }
            }
        });
    }
}
