package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enuh extends enuj {
    public final int[] a;
    public final int b;
    private final ents c;
    private final ents d;

    public enuh(ents entsVar, ents entsVar2) {
        int h;
        this.c = entsVar;
        this.d = entsVar2;
        int b = entsVar.b() + entsVar2.b();
        int i = 0;
        enxb.a(b <= 28, "metadata size too large");
        int[] iArr = new int[b];
        this.a = iArr;
        long j = 0;
        int i2 = 0;
        while (i < iArr.length) {
            ensn e = e(i);
            long j2 = e.d | j;
            if (j2 != j || (h = h(e, iArr, i2)) == -1) {
                iArr[i2] = i;
                i2++;
            } else {
                iArr[h] = e.b ? iArr[h] | (1 << (i + 4)) : i;
            }
            i++;
            j = j2;
        }
        this.b = i2;
    }

    private final int h(ensn ensnVar, int[] iArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (ensnVar.equals(e(iArr[i2] & 31))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.enuj
    public final int a() {
        return this.b;
    }

    @Override // defpackage.enuj
    public final Object b(ensn ensnVar) {
        enxb.a(!ensnVar.b, "key must be single valued");
        int h = h(ensnVar, this.a, this.b);
        if (h >= 0) {
            return ensnVar.c(f(this.a[h]));
        }
        return null;
    }

    @Override // defpackage.enuj
    public final Set c() {
        return new enuf(this);
    }

    @Override // defpackage.enuj
    public final void d(entz entzVar, Object obj) {
        for (int i = 0; i < this.b; i++) {
            int i2 = this.a[i];
            ensn e = e(i2 & 31);
            if (e.b) {
                entzVar.b(e, new enug(this, e, i2), obj);
            } else {
                entzVar.a(e, e.c(f(i2)), obj);
            }
        }
    }

    public final ensn e(int i) {
        int b = this.c.b();
        return i >= b ? this.d.c(i - b) : this.c.c(i);
    }

    public final Object f(int i) {
        int b = this.c.b();
        return i >= b ? this.d.e(i - b) : this.c.e(i);
    }
}
