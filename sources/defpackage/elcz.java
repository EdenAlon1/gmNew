package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elcz implements Closeable {
    public final long a;

    public elcz(long j) {
        this.a = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        efbd.d(new Runnable() { // from class: elcy
            @Override // java.lang.Runnable
            public final void run() {
                elcz elczVar = elcz.this;
                synchronized (eldl.b) {
                }
            }
        }, 5000L);
    }
}
