package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class kqs {
    public boolean a;
    public boolean b;
    public ozt c;

    public final void a() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.b = true;
            ozt oztVar = this.c;
            if (oztVar != null) {
                try {
                    oztVar.a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.b = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.b = false;
                notifyAll();
            }
        }
    }
}
