package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.internal.IChannelStreamCallbacks;
import defpackage.dfwv;
import defpackage.dibq;
import defpackage.dibz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ChannelStreamCallbacks extends IChannelStreamCallbacks.Stub {
    private final Object a = new Object();
    private dibz b;
    private dibq c;

    @Override // com.google.android.gms.wearable.internal.IChannelStreamCallbacks
    public void onChannelUnexpectedlyClosed(int i, int i2) {
        dibz dibzVar;
        dibq dibqVar;
        synchronized (this.a) {
            dibzVar = this.b;
            dibqVar = new dibq();
            this.c = dibqVar;
        }
        if (dibzVar != null) {
            dibzVar.a(dibqVar);
        }
    }

    public void setListener(dibz dibzVar) {
        dibq dibqVar;
        synchronized (this.a) {
            dfwv.n(dibzVar);
            this.b = dibzVar;
            dibqVar = this.c;
        }
        if (dibqVar != null) {
            dibzVar.a(dibqVar);
        }
    }
}
