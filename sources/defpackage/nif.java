package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import androidx.car.app.hardware.info.EnergyProfile;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nif implements nco {
    private static final byte[] b = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final lqc c;
    private long A;
    private long B;
    private nie C;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private boolean H;
    private ncr I;
    private ndu[] J;
    private boolean K;
    public ndu[] a;
    private final nkh d;
    private final int e;
    private final List f;
    private final SparseArray g;
    private final luv h;
    private final luv i;
    private final luv j;
    private final byte[] k;
    private final luv l;
    private final nfo m;
    private final luv n;
    private final ArrayDeque o;
    private final ArrayDeque p;
    private final lwe q;
    private engw r;
    private int s;
    private int t;
    private long u;
    private int v;
    private luv w;
    private long x;
    private int y;
    private long z;

    static {
        lqb lqbVar = new lqb();
        lqbVar.c("application/x-emsg");
        c = new lqc(lqbVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public nif() {
        /*
            r3 = this;
            nkh r0 = defpackage.nkh.a
            int r1 = defpackage.engw.d
            r1 = 32
            engw r2 = defpackage.enou.a
            r3.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nif.<init>():void");
    }

    private static lpw h(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            lvj lvjVar = (lvj) list.get(i);
            if (lvjVar.d == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = lvjVar.a.a;
                nin a = nio.a(bArr);
                UUID uuid = a == null ? null : a.a;
                if (uuid == null) {
                    luj.f("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new lpv(uuid, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new lpw(null, false, (lpv[]) arrayList.toArray(new lpv[0]));
    }

    private final void i() {
        this.s = 0;
        this.v = 0;
    }

    private static void j(luv luvVar, int i, niu niuVar) {
        luvVar.K(i + 8);
        int a = nhz.a(luvVar.e());
        if ((a & 1) != 0) {
            throw new lrg("Overriding TrackEncryptionBox parameters is unsupported.", null, false, 1);
        }
        boolean z = (a & 2) != 0;
        int m = luvVar.m();
        if (m == 0) {
            Arrays.fill(niuVar.l, 0, niuVar.e, false);
            return;
        }
        int i2 = niuVar.e;
        if (m != i2) {
            throw new lrg(a.r(i2, m, "Senc sample count ", " is different from fragment sample count"), null, true, 1);
        }
        Arrays.fill(niuVar.l, 0, m, z);
        niuVar.b(luvVar.b());
        luv luvVar2 = niuVar.n;
        luvVar.F(luvVar2.a, 0, luvVar2.c);
        niuVar.n.K(0);
        niuVar.o = false;
    }

    private final void k(long j) {
        SparseArray sparseArray;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        byte[] bArr;
        int i6;
        boolean z;
        int i7;
        List list;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        int i13;
        nia niaVar;
        int i14;
        boolean z3;
        while (!this.o.isEmpty() && ((lvi) this.o.peek()).a == j) {
            lvi lviVar = (lvi) this.o.pop();
            int i15 = lviVar.d;
            int i16 = 12;
            int i17 = 8;
            if (i15 == 1836019574) {
                lti.d(true, "Unexpected moov box.");
                lpw h = h(lviVar.b);
                lvi a = lviVar.a(1836475768);
                lti.f(a);
                SparseArray sparseArray2 = new SparseArray();
                int size = a.b.size();
                long j2 = -9223372036854775807L;
                int i18 = 0;
                while (i18 < size) {
                    lvj lvjVar = (lvj) a.b.get(i18);
                    int i19 = lvjVar.d;
                    if (i19 == 1953654136) {
                        luv luvVar = lvjVar.a;
                        luvVar.K(i16);
                        Pair create = Pair.create(Integer.valueOf(luvVar.e()), new nia(luvVar.e() - 1, luvVar.e(), luvVar.e(), luvVar.e()));
                        sparseArray2.put(((Integer) create.first).intValue(), (nia) create.second);
                    } else if (i19 == 1835362404) {
                        luv luvVar2 = lvjVar.a;
                        luvVar2.K(8);
                        j2 = nhz.b(luvVar2.e()) == 0 ? luvVar2.r() : luvVar2.s();
                    }
                    i18++;
                    i16 = 12;
                }
                List g = nhz.g(lviVar, new ndc(), j2, h, (this.e & 16) != 0, false, new emwl() { // from class: nib
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return (nis) obj;
                    }
                });
                int size2 = g.size();
                if (this.g.size() == 0) {
                    String a2 = nii.a(g);
                    for (int i20 = 0; i20 < size2; i20++) {
                        niv nivVar = (niv) g.get(i20);
                        nis nisVar = nivVar.a;
                        ndu p = this.I.p(i20, nisVar.b);
                        p.v();
                        this.g.put(nisVar.a, new nie(p, nivVar, m(sparseArray2, nisVar.a), a2));
                        this.A = Math.max(this.A, nisVar.e);
                    }
                    this.I.r();
                } else {
                    lti.c(this.g.size() == size2);
                    for (int i21 = 0; i21 < size2; i21++) {
                        niv nivVar2 = (niv) g.get(i21);
                        nis nisVar2 = nivVar2.a;
                        ((nie) this.g.get(nisVar2.a)).e(nivVar2, m(sparseArray2, nisVar2.a));
                    }
                }
            } else {
                int i22 = 16;
                if (i15 == 1836019558) {
                    SparseArray sparseArray3 = this.g;
                    int i23 = this.e;
                    byte[] bArr2 = this.k;
                    int size3 = lviVar.c.size();
                    int i24 = 0;
                    while (i24 < size3) {
                        lvi lviVar2 = (lvi) lviVar.c.get(i24);
                        if (lviVar2.d == 1953653094) {
                            lvj b2 = lviVar2.b(1952868452);
                            lti.f(b2);
                            luv luvVar3 = b2.a;
                            luvVar3.K(i17);
                            int a3 = nhz.a(luvVar3.e());
                            nie nieVar = (nie) sparseArray3.get(luvVar3.e());
                            if (nieVar == null) {
                                nieVar = null;
                            } else {
                                if ((a3 & 1) != 0) {
                                    long s = luvVar3.s();
                                    niu niuVar = nieVar.b;
                                    niuVar.b = s;
                                    niuVar.c = s;
                                }
                                nia niaVar2 = nieVar.e;
                                nieVar.b.a = new nia((a3 & 2) != 0 ? luvVar3.e() - 1 : niaVar2.a, (a3 & 8) != 0 ? luvVar3.e() : niaVar2.b, (a3 & 16) != 0 ? luvVar3.e() : niaVar2.c, (a3 & 32) != 0 ? luvVar3.e() : niaVar2.d);
                            }
                            if (nieVar == null) {
                                sparseArray = sparseArray3;
                                i = i23;
                                i2 = size3;
                                i3 = i24;
                                i4 = i22;
                            } else {
                                niu niuVar2 = nieVar.b;
                                long j3 = niuVar2.p;
                                boolean z4 = niuVar2.q;
                                nieVar.f();
                                nieVar.k = true;
                                lvj b3 = lviVar2.b(1952867444);
                                if (b3 == null || (i23 & 2) != 0) {
                                    niuVar2.p = j3;
                                    niuVar2.q = z4;
                                } else {
                                    luv luvVar4 = b3.a;
                                    luvVar4.K(i17);
                                    niuVar2.p = nhz.b(luvVar4.e()) == 1 ? luvVar4.s() : luvVar4.r();
                                    niuVar2.q = true;
                                }
                                List list2 = lviVar2.b;
                                int size4 = list2.size();
                                int i25 = 0;
                                int i26 = 0;
                                int i27 = 0;
                                while (true) {
                                    i5 = 1953658222;
                                    if (i25 >= size4) {
                                        break;
                                    }
                                    SparseArray sparseArray4 = sparseArray3;
                                    lvj lvjVar2 = (lvj) list2.get(i25);
                                    int i28 = i23;
                                    if (lvjVar2.d == 1953658222) {
                                        luv luvVar5 = lvjVar2.a;
                                        luvVar5.K(12);
                                        int m = luvVar5.m();
                                        if (m > 0) {
                                            i27 += m;
                                            i26++;
                                        }
                                    }
                                    i25++;
                                    i23 = i28;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                i = i23;
                                nieVar.h = 0;
                                nieVar.g = 0;
                                nieVar.f = 0;
                                niu niuVar3 = nieVar.b;
                                niuVar3.d = i26;
                                niuVar3.e = i27;
                                if (niuVar3.g.length < i26) {
                                    niuVar3.f = new long[i26];
                                    niuVar3.g = new int[i26];
                                }
                                if (niuVar3.h.length < i27) {
                                    int i29 = (i27 * 125) / 100;
                                    niuVar3.h = new int[i29];
                                    niuVar3.i = new long[i29];
                                    niuVar3.j = new boolean[i29];
                                    niuVar3.l = new boolean[i29];
                                }
                                int i30 = 0;
                                int i31 = 0;
                                int i32 = 0;
                                while (true) {
                                    long j4 = 0;
                                    if (i30 >= size4) {
                                        break;
                                    }
                                    lvj lvjVar3 = (lvj) list2.get(i30);
                                    if (lvjVar3.d == i5) {
                                        int i33 = i31 + 1;
                                        luv luvVar6 = lvjVar3.a;
                                        luvVar6.K(8);
                                        int a4 = nhz.a(luvVar6.e());
                                        i7 = i30;
                                        nis nisVar3 = nieVar.d.a;
                                        int i34 = i31;
                                        niu niuVar4 = nieVar.b;
                                        list = list2;
                                        nia niaVar3 = niuVar4.a;
                                        int i35 = lvf.a;
                                        i8 = size3;
                                        niuVar4.g[i34] = luvVar6.m();
                                        long[] jArr = niuVar4.f;
                                        i9 = i24;
                                        i10 = size4;
                                        long j5 = niuVar4.b;
                                        jArr[i34] = j5;
                                        if ((a4 & 1) != 0) {
                                            jArr[i34] = j5 + luvVar6.e();
                                        }
                                        boolean z5 = (a4 & 4) != 0;
                                        int i36 = niaVar3.d;
                                        if (z5) {
                                            i36 = luvVar6.e();
                                        }
                                        int i37 = a4 & 256;
                                        boolean z6 = z5;
                                        int i38 = a4 & 512;
                                        int i39 = a4 & 1024;
                                        int i40 = a4 & 2048;
                                        long[] jArr2 = nisVar3.i;
                                        if (jArr2 != null) {
                                            i11 = i40;
                                            if (jArr2.length == 1 && nisVar3.j != null) {
                                                long j6 = jArr2[0];
                                                if (j6 == 0 || lvf.w(j6, 1000000L, nisVar3.d) + lvf.w(nisVar3.j[0], 1000000L, nisVar3.c) >= nisVar3.e) {
                                                    j4 = nisVar3.j[0];
                                                }
                                            }
                                        } else {
                                            i11 = i40;
                                        }
                                        int[] iArr = niuVar4.h;
                                        long[] jArr3 = niuVar4.i;
                                        boolean[] zArr = niuVar4.j;
                                        boolean z7 = nisVar3.b == 2 && (i & 1) != 0;
                                        int i41 = niuVar4.g[i34] + i32;
                                        int i42 = i36;
                                        long j7 = nisVar3.c;
                                        long j8 = niuVar4.p;
                                        while (i32 < i41) {
                                            int e = i37 != 0 ? luvVar6.e() : niaVar3.b;
                                            l(e);
                                            if (i38 != 0) {
                                                i12 = luvVar6.e();
                                                z2 = z7;
                                            } else {
                                                z2 = z7;
                                                i12 = niaVar3.c;
                                            }
                                            l(i12);
                                            if (i39 != 0) {
                                                i13 = luvVar6.e();
                                            } else {
                                                if (i32 == 0) {
                                                    if (z6) {
                                                        i13 = i42;
                                                        i32 = 0;
                                                    } else {
                                                        i32 = 0;
                                                    }
                                                }
                                                i13 = niaVar3.d;
                                            }
                                            if (i11 != 0) {
                                                niaVar = niaVar3;
                                                i14 = luvVar6.e();
                                            } else {
                                                niaVar = niaVar3;
                                                i14 = 0;
                                            }
                                            int i43 = i13;
                                            int i44 = i41;
                                            long w = lvf.w((i14 + j8) - j4, 1000000L, j7);
                                            jArr3[i32] = w;
                                            if (!niuVar4.q) {
                                                jArr3[i32] = w + nieVar.d.h;
                                            }
                                            iArr[i32] = i12;
                                            if (((i43 >> 16) & 1) == 0) {
                                                if (!z2) {
                                                    z3 = true;
                                                } else if (i32 == 0) {
                                                    z3 = true;
                                                    i32 = 0;
                                                }
                                                zArr[i32] = z3;
                                                j8 += e;
                                                i32++;
                                                z7 = z2;
                                                niaVar3 = niaVar;
                                                i41 = i44;
                                            }
                                            z3 = false;
                                            zArr[i32] = z3;
                                            j8 += e;
                                            i32++;
                                            z7 = z2;
                                            niaVar3 = niaVar;
                                            i41 = i44;
                                        }
                                        niuVar4.p = j8;
                                        i31 = i33;
                                        i32 = i41;
                                    } else {
                                        i7 = i30;
                                        list = list2;
                                        i8 = size3;
                                        i9 = i24;
                                        i10 = size4;
                                    }
                                    i30 = i7 + 1;
                                    list2 = list;
                                    size3 = i8;
                                    i24 = i9;
                                    size4 = i10;
                                    i5 = 1953658222;
                                }
                                i2 = size3;
                                i3 = i24;
                                nis nisVar4 = nieVar.d.a;
                                nia niaVar4 = niuVar2.a;
                                lti.f(niaVar4);
                                nit b4 = nisVar4.b(niaVar4.a);
                                lvj b5 = lviVar2.b(1935763834);
                                if (b5 != null) {
                                    lti.f(b4);
                                    luv luvVar7 = b5.a;
                                    luvVar7.K(8);
                                    if ((nhz.a(luvVar7.e()) & 1) == 1) {
                                        luvVar7.L(8);
                                    }
                                    int j9 = luvVar7.j();
                                    int m2 = luvVar7.m();
                                    int i45 = niuVar2.e;
                                    if (m2 > i45) {
                                        throw new lrg(a.r(i45, m2, "Saiz sample count ", " is greater than fragment sample count"), null, true, 1);
                                    }
                                    int i46 = b4.d;
                                    if (j9 == 0) {
                                        boolean[] zArr2 = niuVar2.l;
                                        i6 = 0;
                                        for (int i47 = 0; i47 < m2; i47++) {
                                            int j10 = luvVar7.j();
                                            i6 += j10;
                                            zArr2[i47] = j10 > i46;
                                        }
                                        z = false;
                                    } else {
                                        boolean z8 = j9 > i46;
                                        i6 = j9 * m2;
                                        z = false;
                                        Arrays.fill(niuVar2.l, 0, m2, z8);
                                    }
                                    Arrays.fill(niuVar2.l, m2, niuVar2.e, z);
                                    if (i6 > 0) {
                                        niuVar2.b(i6);
                                    }
                                }
                                lvj b6 = lviVar2.b(1935763823);
                                if (b6 != null) {
                                    luv luvVar8 = b6.a;
                                    luvVar8.K(8);
                                    int e2 = luvVar8.e();
                                    if ((nhz.a(e2) & 1) == 1) {
                                        luvVar8.L(8);
                                    }
                                    int m3 = luvVar8.m();
                                    if (m3 != 1) {
                                        throw new lrg(a.h(m3, "Unexpected saio entry count: "), null, true, 1);
                                    }
                                    niuVar2.c += nhz.b(e2) == 0 ? luvVar8.r() : luvVar8.s();
                                }
                                lvj b7 = lviVar2.b(1936027235);
                                if (b7 != null) {
                                    j(b7.a, 0, niuVar2);
                                }
                                String str = b4 != null ? b4.b : null;
                                luv luvVar9 = null;
                                luv luvVar10 = null;
                                for (int i48 = 0; i48 < lviVar2.b.size(); i48++) {
                                    lvj lvjVar4 = (lvj) lviVar2.b.get(i48);
                                    luv luvVar11 = lvjVar4.a;
                                    int i49 = lvjVar4.d;
                                    if (i49 == 1935828848) {
                                        luvVar11.K(12);
                                        if (luvVar11.e() == 1936025959) {
                                            luvVar10 = luvVar11;
                                        }
                                    } else if (i49 == 1936158820) {
                                        luvVar11.K(12);
                                        if (luvVar11.e() == 1936025959) {
                                            luvVar9 = luvVar11;
                                        }
                                    }
                                }
                                if (luvVar10 != null && luvVar9 != null) {
                                    luvVar10.K(8);
                                    int b8 = nhz.b(luvVar10.e());
                                    luvVar10.L(4);
                                    if (b8 == 1) {
                                        luvVar10.L(4);
                                    }
                                    if (luvVar10.e() != 1) {
                                        throw new lrg("Entry count in sbgp != 1 (unsupported).", null, false, 1);
                                    }
                                    luvVar9.K(8);
                                    int b9 = nhz.b(luvVar9.e());
                                    luvVar9.L(4);
                                    if (b9 == 1) {
                                        if (luvVar9.r() == 0) {
                                            throw new lrg("Variable length description in sgpd found (unsupported)", null, false, 1);
                                        }
                                    } else if (b9 >= 2) {
                                        luvVar9.L(4);
                                    }
                                    if (luvVar9.r() != 1) {
                                        throw new lrg("Entry count in sgpd != 1 (unsupported).", null, false, 1);
                                    }
                                    luvVar9.L(1);
                                    int j11 = luvVar9.j();
                                    int i50 = (j11 & 240) >> 4;
                                    int i51 = j11 & 15;
                                    if (luvVar9.j() == 1) {
                                        int j12 = luvVar9.j();
                                        int i52 = i22;
                                        byte[] bArr3 = new byte[i52];
                                        luvVar9.F(bArr3, 0, i52);
                                        if (j12 == 0) {
                                            int j13 = luvVar9.j();
                                            byte[] bArr4 = new byte[j13];
                                            luvVar9.F(bArr4, 0, j13);
                                            bArr = bArr4;
                                        } else {
                                            bArr = null;
                                        }
                                        niuVar2.k = true;
                                        niuVar2.m = new nit(true, str, j12, bArr3, i50, i51, bArr);
                                    }
                                }
                                int size5 = lviVar2.b.size();
                                for (int i53 = 0; i53 < size5; i53++) {
                                    lvj lvjVar5 = (lvj) lviVar2.b.get(i53);
                                    if (lvjVar5.d == 1970628964) {
                                        luv luvVar12 = lvjVar5.a;
                                        luvVar12.K(8);
                                        luvVar12.F(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, b)) {
                                            j(luvVar12, 16, niuVar2);
                                        }
                                    }
                                }
                                i17 = 8;
                                i4 = 16;
                            }
                        } else {
                            sparseArray = sparseArray3;
                            i = i23;
                            i2 = size3;
                            i3 = i24;
                            i4 = i22;
                        }
                        i24 = i3 + 1;
                        i22 = i4;
                        i23 = i;
                        sparseArray3 = sparseArray;
                        size3 = i2;
                    }
                    lpw h2 = h(lviVar.b);
                    if (h2 != null) {
                        int size6 = this.g.size();
                        for (int i54 = 0; i54 < size6; i54++) {
                            nie nieVar2 = (nie) this.g.valueAt(i54);
                            nis nisVar5 = nieVar2.d.a;
                            nia niaVar5 = nieVar2.b.a;
                            int i55 = lvf.a;
                            nit b10 = nisVar5.b(niaVar5.a);
                            lpw b11 = h2.b(b10 != null ? b10.b : null);
                            lqb lqbVar = new lqb(nieVar2.d.a.g);
                            lqbVar.a(nieVar2.j);
                            lqbVar.q = b11;
                            nieVar2.a.i(new lqc(lqbVar));
                        }
                    }
                    if (this.z != -9223372036854775807L) {
                        int size7 = this.g.size();
                        for (int i56 = 0; i56 < size7; i56++) {
                            nie nieVar3 = (nie) this.g.valueAt(i56);
                            long j14 = this.z;
                            int i57 = nieVar3.f;
                            while (true) {
                                niu niuVar5 = nieVar3.b;
                                if (i57 < niuVar5.e && niuVar5.a(i57) <= j14) {
                                    if (nieVar3.b.j[i57]) {
                                        nieVar3.i = i57;
                                    }
                                    i57++;
                                }
                            }
                        }
                        this.z = -9223372036854775807L;
                    }
                } else if (!this.o.isEmpty()) {
                    ((lvi) this.o.peek()).c(lviVar);
                }
            }
        }
        i();
    }

    private static void l(int i) {
        if (i < 0) {
            throw new lrg(a.h(i, "Unexpected negative value: "), null, true, 1);
        }
    }

    private static final nia m(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (nia) sparseArray.valueAt(0);
        }
        nia niaVar = (nia) sparseArray.get(i);
        lti.f(niaVar);
        return niaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:315:0x0099, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x00a0, code lost:
    
        if (r37.s != 3) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x00a4, code lost:
    
        if (r2.k != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x00a6, code lost:
    
        r3 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x00b7, code lost:
    
        r37.D = r3;
        r3 = r2.d.a.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x00c5, code lost:
    
        if (j$.util.Objects.equals(r3.o, "video/avc") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x00c7, code lost:
    
        j$.util.Objects.equals(r3.o, "video/hevc");
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x00cc, code lost:
    
        r37.G = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x00d2, code lost:
    
        if (r2.f >= r2.i) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x00d4, code lost:
    
        r38.l(r37.D);
        r0 = r2.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x00dd, code lost:
    
        if (r0 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x00e0, code lost:
    
        r3 = r2.b.n;
        r0 = r0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x00e6, code lost:
    
        if (r0 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x00e8, code lost:
    
        r3.L(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x00f3, code lost:
    
        if (r2.b.c(r2.f) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x00f5, code lost:
    
        r3.L(r3.n() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0101, code lost:
    
        if (r2.g() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0103, code lost:
    
        r37.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0105, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0339, code lost:
    
        r37.s = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x033d, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x010e, code lost:
    
        if (r2.d.a.h != 1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0110, code lost:
    
        r37.D -= 8;
        r38.l(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0127, code lost:
    
        if ("audio/ac4".equals(r2.d.a.g.o) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0129, code lost:
    
        r37.E = r2.b(r37.D, 7);
        defpackage.nbs.b(r37.D, r37.l);
        r2.a.m(r37.l, 7);
        r3 = r37.E + 7;
        r37.E = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x014e, code lost:
    
        r37.D += r3;
        r37.s = 4;
        r37.F = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0146, code lost:
    
        r3 = r2.b(r37.D, 0);
        r37.E = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x00af, code lost:
    
        r3 = r2.b.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0158, code lost:
    
        r3 = r2.d;
        r7 = r3.a;
        r11 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0160, code lost:
    
        if (r2.k != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0162, code lost:
    
        r14 = r3.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0171, code lost:
    
        r3 = r7.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0173, code lost:
    
        if (r3 != 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0175, code lost:
    
        r3 = r37.E;
        r4 = r37.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0179, code lost:
    
        if (r3 >= r4) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x017b, code lost:
    
        r37.E += r11.e(r38, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x02d4, code lost:
    
        r0 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x02da, code lost:
    
        if (r37.G != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x02dc, code lost:
    
        r0 = r0 | com.android.vcard.VCardConfig.FLAG_APPEND_TYPE_PARAM;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x02df, code lost:
    
        r22 = r0;
        r0 = r2.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x02e5, code lost:
    
        if (r0 == null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x02e7, code lost:
    
        r25 = r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x02ee, code lost:
    
        r20 = r14;
        r11.o(r20, r22, r37.D, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0301, code lost:
    
        if (r37.p.isEmpty() != false) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0303, code lost:
    
        r0 = (defpackage.nid) r37.p.removeFirst();
        r37.y -= r0.c;
        r3 = r0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0316, code lost:
    
        if (r0.b == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0318, code lost:
    
        r3 = r3 + r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x031a, code lost:
    
        r6 = r3;
        r3 = r37.J;
        r4 = r3.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x031f, code lost:
    
        if (r12 >= r4) goto L451;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0321, code lost:
    
        r3[r12].o(r6, 1, r0.c, r37.y, null);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0333, code lost:
    
        if (r2.g() != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0335, code lost:
    
        r37.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0338, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x02ec, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0186, code lost:
    
        r12 = r37.i.a;
        r12[0] = 0;
        r12[1] = 0;
        r12[r39] = 0;
        r3 = 4 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0198, code lost:
    
        if (r37.E >= r37.D) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x019a, code lost:
    
        r8 = r37.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x019c, code lost:
    
        if (r8 != 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x01a1, code lost:
    
        if (r37.a.length > 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x01a5, code lost:
    
        if (r37.G != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x01a8, code lost:
    
        r19 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x01bd, code lost:
    
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x01be, code lost:
    
        r38.j(r12, r3, r7.k + r8);
        r37.i.K(r10);
        r4 = r37.i.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x01cf, code lost:
    
        if (r4 < 0) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x01d1, code lost:
    
        r37.F = r4 - r8;
        r37.h.K(r10);
        r11.m(r37.h, 4);
        r37.E += 4;
        r37.D += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x01ec, code lost:
    
        if (r37.a.length <= 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x01ee, code lost:
    
        if (r8 <= 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x01f0, code lost:
    
        r4 = r7.g;
        r13 = r12[4];
        r9 = defpackage.lwa.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x01fc, code lost:
    
        if (j$.util.Objects.equals(r4.o, "video/avc") != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0204, code lost:
    
        if (defpackage.lre.h(r4.k, "video/avc") == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0207, code lost:
    
        r10 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0214, code lost:
    
        if (j$.util.Objects.equals(r4.o, "video/hevc") != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x021c, code lost:
    
        if (defpackage.lre.h(r4.k, "video/hevc") == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x022a, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x022b, code lost:
    
        r37.H = r4;
        r11.m(r37.i, r8);
        r37.E += r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0237, code lost:
    
        if (r8 <= 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x023b, code lost:
    
        if (r37.G != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0243, code lost:
    
        if (defpackage.lwa.k(r12, r8, r7.g) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0245, code lost:
    
        r4 = r19;
        r37.G = r4;
        r9 = r4;
        r4 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x02d1, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x024c, code lost:
    
        r4 = r10;
        r9 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0224, code lost:
    
        if (((r13 & 126) >> 1) != 39) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0226, code lost:
    
        r4 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0209, code lost:
    
        r10 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x020c, code lost:
    
        if ((r13 & 31) == 6) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0229, code lost:
    
        r10 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0252, code lost:
    
        r4 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x025c, code lost:
    
        throw new defpackage.lrg("Invalid NAL length", null, r4, r4 ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x01ab, code lost:
    
        r8 = r7.g;
        r13 = r7.k;
        r8 = defpackage.lwa.d(r8);
        r19 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x01bb, code lost:
    
        if ((r13 + r8) <= (r37.D - r37.E)) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x025d, code lost:
    
        r10 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0260, code lost:
    
        if (r37.H == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0262, code lost:
    
        r37.j.G(r8);
        r38.j(r37.j.a, 0, r37.F);
        r11.m(r37.j, r37.F);
        r4 = r37.F;
        r8 = r37.j;
        r8 = defpackage.lwa.e(r8.a, r8.c);
        r37.j.K(0);
        r37.j.J(r8);
        r8 = r7.g.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0293, code lost:
    
        if (r8 != (-1)) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0295, code lost:
    
        r8 = r37.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0299, code lost:
    
        if (r8.b == 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x029b, code lost:
    
        r8.c(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x02a8, code lost:
    
        r37.q.a(r14, r37.j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x02b7, code lost:
    
        if ((r2.a() & 4) == 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x02b9, code lost:
    
        r37.q.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x02c4, code lost:
    
        r37.E += r4;
        r37.F -= r4;
        r4 = r10;
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x029f, code lost:
    
        r9 = r37.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x02a3, code lost:
    
        if (r9.b == r8) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x02a5, code lost:
    
        r9.c(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x02bf, code lost:
    
        r4 = r11.e(r38, r8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0169, code lost:
    
        r14 = r2.b.a(r2.f);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x005a A[SYNTHETIC] */
    @Override // defpackage.nco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.ncp r38, defpackage.ndk r39) {
        /*
            Method dump skipped, instructions count: 2051
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nif.a(ncp, ndk):int");
    }

    @Override // defpackage.nco
    public final void c(ncr ncrVar) {
        int i;
        if ((this.e & 32) == 0) {
            ncrVar = new nkk(ncrVar, this.d);
        }
        this.I = ncrVar;
        i();
        ndu[] nduVarArr = new ndu[2];
        this.J = nduVarArr;
        int i2 = 100;
        int i3 = 0;
        if ((this.e & 4) != 0) {
            nduVarArr[0] = this.I.p(100, 5);
            i = 1;
            i2 = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
        } else {
            i = 0;
        }
        ndu[] nduVarArr2 = (ndu[]) lvf.af(this.J, i);
        this.J = nduVarArr2;
        for (ndu nduVar : nduVarArr2) {
            nduVar.i(c);
        }
        this.a = new ndu[this.f.size()];
        while (i3 < this.a.length) {
            ndu p = this.I.p(i2, 3);
            p.i((lqc) this.f.get(i3));
            this.a[i3] = p;
            i3++;
            i2++;
        }
    }

    @Override // defpackage.nco
    public final void e(long j, long j2) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            ((nie) this.g.valueAt(i)).f();
        }
        this.p.clear();
        this.y = 0;
        this.q.a.clear();
        this.z = j2;
        this.o.clear();
        i();
    }

    @Override // defpackage.nco
    public final boolean f(ncp ncpVar) {
        engw engwVar;
        ndr a = nir.a(ncpVar, true, false);
        if (a != null) {
            engwVar = engw.r(a);
        } else {
            int i = engw.d;
            engwVar = enou.a;
        }
        this.r = engwVar;
        return a == null;
    }

    @Override // defpackage.nco
    public final /* synthetic */ List x() {
        return this.r;
    }

    public nif(nkh nkhVar, int i, List list) {
        this.d = nkhVar;
        this.e = i;
        this.f = DesugarCollections.unmodifiableList(list);
        this.m = new nfo();
        this.n = new luv(16);
        this.h = new luv(lwa.a);
        this.i = new luv(6);
        this.j = new luv();
        byte[] bArr = new byte[16];
        this.k = bArr;
        this.l = new luv(bArr);
        this.o = new ArrayDeque();
        this.p = new ArrayDeque();
        this.g = new SparseArray();
        int i2 = engw.d;
        this.r = enou.a;
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = ncr.y;
        this.J = new ndu[0];
        this.a = new ndu[0];
        this.q = new lwe(new lwd() { // from class: nic
            @Override // defpackage.lwd
            public final void a(long j, luv luvVar) {
                ncb.a(j, luvVar, nif.this.a);
            }
        });
    }

    @Override // defpackage.nco
    public final void d() {
    }

    @Override // defpackage.nco
    public final /* synthetic */ void g() {
    }
}
