package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eoa extends ffkk implements ffjm {
    final /* synthetic */ eot a;
    final /* synthetic */ dqs b;
    final /* synthetic */ ebe c;
    final /* synthetic */ float d;
    final /* synthetic */ emx e;
    final /* synthetic */ ffix f;
    final /* synthetic */ ffix g;
    final /* synthetic */ hun h;
    final /* synthetic */ int i;
    final /* synthetic */ dvz j;
    final /* synthetic */ ffsk k;
    final /* synthetic */ hus l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eoa(eot eotVar, dqs dqsVar, ebe ebeVar, float f, emx emxVar, ffix ffixVar, ffix ffixVar2, hus husVar, hun hunVar, int i, dvz dvzVar, ffsk ffskVar) {
        super(2);
        this.a = eotVar;
        this.b = dqsVar;
        this.c = ebeVar;
        this.d = f;
        this.e = emxVar;
        this.f = ffixVar;
        this.g = ffixVar2;
        this.l = husVar;
        this.h = hunVar;
        this.i = i;
        this.j = dvzVar;
        this.k = ffskVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [ipo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r27v1, types: [ipo, java.lang.Object] */
    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        ejq ejqVar;
        int i;
        ejq ejqVar2;
        int i2;
        long j;
        int i3;
        int i4;
        int i5;
        ejq ejqVar3;
        int i6;
        long j2;
        int i7;
        ejq ejqVar4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        long j3;
        int i13;
        int i14;
        ens ensVar;
        ArrayList arrayList;
        List list;
        emu emuVar;
        ArrayList arrayList2;
        boolean z;
        ffdn ffdnVar;
        List list2;
        ArrayList arrayList3;
        ejq ejqVar5;
        List arrayList4;
        List arrayList5;
        int i15;
        int i16;
        int i17;
        int i18;
        Object obj3;
        boolean z2;
        int i19;
        eob eobVar;
        int[] iArr;
        int i20;
        int i21;
        int i22;
        ejq ejqVar6 = (ejq) obj;
        long j4 = ((jzk) obj2).a;
        elq.a(this.a.x);
        dqs dqsVar = this.b;
        dqs dqsVar2 = dqs.a;
        boolean z3 = dqsVar == dqsVar2;
        if (!z3) {
            dqsVar2 = dqs.b;
        }
        dev.a(j4, dqsVar2);
        int eo = z3 ? ejqVar6.eo(this.c.b(ejqVar6.q())) : ejqVar6.eo(eba.b(this.c, ejqVar6.q()));
        int eo2 = z3 ? ejqVar6.eo(this.c.c(ejqVar6.q())) : ejqVar6.eo(eba.a(this.c, ejqVar6.q()));
        int eo3 = ejqVar6.eo(((ebf) this.c).a);
        int eo4 = ejqVar6.eo(((ebf) this.c).b) + eo3;
        int i23 = eo2 + eo;
        int i24 = true != z3 ? i23 : eo4;
        int i25 = z3 ? eo3 : eo;
        long h = jzl.h(j4, -i23, -eo4);
        this.a.o = ejqVar6;
        int eo5 = ejqVar6.eo(this.d);
        int a = z3 ? jzk.a(j4) - eo4 : jzk.b(j4) - i23;
        long j5 = eo;
        long j6 = eo3;
        int f = ffmk.f(this.e.a(ejqVar6, a, eo5), 0);
        eot eotVar = this.a;
        dqs dqsVar3 = this.b;
        dqs dqsVar4 = dqs.a;
        if (dqsVar3 == dqsVar4) {
            ejqVar = ejqVar6;
            i = jzk.b(h);
        } else {
            ejqVar = ejqVar6;
            i = f;
        }
        int i26 = i24 - i25;
        eotVar.u = jzl.k(0, i, dqsVar3 != dqsVar4 ? jzk.a(h) : f, 5);
        ens ensVar2 = (ens) this.f.invoke();
        int i27 = a + i25;
        eot eotVar2 = this.a;
        dvz dvzVar = this.j;
        hrw a2 = hrv.a();
        ffji k = a2 != null ? a2.k() : null;
        hrw b = hrv.b(a2);
        try {
            int j7 = eotVar2.j();
            eod eodVar = eotVar2.e;
            int a3 = ejh.a(ensVar2, eodVar.c, j7);
            if (j7 != a3) {
                eodVar.b(a3);
                eodVar.d.c(j7);
            }
            int i28 = i27 + i26;
            int i29 = i25;
            int i30 = f + eo5;
            int b2 = ffln.b(dvzVar.a(i28, f, i29, i26, eotVar2.j(), eotVar2.b()) - (eotVar2.c() * i30));
            hrv.e(a2, b, k);
            eot eotVar3 = this.a;
            List a4 = eih.a(ensVar2, eotVar3.v, eotVar3.q);
            int intValue = ((Number) this.g.invoke()).intValue();
            eot eotVar4 = this.a;
            dqs dqsVar5 = this.b;
            long j8 = h;
            hus husVar = this.l;
            hun hunVar = this.h;
            int i31 = this.i;
            dvz dvzVar2 = this.j;
            ffsk ffskVar = this.k;
            hho hhoVar = eotVar4.w;
            int i32 = intValue;
            ejq ejqVar7 = ejqVar;
            enz enzVar = new enz(ejqVar7, j4, i23, eo4);
            if (i29 < 0) {
                dwv.c("negative beforeContentPadding");
            }
            int i33 = -i29;
            if (i26 < 0) {
                dwv.c("negative afterContentPadding");
            }
            int i34 = a + i26;
            int f2 = ffmk.f(i30, 0);
            if (i32 <= 0) {
                eobVar = new eob(ffel.a, f, eo5, i26, dqsVar5, i33, i34, i31, dvzVar2, enzVar.a(Integer.valueOf(jzk.d(j8)), Integer.valueOf(jzk.c(j8)), env.a), ffskVar);
                ejqVar5 = ejqVar7;
            } else {
                int i35 = i34;
                int i36 = i32 - 1;
                enz enzVar2 = enzVar;
                dqs dqsVar6 = dqs.a;
                if (dqsVar5 == dqsVar6) {
                    ejqVar2 = ejqVar7;
                    i2 = jzk.b(j8);
                } else {
                    ejqVar2 = ejqVar7;
                    i2 = f;
                }
                List list3 = a4;
                long k2 = jzl.k(0, i2, dqsVar5 != dqsVar6 ? jzk.a(j8) : f, 5);
                int i37 = a3;
                int i38 = b2;
                while (i37 > 0 && i38 > 0) {
                    i37--;
                    i38 -= f2;
                }
                int i39 = -i38;
                if (i37 >= i32) {
                    i39 = 0;
                }
                if (i37 >= i32) {
                    i37 = i36;
                }
                ffdn ffdnVar2 = new ffdn();
                int i40 = i33 + (eo5 < 0 ? eo5 : 0);
                int i41 = i39 + i40;
                int i42 = i37;
                int i43 = 0;
                while (true) {
                    j = (j5 << 32) | (j6 & 4294967295L);
                    if (i41 >= 0 || i42 <= 0) {
                        break;
                    }
                    int i44 = i42 - 1;
                    enz enzVar3 = enzVar2;
                    long j9 = j8;
                    int i45 = f2;
                    int i46 = i35;
                    long j10 = k2;
                    ejq ejqVar8 = ejqVar2;
                    emu a5 = eny.a(ejqVar8, i44, j10, ensVar2, j, dqsVar5, hunVar, husVar, ejqVar2.q());
                    ffdnVar2.add(0, a5);
                    i41 += i45;
                    i43 = Math.max(i43, a5.f);
                    i42 = i44;
                    i36 = i36;
                    f2 = i45;
                    i32 = i32;
                    i35 = i46;
                    a = a;
                    j8 = j9;
                    eo5 = eo5;
                    enzVar2 = enzVar3;
                    ejqVar2 = ejqVar8;
                    k2 = j10;
                }
                int i47 = a;
                int i48 = i43;
                int i49 = eo5;
                enz enzVar4 = enzVar2;
                long j11 = j8;
                int i50 = f2;
                int i51 = i35;
                ens ensVar3 = ensVar2;
                int i52 = i32;
                int i53 = i36;
                long j12 = k2;
                ejq ejqVar9 = ejqVar2;
                if (i41 < i40) {
                    i41 = i40;
                }
                int i54 = i41 - i40;
                int f3 = ffmk.f(i51, 0);
                ejq ejqVar10 = ejqVar9;
                int i55 = -i54;
                int i56 = i42;
                int i57 = 0;
                boolean z4 = false;
                while (i57 < ffdnVar2.a) {
                    if (i55 >= f3) {
                        ffdnVar2.d(i57);
                        z4 = true;
                    } else {
                        i56++;
                        i55 += i50;
                        i57++;
                    }
                }
                int i58 = i56;
                boolean z5 = z4;
                int i59 = i48;
                int i60 = i52;
                int i61 = i42;
                while (true) {
                    if (i58 >= i60) {
                        i3 = i60;
                        i4 = i58;
                        i5 = i54;
                        ejqVar3 = ejqVar10;
                        i6 = i59;
                        j2 = j12;
                        i7 = i47;
                        break;
                    }
                    if (i55 >= f3 && i55 > 0 && !ffdnVar2.isEmpty()) {
                        i3 = i60;
                        i4 = i58;
                        i5 = i54;
                        ejqVar3 = ejqVar10;
                        i7 = i47;
                        i6 = i59;
                        j2 = j12;
                        break;
                    }
                    int i62 = f3;
                    int i63 = i60;
                    int i64 = i54;
                    ejq ejqVar11 = ejqVar10;
                    int i65 = i59;
                    long j13 = j12;
                    emu a6 = eny.a(ejqVar11, i58, j13, ensVar3, j, dqsVar5, hunVar, husVar, ejqVar10.q());
                    int i66 = i58;
                    int i67 = i55 + (i66 == i53 ? f : i50);
                    if (i67 > i40 || i66 == i53) {
                        i20 = i67;
                        int max = Math.max(i65, a6.f);
                        ffdnVar2.add(a6);
                        i65 = max;
                        i21 = i61;
                        i22 = i64;
                    } else {
                        i21 = i66 + 1;
                        i22 = i64 - i50;
                        z5 = true;
                        i20 = i67;
                    }
                    i58 = i66 + 1;
                    i55 = i20;
                    ejqVar10 = ejqVar11;
                    j12 = j13;
                    i59 = i65;
                    i54 = i22;
                    i60 = i63;
                    i61 = i21;
                    f3 = i62;
                }
                if (i55 < i7) {
                    int i68 = i7 - i55;
                    int i69 = i55;
                    int i70 = i29;
                    int i71 = i6;
                    int i72 = i5 - i68;
                    int i73 = i71;
                    while (i72 < i70 && i61 > 0) {
                        i61--;
                        int i74 = i73;
                        int i75 = i70;
                        int i76 = i4;
                        ejq ejqVar12 = ejqVar3;
                        emu a7 = eny.a(ejqVar12, i61, j2, ensVar3, j, dqsVar5, hunVar, husVar, ejqVar3.q());
                        ffdnVar2.add(0, a7);
                        i73 = Math.max(i74, a7.f);
                        i72 += i50;
                        i4 = i76;
                        i70 = i75;
                        ejqVar3 = ejqVar12;
                    }
                    i8 = i70;
                    i9 = i4;
                    ejqVar4 = ejqVar3;
                    int i77 = i72;
                    i6 = i73;
                    int i78 = i69 + i68;
                    if (i77 < 0) {
                        i11 = i78 + i77;
                        i10 = 0;
                    } else {
                        i11 = i78;
                        i10 = i77;
                    }
                } else {
                    ejqVar4 = ejqVar3;
                    i8 = i29;
                    int i79 = i55;
                    i9 = i4;
                    i10 = i5;
                    i11 = i79;
                }
                if (i10 < 0) {
                    dwv.c("invalid currentFirstPageScrollOffset");
                }
                int i80 = -i10;
                emu emuVar2 = (emu) ffdnVar2.a();
                int i81 = i9;
                if (i8 > 0 || i49 < 0) {
                    int i82 = i10;
                    int i83 = ffdnVar2.a;
                    i12 = i80;
                    j3 = j2;
                    int i84 = i82;
                    int i85 = 0;
                    while (i85 < i83 && i84 != 0) {
                        i13 = i50;
                        if (i13 > i84) {
                            break;
                        }
                        int i86 = i83;
                        if (i85 == ffdx.e(ffdnVar2)) {
                            break;
                        }
                        i84 -= i13;
                        i85++;
                        emuVar2 = (emu) ffdnVar2.get(i85);
                        i83 = i86;
                        i50 = i13;
                    }
                    i13 = i50;
                    i14 = i84;
                } else {
                    i14 = i10;
                    i12 = i80;
                    j3 = j2;
                    i13 = i50;
                }
                int i87 = i49;
                int i88 = i6;
                emu emuVar3 = emuVar2;
                int i89 = i12;
                int i90 = i13;
                enx enxVar = new enx(ejqVar4, j3, ensVar3, j, dqsVar5, hunVar, husVar);
                int i91 = i61 - 1;
                int max2 = Math.max(0, i61 - i31);
                if (max2 <= i91) {
                    arrayList = null;
                    while (true) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        ensVar = ensVar3;
                        arrayList.add(enxVar.invoke(Integer.valueOf(i91)));
                        if (i91 == max2) {
                            break;
                        }
                        i91--;
                        ensVar3 = ensVar;
                    }
                } else {
                    ensVar = ensVar3;
                    arrayList = null;
                }
                int size = list3.size();
                List list4 = arrayList;
                int i92 = 0;
                while (i92 < size) {
                    ffdn ffdnVar3 = ffdnVar2;
                    List list5 = list3;
                    int i93 = size;
                    int intValue2 = ((Number) list5.get(i92)).intValue();
                    if (intValue2 < max2) {
                        if (list4 == null) {
                            list4 = new ArrayList();
                        }
                        list4.add(enxVar.invoke(Integer.valueOf(intValue2)));
                    }
                    i92++;
                    list3 = list5;
                    ffdnVar2 = ffdnVar3;
                    size = i93;
                }
                ffdn ffdnVar4 = ffdnVar2;
                List list6 = list3;
                if (list4 == null) {
                    list4 = ffel.a;
                }
                List list7 = list4;
                int size2 = list7.size();
                int i94 = i88;
                for (int i95 = 0; i95 < size2; i95++) {
                    i94 = Math.max(i94, ((emu) list7.get(i95)).f);
                }
                int i96 = ((emu) ffdnVar4.e()).a;
                int i97 = i94;
                ejq ejqVar13 = ejqVar4;
                enw enwVar = new enw(ejqVar13, j3, ensVar, j, dqsVar5, hunVar, husVar);
                int i98 = i96 + 1;
                int min = Math.min(i96 + i31, i53);
                if (i98 <= min) {
                    list = null;
                    while (true) {
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(enwVar.invoke(Integer.valueOf(i98)));
                        if (i98 == min) {
                            break;
                        }
                        i98++;
                    }
                } else {
                    list = null;
                }
                int size3 = list6.size();
                int i99 = 0;
                while (i99 < size3) {
                    int intValue3 = ((Number) list6.get(i99)).intValue();
                    int i100 = i3;
                    if (min + 1 <= intValue3 && intValue3 < i100) {
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(enwVar.invoke(Integer.valueOf(intValue3)));
                    }
                    i99++;
                    i3 = i100;
                }
                int i101 = i3;
                if (list == null) {
                    list = ffel.a;
                }
                List list8 = list;
                int size4 = list8.size();
                int i102 = i97;
                for (int i103 = 0; i103 < size4; i103++) {
                    i102 = Math.max(i102, ((emu) list8.get(i103)).f);
                }
                boolean z6 = ffkj.e(emuVar3, ffdnVar4.a()) && list7.isEmpty() && list8.isEmpty();
                dqs dqsVar7 = dqs.a;
                int c = jzl.c(j11, dqsVar5 == dqsVar7 ? i102 : i11);
                if (dqsVar5 == dqsVar7) {
                    i102 = i11;
                }
                int b3 = jzl.b(j11, i102);
                int i104 = dqsVar5 == dqsVar7 ? b3 : c;
                boolean z7 = i11 < Math.min(i104, i7);
                if (z7 && i89 != 0) {
                    dwv.d(a.h(i89, "non-zero pagesScrollOffset="));
                }
                ArrayList arrayList6 = new ArrayList(ffdnVar4.a + list7.size() + list8.size());
                if (z7) {
                    if (!list7.isEmpty() || !list8.isEmpty()) {
                        dwv.c("No extra pages");
                    }
                    int i105 = ffdnVar4.a;
                    int[] iArr2 = new int[i105];
                    for (int i106 = 0; i106 < i105; i106++) {
                        iArr2[i106] = f;
                    }
                    int[] iArr3 = new int[i105];
                    emuVar = emuVar3;
                    z = z6;
                    dxn dxnVar = new dxn(ejqVar13.ek(i87), false, null);
                    if (dqsVar5 == dqs.a) {
                        dxnVar.b(ejqVar13, i104, iArr2, iArr3);
                        iArr = iArr3;
                        arrayList2 = arrayList6;
                        ffdnVar = ffdnVar4;
                    } else {
                        iArr = iArr3;
                        arrayList2 = arrayList6;
                        ffdnVar = ffdnVar4;
                        dxnVar.b(ejqVar13, i104, iArr2, kah.a, iArr);
                    }
                    ffmj O = ffdo.O(iArr);
                    int i107 = O.a;
                    int i108 = O.b;
                    int i109 = O.c;
                    if ((i109 > 0 && i107 <= i108) || (i109 < 0 && i108 <= i107)) {
                        while (true) {
                            int i110 = iArr[i107];
                            int i111 = i109;
                            emu emuVar4 = (emu) ffdnVar.get(i107);
                            emuVar4.b(i110, c, b3);
                            arrayList2.add(emuVar4);
                            if (i107 == i108) {
                                break;
                            }
                            i107 += i111;
                            i109 = i111;
                        }
                    }
                    i87 = i87;
                    list2 = list7;
                } else {
                    emuVar = emuVar3;
                    arrayList2 = arrayList6;
                    z = z6;
                    ffdnVar = ffdnVar4;
                    int size5 = list7.size();
                    int i112 = i89;
                    for (int i113 = 0; i113 < size5; i113++) {
                        emu emuVar5 = (emu) list7.get(i113);
                        i112 -= i30;
                        emuVar5.b(i112, c, b3);
                        arrayList2.add(emuVar5);
                    }
                    list2 = list7;
                    int i114 = ffdnVar.a;
                    for (int i115 = 0; i115 < i114; i115++) {
                        emu emuVar6 = (emu) ffdnVar.get(i115);
                        emuVar6.b(i89, c, b3);
                        arrayList2.add(emuVar6);
                        i89 += i30;
                    }
                    int size6 = list8.size();
                    for (int i116 = 0; i116 < size6; i116++) {
                        emu emuVar7 = (emu) list8.get(i116);
                        emuVar7.b(i89, c, b3);
                        arrayList2.add(emuVar7);
                        i89 += i30;
                    }
                }
                if (z) {
                    arrayList3 = arrayList2;
                } else {
                    arrayList3 = new ArrayList(arrayList2.size());
                    int size7 = arrayList2.size();
                    int i117 = 0;
                    while (i117 < size7) {
                        Object obj4 = arrayList2.get(i117);
                        emu emuVar8 = (emu) obj4;
                        int i118 = size7;
                        ejq ejqVar14 = ejqVar13;
                        if (emuVar8.a >= ((emu) ffdnVar.a()).a && emuVar8.a <= ((emu) ffdnVar.e()).a) {
                            arrayList3.add(obj4);
                        }
                        i117++;
                        size7 = i118;
                        ejqVar13 = ejqVar14;
                    }
                }
                ejqVar5 = ejqVar13;
                if (list2.isEmpty()) {
                    arrayList4 = ffel.a;
                } else {
                    arrayList4 = new ArrayList(arrayList2.size());
                    int size8 = arrayList2.size();
                    for (int i119 = 0; i119 < size8; i119++) {
                        Object obj5 = arrayList2.get(i119);
                        if (((emu) obj5).a < ((emu) ffdnVar.a()).a) {
                            arrayList4.add(obj5);
                        }
                    }
                }
                List list9 = arrayList4;
                if (list8.isEmpty()) {
                    arrayList5 = ffel.a;
                } else {
                    arrayList5 = new ArrayList(arrayList2.size());
                    int size9 = arrayList2.size();
                    for (int i120 = 0; i120 < size9; i120++) {
                        Object obj6 = arrayList2.get(i120);
                        if (((emu) obj6).a > ((emu) ffdnVar.e()).a) {
                            arrayList5.add(obj6);
                        }
                    }
                }
                List list10 = arrayList5;
                if (arrayList3.isEmpty()) {
                    i15 = i101;
                    i16 = i28;
                    i18 = i90;
                    i17 = i8;
                    obj3 = null;
                } else {
                    Object obj7 = arrayList3.get(0);
                    emu emuVar9 = (emu) obj7;
                    i15 = i101;
                    i16 = i28;
                    i17 = i8;
                    float a8 = dwa.a(i16, i17, i26, i90, emuVar9.h, emuVar9.a, dvzVar2, i15);
                    i26 = i26;
                    float f4 = -Math.abs(a8);
                    int e = ffdx.e(arrayList3);
                    if (e > 0) {
                        int i121 = 1;
                        while (true) {
                            Object obj8 = arrayList3.get(i121);
                            emu emuVar10 = (emu) obj8;
                            int i122 = i26;
                            i26 = i122;
                            i18 = i90;
                            float f5 = -Math.abs(dwa.a(i16, i17, i122, i90, emuVar10.h, emuVar10.a, dvzVar2, i15));
                            int compare = Float.compare(f4, f5);
                            if (compare < 0) {
                                obj7 = obj8;
                            }
                            if (i121 == e) {
                                break;
                            }
                            if (compare < 0) {
                                f4 = f5;
                            }
                            i121++;
                            i90 = i18;
                        }
                    } else {
                        i18 = i90;
                    }
                    obj3 = obj7;
                }
                emu emuVar11 = (emu) obj3;
                int i123 = i15;
                float e2 = i18 == 0 ? 0.0f : ffmk.e((dvzVar2.a(i16, f, i17, i26, emuVar11 != null ? emuVar11.a : 0, i123) - (emuVar11 != null ? emuVar11.h : 0)) / i18, -0.5f, 0.5f);
                ?? a9 = enzVar4.a(Integer.valueOf(c), Integer.valueOf(b3), new enu(hhoVar, arrayList2));
                if (i81 < i123 || i11 > i7) {
                    z2 = true;
                    i19 = f;
                } else {
                    i19 = f;
                    z2 = false;
                }
                eobVar = new eob(arrayList3, i19, i87, i26, dqsVar5, i33, i51, i31, emuVar, emuVar11, e2, i14, z2, dvzVar2, a9, z5, list9, list10, ffskVar);
            }
            eob eobVar2 = eobVar;
            this.a.s(eobVar2, ejqVar5.eu(), false);
            return eobVar2;
        } catch (Throwable th) {
            hrv.e(a2, b, k);
            throw th;
        }
    }
}
