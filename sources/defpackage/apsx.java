package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apsx implements AutoCloseable, alxx {
    private static final enru d = enru.c("com/google/android/apps/messaging/shared/api/messaging/message/internal/ChangeHandler");
    public final fgdj c;
    private final fgcm f;
    private final ctbx g;
    private final AtomicBoolean e = new AtomicBoolean(false);
    public final Object a = new Object();
    public final List b = new ArrayList();

    public apsx(alxy alxyVar) {
        fgcm a = fgdm.a(0);
        this.f = a;
        this.c = new fgco(a);
        this.g = alxyVar.c(this);
    }

    @Override // defpackage.alxx
    public final void a() {
        Object c;
        if (this.e.get()) {
            ensk h = d.h();
            h.Y(ente.a, "BugleMapi");
            ((enrr) h.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/ChangeHandler", "invalidate", 341, "OptimisticMessagePager.kt")).q("skipping invalidate since the handler is closed.");
        } else {
            fgcm fgcmVar = this.f;
            do {
                c = fgcmVar.c();
            } while (!fgcmVar.g(c, Integer.valueOf(((Number) c).intValue() + 1)));
        }
    }

    @Override // defpackage.alxx
    public final void b(alxd alxdVar, alxw alxwVar) {
        alxdVar.getClass();
        a();
    }

    public final void c(boolean z) {
        List ak;
        if (this.e.get()) {
            ensk h = d.h();
            h.Y(ente.a, "BugleMapi");
            ((enrr) h.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/ChangeHandler", "propagateChange", 359, "OptimisticMessagePager.kt")).q("skipping propagateChange since the handler is closed.");
        } else if (z && ((Number) this.f.c()).intValue() == 0) {
            ensk h2 = d.h();
            h2.Y(ente.a, "BugleMapi");
            ((enrr) h2.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/ChangeHandler", "propagateChange", 364, "OptimisticMessagePager.kt")).q("skipping propagateChange since the underlying data didn't change.");
        } else {
            synchronized (this.a) {
                ak = ffdx.ak(this.b);
            }
            Iterator it = ak.iterator();
            while (it.hasNext()) {
                ((alxx) it.next()).a();
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.e.set(true);
        ctbw.a(this.g);
    }
}
