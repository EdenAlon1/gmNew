package com.google.android.apps.messaging.ui.attachment;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import defpackage.ctap;
import defpackage.cxqh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FileIconCompose extends FileIcon {
    public FileIconCompose(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.apps.messaging.ui.attachment.FileIcon
    public final void a() {
        this.a.setBackground(cxqh.i(getContext()));
        ImageView imageView = this.a;
        Context context = getContext();
        imageView.setImageDrawable(ctap.j(context, context.getResources().getDrawable(cxqh.e(this.c)), context.getColor(R.color.file_icon_compose)));
    }
}
