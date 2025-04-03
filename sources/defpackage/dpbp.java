package defpackage;

import android.media.MediaCodec;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpbp extends ffhr {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dpbu c;
    int d;
    MediaCodec.BufferInfo e;
    MediaCodec f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpbp(dpbu dpbuVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = dpbuVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
