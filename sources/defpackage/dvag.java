package defpackage;

import android.os.Trace;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvag implements AutoCloseable {
    private static final ThreadLocal a = new dvaf();
    private final String b;

    public dvag(String str) {
        this.b = str;
        ozg.a(str);
        ((ArrayDeque) a.get()).push(str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Trace.endSection();
        String str = (String) ((ArrayDeque) a.get()).poll();
        String str2 = this.b;
        if (!str2.equals(str)) {
            throw new IllegalStateException(String.format("Expect Tracer.endSection(\"%s\") but get Tracer.endSection(\"%s\")", str, str2));
        }
    }
}
