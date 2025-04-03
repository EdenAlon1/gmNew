package defpackage;

import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiev implements AutoCloseable {
    public fiev(String str) {
        Trace.beginSection(str.length() > 127 ? String.valueOf(str.substring(0, 124)).concat("...") : str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Trace.endSection();
    }
}
