package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efcw implements Closeable {
    public Closeable a;

    public efcw(Closeable closeable) {
        this.a = closeable;
    }

    public final Closeable a() {
        Closeable closeable = this.a;
        this.a = null;
        return closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Closeable closeable = this.a;
        if (closeable != null) {
            closeable.close();
        }
    }
}
