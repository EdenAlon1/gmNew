package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ehwh implements Runnable {
    public final dhri d;

    public ehwh() {
        this.d = null;
    }

    protected abstract void a();

    public final void b(Exception exc) {
        dhri dhriVar = this.d;
        if (dhriVar != null) {
            dhriVar.c(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            b(e);
        }
    }

    public ehwh(dhri dhriVar) {
        this.d = dhriVar;
    }
}
