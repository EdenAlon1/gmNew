package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bi extends bm {
    int ag;
    int ah;
    private bl am;
    protected final bc af = new bc();
    private int an = 0;
    private int ao = 0;
    private bh[] ap = new bh[4];
    private bh[] aq = new bh[4];
    private bh[] ar = new bh[4];
    public int ai = 2;
    private final boolean[] as = new boolean[3];
    private final bh[] at = new bh[4];
    public boolean aj = false;
    public boolean ak = false;

    private final int G(bc bcVar, bh[] bhVarArr, bh bhVar, int i, boolean[] zArr) {
        int i2;
        int i3;
        float f;
        bh bhVar2;
        bg bgVar;
        zArr[0] = true;
        zArr[1] = false;
        bhVarArr[0] = null;
        bhVarArr[2] = null;
        bhVarArr[1] = null;
        int i4 = 3;
        bhVarArr[3] = null;
        if (i != 0) {
            int i5 = 3;
            bg bgVar2 = bhVar.j.b;
            boolean z = bgVar2 == null || bgVar2.a == this;
            bhVar.ac = null;
            bh bhVar3 = bhVar.K != 8 ? bhVar : null;
            bh bhVar4 = bhVar;
            int i6 = 0;
            bh bhVar5 = null;
            bh bhVar6 = bhVar3;
            while (bhVar4.l.b != null) {
                bhVar4.ac = null;
                if (bhVar4.K != 8) {
                    if (bhVar3 == null) {
                        bhVar3 = bhVar4;
                    }
                    if (bhVar6 != null && bhVar6 != bhVar4) {
                        bhVar6.ac = bhVar4;
                    }
                    bhVar6 = bhVar4;
                } else {
                    bg bgVar3 = bhVar4.j;
                    bcVar.n(bgVar3.f, bgVar3.b.f, 0, 5);
                    bcVar.n(bhVar4.l.f, bhVar4.j.f, 0, 5);
                }
                if (bhVar4.K != 8 && bhVar4.ae == (i2 = i5)) {
                    if (bhVar4.ad == i2) {
                        zArr[0] = false;
                    }
                    if (bhVar4.u <= 0.0f) {
                        zArr[0] = false;
                        int i7 = i6 + 1;
                        bh[] bhVarArr2 = this.ap;
                        int length = bhVarArr2.length;
                        if (i7 >= length) {
                            this.ap = (bh[]) Arrays.copyOf(bhVarArr2, length + length);
                        }
                        this.ap[i6] = bhVar4;
                        i6 = i7;
                    }
                }
                bh bhVar7 = bhVar4.l.b.a;
                bg bgVar4 = bhVar7.j.b;
                if (bgVar4 == null || bgVar4.a != bhVar4 || bhVar7 == bhVar4) {
                    break;
                }
                bhVar4 = bhVar7;
                bhVar5 = bhVar4;
                i5 = 3;
            }
            bg bgVar5 = bhVar4.l.b;
            if (bgVar5 != null && bgVar5.a != this) {
                z = false;
            }
            if (bhVar.j.b == null || bhVar5.l.b == null) {
                zArr[1] = true;
            }
            bhVar.Y = z;
            bhVar5.ac = null;
            bhVarArr[0] = bhVar;
            bhVarArr[2] = bhVar3;
            bhVarArr[1] = bhVar5;
            bhVarArr[3] = bhVar6;
            return i6;
        }
        bg bgVar6 = bhVar.i.b;
        boolean z2 = bgVar6 == null || bgVar6.a == this;
        bhVar.ab = null;
        bh bhVar8 = bhVar.K != 8 ? bhVar : null;
        bh bhVar9 = bhVar;
        int i8 = 0;
        bh bhVar10 = null;
        bh bhVar11 = bhVar8;
        while (true) {
            if (bhVar9.k.b == null) {
                i3 = i4;
                break;
            }
            bhVar9.ab = null;
            if (bhVar9.K != 8) {
                if (bhVar8 == null) {
                    bhVar8 = bhVar9;
                }
                if (bhVar11 != null && bhVar11 != bhVar9) {
                    bhVar11.ab = bhVar9;
                }
                bhVar11 = bhVar9;
                f = 0.0f;
            } else {
                bg bgVar7 = bhVar9.i;
                f = 0.0f;
                bcVar.n(bgVar7.f, bgVar7.b.f, 0, 5);
                bcVar.n(bhVar9.k.f, bhVar9.i.f, 0, 5);
            }
            if (bhVar9.K != 8 && bhVar9.ad == i4) {
                if (bhVar9.ae == i4) {
                    zArr[0] = false;
                }
                if (bhVar9.u <= f) {
                    zArr[0] = false;
                    int i9 = i8 + 1;
                    bh[] bhVarArr3 = this.ap;
                    i3 = i4;
                    int length2 = bhVarArr3.length;
                    if (i9 >= length2) {
                        this.ap = (bh[]) Arrays.copyOf(bhVarArr3, length2 + length2);
                    }
                    this.ap[i8] = bhVar9;
                    i8 = i9;
                    bhVar2 = bhVar9.k.b.a;
                    bgVar = bhVar2.i.b;
                    if (bgVar != null || bgVar.a != bhVar9 || bhVar2 == bhVar9) {
                        break;
                        break;
                    }
                    bhVar10 = bhVar2;
                    bhVar9 = bhVar10;
                    i4 = i3;
                }
            }
            i3 = i4;
            bhVar2 = bhVar9.k.b.a;
            bgVar = bhVar2.i.b;
            if (bgVar != null) {
                break;
            }
            bhVar10 = bhVar2;
            bhVar9 = bhVar10;
            i4 = i3;
        }
        bg bgVar8 = bhVar9.k.b;
        if (bgVar8 != null && bgVar8.a != this) {
            z2 = false;
        }
        if (bhVar.i.b == null || bhVar10.k.b == null) {
            zArr[1] = true;
        }
        bhVar.X = z2;
        bhVar10.ab = null;
        bhVarArr[0] = bhVar;
        bhVarArr[2] = bhVar8;
        bhVarArr[1] = bhVar10;
        bhVarArr[i3] = bhVar11;
        return i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0523 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void H(defpackage.bc r30) {
        /*
            Method dump skipped, instructions count: 1399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi.H(bc):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0543 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void I(defpackage.bc r30) {
        /*
            Method dump skipped, instructions count: 1431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi.I(bc):void");
    }

    final void A(bh bhVar, int i) {
        int i2 = 0;
        if (i == 0) {
            while (true) {
                bg bgVar = bhVar.i;
                bg bgVar2 = bgVar.b;
                if (bgVar2 == null) {
                    break;
                }
                bh bhVar2 = bgVar2.a;
                bg bgVar3 = bhVar2.k.b;
                if (bgVar3 == null || bgVar3 != bgVar || bhVar2 == bhVar) {
                    break;
                } else {
                    bhVar = bhVar2;
                }
            }
            while (true) {
                int i3 = this.an;
                if (i2 >= i3) {
                    int i4 = i3 + 1;
                    bh[] bhVarArr = this.ar;
                    int length = bhVarArr.length;
                    if (i4 >= length) {
                        this.ar = (bh[]) Arrays.copyOf(bhVarArr, length + length);
                    }
                    bh[] bhVarArr2 = this.ar;
                    int i5 = this.an;
                    bhVarArr2[i5] = bhVar;
                    this.an = i5 + 1;
                    return;
                }
                if (this.ar[i2] == bhVar) {
                    return;
                } else {
                    i2++;
                }
            }
        } else {
            while (true) {
                bg bgVar4 = bhVar.j;
                bg bgVar5 = bgVar4.b;
                if (bgVar5 == null) {
                    break;
                }
                bh bhVar3 = bgVar5.a;
                bg bgVar6 = bhVar3.l.b;
                if (bgVar6 == null || bgVar6 != bgVar4 || bhVar3 == bhVar) {
                    break;
                } else {
                    bhVar = bhVar3;
                }
            }
            while (true) {
                int i6 = this.ao;
                if (i2 >= i6) {
                    int i7 = i6 + 1;
                    bh[] bhVarArr3 = this.aq;
                    int length2 = bhVarArr3.length;
                    if (i7 >= length2) {
                        this.aq = (bh[]) Arrays.copyOf(bhVarArr3, length2 + length2);
                    }
                    bh[] bhVarArr4 = this.aq;
                    int i8 = this.ao;
                    bhVarArr4[i8] = bhVar;
                    this.ao = i8 + 1;
                    return;
                }
                if (this.aq[i2] == bhVar) {
                    return;
                } else {
                    i2++;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(defpackage.bh r11, boolean[] r12) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi.B(bh, boolean[]):void");
    }

    public final void C(bh bhVar, boolean[] zArr) {
        int i;
        bh bhVar2;
        int i2;
        bg bgVar;
        bg bgVar2;
        bg bgVar3;
        int i3;
        boolean z;
        bg bgVar4;
        bg bgVar5;
        bg bgVar6;
        bg bgVar7;
        bh bhVar3;
        boolean z2 = false;
        r1 = 0;
        int i4 = 0;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (bhVar.ae == 3 && bhVar.ad != 3 && bhVar.u > 0.0f) {
            zArr[0] = false;
            return;
        }
        int e = bhVar.e();
        bhVar.U = true;
        if (bhVar instanceof bj) {
            bj bjVar = (bj) bhVar;
            if (bjVar.ai == 0) {
                int i5 = bjVar.ag;
                if (i5 != -1) {
                    i = i5;
                } else {
                    int i6 = bjVar.ah;
                    i = 0;
                    if (i6 != -1) {
                        i4 = i6;
                    }
                }
            } else {
                i4 = e;
                i = i4;
            }
        } else {
            bg bgVar8 = bhVar.m;
            if (bgVar8.b == null && bhVar.j.b == null && bhVar.l.b == null) {
                i = e + bhVar.x;
            } else {
                bg bgVar9 = bhVar.l.b;
                if (bgVar9 != null && (bgVar7 = bhVar.j.b) != null && (bgVar9 == bgVar7 || ((bhVar3 = bgVar9.a) == bgVar7.a && bhVar3 != bhVar.r))) {
                    zArr[0] = false;
                    return;
                }
                if (bgVar8.c()) {
                    bh bhVar4 = bhVar.m.b.a;
                    if (!bhVar4.U) {
                        C(bhVar4, zArr);
                    }
                    int max = Math.max((bhVar4.L - bhVar4.t) + e, e);
                    int max2 = Math.max((bhVar4.O - bhVar4.t) + e, e);
                    if (bhVar.K == 8) {
                        int i7 = bhVar.t;
                        max -= i7;
                        max2 -= i7;
                    }
                    bhVar.L = max;
                    bhVar.O = max2;
                    return;
                }
                bh bhVar5 = null;
                if (bhVar.j.c()) {
                    bg bgVar10 = bhVar.j;
                    bhVar2 = bgVar10.b.a;
                    i = bgVar10.a() + e;
                    if (!bhVar2.t() && !bhVar2.U) {
                        C(bhVar2, zArr);
                    }
                } else {
                    i = e;
                    bhVar2 = null;
                }
                if (bhVar.l.c()) {
                    bg bgVar11 = bhVar.l;
                    bh bhVar6 = bgVar11.b.a;
                    e += bgVar11.a();
                    if (!bhVar6.t() && !bhVar6.U) {
                        C(bhVar6, zArr);
                    }
                    bhVar5 = bhVar6;
                }
                if (bhVar.j.b != null && !bhVar2.t()) {
                    int i8 = bhVar.j.b.g;
                    if (i8 == 3) {
                        i3 = bhVar2.L - bhVar2.e();
                    } else {
                        if (i8 == 5) {
                            i3 = bhVar2.L;
                        }
                        z = (bhVar2.R && ((bgVar5 = bhVar2.j.b) == null || bgVar5.a == bhVar || (bgVar6 = bhVar2.l.b) == null || bgVar6.a == bhVar || bhVar2.ae == 3)) ? false : true;
                        bhVar.R = z;
                        if (z && ((bgVar4 = bhVar2.l.b) == null || bgVar4.a != bhVar)) {
                            i += i - bhVar2.L;
                        }
                    }
                    i += i3;
                    if (bhVar2.R) {
                    }
                    bhVar.R = z;
                    if (z) {
                        i += i - bhVar2.L;
                    }
                }
                if (bhVar.l.b != null && !bhVar5.t()) {
                    int i9 = bhVar.l.b.g;
                    if (i9 == 5) {
                        i2 = bhVar5.O - bhVar5.e();
                    } else {
                        if (i9 == 3) {
                            i2 = bhVar5.O;
                        }
                        if (!bhVar5.S || ((bgVar2 = bhVar5.j.b) != null && bgVar2.a != bhVar && (bgVar3 = bhVar5.l.b) != null && bgVar3.a != bhVar && bhVar5.ae != 3)) {
                            z2 = true;
                        }
                        bhVar.S = z2;
                        if (z2 && ((bgVar = bhVar5.j.b) == null || bgVar.a != bhVar)) {
                            i4 = e + (e - bhVar5.O);
                        }
                    }
                    e += i2;
                    if (!bhVar5.S) {
                    }
                    z2 = true;
                    bhVar.S = z2;
                    if (z2) {
                        i4 = e + (e - bhVar5.O);
                    }
                }
            }
            i4 = e;
        }
        if (bhVar.K == 8) {
            int i10 = bhVar.t;
            i -= i10;
            i4 -= i10;
        }
        bhVar.L = i;
        bhVar.O = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05c5 A[LOOP:16: B:264:0x05c3->B:265:0x05c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:271:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x050f  */
    /* JADX WARN: Type inference failed for: r0v12, types: [bh] */
    /* JADX WARN: Type inference failed for: r0v130 */
    /* JADX WARN: Type inference failed for: r0v131 */
    /* JADX WARN: Type inference failed for: r0v36, types: [int] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28, types: [int] */
    /* JADX WARN: Type inference failed for: r2v31, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6, types: [bh] */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.util.ArrayList] */
    @Override // defpackage.bm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() {
        /*
            Method dump skipped, instructions count: 1491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi.D():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x06b9, code lost:
    
        if (r4.K != 8) goto L243;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0617  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E(defpackage.bc r21) {
        /*
            Method dump skipped, instructions count: 1777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi.E(bc):boolean");
    }

    @Override // defpackage.bm, defpackage.bh
    public final void i() {
        this.af.l();
        super.i();
    }
}
