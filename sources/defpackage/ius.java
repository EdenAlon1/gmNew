package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ius extends ffkk implements ffix {
    final /* synthetic */ ixj a;
    final /* synthetic */ iuv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ius(ixj ixjVar, iuv iuvVar) {
        super(0);
        this.a = ixjVar;
        this.b = iuvVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        ffji n = this.a.a.n();
        if (n != null) {
            n.invoke(new iuu(this.b));
        }
        return ffcu.a;
    }
}
