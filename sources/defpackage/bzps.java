package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzps extends ffhr {
    boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ bzpx c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzps(bzpx bzpxVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = bzpxVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, null, this);
    }
}
