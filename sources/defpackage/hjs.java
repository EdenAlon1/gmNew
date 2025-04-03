package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hjs implements Iterable, htx, fflg {
    private final hjr a;
    private final int b;
    private final int c;

    public hjs(hjr hjrVar, int i, int i2) {
        this.a = hjrVar;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        if (this.a.g != this.c) {
            hjt.g();
        }
        if (this.a.b(this.b) != null) {
            return new hkv();
        }
        hjr hjrVar = this.a;
        int i = this.b;
        return new hgv(hjrVar, i + 1, i + hjt.a(hjrVar.a, i));
    }
}
