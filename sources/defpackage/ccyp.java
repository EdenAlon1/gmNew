package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccyp extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ ccyq b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccyp(ccyq ccyqVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = ccyqVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object e = this.b.e(null, null, this);
        return e == ffhh.a ? e : new ffch(e);
    }
}
