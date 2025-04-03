package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acuc implements Closeable {
    final /* synthetic */ acuq a;
    private final String b;
    private final kfb c;

    public acuc(acuq acuqVar, String str, kfb kfbVar) {
        this.a = acuqVar;
        this.b = str;
        this.c = kfbVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a.j) {
            kfb kfbVar = (kfb) this.a.j.get(this.b);
            if (kfbVar != null && kfbVar.equals(this.c)) {
                csjb c = acuq.a.c();
                c.I("Removing cancelled request");
                c.A("requestId", this.b);
                c.r();
                this.a.j.remove(this.b);
            }
        }
    }
}
