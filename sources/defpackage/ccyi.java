package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccyi extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ ccyq b;
    int c;
    String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccyi(ccyq ccyqVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = ccyqVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object b = this.b.b(null, null, this);
        return b == ffhh.a ? b : new ffch(b);
    }
}
