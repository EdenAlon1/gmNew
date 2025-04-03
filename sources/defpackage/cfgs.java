package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfgs extends ffhr {
    Object a;
    Object b;
    long c;
    /* synthetic */ Object d;
    final /* synthetic */ cfgt e;
    int f;
    cfgt g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfgs(cfgt cfgtVar, ffgu ffguVar) {
        super(ffguVar);
        this.e = cfgtVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(null, this);
    }
}
