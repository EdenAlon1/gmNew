package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccxm extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ ccxy b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccxm(ccxy ccxyVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = ccxyVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object b = this.b.b(null, null, this);
        return b == ffhh.a ? b : new ffch(b);
    }
}
