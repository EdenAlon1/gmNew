package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ghw extends ffkk implements ffix {
    final /* synthetic */ gmk a;
    final /* synthetic */ ffix b;
    final /* synthetic */ ffsk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghw(gmk gmkVar, ffix ffixVar, ffsk ffskVar) {
        super(0);
        this.a = gmkVar;
        this.b = ffixVar;
        this.c = ffskVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        int ordinal = this.a.c().ordinal();
        if (ordinal == 1) {
            this.b.invoke();
        } else if (ordinal != 2) {
            ffqy.d(this.c, null, null, new ghv(this.a, null), 3);
        } else {
            ffqy.d(this.c, null, null, new ghu(this.a, null), 3);
        }
        return ffcu.a;
    }
}
