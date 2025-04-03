package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pur implements Runnable {
    private final puu a;
    private final Intent b;
    private final int c;

    public pur(puu puuVar, Intent intent, int i) {
        this.a = puuVar;
        this.b = intent;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(this.b, this.c);
    }
}
