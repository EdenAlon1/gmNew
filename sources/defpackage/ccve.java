package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccve extends ffhr {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ ccvj c;
    int d;
    ccvl e;
    ccvj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccve(ccvj ccvjVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = ccvjVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object k = this.c.k(null, null, this);
        return k == ffhh.a ? k : new ffch(k);
    }
}
