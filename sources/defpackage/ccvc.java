package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccvc extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ ccvj b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccvc(ccvj ccvjVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = ccvjVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object j = this.b.j(null, null, this);
        return j == ffhh.a ? j : new ffch(j);
    }
}
