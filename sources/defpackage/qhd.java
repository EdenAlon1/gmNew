package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qhd implements qdd {
    final /* synthetic */ ffrf a;

    public qhd(ffrf ffrfVar) {
        this.a = ffrfVar;
    }

    @Override // defpackage.qdd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Throwable th = (Throwable) obj;
        if (this.a.k()) {
            return;
        }
        ffrf ffrfVar = this.a;
        th.getClass();
        ffrfVar.w(ffci.a(th));
    }
}
