package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhrg {
    private final Object a = new Object();
    private Queue b;
    private boolean c;

    public final void a(dhrf dhrfVar) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(dhrfVar);
        }
    }

    public final void b(dhre dhreVar) {
        dhrf dhrfVar;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        dhrfVar = (dhrf) this.b.poll();
                        if (dhrfVar == null) {
                            this.c = false;
                            return;
                        }
                    }
                    dhrfVar.c(dhreVar);
                }
            }
        }
    }
}
