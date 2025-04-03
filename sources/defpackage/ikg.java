package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ikg extends ikh {
    public final hvh a;
    private ioc g;
    private iki h;
    private boolean i;
    public final imh b = new imh();
    private final cno f = new cno(2);
    public boolean c = true;
    private boolean j = true;

    public ikg(hvh hvhVar) {
        this.a = hvhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [hvh] */
    /* JADX WARN: Type inference failed for: r0v3, types: [hvh] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [hvh] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [hne] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [hne] */
    public final void a() {
        hne hneVar = this.d;
        Object[] objArr = hneVar.a;
        int i = hneVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((ikg) objArr[i2]).a();
        }
        isz iszVar = this.a;
        ?? r3 = 0;
        while (iszVar != 0) {
            if (iszVar instanceof ixl) {
                ((ixl) iszVar).dU();
            } else if ((iszVar.q & 16) != 0 && (iszVar instanceof isz)) {
                hvh hvhVar = iszVar.n;
                int i3 = 0;
                iszVar = iszVar;
                r3 = r3;
                while (hvhVar != null) {
                    if ((hvhVar.q & 16) != 0) {
                        i3++;
                        r3 = r3;
                        if (i3 == 1) {
                            iszVar = hvhVar;
                        } else {
                            if (r3 == 0) {
                                r3 = new hne(new hvh[16]);
                            }
                            if (iszVar != 0) {
                                r3.n(iszVar);
                            }
                            r3.n(hvhVar);
                            iszVar = 0;
                        }
                    }
                    hvhVar = hvhVar.t;
                    iszVar = iszVar;
                    r3 = r3;
                }
                if (i3 != 1) {
                }
            }
            iszVar = isx.a(r3);
        }
    }

    public final void b(long j, cok cokVar) {
        if (this.b.a(j) && !cokVar.n(this)) {
            this.b.c(j);
            this.f.i(j);
        }
        hne hneVar = this.d;
        Object[] objArr = hneVar.a;
        int i = hneVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((ikg) objArr[i2]).b(j, cokVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [hvh] */
    /* JADX WARN: Type inference failed for: r5v1, types: [hvh] */
    /* JADX WARN: Type inference failed for: r5v10, types: [int] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47, types: [hvh] */
    /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [hne] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [hne] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    @Override // defpackage.ikh
    public final boolean c(cno cnoVar, ioc iocVar, ikd ikdVar, boolean z) {
        Object obj;
        boolean z2;
        boolean z3;
        iki ikiVar;
        boolean z4;
        imh imhVar;
        int i;
        boolean z5;
        int i2;
        boolean z6;
        int i3;
        int i4;
        long j;
        ioc iocVar2 = iocVar;
        boolean c = super.c(cnoVar, iocVar, ikdVar, z);
        isz iszVar = this.a;
        boolean z7 = true;
        if (iszVar.z) {
            ?? r8 = 0;
            while (iszVar != 0) {
                if (iszVar instanceof ixl) {
                    this.g = isx.e((ixl) iszVar, 16);
                } else if ((iszVar.q & 16) != 0 && (iszVar instanceof isz)) {
                    hvh hvhVar = iszVar.n;
                    int i5 = 0;
                    iszVar = iszVar;
                    r8 = r8;
                    while (hvhVar != null) {
                        if ((hvhVar.q & 16) != 0) {
                            i5++;
                            r8 = r8;
                            if (i5 == 1) {
                                iszVar = hvhVar;
                            } else {
                                if (r8 == 0) {
                                    r8 = new hne(new hvh[16]);
                                }
                                if (iszVar != 0) {
                                    r8.n(iszVar);
                                }
                                r8.n(hvhVar);
                                iszVar = 0;
                            }
                        }
                        hvhVar = hvhVar.t;
                        iszVar = iszVar;
                        r8 = r8;
                    }
                    if (i5 != 1) {
                    }
                }
                iszVar = isx.a(r8);
            }
            if (this.g != null) {
                int b = cnoVar.b();
                int i6 = 0;
                while (i6 < b) {
                    long c2 = cnoVar.c(i6);
                    iku ikuVar = (iku) cnoVar.e(i6);
                    if (this.b.a(c2)) {
                        long j2 = ikuVar.g;
                        boolean z8 = z7;
                        long j3 = ikuVar.c;
                        if ((((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j3 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z6 = z8;
                            ArrayList arrayList = new ArrayList(ikuVar.a().size());
                            List a = ikuVar.a();
                            z5 = c;
                            int size = a.size();
                            i2 = b;
                            int i7 = 0;
                            while (i7 < size) {
                                int i8 = size;
                                ijw ijwVar = (ijw) a.get(i7);
                                int i9 = i6;
                                List list = a;
                                long j4 = ijwVar.b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    j = c2;
                                    long j5 = ijwVar.a;
                                    i4 = i7;
                                    ioc iocVar3 = this.g;
                                    iocVar3.getClass();
                                    arrayList.add(new ijw(j5, iocVar3.h(iocVar2, j4), ijwVar.c));
                                } else {
                                    i4 = i7;
                                    j = c2;
                                }
                                i7 = i4 + 1;
                                a = list;
                                size = i8;
                                i6 = i9;
                                c2 = j;
                            }
                            i3 = i6;
                            long j6 = c2;
                            cno cnoVar2 = this.f;
                            ioc iocVar4 = this.g;
                            iocVar4.getClass();
                            long h = iocVar4.h(iocVar2, j2);
                            ioc iocVar5 = this.g;
                            iocVar5.getClass();
                            iku ikuVar2 = new iku(ikuVar.a, ikuVar.b, iocVar5.h(iocVar2, j3), ikuVar.d, ikuVar.e, ikuVar.f, h, ikuVar.h, ikuVar.i, arrayList, ikuVar.j, ikuVar.k);
                            iku ikuVar3 = ikuVar.l;
                            if (ikuVar3 == null) {
                                ikuVar3 = ikuVar;
                            }
                            ikuVar2.l = ikuVar3;
                            iku ikuVar4 = ikuVar.l;
                            if (ikuVar4 != null) {
                                ikuVar = ikuVar4;
                            }
                            ikuVar2.l = ikuVar;
                            cnoVar2.h(j6, ikuVar2);
                        } else {
                            z5 = c;
                            i2 = b;
                            i3 = i6;
                            z6 = z8;
                        }
                    } else {
                        z5 = c;
                        i2 = b;
                        z6 = z7;
                        i3 = i6;
                    }
                    i6 = i3 + 1;
                    iocVar2 = iocVar;
                    z7 = z6;
                    c = z5;
                    b = i2;
                }
                boolean z9 = c;
                boolean z10 = z7;
                if (this.f.k()) {
                    this.b.a = 0;
                    this.d.g();
                    return z10;
                }
                int i10 = this.b.a;
                while (true) {
                    i10--;
                    if (i10 < 0) {
                        break;
                    }
                    if (!cnoVar.j(this.b.b[i10]) && i10 < (i = (imhVar = this.b).a)) {
                        int i11 = i - 1;
                        int i12 = i10;
                        while (i12 < i11) {
                            long[] jArr = imhVar.b;
                            int i13 = i12 + 1;
                            jArr[i12] = jArr[i13];
                            i12 = i13;
                        }
                        imhVar.a--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(this.f.b());
                int b2 = this.f.b();
                for (int i14 = 0; i14 < b2; i14++) {
                    arrayList2.add(this.f.e(i14));
                }
                iki ikiVar2 = new iki(arrayList2, ikdVar);
                List list2 = ikiVar2.a;
                int size2 = list2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = list2.get(i15);
                    if (ikdVar.a(((iku) obj).a)) {
                        break;
                    }
                    i15++;
                }
                iku ikuVar5 = (iku) obj;
                if (ikuVar5 != null) {
                    if (z) {
                        z2 = false;
                        z4 = this.c;
                        if (!z4 && (ikuVar5.d || ikuVar5.h)) {
                            ioc iocVar6 = this.g;
                            iocVar6.getClass();
                            long j7 = ikuVar5.c;
                            long g = iocVar6.g();
                            long j8 = g >> 32;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
                            z4 = !((intBitsToFloat < 0.0f ? z10 : false) | (intBitsToFloat > ((float) ((int) j8)) ? z10 : false) | (intBitsToFloat2 < 0.0f ? z10 : false) | (intBitsToFloat2 > ((float) ((int) (g & 4294967295L))) ? z10 : false));
                            this.c = z4;
                        }
                    } else {
                        z2 = false;
                        this.c = false;
                        z4 = false;
                    }
                    boolean z11 = this.i;
                    if (z4 != z11) {
                        int i16 = ikiVar2.e;
                        if (ikm.a(i16, 3) || ikm.a(i16, 4) || ikm.a(i16, 5)) {
                            ikiVar2.e = z10 == z4 ? 4 : 5;
                        }
                    }
                    int i17 = ikiVar2.e;
                    if ((ikm.a(i17, 4) && z11 && !this.j) || (ikm.a(i17, 5) && z4 && ikuVar5.d)) {
                        ikiVar2.e = 3;
                    }
                } else {
                    z2 = false;
                }
                if (!z9 && ikm.a(ikiVar2.e, 3) && (ikiVar = this.h) != null) {
                    if (ikiVar.a.size() == ikiVar2.a.size()) {
                        int size3 = ikiVar2.a.size();
                        for (?? r5 = z2; r5 < size3; r5++) {
                            if (iak.i(((iku) ikiVar.a.get(r5)).c, ((iku) ikiVar2.a.get(r5)).c)) {
                            }
                        }
                        z3 = z2;
                        this.h = ikiVar2;
                        return z3;
                    }
                }
                z3 = true;
                this.h = ikiVar2;
                return z3;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x008d  */
    /* JADX WARN: Type inference failed for: r0v10, types: [hvh] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [hvh] */
    /* JADX WARN: Type inference failed for: r0v3, types: [hvh] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [hne] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [hne] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.ikd r13) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ikg.d(ikd):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [hvh] */
    /* JADX WARN: Type inference failed for: r0v20, types: [hvh] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v3, types: [hvh] */
    /* JADX WARN: Type inference failed for: r13v1, types: [hvh] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2, types: [hvh] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [hvh] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [hne] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [hne] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [hne] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [hne] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final boolean e(ikd ikdVar, boolean z) {
        if (this.f.k()) {
            return false;
        }
        isz iszVar = this.a;
        if (!iszVar.z) {
            return false;
        }
        iki ikiVar = this.h;
        ikiVar.getClass();
        ioc iocVar = this.g;
        iocVar.getClass();
        long g = iocVar.g();
        ?? r6 = 0;
        while (iszVar != 0) {
            if (iszVar instanceof ixl) {
                ((ixl) iszVar).dV(ikiVar, ikk.a, g);
            } else if ((iszVar.q & 16) != 0 && (iszVar instanceof isz)) {
                hvh hvhVar = iszVar.n;
                int i = 0;
                iszVar = iszVar;
                r6 = r6;
                while (hvhVar != null) {
                    if ((hvhVar.q & 16) != 0) {
                        i++;
                        r6 = r6;
                        if (i == 1) {
                            iszVar = hvhVar;
                        } else {
                            if (r6 == 0) {
                                r6 = new hne(new hvh[16]);
                            }
                            if (iszVar != 0) {
                                r6.n(iszVar);
                            }
                            r6.n(hvhVar);
                            iszVar = 0;
                        }
                    }
                    hvhVar = hvhVar.t;
                    iszVar = iszVar;
                    r6 = r6;
                }
                if (i != 1) {
                }
            }
            iszVar = isx.a(r6);
        }
        if (this.a.z) {
            hne hneVar = this.d;
            Object[] objArr = hneVar.a;
            int i2 = hneVar.b;
            for (int i3 = 0; i3 < i2; i3++) {
                ikg ikgVar = (ikg) objArr[i3];
                this.g.getClass();
                ikgVar.e(ikdVar, z);
            }
        }
        isz iszVar2 = this.a;
        if (iszVar2.z) {
            ?? r14 = 0;
            while (iszVar2 != 0) {
                if (iszVar2 instanceof ixl) {
                    ((ixl) iszVar2).dV(ikiVar, ikk.b, g);
                } else if ((iszVar2.q & 16) != 0 && (iszVar2 instanceof isz)) {
                    hvh hvhVar2 = iszVar2.n;
                    int i4 = 0;
                    iszVar2 = iszVar2;
                    r14 = r14;
                    while (hvhVar2 != null) {
                        if ((hvhVar2.q & 16) != 0) {
                            i4++;
                            r14 = r14;
                            if (i4 == 1) {
                                iszVar2 = hvhVar2;
                            } else {
                                if (r14 == 0) {
                                    r14 = new hne(new hvh[16]);
                                }
                                if (iszVar2 != 0) {
                                    r14.n(iszVar2);
                                }
                                r14.n(hvhVar2);
                                iszVar2 = 0;
                            }
                        }
                        hvhVar2 = hvhVar2.t;
                        iszVar2 = iszVar2;
                        r14 = r14;
                    }
                    if (i4 != 1) {
                    }
                }
                iszVar2 = isx.a(r14);
            }
        }
        return true;
    }

    public final String toString() {
        return "Node(modifierNode=" + this.a + ", children=" + this.d + ", pointerIds=" + this.b + ')';
    }
}
