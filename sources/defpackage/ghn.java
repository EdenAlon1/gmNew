package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ghn extends ffkk implements ffji {
    final /* synthetic */ ffsk a;
    final /* synthetic */ gmk b;
    final /* synthetic */ ffix c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghn(ffsk ffskVar, gmk gmkVar, ffix ffixVar) {
        super(1);
        this.a = ffskVar;
        this.b = gmkVar;
        this.c = ffixVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ffqy.d(this.a, null, null, new ghl(this.b, ((Number) obj).floatValue(), null), 3).hZ(new ghm(this.b, this.c));
        return ffcu.a;
    }
}
