package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emu {
    public final int a;
    public final List b;
    public final long c;
    public final Object d;
    public final boolean e;
    public final int f;
    public final int[] g;
    public int h;
    public int i;
    private final hun j;
    private final kah k;
    private final hus l;

    public emu(int i, List list, long j, Object obj, dqs dqsVar, hun hunVar, hus husVar, kah kahVar) {
        this.a = i;
        this.b = list;
        this.c = j;
        this.d = obj;
        this.j = hunVar;
        this.l = husVar;
        this.k = kahVar;
        this.e = dqsVar == dqs.a;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iqk iqkVar = (iqk) list.get(i3);
            i2 = Math.max(i2, !this.e ? iqkVar.b : iqkVar.a);
        }
        this.f = i2;
        int size2 = this.b.size();
        this.g = new int[size2 + size2];
        this.i = Integer.MIN_VALUE;
    }

    public final void a(int i) {
        int i2;
        this.h += i;
        while (true) {
            int[] iArr = this.g;
            if (i2 >= iArr.length) {
                return;
            }
            if (this.e) {
                i2 = i2 % 2 != 1 ? i2 + 1 : 0;
                iArr[i2] = iArr[i2] + i;
            } else {
                if (i2 % 2 != 0) {
                }
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final void b(int i, int i2, int i3) {
        int i4;
        this.h = i;
        this.i = true != this.e ? i2 : i3;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            iqk iqkVar = (iqk) list.get(i5);
            int i6 = i5 + i5;
            if (this.e) {
                int[] iArr = this.g;
                hun hunVar = this.j;
                if (hunVar == null) {
                    dwv.a("null horizontalAlignment");
                    throw new ffbx();
                }
                iArr[i6] = hunVar.a(iqkVar.a, i2, this.k);
                this.g[i6 + 1] = i;
                i4 = iqkVar.b;
            } else {
                int i7 = i6 + 1;
                int[] iArr2 = this.g;
                iArr2[i6] = i;
                hus husVar = this.l;
                if (husVar == null) {
                    dwv.a("null verticalAlignment");
                    throw new ffbx();
                }
                iArr2[i7] = husVar.a(iqkVar.b, i3);
                i4 = iqkVar.a;
            }
            i += i4;
        }
    }
}
