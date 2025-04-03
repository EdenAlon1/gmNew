package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lfg {
    public lex a;
    private final SparseArray b;

    private lfg() {
        this(1);
    }

    final lfg a(int i) {
        return (lfg) this.b.get(i);
    }

    final void b(lex lexVar, int i, int i2) {
        lfg a = a(lexVar.a(i));
        if (a == null) {
            a = new lfg(1);
            this.b.put(lexVar.a(i), a);
        }
        if (i2 > i) {
            a.b(lexVar, i + 1, i2);
        } else {
            a.a = lexVar;
        }
    }

    public lfg(int i) {
        this.b = new SparseArray(i);
    }
}
