package defpackage;

import android.media.MediaCodec;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bzu implements bjt {
    final /* synthetic */ bxv a;
    final /* synthetic */ bzv b;

    public bzu(bzv bzvVar, bxv bxvVar) {
        this.b = bzvVar;
        this.a = bxvVar;
    }

    @Override // defpackage.bjt
    public final void a(Throwable th) {
        this.b.b.m.remove(this.a);
        if (th instanceof MediaCodec.CodecException) {
            this.b.b.h((MediaCodec.CodecException) th);
        } else {
            bzv bzvVar = this.b;
            bzvVar.b.i(0, th.getMessage(), th);
        }
    }

    @Override // defpackage.bjt
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.b.m.remove(this.a);
    }
}
