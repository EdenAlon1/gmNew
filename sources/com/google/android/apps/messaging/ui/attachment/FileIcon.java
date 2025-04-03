package com.google.android.apps.messaging.ui.attachment;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import defpackage.ctap;
import defpackage.cxnv;
import defpackage.cxqh;
import defpackage.ehdr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FileIcon extends cxnv {
    ImageView a;
    boolean b;
    String c;
    int d;

    public FileIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = "*/*";
    }

    public void a() {
        this.a.setBackground(cxqh.i(getContext()));
        ImageView imageView = this.a;
        Context context = getContext();
        imageView.setImageDrawable(ctap.j(context, context.getResources().getDrawable(cxqh.e(this.c)), ehdr.d(context, R.attr.colorOnPrimaryBrandIcon, "ConversationDrawables")));
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.file_image);
        a();
    }
}
