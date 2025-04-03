package defpackage;

import android.media.MediaCodec;

/* compiled from: PG */
/* loaded from: classes.dex */
final class byv implements bjt {
    final /* synthetic */ byw a;

    public byv(byw bywVar) {
        this.a = bywVar;
    }

    @Override // defpackage.bjt
    public final void a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            this.a.a.h((MediaCodec.CodecException) th);
        } else {
            byw bywVar = this.a;
            bywVar.a.i(0, th.getMessage(), th);
        }
    }

    @Override // defpackage.bjt
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }
}
