package defpackage;

import android.util.Log;
import java.io.Writer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gv extends Writer {
    private final StringBuilder b = new StringBuilder(128);
    private final String a = "FragmentManager";

    private final void a() {
        if (this.b.length() > 0) {
            Log.d(this.a, this.b.toString());
            StringBuilder sb = this.b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                a();
            } else {
                this.b.append(c);
            }
        }
    }
}
