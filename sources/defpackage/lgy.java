package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lgy {
    public lhc a;
    private final SparseArray b;

    private lgy() {
        this(1);
    }

    final lgy a(int i) {
        return (lgy) this.b.get(i);
    }

    final void b(lhc lhcVar, int i, int i2) {
        lgy a = a(lhcVar.a(i));
        if (a == null) {
            a = new lgy(1);
            this.b.put(lhcVar.a(i), a);
        }
        if (i2 > i) {
            a.b(lhcVar, i + 1, i2);
        } else {
            a.a = lhcVar;
        }
    }

    public lgy(int i) {
        this.b = new SparseArray(i);
    }
}
