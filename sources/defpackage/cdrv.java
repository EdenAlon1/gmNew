package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdrv extends ffhr {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ cdrr d;
    int e;
    cdrr f;
    Instant g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdrv(cdrr cdrrVar, ffgu ffguVar) {
        super(ffguVar);
        this.d = cdrrVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.e(null, null, this);
    }
}
