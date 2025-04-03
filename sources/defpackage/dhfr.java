package defpackage;

import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhfr implements AutoCloseable {
    public dhfr(String str) {
        Trace.beginSection(str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Trace.endSection();
    }
}
