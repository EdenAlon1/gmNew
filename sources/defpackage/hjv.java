package defpackage;

import com.android.vcard.VCardConfig;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjv {
    public final hjr a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public cnw f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public cnw p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    private final hgx u;
    private final hgx v;
    private final hgx w;
    private cnv x;

    public hjv(hjr hjrVar) {
        this.a = hjrVar;
        this.b = hjrVar.a;
        this.c = hjrVar.c;
        this.d = hjrVar.h;
        this.e = hjrVar.i;
        this.f = hjrVar.j;
        int i = hjrVar.b;
        this.g = i;
        this.h = (this.b.length / 5) - i;
        int i2 = hjrVar.d;
        this.k = i2;
        this.l = this.c.length - i2;
        this.m = i;
        this.u = new hgx();
        this.v = new hgx();
        this.w = new hgx();
        this.r = i;
        this.s = -1;
    }

    public static final int W(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public static /* synthetic */ void Y(hjv hjvVar) {
        int i = hjvVar.s;
        int h = hjvVar.h(i) * 5;
        int[] iArr = hjvVar.b;
        int i2 = h + 1;
        int i3 = iArr[i2];
        if ((i3 & VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        iArr[i2] = i4;
        if ((67108864 & i4) == 0) {
            hjvVar.Q(hjvVar.l(i));
        }
    }

    private final int ab(int[] iArr, int i) {
        return c(iArr, i) + Integer.bitCount(iArr[(i * 5) + 1] >> 29);
    }

    private final int ac(int[] iArr, int i) {
        return ad(iArr[(h(i) * 5) + 2]);
    }

    private final int ad(int i) {
        return i > -2 ? i : f() + i + 2;
    }

    private final int ae(int i, int i2) {
        return i < i2 ? i : -((f() - i) + 2);
    }

    private final void af() {
        this.v.d((e() - this.h) - this.r);
    }

    private final void ag(int i, Object obj, boolean z, Object obj2) {
        int a;
        hgx hgxVar = this.w;
        int i2 = this.s;
        int i3 = this.n;
        hgxVar.d(this.o);
        if (i3 > 0) {
            int i4 = this.q;
            int c = c(this.b, h(i4));
            E(1);
            this.i = c;
            this.j = c;
            int h = h(i4);
            Object obj3 = hfc.a;
            int i5 = obj != obj3 ? 1 : 0;
            int i6 = (z || obj2 == obj3) ? 0 : 1;
            int i7 = this.l;
            int i8 = this.k;
            int length = this.c.length;
            int W = W(c, i8, i7, length);
            if (W >= 0 && this.m < i4) {
                W = -(((length - i7) - W) + 1);
            }
            int[] iArr = this.b;
            int i9 = this.s;
            int i10 = h * 5;
            iArr[i10] = i;
            iArr[i10 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i10 + 2] = i9;
            iArr[i10 + 3] = 0;
            iArr[i10 + 4] = W;
            int i11 = (z ? 1 : 0) + i5 + i6;
            if (i11 > 0) {
                F(i11, i4);
                Object[] objArr = this.c;
                int i12 = this.i;
                if (z) {
                    objArr[i12] = obj2;
                    i12++;
                }
                if (i5 != 0) {
                    objArr[i12] = obj;
                    i12++;
                }
                if (i6 != 0) {
                    objArr[i12] = obj2;
                    i12++;
                }
                this.i = i12;
            }
            this.o = 0;
            a = i4 + 1;
            this.s = i4;
            this.q = a;
            if (i2 >= 0 && t(i2) != null) {
                throw null;
            }
        } else {
            this.u.d(i2);
            af();
            int i13 = this.q;
            int h2 = h(i13);
            if (!ffkj.e(obj2, hfc.a)) {
                if (z) {
                    R(this.q, obj2);
                } else {
                    P(obj2);
                }
            }
            this.i = n(this.b, h2);
            this.j = c(this.b, h(this.q + 1));
            int[] iArr2 = this.b;
            this.o = iArr2[(h2 * 5) + 1] & 67108863;
            this.s = i13;
            this.q = i13 + 1;
            a = i13 + hjt.a(iArr2, h2);
        }
        this.r = a;
    }

    private static final int ah(int i, int i2, int i3) {
        return i < 0 ? (i3 - i2) + i + 1 : i;
    }

    private final void ai() {
        this.r = (e() - this.h) - this.v.b();
    }

    private final void aj(Object obj) {
        if (this.n > 0) {
            F(1, this.s);
        }
        Object[] objArr = this.c;
        int i = this.i;
        int i2 = i + 1;
        this.i = i2;
        Object obj2 = objArr[d(i)];
        if (i2 > this.j) {
            hfp.j("Writing to an invalid slot");
        }
        this.c[d(this.i - 1)] = obj;
    }

    public final void A(boolean z) {
        this.t = true;
        if (z && this.u.b == 0) {
            G(f());
            H(this.c.length - this.l, this.g);
            int i = this.k;
            ffdo.d(this.c, null, i, this.l + i);
            I();
        }
        hjr hjrVar = this.a;
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList arrayList = this.d;
        HashMap hashMap = this.e;
        cnw cnwVar = this.f;
        if (!hjrVar.f) {
            hih.a("Unexpected writer close()");
        }
        hjrVar.f = false;
        hjrVar.g(iArr, i2, objArr, i3, arrayList, hashMap, cnwVar);
    }

    public final void B() {
        if (this.n <= 0) {
            hih.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.w.b != this.u.b) {
                hfp.j("startGroup/endGroup mismatch while inserting");
            }
            ai();
        }
    }

    public final void C(int i) {
        if (this.n > 0) {
            hfp.j("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.s;
        if (i2 != i) {
            if (i < i2 || i >= this.r) {
                hfp.j(a.r(i2, i, "Started group at ", " must be a subgroup of the group at "));
            }
            int i3 = this.q;
            int i4 = this.i;
            int i5 = this.j;
            this.q = i;
            M();
            this.q = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void D(int i, int i2, int i3) {
        int ae = ae(i, this.g);
        while (i3 < i2) {
            int[] iArr = this.b;
            iArr[(h(i3) * 5) + 2] = ae;
            int a = hjt.a(iArr, h(i3)) + i3;
            D(i3, a, i3 + 1);
            i3 = a;
        }
    }

    public final void E(int i) {
        if (i > 0) {
            int i2 = this.q;
            G(i2);
            int i3 = this.g;
            int i4 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int max = Math.max(Math.max(length + length, i5 + i), 32);
                int i6 = max * 5;
                int i7 = max - i5;
                int[] iArr2 = new int[i6];
                ffdo.l(iArr, iArr2, 0, 0, i3 * 5);
                ffdo.l(iArr, iArr2, (i3 + i7) * 5, (i4 + i3) * 5, length * 5);
                this.b = iArr2;
                i4 = i7;
            }
            int i8 = this.r;
            if (i8 >= i3) {
                this.r = i8 + i;
            }
            int i9 = i3 + i;
            this.g = i9;
            this.h = i4 - i;
            int W = W(i5 > 0 ? b(i2 + i) : 0, this.m >= i3 ? this.k : 0, this.l, this.c.length);
            for (int i10 = i3; i10 < i9; i10++) {
                this.b[(i10 * 5) + 4] = W;
            }
            int i11 = this.m;
            if (i11 >= i3) {
                this.m = i11 + i;
            }
        }
    }

    public final void F(int i, int i2) {
        if (i > 0) {
            H(this.i, i2);
            int i3 = this.k;
            int i4 = this.l;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length + length, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.j;
            if (i9 >= i3) {
                this.j = i9 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r2 = r7.b;
        r3 = r8 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
        r6 = r3 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        if (r8 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        defpackage.ffdo.l(r2, r2, r6, r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        defpackage.ffdo.l(r2, r2, r5, r4 + r5, r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(int r8) {
        /*
            r7 = this;
            int r0 = r7.h
            int r1 = r7.g
            if (r1 == r8) goto L9e
            java.util.ArrayList r2 = r7.d
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L5b
            int r2 = r7.h
            int r3 = r7.e()
            int r3 = r3 - r2
            if (r1 >= r8) goto L39
            java.util.ArrayList r2 = r7.d
            int r2 = defpackage.hjt.b(r2, r1, r3)
        L1d:
            java.util.ArrayList r4 = r7.d
            int r4 = r4.size()
            if (r2 >= r4) goto L5b
            java.util.ArrayList r4 = r7.d
            java.lang.Object r4 = r4.get(r2)
            hen r4 = (defpackage.hen) r4
            int r5 = r4.a
            if (r5 >= 0) goto L5b
            int r5 = r5 + r3
            if (r5 >= r8) goto L5b
            r4.a = r5
            int r2 = r2 + 1
            goto L1d
        L39:
            java.util.ArrayList r2 = r7.d
            int r2 = defpackage.hjt.b(r2, r8, r3)
        L3f:
            java.util.ArrayList r4 = r7.d
            int r4 = r4.size()
            if (r2 >= r4) goto L5b
            java.util.ArrayList r4 = r7.d
            java.lang.Object r4 = r4.get(r2)
            hen r4 = (defpackage.hen) r4
            int r5 = r4.a
            if (r5 < 0) goto L5b
            int r5 = r3 - r5
            int r5 = -r5
            r4.a = r5
            int r2 = r2 + 1
            goto L3f
        L5b:
            if (r0 <= 0) goto L71
            int[] r2 = r7.b
            int r3 = r8 * 5
            int r4 = r0 * 5
            int r5 = r1 * 5
            int r6 = r3 + r4
            if (r8 >= r1) goto L6d
            defpackage.ffdo.l(r2, r2, r6, r3, r5)
            goto L71
        L6d:
            int r4 = r4 + r5
            defpackage.ffdo.l(r2, r2, r5, r4, r6)
        L71:
            if (r8 >= r1) goto L75
            int r1 = r8 + r0
        L75:
            int r2 = r7.e()
            if (r1 < r2) goto L80
            java.lang.String r3 = "Check failed"
            defpackage.hfp.j(r3)
        L80:
            if (r1 >= r2) goto L9e
            int[] r3 = r7.b
            int r4 = r1 * 5
            int r4 = r4 + 2
            r3 = r3[r4]
            int r5 = r7.ad(r3)
            int r5 = r7.ae(r5, r8)
            if (r5 == r3) goto L98
            int[] r3 = r7.b
            r3[r4] = r5
        L98:
            int r1 = r1 + 1
            if (r1 != r8) goto L80
            int r1 = r1 + r0
            goto L80
        L9e:
            r7.g = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hjv.G(int):void");
    }

    public final void H(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int min = Math.min(i2 + 1, f());
        if (i5 != min) {
            int length = this.c.length - i3;
            if (min < i5) {
                int h = h(min);
                int h2 = h(i5);
                int i7 = this.g;
                while (h < h2) {
                    int i8 = (h * 5) + 4;
                    int i9 = this.b[i8];
                    if (i9 < 0) {
                        hfp.j("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    h++;
                    if (h == i7) {
                        h += this.h;
                    }
                }
            } else {
                int h3 = h(i5);
                int h4 = h(min);
                while (h3 < h4) {
                    int i10 = (h3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (i11 >= 0) {
                        hfp.j("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    h3++;
                    if (h3 == this.g) {
                        h3 += this.h;
                    }
                }
            }
            this.m = min;
        }
        this.k = i;
    }

    public final void I() {
        int i;
        cnv cnvVar = this.x;
        if (cnvVar != null) {
            while (hii.c(cnvVar)) {
                int a = hii.a(cnvVar);
                int h = h(a) * 5;
                int i2 = a + 1;
                int j = j(a) + a;
                while (true) {
                    if (i2 >= j) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(h(i2) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        i2 += j(i2);
                    }
                }
                int[] iArr = this.b;
                int i3 = h + 1;
                int i4 = iArr[i3];
                if (((67108864 & i4) != 0 ? 1 : 0) != i) {
                    iArr[i3] = (i << 26) | ((-67108865) & i4);
                    int l = l(a);
                    if (l >= 0) {
                        hii.b(cnvVar, l);
                    }
                }
            }
        }
    }

    public final void J(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            H(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            ffdo.d(this.c, null, i, i5);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final void K() {
        int i = this.r;
        this.q = i;
        this.i = c(this.b, h(i));
    }

    public final void L(int i, Object obj, Object obj2) {
        ag(i, obj, false, obj2);
    }

    public final void M() {
        if (this.n != 0) {
            hfp.j("Key must be supplied when inserting");
        }
        Object obj = hfc.a;
        ag(0, obj, false, obj);
    }

    public final void N(int i, Object obj) {
        ag(i, obj, false, hfc.a);
    }

    public final void O(int i, Object obj) {
        ag(i, obj, true, hfc.a);
    }

    public final void P(Object obj) {
        int h = h(this.q);
        if ((this.b[(h * 5) + 1] & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) == 0) {
            hfp.j("Updating the data of a group that was not created with a data slot");
        }
        this.c[d(ab(this.b, h))] = obj;
    }

    public final void Q(int i) {
        if (i >= 0) {
            cnv cnvVar = this.x;
            if (cnvVar == null) {
                cnvVar = new cnv((byte[]) null);
                this.x = cnvVar;
            }
            hii.b(cnvVar, i);
        }
    }

    public final void R(int i, Object obj) {
        int h = h(i);
        int[] iArr = this.b;
        if (h >= iArr.length || (iArr[(h * 5) + 1] & 1073741824) == 0) {
            hfp.j(a.f(i, "Updating the node of a group at ", " that was not created with as a node group"));
        }
        this.c[d(c(this.b, h))] = obj;
    }

    public final boolean S(int i, int i2) {
        int e;
        int j;
        if (i2 == this.s) {
            e = this.r;
        } else {
            if (i2 > this.u.a(0)) {
                j = j(i2);
            } else {
                hgx hgxVar = this.u;
                int[] iArr = hgxVar.a;
                int min = Math.min(iArr.length, hgxVar.b);
                int i3 = 0;
                while (true) {
                    if (i3 >= min) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    j = j(i2);
                } else {
                    e = (e() - this.h) - this.v.a[i3];
                }
            }
            e = j + i2;
        }
        return i > i2 && i < e;
    }

    public final boolean T(int i) {
        return (this.b[(h(i) * 5) + 1] & 1073741824) != 0;
    }

    public final boolean U() {
        if (this.n != 0) {
            hfp.j("Cannot remove group while inserting");
        }
        int i = this.q;
        int i2 = this.i;
        int c = c(this.b, h(i));
        int m = m();
        if (t(this.s) != null && s(i) != null) {
            throw null;
        }
        cnv cnvVar = this.x;
        if (cnvVar != null) {
            while (hii.c(cnvVar)) {
                if (cnvVar.b == 0) {
                    cpx.d("IntList is empty.");
                }
                if (cnvVar.a[0] < i) {
                    break;
                }
                hii.a(cnvVar);
            }
        }
        boolean V = V(i, this.q - i);
        J(c, this.i - c, i - 1);
        this.q = i;
        this.i = i2;
        this.o -= m;
        return V;
    }

    public final boolean V(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            G(i);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.e;
                int i3 = i + i2;
                int b = hjt.b(this.d, i3, e() - this.h);
                if (b >= this.d.size()) {
                    b--;
                }
                int i4 = b + 1;
                int i5 = 0;
                while (b >= 0) {
                    hen henVar = (hen) this.d.get(b);
                    int a = a(henVar);
                    if (a < i) {
                        break;
                    }
                    if (a < i3) {
                        henVar.a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i5 == 0) {
                            i5 = b + 1;
                        }
                        i4 = b;
                    }
                    b--;
                }
                r0 = i4 < i5;
                if (r0) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.g = i;
            this.h += i2;
            int i6 = this.m;
            if (i6 > i) {
                this.m = Math.max(i, i6 - i2);
            }
            int i7 = this.r;
            if (i7 >= this.g) {
                this.r = i7 - i2;
            }
            int i8 = this.s;
            if (i8 >= 0 && (this.b[(h(i8) * 5) + 1] & VCardConfig.FLAG_APPEND_TYPE_PARAM) != 0) {
                Q(i8);
            }
        }
        return r0;
    }

    public final void X() {
        cok cokVar;
        int i = this.n;
        int i2 = this.q;
        int i3 = this.r;
        int i4 = this.s;
        int h = h(i4);
        int i5 = i2 - i4;
        int i6 = this.o;
        int i7 = (h * 5) + 1;
        int i8 = this.b[i7] & 1073741824;
        if (i > 0) {
            cnw cnwVar = this.p;
            if (cnwVar != null && (cokVar = (cok) cnwVar.a(i4)) != null) {
                Object[] objArr = cokVar.b;
                int i9 = cokVar.c;
                for (int i10 = 0; i10 < i9; i10++) {
                    aj(objArr[i10]);
                }
            }
            hjt.h(this.b, h, i5);
            hjt.i(this.b, h, i6);
            hgx hgxVar = this.w;
            if (i8 != 0) {
                i6 = 1;
            }
            this.o = hgxVar.b() + i6;
            int ac = ac(this.b, i4);
            this.s = ac;
            int f = ac < 0 ? f() : h(ac + 1);
            r11 = f >= 0 ? c(this.b, f) : 0;
            this.i = r11;
            this.j = r11;
            return;
        }
        if (i2 != i3) {
            hfp.j("Expected to be at the end of a group");
        }
        int a = hjt.a(this.b, h);
        int[] iArr = this.b;
        int i11 = iArr[i7] & 67108863;
        hjt.h(iArr, h, i5);
        hjt.i(this.b, h, i6);
        int b = this.u.b();
        ai();
        this.s = b;
        int ac2 = ac(this.b, i4);
        int b2 = this.w.b();
        this.o = b2;
        if (ac2 == b) {
            this.o = b2 + (i8 == 0 ? i6 - i11 : 0);
            return;
        }
        int i12 = i5 - a;
        int i13 = i8 != 0 ? 0 : i6 - i11;
        if (i12 != 0 || i13 != 0) {
            while (ac2 != 0 && ac2 != b) {
                if (i13 == 0) {
                    if (i12 == 0) {
                        break;
                    } else {
                        i13 = 0;
                    }
                }
                int h2 = h(ac2);
                int i14 = (h2 * 5) + 1;
                if (i12 != 0) {
                    hjt.h(this.b, h2, hjt.a(this.b, h2) + i12);
                }
                if (i13 != 0) {
                    int[] iArr2 = this.b;
                    hjt.i(iArr2, h2, (iArr2[i14] & 67108863) + i13);
                }
                int[] iArr3 = this.b;
                if ((iArr3[i14] & 1073741824) != 0) {
                    i13 = 0;
                }
                ac2 = ac(iArr3, ac2);
            }
            r11 = i13;
        }
        this.o += r11;
    }

    public final void Z(hjr hjrVar, int i) {
        hjr hjrVar2;
        int i2;
        if (this.n <= 0) {
            hfp.j("Check failed");
        }
        if (i == 0) {
            if (this.q == 0 && this.a.b == 0) {
                int a = hjt.a(hjrVar.a, 0);
                int i3 = hjrVar.b;
                if (a == i3) {
                    int[] iArr = this.b;
                    Object[] objArr = this.c;
                    ArrayList arrayList = this.d;
                    HashMap hashMap = this.e;
                    cnw cnwVar = this.f;
                    int[] iArr2 = hjrVar.a;
                    Object[] objArr2 = hjrVar.c;
                    int i4 = hjrVar.d;
                    HashMap hashMap2 = hjrVar.i;
                    cnw cnwVar2 = hjrVar.j;
                    this.b = iArr2;
                    this.c = objArr2;
                    this.d = hjrVar.h;
                    this.g = i3;
                    this.h = (iArr2.length / 5) - i3;
                    this.k = i4;
                    this.l = objArr2.length - i4;
                    this.m = i3;
                    this.e = hashMap2;
                    this.f = cnwVar2;
                    hjrVar.g(iArr, 0, objArr, 0, arrayList, hashMap, cnwVar);
                    return;
                }
            }
            hjrVar2 = hjrVar;
            i2 = 0;
        } else {
            hjrVar2 = hjrVar;
            i2 = i;
        }
        hjv d = hjrVar2.d();
        try {
            hju.a(d, i2, this, true, true, false);
            d.A(true);
        } catch (Throwable th) {
            d.A(false);
            throw th;
        }
    }

    public final int a(hen henVar) {
        int i = henVar.a;
        return i < 0 ? f() + i : i;
    }

    public final void aa(Object obj) {
        if (this.n <= 0 || this.i == this.k) {
            aj(obj);
            return;
        }
        cnw cnwVar = this.p;
        byte[] bArr = null;
        if (cnwVar == null) {
            cnwVar = new cnw((byte[]) null);
        }
        this.p = cnwVar;
        int i = this.s;
        Object a = cnwVar.a(i);
        if (a == null) {
            a = new cok(bArr);
            cnwVar.f(i, a);
        }
        ((cok) a).h(obj);
    }

    public final int b(int i) {
        return c(this.b, h(i));
    }

    public final int c(int[] iArr, int i) {
        return i >= e() ? this.c.length - this.l : ah(iArr[(i * 5) + 4], this.l, this.c.length);
    }

    public final int d(int i) {
        return i + (this.l * (i < this.k ? 0 : 1));
    }

    public final int e() {
        return this.b.length / 5;
    }

    public final int f() {
        return e() - this.h;
    }

    public final int g() {
        return this.c.length - this.l;
    }

    public final int h(int i) {
        return i + (this.h * (i < this.g ? 0 : 1));
    }

    public final int i(int i) {
        return this.b[h(i) * 5];
    }

    public final int j(int i) {
        return hjt.a(this.b, h(i));
    }

    public final int k(int i) {
        return this.b[(h(i) * 5) + 1] & 67108863;
    }

    public final int l(int i) {
        return ac(this.b, i);
    }

    public final int m() {
        int i = this.q;
        int h = h(i);
        int a = i + hjt.a(this.b, h);
        this.q = a;
        this.i = c(this.b, h(a));
        int i2 = this.b[(h * 5) + 1];
        if ((1073741824 & i2) != 0) {
            return 1;
        }
        return i2 & 67108863;
    }

    public final int n(int[] iArr, int i) {
        return i >= e() ? this.c.length - this.l : ah(hjt.e(iArr, i), this.l, this.c.length);
    }

    public final int o(int i, int i2) {
        int n = n(this.b, h(i));
        int c = c(this.b, h(i + 1));
        int i3 = n + i2;
        if (i3 >= n && i3 < c) {
            return i3;
        }
        hfp.j(a.r(i, i2, "Write to an invalid slot index ", " for group "));
        return i3;
    }

    public final int p(int i) {
        return c(this.b, h(i + j(i)));
    }

    public final int q(int i) {
        return n(this.b, h(i));
    }

    public final hen r(int i) {
        ArrayList arrayList = this.d;
        int d = hjt.d(arrayList, i, f());
        if (d >= 0) {
            return (hen) arrayList.get(d);
        }
        if (i > this.g) {
            i = -(f() - i);
        }
        hen henVar = new hen(i);
        arrayList.add(-(d + 1), henVar);
        return henVar;
    }

    public final hen s(int i) {
        if (i < 0 || i >= f()) {
            return null;
        }
        return hjt.f(this.d, i, f());
    }

    public final hgw t(int i) {
        hen s;
        HashMap hashMap = this.e;
        if (hashMap == null || (s = s(i)) == null) {
            return null;
        }
        return (hgw) hashMap.get(s);
    }

    public final String toString() {
        return "SlotWriter(current = " + this.q + " end=" + this.r + " size = " + f() + " gap=" + this.g + '-' + (this.g + this.h) + ')';
    }

    public final Object u(int i) {
        int h = h(i);
        int[] iArr = this.b;
        return (iArr[(h * 5) + 1] & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) != 0 ? this.c[ab(iArr, h)] : hfc.a;
    }

    public final Object v(int i) {
        int h = h(i);
        int[] iArr = this.b;
        if ((iArr[(h * 5) + 1] & 536870912) != 0) {
            return this.c[hjt.c(iArr, h)];
        }
        return null;
    }

    public final Object w(int i) {
        int h = h(i);
        int[] iArr = this.b;
        if ((iArr[(h * 5) + 1] & 1073741824) != 0) {
            return this.c[d(c(iArr, h))];
        }
        return null;
    }

    public final Object x(int i, int i2, Object obj) {
        int d = d(o(i, i2));
        Object[] objArr = this.c;
        Object obj2 = objArr[d];
        objArr[d] = obj;
        return obj2;
    }

    public final void y(int i) {
        if (i < 0) {
            hfp.j("Cannot seek backwards");
        }
        if (this.n > 0) {
            hih.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.q + i;
        if (i2 < this.s || i2 > this.r) {
            hfp.j("Cannot seek outside the current group (" + this.s + '-' + this.r + ')');
        }
        this.q = i2;
        int c = c(this.b, h(i2));
        this.i = c;
        this.j = c;
    }

    public final void z() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            af();
        }
    }
}
