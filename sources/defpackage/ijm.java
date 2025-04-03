package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ijm extends ffhr {
    long a;
    /* synthetic */ Object b;
    final /* synthetic */ ijo c;
    int d;
    ijo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ijm(ijo ijoVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = ijoVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(0L, this);
    }
}
