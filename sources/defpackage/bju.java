package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bju implements kfd {
    final /* synthetic */ bjv a;

    public bju(bjv bjvVar) {
        this.a = bjvVar;
    }

    @Override // defpackage.kfd
    public final Object a(kfb kfbVar) {
        ksw.d(this.a.b == null, "The result can only set once!");
        this.a.b = kfbVar;
        return "FutureChain[" + this.a + "]";
    }
}
