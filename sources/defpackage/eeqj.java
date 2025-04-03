package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeqj {
    public eeqi a;

    public final void a(eeqi eeqiVar) {
        if (this.a == eeqiVar) {
            this.a = null;
        }
        notifyAll();
    }

    public final synchronized void b(eeqi eeqiVar) {
        eeqiVar.a = true;
        if (this.a == eeqiVar) {
            this.a = null;
        }
        notifyAll();
    }
}
