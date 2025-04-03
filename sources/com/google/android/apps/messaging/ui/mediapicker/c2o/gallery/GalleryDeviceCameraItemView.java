package com.google.android.apps.messaging.ui.mediapicker.c2o.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryDeviceCameraItemView;
import defpackage.dcai;
import defpackage.dcal;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GalleryDeviceCameraItemView extends LinearLayout implements dcal {
    public dcai a;

    public GalleryDeviceCameraItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.dcal
    public final int a() {
        return 12;
    }

    @Override // defpackage.dcal
    public final void b(dcai dcaiVar) {
        this.a = dcaiVar;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.device_camera_picture_button);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: dcgb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GalleryDeviceCameraItemView galleryDeviceCameraItemView = GalleryDeviceCameraItemView.this;
                dcai dcaiVar = galleryDeviceCameraItemView.a;
                if (dcaiVar != null) {
                    dcaiVar.a(galleryDeviceCameraItemView);
                }
            }
        });
        View findViewById2 = findViewById(R.id.device_camera_video_button);
        findViewById2.setOnClickListener(new View.OnClickListener() { // from class: dcgc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dcai dcaiVar = GalleryDeviceCameraItemView.this.a;
                if (dcaiVar != null) {
                    dcaiVar.a.g();
                }
            }
        });
        findViewById.setClipToOutline(true);
        findViewById2.setClipToOutline(true);
    }
}
