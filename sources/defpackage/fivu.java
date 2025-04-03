package defpackage;

import android.util.Log;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fivu implements Closeable {
    private static final String b = "fivu";
    public final long a;
    private boolean c;

    protected fivu(long j) {
        if (j == 0) {
            throw new IllegalArgumentException("Failed to load C++ pointer from JNI");
        }
        this.a = j;
    }

    protected abstract void a(long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.c) {
            return;
        }
        a(this.a);
        this.c = true;
    }

    protected final void finalize() {
        try {
            if (!this.c) {
                Log.w(b, "Closing an already closed native lib");
                close();
            }
        } finally {
            super.finalize();
        }
    }
}
