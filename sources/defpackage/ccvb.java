package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccvb extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ ccvj b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccvb(ccvj ccvjVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = ccvjVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object i = this.b.i(false, null, null, 0, this);
        return i == ffhh.a ? i : new ffch(i);
    }
}
