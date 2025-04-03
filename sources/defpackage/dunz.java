package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dunz {
    final dunx[] a = new dunx[64];
    private final Object b = new Object();
    private final AtomicInteger c = new AtomicInteger(0);

    final void a(dunx dunxVar) {
        int andIncrement = this.c.getAndIncrement() % 64;
        synchronized (this.b) {
            this.a[andIncrement] = dunxVar;
        }
    }
}
