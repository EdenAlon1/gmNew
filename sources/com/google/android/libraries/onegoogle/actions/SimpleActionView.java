package com.google.android.libraries.onegoogle.actions;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.ebvw;
import defpackage.ebwc;
import defpackage.emux;
import defpackage.emxc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class SimpleActionView extends LinearLayout implements ebwc {
    public emxc a;

    public SimpleActionView(Context context) {
        this(context, null);
    }

    @Override // defpackage.ebwc
    public final void b(ebvw ebvwVar) {
        if (this.a.g()) {
            ebvwVar.c(this, ((Integer) this.a.c()).intValue());
        }
    }

    @Override // defpackage.ebwc
    public final void ho(ebvw ebvwVar) {
        if (this.a.g()) {
            ebvwVar.e(this);
        }
    }

    public SimpleActionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = emux.a;
    }
}
