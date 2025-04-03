package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fvi extends ffkk implements ffji {
    final /* synthetic */ ffsk a;
    final /* synthetic */ gmk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvi(ffsk ffskVar, gmk gmkVar) {
        super(1);
        this.a = ffskVar;
        this.b = gmkVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ffqy.d(this.a, null, null, new fvh(this.b, ((Number) obj).floatValue(), null), 3);
        return ffcu.a;
    }
}
