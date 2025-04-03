package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gco extends ffkk implements ffix {
    final /* synthetic */ ffji a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gco(ffji ffjiVar, int i) {
        super(0);
        this.a = ffjiVar;
        this.b = i;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        this.a.invoke(Integer.valueOf(this.b));
        return ffcu.a;
    }
}
