package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class chdg implements Closeable {
    final /* synthetic */ chdj a;

    public chdg(chdj chdjVar) {
        this.a = chdjVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            this.a.w = null;
        }
    }
}
