package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnqx extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ cnrn b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnqx(cnrn cnrnVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = cnrnVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object f = this.b.f(this);
        return f == ffhh.a ? f : new ffch(f);
    }
}
