package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yg {
    public int[] a;
    public List b;

    public final yf a(int i) {
        yf yfVar;
        List list = this.b;
        if (list == null) {
            return null;
        }
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            yfVar = (yf) this.b.get(size);
        } while (yfVar.a != i);
        return yfVar;
    }

    public final void b(yf yfVar) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            yf yfVar2 = (yf) this.b.get(i);
            if (yfVar2.a == yfVar.a) {
                this.b.remove(i);
            }
            if (yfVar2.a >= yfVar.a) {
                this.b.add(i, yfVar);
                return;
            }
        }
        this.b.add(yfVar);
    }

    public final void c() {
        int[] iArr = this.a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.b = null;
    }

    public final void d(int i) {
        int[] iArr = this.a;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.a = iArr2;
            Arrays.fill(iArr2, -1);
            return;
        }
        int length = iArr.length;
        if (i >= length) {
            while (length <= i) {
                length += length;
            }
            int[] iArr3 = new int[length];
            this.a = iArr3;
            int length2 = iArr.length;
            System.arraycopy(iArr, 0, iArr3, 0, length2);
            int[] iArr4 = this.a;
            Arrays.fill(iArr4, length2, iArr4.length, -1);
        }
    }

    public final void e(int i, int i2) {
        int[] iArr = this.a;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        d(i3);
        int[] iArr2 = this.a;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill(this.a, i, i3, -1);
        List list = this.b;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                yf yfVar = (yf) this.b.get(size);
                int i4 = yfVar.a;
                if (i4 >= i) {
                    yfVar.a = i4 + i2;
                }
            }
        }
    }

    public final void f(int i, int i2) {
        int[] iArr = this.a;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        d(i3);
        int[] iArr2 = this.a;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = this.a;
        int length = iArr3.length;
        Arrays.fill(iArr3, length - i2, length, -1);
        List list = this.b;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                yf yfVar = (yf) this.b.get(size);
                int i4 = yfVar.a;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.b.remove(size);
                    } else {
                        yfVar.a = i4 - i2;
                    }
                }
            }
        }
    }

    public final void g(int i) {
        List list = this.b;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (((yf) this.b.get(size)).a >= i) {
                    this.b.remove(size);
                }
            }
        }
        i(i);
    }

    public final yf h(int i, int i2, int i3) {
        List list = this.b;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            yf yfVar = (yf) this.b.get(i4);
            int i5 = yfVar.a;
            if (i5 >= i2) {
                return null;
            }
            if (i5 >= i && (i3 == 0 || yfVar.b == i3 || yfVar.d)) {
                return yfVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r5) {
        /*
            r4 = this;
            int[] r0 = r4.a
            if (r0 != 0) goto L5
            goto L5f
        L5:
            int r0 = r0.length
            if (r5 >= r0) goto L5f
            java.util.List r0 = r4.b
            r1 = -1
            if (r0 != 0) goto Lf
        Ld:
            r0 = r1
            goto L45
        Lf:
            yf r0 = r4.a(r5)
            if (r0 == 0) goto L1a
            java.util.List r2 = r4.b
            r2.remove(r0)
        L1a:
            java.util.List r0 = r4.b
            int r0 = r0.size()
            r2 = 0
        L21:
            if (r2 >= r0) goto L33
            java.util.List r3 = r4.b
            java.lang.Object r3 = r3.get(r2)
            yf r3 = (defpackage.yf) r3
            int r3 = r3.a
            if (r3 < r5) goto L30
            goto L34
        L30:
            int r2 = r2 + 1
            goto L21
        L33:
            r2 = r1
        L34:
            if (r2 == r1) goto Ld
            java.util.List r0 = r4.b
            java.lang.Object r0 = r0.get(r2)
            yf r0 = (defpackage.yf) r0
            java.util.List r3 = r4.b
            r3.remove(r2)
            int r0 = r0.a
        L45:
            if (r0 != r1) goto L51
            int[] r0 = r4.a
            int r2 = r0.length
            java.util.Arrays.fill(r0, r5, r2, r1)
            int[] r5 = r4.a
            int r5 = r5.length
            return
        L51:
            int r0 = r0 + 1
            int[] r2 = r4.a
            int r2 = r2.length
            int r0 = java.lang.Math.min(r0, r2)
            int[] r2 = r4.a
            java.util.Arrays.fill(r2, r5, r0, r1)
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yg.i(int):void");
    }
}
