package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class let implements Runnable {
    private final List a;
    private final Throwable b;
    private final int c;

    public let(Collection collection, int i, Throwable th) {
        ksw.i(collection, "initCallbacks cannot be null");
        this.a = new ArrayList(collection);
        this.c = i;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        int size = this.a.size();
        int i2 = 0;
        if (i != 1) {
            while (i2 < size) {
                ((les) this.a.get(i2)).a(this.b);
                i2++;
            }
        } else {
            while (i2 < size) {
                ((les) this.a.get(i2)).b();
                i2++;
            }
        }
    }
}
