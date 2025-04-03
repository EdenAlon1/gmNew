package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qpm extends qol {
    private final Object m;
    private qoq n;

    static {
        String.format("application/json; charset=%s", "utf-8");
    }

    public qpm(String str, qoq qoqVar, qop qopVar) {
        super(str, qopVar);
        this.m = new Object();
        this.n = qoqVar;
    }

    @Override // defpackage.qol
    public final void e() {
        super.e();
        synchronized (this.m) {
            this.n = null;
        }
    }

    @Override // defpackage.qol
    protected final void f(Object obj) {
        qoq qoqVar;
        synchronized (this.m) {
            qoqVar = this.n;
        }
        if (qoqVar != null) {
            qoqVar.a(obj);
        }
    }
}
