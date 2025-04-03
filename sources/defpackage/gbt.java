package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gbt extends ffkk implements ffix {
    final /* synthetic */ ffji a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbt(ffji ffjiVar, long j) {
        super(0);
        this.a = ffjiVar;
        this.b = j;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        this.a.invoke(Long.valueOf(this.b));
        return ffcu.a;
    }
}
