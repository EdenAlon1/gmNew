package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgfi extends ffhr {
    boolean a;
    boolean b;
    /* synthetic */ Object c;
    final /* synthetic */ cgfj d;
    int e;
    cgfj f;
    Instant g;
    Instant h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgfi(cgfj cgfjVar, ffgu ffguVar) {
        super(ffguVar);
        this.d = cgfjVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(0, null, 0, false, null, false, null, this);
    }
}
