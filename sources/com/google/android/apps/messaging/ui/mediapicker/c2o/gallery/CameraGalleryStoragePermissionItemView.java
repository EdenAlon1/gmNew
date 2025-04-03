package com.google.android.apps.messaging.ui.mediapicker.c2o.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.CameraGalleryStoragePermissionItemView;
import defpackage.dcai;
import defpackage.dcal;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CameraGalleryStoragePermissionItemView extends LinearLayout implements dcal {
    public dcai a;
    private final int b;

    public CameraGalleryStoragePermissionItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = getResources().getDimensionPixelSize(R.dimen.camera_gallery_placeholder_start_margin) + getResources().getDimensionPixelSize(R.dimen.camera_gallery_placeholder_end_margin);
    }

    @Override // defpackage.dcal
    public final int a() {
        return 2;
    }

    @Override // defpackage.dcal
    public final void b(dcai dcaiVar) {
        this.a = dcaiVar;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new View.OnClickListener() { // from class: dcel
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CameraGalleryStoragePermissionItemView cameraGalleryStoragePermissionItemView = CameraGalleryStoragePermissionItemView.this;
                dcai dcaiVar = cameraGalleryStoragePermissionItemView.a;
                if (dcaiVar != null) {
                    dcaiVar.a(cameraGalleryStoragePermissionItemView);
                }
            }
        });
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - ((int) (size / (getResources().getConfiguration().orientation == 1 ? 1.3333334f : 0.75f)))) - this.b, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }
}
