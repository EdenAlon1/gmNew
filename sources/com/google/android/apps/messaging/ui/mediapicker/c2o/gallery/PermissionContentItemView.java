package com.google.android.apps.messaging.ui.mediapicker.c2o.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.PermissionContentItemView;
import defpackage.dcai;
import defpackage.dcal;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PermissionContentItemView extends LinearLayout implements dcal {
    public dcai a;

    public PermissionContentItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
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
        setOnClickListener(new View.OnClickListener() { // from class: dcha
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PermissionContentItemView permissionContentItemView = PermissionContentItemView.this;
                dcai dcaiVar = permissionContentItemView.a;
                if (dcaiVar != null) {
                    dcaiVar.a(permissionContentItemView);
                }
            }
        });
    }
}
