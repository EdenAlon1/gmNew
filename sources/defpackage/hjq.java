package defpackage;

import com.android.vcard.VCardConfig;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjq {
    public final hjr a;
    public final int[] b;
    public final int c;
    public final int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    private final Object[] m;
    private final hgx n;

    public hjq(hjr hjrVar) {
        this.a = hjrVar;
        this.b = hjrVar.a;
        int i = hjrVar.b;
        this.c = i;
        this.m = hjrVar.c;
        this.d = hjrVar.d;
        this.g = i;
        this.h = -1;
        this.n = new hgx();
    }

    private final Object C(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) == 0) {
            return hfc.a;
        }
        Object[] objArr = this.m;
        int length = iArr.length;
        if (i2 < length) {
            length = iArr[i2 + 4] + Integer.bitCount(i3 >> 29);
        }
        return objArr[length];
    }

    public final boolean A() {
        return x() || this.f == this.g;
    }

    public final boolean B(int i) {
        return (this.b[(i * 5) + 1] & 1073741824) != 0;
    }

    public final int a() {
        int i = this.f;
        if (i < this.g) {
            return this.b[i * 5];
        }
        return 0;
    }

    public final int b(int i) {
        return this.b[i * 5];
    }

    public final int c(int i) {
        return hjt.a(this.b, i);
    }

    public final int d(int i) {
        return this.b[(i * 5) + 1] & 67108863;
    }

    public final int e(int i) {
        return this.b[(i * 5) + 2];
    }

    public final int f() {
        if (this.i != 0) {
            hfp.j("Cannot skip while in an empty region");
        }
        int[] iArr = this.b;
        int i = this.f;
        int i2 = iArr[(i * 5) + 1];
        int i3 = (1073741824 & i2) == 0 ? 67108863 & i2 : 1;
        this.f = i + hjt.a(iArr, i);
        return i3;
    }

    public final hen g(int i) {
        ArrayList arrayList = this.a.h;
        int d = hjt.d(arrayList, i, this.c);
        if (d >= 0) {
            return (hen) arrayList.get(d);
        }
        hen henVar = new hen(i);
        arrayList.add(-(d + 1), henVar);
        return henVar;
    }

    public final Object h() {
        int i = this.f;
        if (i < this.g) {
            return C(this.b, i);
        }
        return 0;
    }

    public final Object i() {
        int i = this.f;
        if (i < this.g) {
            return p(this.b, i);
        }
        return null;
    }

    public final Object j(int i) {
        return C(this.b, i);
    }

    public final Object k(int i) {
        return l(this.f, i);
    }

    public final Object l(int i, int i2) {
        int e = hjt.e(this.b, i);
        int i3 = i + 1;
        int i4 = e + i2;
        return i4 < (i3 < this.c ? this.b[(i3 * 5) + 4] : this.d) ? this.m[i4] : hfc.a;
    }

    public final Object m(int i) {
        return p(this.b, i);
    }

    public final Object n() {
        int i;
        if (this.i > 0 || (i = this.j) >= this.k) {
            this.l = false;
            return hfc.a;
        }
        this.l = true;
        Object[] objArr = this.m;
        this.j = i + 1;
        return objArr[i];
    }

    public final Object o(int i) {
        int i2 = i * 5;
        int[] iArr = this.b;
        if ((iArr[i2 + 1] & 1073741824) != 0) {
            return this.m[iArr[i2 + 4]];
        }
        return null;
    }

    public final Object p(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 536870912) != 0) {
            return this.m[hjt.c(iArr, i)];
        }
        return null;
    }

    public final void q() {
        this.i++;
    }

    public final void r() {
        this.e = true;
        if (this.a.e <= 0) {
            hfp.j("Unexpected reader close()");
        }
        r0.e--;
    }

    public final void s() {
        if (this.i == 0) {
            if (this.f != this.g) {
                hfp.j("endGroup() not called at the end of a group");
            }
            int[] iArr = this.b;
            int i = iArr[(this.h * 5) + 2];
            this.h = i;
            this.g = i < 0 ? this.c : hjt.a(iArr, i) + i;
            int b = this.n.b();
            if (b < 0) {
                this.j = 0;
                this.k = 0;
            } else {
                this.j = b;
                this.k = i >= this.c + (-1) ? this.d : this.b[((i + 1) * 5) + 4];
            }
        }
    }

    public final void t(int i) {
        if (this.i != 0) {
            hfp.j("Cannot reposition while in an empty region");
        }
        this.f = i;
        int i2 = this.c;
        int i3 = i < i2 ? this.b[(i * 5) + 2] : -1;
        if (i3 != this.h) {
            this.h = i3;
            if (i3 < 0) {
                this.g = i2;
            } else {
                this.g = i3 + hjt.a(this.b, i3);
            }
            this.j = 0;
            this.k = 0;
        }
    }

    public final String toString() {
        return "SlotReader(current=" + this.f + ", key=" + a() + ", parent=" + this.h + ", end=" + this.g + ')';
    }

    public final void u() {
        if (this.i != 0) {
            hfp.j("Cannot skip the enclosing group while in an empty region");
        }
        this.f = this.g;
        this.j = 0;
        this.k = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v() {
        /*
            r5 = this;
            int r0 = r5.i
            if (r0 > 0) goto L53
            int r0 = r5.h
            int r1 = r5.f
            int[] r2 = r5.b
            int r3 = r1 * 5
            int r3 = r3 + 2
            r2 = r2[r3]
            if (r2 == r0) goto L17
            java.lang.String r0 = "Invalid slot table detected"
            defpackage.hih.a(r0)
        L17:
            hgx r0 = r5.n
            int r2 = r5.j
            int r3 = r5.k
            r4 = -1
            if (r2 != 0) goto L27
            if (r3 != 0) goto L26
            r0.d(r4)
            goto L2a
        L26:
            r2 = 0
        L27:
            r0.d(r2)
        L2a:
            r5.h = r1
            int[] r0 = r5.b
            int r0 = defpackage.hjt.a(r0, r1)
            int r0 = r0 + r1
            r5.g = r0
            int r0 = r1 + 1
            r5.f = r0
            int[] r2 = r5.b
            int r2 = defpackage.hjt.e(r2, r1)
            r5.j = r2
            int r2 = r5.c
            int r2 = r2 + r4
            if (r1 < r2) goto L49
            int r0 = r5.d
            goto L51
        L49:
            int[] r1 = r5.b
            int r0 = r0 * 5
            int r0 = r0 + 4
            r0 = r1[r0]
        L51:
            r5.k = r0
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hjq.v():void");
    }

    public final boolean w(int i) {
        return (this.b[(i * 5) + 1] & VCardConfig.FLAG_APPEND_TYPE_PARAM) != 0;
    }

    public final boolean x() {
        return this.i > 0;
    }

    public final boolean y(int i) {
        return (this.b[(i * 5) + 1] & VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS) != 0;
    }

    public final boolean z(int i) {
        return (this.b[(i * 5) + 1] & 536870912) != 0;
    }
}
