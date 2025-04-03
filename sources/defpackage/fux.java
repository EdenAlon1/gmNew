package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fux extends ffkk implements ffix {
    final /* synthetic */ gmk a;
    final /* synthetic */ ffsk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fux(gmk gmkVar, ffsk ffskVar) {
        super(0);
        this.a = gmkVar;
        this.b = ffskVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        int ordinal = this.a.c().ordinal();
        if (ordinal == 1) {
            ffqy.d(this.b, null, null, new fuu(this.a, null), 3);
        } else if (ordinal != 2) {
            ffqy.d(this.b, null, null, new fuw(this.a, null), 3);
        } else {
            ffqy.d(this.b, null, null, new fuv(this.a, null), 3);
        }
        return ffcu.a;
    }
}
