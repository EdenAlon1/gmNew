package defpackage;

import java.io.Closeable;
import java.nio.channels.FileLock;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efcr implements Closeable {
    private FileLock a;

    public efcr(FileLock fileLock) {
        this.a = fileLock;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileLock fileLock = this.a;
        if (fileLock != null) {
            fileLock.release();
            this.a = null;
        }
    }
}
