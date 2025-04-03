package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjzu extends ffhr {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ ckac c;
    int d;
    ckac e;
    int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjzu(ckac ckacVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = ckacVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object k = this.c.k(null, 0, this);
        return k == ffhh.a ? k : new ffch(k);
    }
}
