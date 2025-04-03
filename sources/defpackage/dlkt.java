package defpackage;

import com.google.android.libraries.abuse.hades.tartarus.core.TartarusKt;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlkt implements Closeable {
    private static final enru c = enru.c("com/google/android/libraries/abuse/hades/tartarus/core/TartarusRuntime");
    public long a;
    public boolean b = false;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.b) {
            this.b = true;
            int i = dlks.a;
            boolean m = TartarusKt.m(this.a);
            this.a = 0L;
            if (m) {
                return;
            }
        }
        ((enrr) c.j().h("com/google/android/libraries/abuse/hades/tartarus/core/TartarusRuntime", "close", 59, "TartarusRuntime.kt")).q("Failed to release runtime.");
    }
}
