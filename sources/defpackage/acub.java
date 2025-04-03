package defpackage;

import j$.util.Map;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acub implements Closeable {
    final /* synthetic */ acuq a;
    private final acua b;
    private final acum c;

    public acub(acuq acuqVar, acua acuaVar, acum acumVar) {
        this.a = acuqVar;
        this.b = acuaVar;
        this.c = acumVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean h = this.c.h();
        boolean z = !h;
        synchronized (acuq.b) {
            acum acumVar = (acum) this.a.i.get(this.b);
            if (acumVar != null && acumVar.equals(this.c)) {
                if (!h) {
                    acuq.a.p("Removing cancelled JsBridgeChannel");
                    Map.EL.remove(this.a.i, this.b, acumVar);
                }
            }
            z = true;
        }
        if (z) {
            acuq.a.p("Closing cancelled JsBridgeChannel");
            try {
                this.c.close();
            } catch (IOException e) {
                acuq.a.o("Failed when closing an opening JsBridgeChannel", e);
            }
        }
    }
}
