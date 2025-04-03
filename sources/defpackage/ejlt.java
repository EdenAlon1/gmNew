package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejlt implements Runnable {
    final List a = new ArrayList();
    Runnable b;

    @Override // java.lang.Runnable
    public final void run() {
        efbd.c();
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
