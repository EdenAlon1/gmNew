package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eae implements ipu, eab {
    public final dxi a;
    public final dza b;
    private final dxq d;
    private final float e;
    private final float f;
    private final int g;
    private final dzy i;
    private final boolean c = true;
    private final int h = Alert.DURATION_SHOW_INDEFINITELY;

    public eae(dxi dxiVar, dxq dxqVar, float f, dza dzaVar, float f2, int i, dzy dzyVar) {
        this.a = dxiVar;
        this.d = dxqVar;
        this.e = f;
        this.b = dzaVar;
        this.f = f2;
        this.g = i;
        this.i = dzyVar;
    }

    public static final int k(inx inxVar, int i) {
        return inxVar.c(i);
    }

    public static final int l(inx inxVar, int i) {
        return inxVar.d(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int m(List list, int i, int i2, int i3, int i4, dzy dzyVar) {
        inx inxVar;
        boolean z;
        long c;
        int i5;
        boolean z2;
        int i6;
        cmv cmvVar;
        List list2 = list;
        int i7 = 0;
        if (list2.isEmpty()) {
            c = cmv.c(0, 0);
        } else {
            int i8 = Alert.DURATION_SHOW_INDEFINITELY;
            long d = jzl.d(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY);
            inx inxVar2 = (inx) ffdx.N(list2, 0);
            int k = inxVar2 != null ? k(inxVar2, i) : 0;
            int l = inxVar2 != null ? l(inxVar2, k) : 0;
            if (list2.size() > 1) {
                inxVar = inxVar2;
                z = true;
            } else {
                inxVar = inxVar2;
                z = false;
            }
            int i9 = k;
            int i10 = l;
            if (dzl.a(z, 0, cmv.c(i, Alert.DURATION_SHOW_INDEFINITELY), inxVar == null ? null : new cmv(cmv.c(l, k)), 0, 0, 0, false, false, i4, dzyVar, d, i2, i3).b) {
                c = cmv.c(0, 0);
            } else {
                int size = list2.size();
                int i11 = i;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = i9;
                int i18 = i10;
                int i19 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    int i20 = i11 - i18;
                    int i21 = i12 + 1;
                    int max = Math.max(i13, i17);
                    inx inxVar3 = (inx) ffdx.N(list2, i21);
                    int k2 = inxVar3 != null ? k(inxVar3, i) : i7;
                    int l2 = inxVar3 != null ? l(inxVar3, k2) + i2 : i7;
                    if (i12 + 2 < list2.size()) {
                        i5 = size;
                        z2 = 1;
                    } else {
                        i5 = size;
                        z2 = i7;
                    }
                    int i22 = i14;
                    int i23 = i15;
                    int i24 = i21 - i19;
                    int i25 = i5;
                    long c2 = cmv.c(i20, i8);
                    if (inxVar3 == null) {
                        i6 = i20;
                        cmvVar = null;
                    } else {
                        i6 = i20;
                        cmvVar = new cmv(cmv.c(l2, k2));
                    }
                    int i26 = k2;
                    int i27 = l2;
                    int i28 = i6;
                    dzk a = dzl.a(z2, i24, c2, cmvVar, i22, i23, max, false, false, i4, dzyVar, d, i2, i3);
                    if (a.a) {
                        i15 = i23 + max + i3;
                        dzl.b(a, dzyVar);
                        int i29 = i27 - i2;
                        i14 = i22 + 1;
                        if (a.b) {
                            i16 = i21;
                            break;
                        }
                        i19 = i21;
                        i11 = i;
                        i18 = i29;
                        i13 = 0;
                    } else {
                        i14 = i22;
                        i13 = max;
                        i15 = i23;
                        i11 = i28;
                        i18 = i27;
                    }
                    i12 = i21;
                    i16 = i12;
                    size = i25;
                    i17 = i26;
                    i8 = Alert.DURATION_SHOW_INDEFINITELY;
                    i7 = 0;
                    list2 = list;
                }
                c = cmv.c(i15 - i3, i16);
            }
        }
        return cmv.a(c);
    }

    @Override // defpackage.ipu
    public final int a(iny inyVar, List list, int i) {
        List list2 = (List) ffdx.N(list, 1);
        inx inxVar = list2 != null ? (inx) ffdx.M(list2) : null;
        List list3 = (List) ffdx.N(list, 2);
        this.i.a(inxVar, list3 != null ? (inx) ffdx.M(list3) : null, jzl.k(0, i, 0, 13));
        List list4 = (List) ffdx.M(list);
        if (list4 == null) {
            list4 = ffel.a;
        }
        return m(list4, i, inyVar.eo(this.e), inyVar.eo(this.f), this.g, this.i);
    }

    @Override // defpackage.ipu
    public final int b(iny inyVar, List list, int i) {
        List list2 = (List) ffdx.N(list, 1);
        inx inxVar = list2 != null ? (inx) ffdx.M(list2) : null;
        List list3 = (List) ffdx.N(list, 2);
        this.i.a(inxVar, list3 != null ? (inx) ffdx.M(list3) : null, jzl.k(0, 0, i, 7));
        List list4 = (List) ffdx.M(list);
        if (list4 == null) {
            list4 = ffel.a;
        }
        int eo = inyVar.eo(this.e);
        int i2 = this.g;
        int size = list4.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 < size) {
            i5 += ((inx) list4.get(i3)).b(i) + eo;
            int i7 = i3 + 1;
            if (i7 - i6 == i2 || i7 == list4.size()) {
                i4 = Math.max(i4, i5 - eo);
                i6 = i3;
                i5 = 0;
            }
            i3 = i7;
        }
        return i4;
    }

    @Override // defpackage.ipu
    public final int c(iny inyVar, List list, int i) {
        List list2 = (List) ffdx.N(list, 1);
        inx inxVar = list2 != null ? (inx) ffdx.M(list2) : null;
        List list3 = (List) ffdx.N(list, 2);
        this.i.a(inxVar, list3 != null ? (inx) ffdx.M(list3) : null, jzl.k(0, i, 0, 13));
        List list4 = (List) ffdx.M(list);
        if (list4 == null) {
            list4 = ffel.a;
        }
        return m(list4, i, inyVar.eo(this.e), inyVar.eo(this.f), this.g, this.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ipu
    public final int d(iny inyVar, List list, int i) {
        dzy dzyVar;
        cmv cmvVar;
        int i2;
        int[] iArr;
        dzy dzyVar2;
        int i3;
        long c;
        inx inxVar;
        boolean z;
        int i4;
        int i5;
        cmv cmvVar2;
        int i6 = 1;
        List list2 = (List) ffdx.N(list, 1);
        inx inxVar2 = list2 != null ? (inx) ffdx.M(list2) : null;
        List list3 = (List) ffdx.N(list, 2);
        int i7 = 0;
        this.i.a(inxVar2, list3 != null ? (inx) ffdx.M(list3) : null, jzl.k(0, 0, i, 7));
        List list4 = (List) ffdx.M(list);
        if (list4 == null) {
            list4 = ffel.a;
        }
        int eo = inyVar.eo(this.e);
        int eo2 = inyVar.eo(this.f);
        int i8 = this.g;
        dzy dzyVar3 = this.i;
        if (list4.isEmpty()) {
            return 0;
        }
        int size = list4.size();
        int[] iArr2 = new int[size];
        int size2 = list4.size();
        int[] iArr3 = new int[size2];
        int size3 = list4.size();
        for (int i9 = 0; i9 < size3; i9++) {
            inx inxVar3 = (inx) list4.get(i9);
            int l = l(inxVar3, i);
            iArr2[i9] = l;
            iArr3[i9] = k(inxVar3, l);
        }
        list4.size();
        list4.size();
        int i10 = dzyVar3.c;
        int size4 = list4.size();
        int i11 = Alert.DURATION_SHOW_INDEFINITELY;
        int min = Math.min(Alert.DURATION_SHOW_INDEFINITELY, size4);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            i12 += iArr2[i13];
        }
        int size5 = i12 + ((list4.size() - 1) * eo);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i14 = iArr3[0];
        ffev it = new ffmj(1, ffdo.z(iArr3)).iterator();
        while (((ffmi) it).a) {
            int i15 = iArr3[it.a()];
            if (i14 < i15) {
                i14 = i15;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i16 = iArr2[0];
        ffev it2 = new ffmj(1, ffdo.z(iArr2)).iterator();
        while (((ffmi) it2).a) {
            int i17 = iArr2[it2.a()];
            if (i16 < i17) {
                i16 = i17;
            }
        }
        int i18 = size5;
        while (i16 <= i18 && i14 != i) {
            int i19 = (i16 + i18) / 2;
            int i20 = dzt.a;
            if (list4.isEmpty()) {
                c = cmv.c(i7, i7);
                i2 = i8;
                dzyVar2 = dzyVar3;
                i3 = i7;
                iArr = iArr3;
            } else {
                long d = jzl.d(i7, i19, i7, i11);
                inx inxVar4 = (inx) ffdx.N(list4, i7);
                int i21 = inxVar4 != null ? iArr3[i7] : i7;
                if (inxVar4 != null) {
                    i7 = iArr2[i7];
                }
                int i22 = list4.size() > i6 ? i6 : 0;
                long c2 = cmv.c(i19, Alert.DURATION_SHOW_INDEFINITELY);
                if (inxVar4 == null) {
                    dzyVar = dzyVar3;
                    cmvVar = null;
                } else {
                    dzyVar = dzyVar3;
                    cmvVar = new cmv(cmv.c(i7, i21));
                }
                int[] iArr4 = iArr3;
                int i23 = i21;
                i2 = i8;
                if (dzl.a(i22, 0, c2, cmvVar, 0, 0, 0, false, false, i2, dzyVar, d, eo, eo2).b) {
                    c = cmv.c(0, 0);
                    iArr = iArr4;
                    i3 = 0;
                    dzyVar2 = dzyVar;
                } else {
                    int i24 = 0;
                    int size6 = list4.size();
                    int i25 = i23;
                    int i26 = i19;
                    int i27 = 0;
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 0;
                    int i31 = 0;
                    while (true) {
                        if (i27 >= size6) {
                            iArr = iArr4;
                            dzyVar2 = dzyVar;
                            i3 = 0;
                            i27 = i28;
                            break;
                        }
                        int i32 = i26 - i7;
                        int i33 = i27 + 1;
                        int max = Math.max(i24, i25);
                        inx inxVar5 = (inx) ffdx.N(list4, i33);
                        int i34 = inxVar5 != null ? iArr4[i33] : 0;
                        int i35 = inxVar5 != null ? iArr2[i33] + eo : 0;
                        if (i27 + 2 < list4.size()) {
                            inxVar = inxVar5;
                            z = true;
                        } else {
                            inxVar = inxVar5;
                            z = false;
                        }
                        int i36 = size6;
                        int i37 = i33 - i31;
                        long c3 = cmv.c(i32, Alert.DURATION_SHOW_INDEFINITELY);
                        if (inxVar == null) {
                            iArr = iArr4;
                            i4 = i36;
                            i5 = i35;
                            cmvVar2 = null;
                        } else {
                            iArr = iArr4;
                            i4 = i36;
                            i5 = i35;
                            cmvVar2 = new cmv(cmv.c(i5, i34));
                        }
                        i27 = i33;
                        int i38 = i34;
                        i3 = 0;
                        int i39 = i4;
                        dzk a = dzl.a(z, i37, c3, cmvVar2, i29, i30, max, false, false, i2, dzyVar, d, eo, eo2);
                        dzyVar2 = dzyVar;
                        if (a.a) {
                            i30 += max + eo2;
                            dzl.b(a, dzyVar2);
                            i5 -= eo;
                            i29++;
                            if (a.b) {
                                break;
                            }
                            i24 = 0;
                            i31 = i27;
                            i26 = i19;
                        } else {
                            i26 = i32;
                            i24 = max;
                        }
                        i7 = i5;
                        iArr4 = iArr;
                        i28 = i27;
                        dzyVar = dzyVar2;
                        i25 = i38;
                        size6 = i39;
                    }
                    c = cmv.c(i30 - eo2, i27);
                }
            }
            int a2 = cmv.a(c);
            if (a2 > i || cmv.b(c) < min) {
                i16 = i19 + 1;
                if (i16 > i18) {
                    return i16;
                }
            } else {
                if (a2 >= i) {
                    return i19;
                }
                i18 = i19 - 1;
            }
            iArr3 = iArr;
            i7 = i3;
            size5 = i19;
            dzyVar3 = dzyVar2;
            i8 = i2;
            i6 = 1;
            i11 = Alert.DURATION_SHOW_INDEFINITELY;
            i14 = a2;
        }
        return size5;
    }

    @Override // defpackage.ipu
    public final ipo e(ipq ipqVar, List list, long j) {
        ipo ei;
        long d;
        long d2;
        dzz dzzVar;
        long j2;
        ipl a;
        dzy dzyVar;
        hne hneVar;
        cmv cmvVar;
        Integer num;
        Integer num2;
        ipo ei2;
        int i;
        dzz dzzVar2;
        cmv cmvVar2;
        ipl iplVar;
        Iterator it;
        Integer num3;
        Integer num4;
        long j3;
        cmv cmvVar3;
        int i2;
        cnv cnvVar;
        cnv cnvVar2;
        int i3;
        int i4;
        ipo ei3;
        ipq ipqVar2 = ipqVar;
        if (this.g != 0 && !list.isEmpty()) {
            if (jzk.a(j) != 0) {
                List list2 = (List) ffdx.K(list);
                if (list2.isEmpty()) {
                    ei3 = ipqVar2.ei(0, 0, ffem.a, ead.a);
                    return ei3;
                }
                List list3 = (List) ffdx.N(list, 1);
                ipl iplVar2 = list3 != null ? (ipl) ffdx.M(list3) : null;
                List list4 = (List) ffdx.N(list, 2);
                ipl iplVar3 = list4 != null ? (ipl) ffdx.M(list4) : null;
                list2.size();
                dzy dzyVar2 = this.i;
                d = jzl.d((r5 & 1) != 0 ? jzk.d(r8) : 0, (r5 & 2) != 0 ? jzk.b(r8) : 0, (r5 & 4) != 0 ? jzk.c(r8) : 0, jzk.a(eaz.b(j)));
                long c = eaz.c(d);
                if (iplVar2 != null) {
                    dzt.f(iplVar2, c, new dzw(dzyVar2));
                    dzyVar2.a = iplVar2;
                }
                if (iplVar3 != null) {
                    dzt.f(iplVar3, c, new dzx(dzyVar2));
                    dzyVar2.b = iplVar3;
                }
                Iterator it2 = list2.iterator();
                float f = this.e;
                float f2 = this.f;
                long b = eaz.b(j);
                int i5 = this.g;
                dzy dzyVar3 = this.i;
                int i6 = dzt.a;
                hne hneVar2 = new hne(new ipo[16]);
                int b2 = jzk.b(b);
                int d3 = jzk.d(b);
                int a2 = jzk.a(b);
                cnw cnwVar = cmz.a;
                cnw cnwVar2 = new cnw((byte[]) null);
                ArrayList arrayList = new ArrayList();
                float ceil = (float) Math.ceil(ipqVar2.em(f));
                float ceil2 = (float) Math.ceil(ipqVar2.em(f2));
                long d4 = jzl.d(0, b2, 0, a2);
                d2 = jzl.d((r5 & 1) != 0 ? jzk.d(d4) : 0, (r5 & 2) != 0 ? jzk.b(d4) : 0, (r5 & 4) != 0 ? jzk.c(d4) : 0, jzk.a(d4));
                long c2 = eaz.c(d2);
                fflb fflbVar = new fflb();
                if (it2 instanceof dyu) {
                    ipqVar2.ek(b2);
                    ipqVar2.ek(a2);
                    dzzVar = new dzz();
                } else {
                    dzzVar = null;
                }
                if (it2.hasNext()) {
                    j2 = d4;
                    a = dzt.a(it2, dzzVar);
                } else {
                    j2 = d4;
                    a = null;
                }
                if (a != null) {
                    dzyVar = dzyVar3;
                    hneVar = hneVar2;
                    cmvVar = new cmv(dzt.f(a, c2, new dzr(fflbVar)));
                } else {
                    dzyVar = dzyVar3;
                    hneVar = hneVar2;
                    cmvVar = null;
                }
                Integer valueOf = cmvVar != null ? Integer.valueOf(cmv.a(cmvVar.a)) : null;
                if (cmvVar != null) {
                    num = valueOf;
                    num2 = Integer.valueOf(cmv.b(cmvVar.a));
                } else {
                    num = valueOf;
                    num2 = null;
                }
                int i7 = (int) ceil2;
                ipl iplVar4 = a;
                cnv cnvVar3 = new cnv((byte[]) null);
                cnv cnvVar4 = new cnv((byte[]) null);
                long j4 = j2;
                int i8 = (int) ceil;
                dzk a3 = dzl.a(it2.hasNext(), 0, cmv.c(b2, a2), cmvVar, 0, 0, 0, false, false, i5, dzyVar, b, i8, i7);
                Integer num5 = num2;
                int i9 = i5;
                dzy dzyVar4 = dzyVar;
                if (a3.b) {
                    dzl.b(a3, dzyVar4);
                }
                cnv cnvVar5 = cnvVar4;
                dzy dzyVar5 = dzyVar4;
                cnv cnvVar6 = cnvVar3;
                int i10 = b2;
                int i11 = a2;
                int i12 = d3;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                ipl iplVar5 = iplVar4;
                int i18 = 0;
                while (!a3.b && iplVar5 != null) {
                    num.getClass();
                    int intValue = num.intValue();
                    num5.getClass();
                    int i19 = b2;
                    int i20 = i14 + intValue;
                    int max = Math.max(i13, num5.intValue());
                    int i21 = i10 - intValue;
                    arrayList.add(iplVar5);
                    cnwVar2.f(i18, fflbVar.a);
                    i18++;
                    int i22 = i18 - i17;
                    boolean z = i22 < i9;
                    if (dzzVar != null) {
                        if (z) {
                            int i23 = i21 - i8;
                            if (i23 < 0) {
                                i = i22;
                                i3 = 0;
                            } else {
                                i = i22;
                                i3 = i23;
                            }
                        } else {
                            i = i22;
                            i3 = i19;
                        }
                        ipqVar2.ek(i3);
                        if (z) {
                            i4 = i11;
                        } else {
                            i4 = (i11 - max) - i7;
                            if (i4 < 0) {
                                i4 = 0;
                            }
                        }
                        ipqVar2.ek(i4);
                    } else {
                        i = i22;
                    }
                    ipl a4 = !it2.hasNext() ? null : dzt.a(it2, dzzVar);
                    fflbVar.a = null;
                    if (a4 != null) {
                        dzzVar2 = dzzVar;
                        cmvVar2 = new cmv(dzt.f(a4, c2, new dzq(fflbVar)));
                    } else {
                        dzzVar2 = dzzVar;
                        cmvVar2 = null;
                    }
                    Integer valueOf2 = cmvVar2 != null ? Integer.valueOf(cmv.a(cmvVar2.a) + i8) : null;
                    if (cmvVar2 != null) {
                        iplVar = a4;
                        it = it2;
                        num3 = Integer.valueOf(cmv.b(cmvVar2.a));
                    } else {
                        iplVar = a4;
                        it = it2;
                        num3 = null;
                    }
                    cmv cmvVar4 = cmvVar2;
                    boolean hasNext = it.hasNext();
                    int i24 = i9;
                    int i25 = i;
                    long c3 = cmv.c(i21, i11);
                    if (cmvVar4 == null) {
                        num4 = num3;
                        j3 = c2;
                        cmvVar3 = null;
                    } else {
                        valueOf2.getClass();
                        int intValue2 = valueOf2.intValue();
                        num3.getClass();
                        num4 = num3;
                        j3 = c2;
                        cmvVar3 = new cmv(cmv.c(intValue2, num4.intValue()));
                    }
                    a3 = dzl.a(hasNext, i25, c3, cmvVar3, i15, i16, max, false, false, i24, dzyVar5, b, i8, i7);
                    dzy dzyVar6 = dzyVar5;
                    if (a3.a) {
                        i2 = i19;
                        int min = Math.min(Math.max(i12, i20), i2);
                        int i26 = i16 + max;
                        dzl.b(a3, dzyVar6);
                        cnvVar2 = cnvVar5;
                        cnvVar2.e(max);
                        i11 = (i11 - i26) - i7;
                        cnv cnvVar7 = cnvVar6;
                        cnvVar7.e(i18);
                        valueOf2 = valueOf2 != null ? Integer.valueOf(valueOf2.intValue() - i8) : null;
                        i15++;
                        i16 = i26 + i7;
                        i12 = min;
                        i10 = i2;
                        i17 = i18;
                        i13 = 0;
                        i14 = 0;
                        cnvVar = cnvVar7;
                    } else {
                        i2 = i19;
                        cnvVar = cnvVar6;
                        cnvVar2 = cnvVar5;
                        i10 = i21;
                        i14 = i20;
                        i13 = max;
                    }
                    num = valueOf2;
                    dzyVar5 = dzyVar6;
                    cnvVar6 = cnvVar;
                    b2 = i2;
                    it2 = it;
                    cnvVar5 = cnvVar2;
                    i9 = i24;
                    dzzVar = dzzVar2;
                    iplVar5 = iplVar;
                    num5 = num4;
                    c2 = j3;
                    ipqVar2 = ipqVar;
                }
                cnv cnvVar8 = cnvVar6;
                cnv cnvVar9 = cnvVar5;
                int size = arrayList.size();
                iqk[] iqkVarArr = new iqk[size];
                for (int i27 = 0; i27 < size; i27++) {
                    iqkVarArr[i27] = (iqk) cnwVar2.a(i27);
                }
                int i28 = cnvVar8.b;
                int i29 = i12;
                int[] iArr = new int[i28];
                int[] iArr2 = new int[i28];
                int[] iArr3 = cnvVar8.a;
                int i30 = i29;
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                while (i32 < i28) {
                    int i34 = iArr3[i32];
                    int i35 = i8;
                    ipo a5 = ebk.a(this, i30, jzk.c(j4), jzk.b(j4), cnvVar9.a(i32), i35, ipqVar, arrayList, iqkVarArr, i31, i34, iArr, i32);
                    int k = a5.k();
                    int j5 = a5.j();
                    iArr2[i32] = j5;
                    i33 += j5;
                    i30 = Math.max(i30, k);
                    hneVar.n(a5);
                    i32++;
                    i31 = i34;
                    iArr3 = iArr3;
                    cnvVar9 = cnvVar9;
                    i8 = i35;
                }
                hne hneVar3 = hneVar;
                int i36 = hneVar3.b;
                int i37 = i36 == 0 ? 0 : i33;
                if (i36 == 0) {
                    i30 = 0;
                }
                dxq dxqVar = this.d;
                int eo = ipqVar.eo(dxqVar.a()) * (hneVar3.b - 1);
                int c4 = jzk.c(b);
                int a6 = jzk.a(b);
                int i38 = i37 + eo;
                if (i38 >= c4) {
                    c4 = i38;
                }
                if (c4 <= a6) {
                    a6 = c4;
                }
                dxqVar.b(ipqVar, a6, iArr2, iArr);
                int d5 = jzk.d(b);
                int b3 = jzk.b(b);
                dzs dzsVar = new dzs(hneVar3);
                if (i30 < d5) {
                    i30 = d5;
                }
                if (i30 <= b3) {
                    b3 = i30;
                }
                ei2 = ipqVar.ei(b3, a6, ffem.a, dzsVar);
                return ei2;
            }
            int i39 = this.i.c;
        }
        ei = ipqVar2.ei(0, 0, ffem.a, eac.a);
        return ei;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eae)) {
            return false;
        }
        eae eaeVar = (eae) obj;
        boolean z = eaeVar.c;
        if (!ffkj.e(this.a, eaeVar.a) || !ffkj.e(this.d, eaeVar.d) || !jzq.b(this.e, eaeVar.e) || !ffkj.e(this.b, eaeVar.b) || !jzq.b(this.f, eaeVar.f) || this.g != eaeVar.g) {
            return false;
        }
        int i = eaeVar.h;
        return ffkj.e(this.i, eaeVar.i);
    }

    @Override // defpackage.ebj
    public final /* synthetic */ int f(iqk iqkVar) {
        return iqkVar.v();
    }

    @Override // defpackage.ebj
    public final /* synthetic */ int g(iqk iqkVar) {
        return iqkVar.w();
    }

    @Override // defpackage.ebj
    public final /* synthetic */ void h(int i, int[] iArr, int[] iArr2, ipq ipqVar) {
        this.a.b(ipqVar, i, iArr, ipqVar.q(), iArr2);
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() + 38161) * 31) + this.d.hashCode()) * 31) + Float.floatToIntBits(this.e)) * 31) + this.b.hashCode()) * 31) + Float.floatToIntBits(this.f)) * 31) + this.g) * 31) + Alert.DURATION_SHOW_INDEFINITELY) * 31) + 1922;
    }

    @Override // defpackage.ebj
    public final /* synthetic */ long i(int i, int i2, int i3, boolean z) {
        return ebm.b(z, i, i2, i3);
    }

    @Override // defpackage.ebj
    public final /* synthetic */ ipo j(iqk[] iqkVarArr, ipq ipqVar, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        ipo ei;
        ei = ipqVar.ei(i, i2, ffem.a, new eaa(iArr2, i3, i4, i5, iqkVarArr, this, i2, kah.a, iArr));
        return ei;
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.a + ", verticalArrangement=" + this.d + ", mainAxisSpacing=" + ((Object) jzq.a(this.e)) + ", crossAxisAlignment=" + this.b + ", crossAxisArrangementSpacing=" + ((Object) jzq.a(this.f)) + ", maxItemsInMainAxis=" + this.g + ", maxLines=2147483647, overflow=" + this.i + ')';
    }
}
