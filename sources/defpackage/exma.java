package defpackage;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exma implements Closeable {
    public final Map a;
    public final int b;
    public final int c;
    private int d;

    public exma(exmb exmbVar, int i, int i2) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap.put(exmbVar.a(), exmbVar);
        this.b = i;
        this.c = i2;
        this.d = 1;
    }

    public final exmb a() {
        return (exmb) this.a.values().iterator().next();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((exmb) it.next()).b();
            }
        }
    }
}
