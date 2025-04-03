package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnqj extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ cnqp b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnqj(cnqp cnqpVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = cnqpVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object b = this.b.b(null, this);
        return b == ffhh.a ? b : new ffch(b);
    }
}
