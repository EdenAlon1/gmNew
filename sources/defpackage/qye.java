package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qye extends rkc implements qyg {
    public qyf a;

    public qye(long j) {
        super(j);
    }

    @Override // defpackage.rkc
    protected final /* bridge */ /* synthetic */ int a(Object obj) {
        qwv qwvVar = (qwv) obj;
        if (qwvVar == null) {
            return 1;
        }
        return qwvVar.a();
    }

    @Override // defpackage.qyg
    public final /* bridge */ /* synthetic */ qwv b(qtp qtpVar) {
        return (qwv) super.j(qtpVar);
    }

    @Override // defpackage.rkc
    protected final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        qwv qwvVar = (qwv) obj2;
        qyf qyfVar = this.a;
        if (qyfVar == null || qwvVar == null) {
            return;
        }
        ((qwe) qyfVar).e.a(qwvVar, true);
    }

    @Override // defpackage.qyg
    public final /* bridge */ /* synthetic */ void d(qtp qtpVar, qwv qwvVar) {
    }
}
