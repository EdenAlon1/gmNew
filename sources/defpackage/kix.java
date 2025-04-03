package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kix extends kjb {
    public kiu[] aJ;
    public int a = -1;
    public int b = -1;
    public int c = -1;
    public int d = -1;
    public int e = -1;
    public int f = -1;
    public float g = 0.5f;
    public float h = 0.5f;
    public float i = 0.5f;
    public float j = 0.5f;
    public float k = 0.5f;
    public float aB = 0.5f;
    public int aC = 0;
    public int aD = 0;
    public int aE = 2;
    public int aF = 2;
    public int aG = 0;
    public int aH = -1;
    public int aI = 0;
    private final ArrayList aY = new ArrayList();
    private kiu[] aZ = null;
    private kiu[] ba = null;
    private int[] bb = null;
    public int aK = 0;

    @Override // defpackage.kiu
    public final void a(kgz kgzVar, boolean z) {
        kiu kiuVar;
        float f;
        int i;
        super.a(kgzVar, z);
        kiu kiuVar2 = this.ae;
        boolean z2 = kiuVar2 != null && ((kiv) kiuVar2).e;
        int i2 = this.aG;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = this.aY.size();
                int i3 = 0;
                while (i3 < size) {
                    ((kiw) this.aY.get(i3)).d(z2, i3, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = this.aY.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((kiw) this.aY.get(i4)).d(z2, i4, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.bb != null && this.ba != null && this.aZ != null) {
                for (int i5 = 0; i5 < this.aK; i5++) {
                    this.aJ[i5].v();
                }
                int[] iArr = this.bb;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.g;
                kiu kiuVar3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.g;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    kiu kiuVar4 = this.ba[i];
                    if (kiuVar4 != null && kiuVar4.ar != 8) {
                        if (i8 == 0) {
                            kiuVar4.q(kiuVar4.T, this.T, this.aR);
                            kiuVar4.at = this.a;
                            kiuVar4.ao = f;
                            i8 = 0;
                        }
                        if (i8 == i6 - 1) {
                            kiuVar4.q(kiuVar4.V, this.V, this.aS);
                        }
                        if (i8 > 0 && kiuVar3 != null) {
                            kiuVar4.q(kiuVar4.T, kiuVar3.V, this.aC);
                            kiuVar3.q(kiuVar3.V, kiuVar4.T, 0);
                        }
                        kiuVar3 = kiuVar4;
                    }
                    i8++;
                    f2 = f;
                }
                int i9 = 0;
                while (i9 < i7) {
                    kiu kiuVar5 = this.aZ[i9];
                    if (kiuVar5 != null && kiuVar5.ar != 8) {
                        if (i9 == 0) {
                            kiuVar5.q(kiuVar5.U, this.U, this.aN);
                            kiuVar5.au = this.b;
                            kiuVar5.ap = this.h;
                            i9 = 0;
                        }
                        if (i9 == i7 - 1) {
                            kiuVar5.q(kiuVar5.W, this.W, this.aO);
                        }
                        if (i9 > 0 && kiuVar3 != null) {
                            kiuVar5.q(kiuVar5.U, kiuVar3.W, this.aD);
                            kiuVar3.q(kiuVar3.W, kiuVar5.U, 0);
                        }
                        kiuVar3 = kiuVar5;
                    }
                    i9++;
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.aI == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        kiu[] kiuVarArr = this.aJ;
                        if (i12 < kiuVarArr.length && (kiuVar = kiuVarArr[i12]) != null && kiuVar.ar != 8) {
                            kiu kiuVar6 = this.ba[i10];
                            kiu kiuVar7 = this.aZ[i11];
                            if (kiuVar != kiuVar6) {
                                kiuVar.q(kiuVar.T, kiuVar6.T, 0);
                                kiuVar.q(kiuVar.V, kiuVar6.V, 0);
                            }
                            if (kiuVar != kiuVar7) {
                                kiuVar.q(kiuVar.U, kiuVar7.U, 0);
                                kiuVar.q(kiuVar.W, kiuVar7.W, 0);
                            }
                        }
                    }
                }
            }
        } else if (this.aY.size() > 0) {
            ((kiw) this.aY.get(0)).d(z2, 0, true);
        }
        this.aT = false;
    }

    public final int ae(kiu kiuVar, int i) {
        kiu kiuVar2;
        if (kiuVar == null) {
            return 0;
        }
        if (kiuVar.X() == 3) {
            int i2 = kiuVar.C;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (kiuVar.H * i);
                if (i3 != kiuVar.j()) {
                    kiuVar.r = true;
                    ak(kiuVar, 1, i3, kiuVar.Y(), kiuVar.h());
                }
                return i3;
            }
            kiuVar2 = kiuVar;
            if (i2 != 1 && i2 == 3) {
                return (int) ((kiuVar2.h() * kiuVar2.ah) + 0.5f);
            }
        } else {
            kiuVar2 = kiuVar;
        }
        return kiuVar2.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x06fe  */
    @Override // defpackage.kjb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r36, int r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 1839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kix.b(int, int, int, int):void");
    }

    public final int c(kiu kiuVar, int i) {
        kiu kiuVar2;
        if (kiuVar == null) {
            return 0;
        }
        if (kiuVar.Y() == 3) {
            int i2 = kiuVar.D;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (kiuVar.K * i);
                if (i3 != kiuVar.h()) {
                    kiuVar.r = true;
                    ak(kiuVar, kiuVar.X(), kiuVar.j(), 1, i3);
                }
                return i3;
            }
            kiuVar2 = kiuVar;
            if (i2 != 1 && i2 == 3) {
                return (int) ((kiuVar2.j() * kiuVar2.ah) + 0.5f);
            }
        } else {
            kiuVar2 = kiuVar;
        }
        return kiuVar2.h();
    }
}
