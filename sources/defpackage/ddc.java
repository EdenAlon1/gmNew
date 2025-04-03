package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddc implements dcw {
    public final int a;
    private final cmw b;
    private final cmy c;
    private final cym d;
    private int[] e = dcu.a;
    private float[] f;
    private cyb g;
    private cyb h;
    private cyb i;
    private cyb j;
    private float[] k;
    private float[] l;
    private cyf m;

    public ddc(cmw cmwVar, cmy cmyVar, int i, cym cymVar) {
        this.b = cmwVar;
        this.c = cmyVar;
        this.a = i;
        this.d = cymVar;
        float[] fArr = dcu.b;
        this.f = fArr;
        this.k = fArr;
        this.l = fArr;
        this.m = dcu.c;
    }

    private final float h(int i) {
        return i(j(i), i, false);
    }

    private final float i(int i, int i2, boolean z) {
        cym cymVar;
        float f;
        cmw cmwVar = this.b;
        if (i >= cmwVar.b - 1) {
            f = i2;
        } else {
            int a = cmwVar.a(i);
            int a2 = this.b.a(i + 1);
            if (i2 == a) {
                f = a;
            } else {
                int i3 = a2 - a;
                ddb ddbVar = (ddb) this.c.a(a);
                if (ddbVar == null || (cymVar = ddbVar.b) == null) {
                    cymVar = this.d;
                }
                float f2 = i3;
                float a3 = cymVar.a((i2 - a) / f2);
                if (z) {
                    return a3;
                }
                f = (f2 * a3) + a;
            }
        }
        return f / 1000.0f;
    }

    private final int j(int i) {
        int i2;
        cmw cmwVar = this.b;
        int i3 = cmwVar.b;
        if (i3 <= 0) {
            cpx.c("");
        }
        int i4 = i3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = cmwVar.a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = -(i5 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    private final void k(cyb cybVar, cyb cybVar2, cyb cybVar3) {
        float[] fArr;
        cyf cyfVar = this.m;
        cyf cyfVar2 = dcu.c;
        if (this.g == null) {
            this.g = cybVar.c();
            this.h = cybVar3.c();
            int i = this.b.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = this.b.a(i2) / 1000.0f;
            }
            this.f = fArr2;
            int i3 = this.b.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.e = iArr;
        }
        if (cyfVar == cyfVar2) {
            return;
        }
        if (this.m != dcu.c && ffkj.e(this.i, cybVar) && ffkj.e(this.j, cybVar2)) {
            return;
        }
        this.i = cybVar;
        this.j = cybVar2;
        int b = (cybVar.b() & 1) + cybVar.b();
        this.k = new float[b];
        this.l = new float[b];
        int i5 = this.b.b;
        float[][] fArr3 = new float[i5][];
        for (int i6 = 0; i6 < i5; i6++) {
            cmw cmwVar = this.b;
            cmy cmyVar = this.c;
            int a = cmwVar.a(i6);
            ddb ddbVar = (ddb) cmyVar.a(a);
            if (a == 0) {
                if (ddbVar == null) {
                    fArr = new float[b];
                    for (int i7 = 0; i7 < b; i7++) {
                        fArr[i7] = cybVar.a(i7);
                    }
                    fArr3[i6] = fArr;
                } else {
                    a = 0;
                }
            }
            if (a == this.a && ddbVar == null) {
                fArr = new float[b];
                for (int i8 = 0; i8 < b; i8++) {
                    fArr[i8] = cybVar2.a(i8);
                }
            } else {
                ddbVar.getClass();
                fArr = new float[b];
                for (int i9 = 0; i9 < b; i9++) {
                    fArr[i9] = ddbVar.a.a(i9);
                }
            }
            fArr3[i6] = fArr;
        }
        this.m = new cyf(this.e, this.f, fArr3);
    }

    @Override // defpackage.dcr
    public final /* synthetic */ long a(cyb cybVar, cyb cybVar2, cyb cybVar3) {
        return dcv.a(this);
    }

    @Override // defpackage.dcr
    public final /* synthetic */ cyb b(cyb cybVar, cyb cybVar2, cyb cybVar3) {
        return dcq.a(this, cybVar, cybVar2, cybVar3);
    }

    @Override // defpackage.dcr
    public final cyb c(long j, cyb cybVar, cyb cybVar2, cyb cybVar3) {
        cyb cybVar4;
        cyb cybVar5;
        cyb cybVar6 = cybVar;
        cyb cybVar7 = cybVar2;
        int a = (int) dcu.a(this, j / 1000000);
        ddb ddbVar = (ddb) this.c.a(a);
        if (ddbVar != null) {
            return ddbVar.a;
        }
        if (a >= this.a) {
            return cybVar7;
        }
        if (a <= 0) {
            return cybVar6;
        }
        k(cybVar6, cybVar7, cybVar3);
        cyb cybVar8 = this.g;
        cybVar8.getClass();
        int i = 0;
        if (this.m != dcu.c) {
            float h = h(a);
            float[] fArr = this.k;
            cye[][] cyeVarArr = this.m.a;
            int length = cyeVarArr.length;
            float f = cyeVarArr[0][0].a;
            int i2 = length - 1;
            float f2 = cyeVarArr[i2][0].b;
            int length2 = fArr.length;
            if (h >= f && h <= f2) {
                int i3 = 0;
                boolean z = false;
                while (i3 < length) {
                    int i4 = i;
                    int i5 = i4;
                    while (i4 < length2 - 1) {
                        cye cyeVar = cyeVarArr[i3][i5];
                        if (h <= cyeVar.b) {
                            int i6 = i4 + 1;
                            if (cyeVar.g) {
                                fArr[i4] = cyeVar.c(h);
                                fArr[i6] = cyeVar.d(h);
                            } else {
                                cyeVar.e(h);
                                fArr[i4] = cyeVar.h + (cyeVar.e * cyeVar.c);
                                fArr[i6] = cyeVar.i + (cyeVar.f * cyeVar.d);
                            }
                            z = true;
                        }
                        i5++;
                        i4 += 2;
                    }
                    if (z) {
                        break;
                    }
                    i3++;
                    i = 0;
                }
            } else {
                int i7 = length2 - 1;
                if (h > f2) {
                    f = f2;
                }
                if (h <= f2) {
                    i2 = 0;
                }
                float f3 = h - f;
                int i8 = 0;
                int i9 = 0;
                while (i8 < i7) {
                    int i10 = i8 + 1;
                    cye cyeVar2 = cyeVarArr[i2][i9];
                    if (cyeVar2.g) {
                        fArr[i8] = cyeVar2.c(f) + (cyeVar2.h * f3);
                        fArr[i10] = cyeVar2.d(f) + (cyeVar2.i * f3);
                    } else {
                        cyeVar2.e(f);
                        fArr[i8] = cyeVar2.h + (cyeVar2.e * cyeVar2.c) + (cyeVar2.a() * f3);
                        fArr[i10] = cyeVar2.i + (cyeVar2.f * cyeVar2.d) + (cyeVar2.b() * f3);
                    }
                    i8 += 2;
                    i9++;
                }
            }
            int length3 = fArr.length;
            for (int i11 = 0; i11 < length3; i11++) {
                cybVar8.e(i11, fArr[i11]);
            }
        } else {
            int j2 = j(a);
            float i12 = i(j2, a, true);
            ddb ddbVar2 = (ddb) this.c.a(this.b.a(j2));
            if (ddbVar2 != null && (cybVar5 = ddbVar2.a) != null) {
                cybVar6 = cybVar5;
            }
            ddb ddbVar3 = (ddb) this.c.a(this.b.a(j2 + 1));
            if (ddbVar3 != null && (cybVar4 = ddbVar3.a) != null) {
                cybVar7 = cybVar4;
            }
            int b = cybVar8.b();
            for (int i13 = 0; i13 < b; i13++) {
                cybVar8.e(i13, (cybVar6.a(i13) * (1.0f - i12)) + (cybVar7.a(i13) * i12));
            }
        }
        return cybVar8;
    }

    @Override // defpackage.dcr
    public final cyb d(long j, cyb cybVar, cyb cybVar2, cyb cybVar3) {
        long a = dcu.a(this, j / 1000000);
        k(cybVar, cybVar2, cybVar3);
        cyb cybVar4 = this.h;
        cybVar4.getClass();
        int i = 0;
        if (this.m != dcu.c) {
            float h = h((int) a);
            float[] fArr = this.l;
            cye[][] cyeVarArr = this.m.a;
            float f = cyeVarArr[0][0].a;
            float f2 = cyeVarArr[cyeVarArr.length - 1][0].b;
            if (h < f) {
                h = f;
            }
            if (h <= f2) {
                f2 = h;
            }
            int length = fArr.length;
            boolean z = false;
            for (cye[] cyeVarArr2 : cyeVarArr) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < length - 1) {
                    cye cyeVar = cyeVarArr2[i3];
                    if (f2 <= cyeVar.b) {
                        int i4 = i2 + 1;
                        if (cyeVar.g) {
                            fArr[i2] = cyeVar.h;
                            fArr[i4] = cyeVar.i;
                        } else {
                            cyeVar.e(f2);
                            fArr[i2] = cyeVar.a();
                            fArr[i4] = cyeVar.b();
                        }
                        z = true;
                    }
                    i2 += 2;
                    i3++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                cybVar4.e(i, fArr[i]);
                i++;
            }
        } else {
            cyb b = dcu.b(this, (-1) + a, cybVar, cybVar2, cybVar3);
            cyb b2 = dcu.b(this, a, cybVar, cybVar2, cybVar3);
            int b3 = b.b();
            while (i < b3) {
                cybVar4.e(i, (b.a(i) - b2.a(i)) * 1000.0f);
                i++;
            }
        }
        return cybVar4;
    }

    @Override // defpackage.dcr
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // defpackage.dcw
    public final int f() {
        return 0;
    }

    @Override // defpackage.dcw
    public final int g() {
        return this.a;
    }
}
