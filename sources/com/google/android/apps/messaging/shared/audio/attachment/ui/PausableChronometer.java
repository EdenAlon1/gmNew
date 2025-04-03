package com.google.android.apps.messaging.shared.audio.attachment.ui;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.ardg;
import defpackage.cqoh;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class PausableChronometer extends ardg {
    public cqoh a;
    public long b;

    public PausableChronometer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0L;
    }

    public final void c(long j) {
        this.b = j;
        setBase(this.a.a() - this.b);
    }
}
