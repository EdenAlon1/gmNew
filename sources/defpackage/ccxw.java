package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccxw extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ ccxy b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccxw(ccxy ccxyVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = ccxyVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object e = this.b.e(null, null, this);
        return e == ffhh.a ? e : new ffch(e);
    }
}
