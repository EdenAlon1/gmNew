package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bciw extends dtsr implements bcid {
    @Deprecated
    public bciw(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bcjd bcjdVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bcjh.a, dtyoVar, dtvsVar, bcjdVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bcgn();
    }

    public final int c() {
        return getInt(cM(13, bcjh.a));
    }

    public final int e() {
        return getInt(cM(14, bcjh.a));
    }

    public final int f() {
        return getInt(cM(15, bcjh.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        azsu[] azsuVarArr;
        int i;
        boolean[] zArr;
        boolean[] zArr2;
        int[] iArr;
        long[] jArr;
        boolean[] zArr3;
        boolean[] zArr4;
        int[] iArr2;
        int[] iArr3;
        boolean[] zArr5;
        String[] strArr;
        String[] strArr2;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        String[] strArr3;
        String[] strArr4;
        boolean[] zArr6;
        long[] jArr2;
        csgg[] csggVarArr;
        engr engrVar;
        csgg[] csggVarArr2;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length == 0 || (length == 1 && dB[0] == -1)) {
            int i2 = engw.d;
            return enou.a;
        }
        HashSet hashSet = new HashSet();
        dtvs dtvsVar = this.d;
        boolean di = di(0);
        boolean z = dtvsVar.b;
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bcjh.a)))) : new long[]{i()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bcie
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bciw.this.getString(0)));
            }
        });
        if (!di(1)) {
            azsuVarArr = null;
        } else if (z) {
            String[] dt = dt(getString(cM(1, bcjh.a)));
            int length2 = dt.length;
            azsu[] azsuVarArr2 = new azsu[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                azsuVarArr2[i3] = azsv.a(dt[i3]);
            }
            azsuVarArr = (azsu[]) dtub.C(null, azsuVarArr2, new azsu[0]);
        } else {
            azsuVarArr = new azsu[]{j()};
        }
        dtsr.dz(length, azsuVarArr, new emyl() { // from class: bciv
            @Override // defpackage.emyl
            public final Object get() {
                return "my_identity_token_foreign_key:".concat(String.valueOf(bciw.this.getString(1)));
            }
        });
        String[] strArr5 = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, bcjh.a))), new String[0]) : new String[]{q()} : null;
        dtsr.dz(length, strArr5, new emyl() { // from class: bcif
            @Override // defpackage.emyl
            public final Object get() {
                return "normalized_destination:".concat(String.valueOf(bciw.this.getString(2)));
            }
        });
        String[] strArr6 = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, bcjh.a))), new String[0]) : new String[]{r()} : null;
        dtsr.dz(length, strArr6, new emyl() { // from class: bcig
            @Override // defpackage.emyl
            public final Object get() {
                return "send_destination:".concat(String.valueOf(bciw.this.getString(3)));
            }
        });
        String[] strArr7 = di(4) ? z ? (String[]) dtub.C(null, dt(getString(cM(4, bcjh.a))), new String[0]) : new String[]{n()} : null;
        dtsr.dz(length, strArr7, new emyl() { // from class: bcih
            @Override // defpackage.emyl
            public final Object get() {
                return "display_destination:".concat(String.valueOf(bciw.this.getString(4)));
            }
        });
        String[] strArr8 = di(5) ? z ? (String[]) dtub.C(null, dt(getString(cM(5, bcjh.a))), new String[0]) : new String[]{o()} : null;
        dtsr.dz(length, strArr8, new emyl() { // from class: bcii
            @Override // defpackage.emyl
            public final Object get() {
                return "first_name:".concat(String.valueOf(bciw.this.getString(5)));
            }
        });
        String[] strArr9 = di(6) ? z ? (String[]) dtub.C(null, dt(getString(cM(6, bcjh.a))), new String[0]) : new String[]{p()} : null;
        dtsr.dz(length, strArr9, new emyl() { // from class: bcij
            @Override // defpackage.emyl
            public final Object get() {
                return "full_name:".concat(String.valueOf(bciw.this.getString(6)));
            }
        });
        if (!di(7)) {
            i = 0;
            zArr = null;
        } else if (z) {
            i = 0;
            zArr = dtub.D(null, du(getString(cM(7, bcjh.a))));
        } else {
            i = 0;
            zArr = new boolean[]{t()};
        }
        dtsr.dA(length, zArr, new emyl() { // from class: bcik
            @Override // defpackage.emyl
            public final Object get() {
                return "is_self:".concat(String.valueOf(bciw.this.getString(7)));
            }
        });
        if (!di(8)) {
            zArr2 = null;
        } else if (z) {
            zArr2 = dtub.D(null, du(getString(cM(8, bcjh.a))));
        } else {
            boolean[] zArr7 = new boolean[1];
            zArr7[i] = s();
            zArr2 = zArr7;
        }
        dtsr.dA(length, zArr2, new emyl() { // from class: bcil
            @Override // defpackage.emyl
            public final Object get() {
                return "blocked:".concat(String.valueOf(bciw.this.getString(8)));
            }
        });
        if (!di(9)) {
            iArr = null;
        } else if (z) {
            iArr = dtub.z(null, dr(getString(cM(9, bcjh.a))));
        } else {
            iArr = new int[1];
            iArr[i] = h();
        }
        dtsr.dx(length, iArr, new emyl() { // from class: bcim
            @Override // defpackage.emyl
            public final Object get() {
                return "participant_type:".concat(String.valueOf(bciw.this.getString(9)));
            }
        });
        if (!di(10)) {
            jArr = dB;
            zArr3 = null;
        } else if (z) {
            jArr = dB;
            zArr3 = dtub.D(null, du(getString(cM(10, bcjh.a))));
        } else {
            jArr = dB;
            zArr3 = new boolean[1];
            zArr3[i] = u();
        }
        dtsr.dA(length, zArr3, new emyl() { // from class: bcin
            @Override // defpackage.emyl
            public final Object get() {
                return "is_spam:".concat(String.valueOf(bciw.this.getString(10)));
            }
        });
        if (!di(11)) {
            zArr4 = zArr3;
            iArr2 = null;
        } else if (z) {
            zArr4 = zArr3;
            iArr2 = dtub.z(null, dr(getString(cM(11, bcjh.a))));
        } else {
            zArr4 = zArr3;
            iArr2 = new int[1];
            iArr2[i] = g();
        }
        dtsr.dx(length, iArr2, new emyl() { // from class: bcio
            @Override // defpackage.emyl
            public final Object get() {
                return "is_spam_source:".concat(String.valueOf(bciw.this.getString(11)));
            }
        });
        if (!di(12)) {
            iArr3 = iArr2;
            zArr5 = zArr2;
            strArr = null;
        } else if (z) {
            iArr3 = iArr2;
            zArr5 = zArr2;
            strArr = (String[]) dtub.C(null, dt(getString(cM(12, bcjh.a))), new String[i]);
        } else {
            iArr3 = iArr2;
            zArr5 = zArr2;
            strArr = new String[1];
            strArr[i] = m();
        }
        dtsr.dz(length, strArr, new emyl() { // from class: bcip
            @Override // defpackage.emyl
            public final Object get() {
                return "country_code:".concat(String.valueOf(bciw.this.getString(12)));
            }
        });
        int[] z2 = di(13) ? z ? dtub.z(null, dr(getString(cM(13, bcjh.a)))) : new int[]{c()} : null;
        dtsr.dx(length, z2, new emyl() { // from class: bciq
            @Override // defpackage.emyl
            public final Object get() {
                return "color_palette_index:".concat(String.valueOf(bciw.this.getString(13)));
            }
        });
        if (!di(14)) {
            strArr2 = strArr;
            iArr4 = null;
        } else if (z) {
            strArr2 = strArr;
            iArr4 = dtub.z(null, dr(getString(cM(14, bcjh.a))));
        } else {
            strArr2 = strArr;
            iArr4 = new int[]{e()};
        }
        dtsr.dx(length, iArr4, new emyl() { // from class: bcir
            @Override // defpackage.emyl
            public final Object get() {
                return "color_type:".concat(String.valueOf(bciw.this.getString(14)));
            }
        });
        if (!di(15)) {
            iArr5 = iArr4;
            iArr6 = null;
        } else if (z) {
            iArr5 = iArr4;
            iArr6 = dtub.z(null, dr(getString(cM(15, bcjh.a))));
        } else {
            iArr5 = iArr4;
            iArr6 = new int[]{f()};
        }
        dtsr.dx(length, iArr6, new emyl() { // from class: bcis
            @Override // defpackage.emyl
            public final Object get() {
                return "extended_color:".concat(String.valueOf(bciw.this.getString(15)));
            }
        });
        if (!di(16)) {
            iArr7 = iArr6;
            iArr8 = z2;
            strArr3 = null;
        } else if (z) {
            iArr7 = iArr6;
            iArr8 = z2;
            strArr3 = (String[]) dtub.C(null, dt(getString(cM(16, bcjh.a))), new String[0]);
        } else {
            iArr7 = iArr6;
            iArr8 = z2;
            strArr3 = new String[]{l()};
        }
        dtsr.dz(length, strArr3, new emyl() { // from class: bcit
            @Override // defpackage.emyl
            public final Object get() {
                return "cms_id:".concat(String.valueOf(bciw.this.getString(16)));
            }
        });
        if (di(17)) {
            if (z) {
                int[] dr = dr(getString(cM(17, bcjh.a)));
                csgg[] values = csgg.values();
                int length3 = values.length;
                strArr4 = strArr3;
                csgg[] csggVarArr3 = new csgg[dr.length];
                zArr6 = zArr;
                jArr2 = B;
                for (int i4 = 0; i4 < dr.length; i4++) {
                    int i5 = dr[i4];
                    if (i5 >= length3) {
                        throw new IllegalStateException();
                    }
                    csggVarArr3[i4] = values[i5];
                }
                csggVarArr2 = (csgg[]) dtub.C(null, csggVarArr3, new csgg[0]);
            } else {
                strArr4 = strArr3;
                zArr6 = zArr;
                jArr2 = B;
                csggVarArr2 = new csgg[]{k()};
            }
            csggVarArr = csggVarArr2;
        } else {
            strArr4 = strArr3;
            zArr6 = zArr;
            jArr2 = B;
            csggVarArr = null;
        }
        dtsr.dz(length, csggVarArr, new emyl() { // from class: bciu
            @Override // defpackage.emyl
            public final Object get() {
                return "cms_life_cycle:".concat(String.valueOf(bciw.this.getString(17)));
            }
        });
        engr engrVar2 = new engr();
        int i6 = 0;
        while (i6 < length) {
            long j = jArr[i6];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                engrVar = engrVar2;
            } else {
                hashSet.add(Long.valueOf(jArr[i6]));
                String[] strArr10 = bcjh.a;
                bcgp bcgpVar = new bcgp();
                bcgpVar.aF();
                bcgpVar.aD();
                long j2 = jArr[i6];
                if (jArr2 != null) {
                    long j3 = jArr2[i6];
                    bcgpVar.aE(0);
                    bcgpVar.a = j3;
                }
                if (azsuVarArr != null) {
                    azsu azsuVar = azsuVarArr[i6];
                    int i7 = bcgpVar.aB;
                    if (i7 < 110) {
                        dtub.w("my_identity_token_foreign_key", i7);
                    }
                    bcgpVar.aE(1);
                    bcgpVar.b = azsuVar;
                }
                if (strArr5 != null) {
                    String str = strArr5[i6];
                    int i8 = bcgpVar.aB;
                    if (i8 < 0) {
                        dtub.w("normalized_destination", i8);
                    }
                    bcgpVar.aE(2);
                    bcgpVar.c = str;
                }
                if (strArr6 != null) {
                    String str2 = strArr6[i6];
                    int i9 = bcgpVar.aB;
                    if (i9 < 0) {
                        dtub.w("send_destination", i9);
                    }
                    bcgpVar.aE(3);
                    bcgpVar.d = str2;
                }
                if (strArr7 != null) {
                    String str3 = strArr7[i6];
                    int i10 = bcgpVar.aB;
                    if (i10 < 0) {
                        dtub.w("display_destination", i10);
                    }
                    bcgpVar.aE(4);
                    bcgpVar.e = str3;
                }
                if (strArr8 != null) {
                    String str4 = strArr8[i6];
                    int i11 = bcgpVar.aB;
                    if (i11 < 0) {
                        dtub.w("first_name", i11);
                    }
                    bcgpVar.aE(5);
                    bcgpVar.f = str4;
                }
                if (strArr9 != null) {
                    String str5 = strArr9[i6];
                    int i12 = bcgpVar.aB;
                    if (i12 < 0) {
                        dtub.w("full_name", i12);
                    }
                    bcgpVar.aE(6);
                    bcgpVar.g = str5;
                }
                if (zArr6 != null) {
                    boolean z3 = zArr6[i6];
                    int i13 = bcgpVar.aB;
                    if (i13 < 0) {
                        dtub.w("is_self", i13);
                    }
                    bcgpVar.aE(7);
                    bcgpVar.h = z3;
                }
                if (zArr5 != null) {
                    boolean z4 = zArr5[i6];
                    int i14 = bcgpVar.aB;
                    if (i14 < 0) {
                        dtub.w("blocked", i14);
                    }
                    bcgpVar.aE(8);
                    bcgpVar.i = z4;
                }
                if (iArr != null) {
                    int i15 = iArr[i6];
                    int i16 = bcgpVar.aB;
                    if (i16 < 0) {
                        dtub.w("participant_type", i16);
                    }
                    bcgpVar.aE(9);
                    bcgpVar.j = i15;
                }
                if (zArr4 != null) {
                    boolean z5 = zArr4[i6];
                    int i17 = bcgpVar.aB;
                    if (i17 < 0) {
                        dtub.w("is_spam", i17);
                    }
                    bcgpVar.aE(10);
                    bcgpVar.k = z5;
                }
                if (iArr3 != null) {
                    int i18 = iArr3[i6];
                    int i19 = bcgpVar.aB;
                    if (i19 < 0) {
                        dtub.w("is_spam_source", i19);
                    }
                    bcgpVar.aE(11);
                    bcgpVar.l = i18;
                }
                if (strArr2 != null) {
                    String str6 = strArr2[i6];
                    int i20 = bcgpVar.aB;
                    if (i20 < 0) {
                        dtub.w("country_code", i20);
                    }
                    bcgpVar.aE(12);
                    bcgpVar.m = str6;
                }
                if (iArr8 != null) {
                    int i21 = iArr8[i6];
                    int i22 = bcgpVar.aB;
                    if (i22 < 0) {
                        dtub.w("color_palette_index", i22);
                    }
                    bcgpVar.aE(13);
                    bcgpVar.n = i21;
                }
                if (iArr5 != null) {
                    int i23 = iArr5[i6];
                    int i24 = bcgpVar.aB;
                    if (i24 < 0) {
                        dtub.w("color_type", i24);
                    }
                    bcgpVar.aE(14);
                    bcgpVar.o = i23;
                }
                if (iArr7 != null) {
                    int i25 = iArr7[i6];
                    int i26 = bcgpVar.aB;
                    if (i26 < 0) {
                        dtub.w("extended_color", i26);
                    }
                    bcgpVar.aE(15);
                    bcgpVar.p = i25;
                }
                if (strArr4 != null) {
                    String str7 = strArr4[i6];
                    int i27 = bcgpVar.aB;
                    if (i27 < 0) {
                        dtub.w("cms_id", i27);
                    }
                    bcgpVar.aE(16);
                    bcgpVar.q = str7;
                }
                if (csggVarArr != null) {
                    csgg csggVar = csggVarArr[i6];
                    int i28 = bcgpVar.aB;
                    if (i28 < 0) {
                        dtub.w("cms_life_cycle", i28);
                    }
                    bcgpVar.aE(17);
                    bcgpVar.r = csggVar;
                }
                bcgn bcgnVar = new bcgn();
                bcgnVar.aC(bcgpVar.aB());
                engrVar = engrVar2;
                bcgnVar.a = bcgpVar.a;
                bcgnVar.b = bcgpVar.b;
                bcgnVar.c = bcgpVar.c;
                bcgnVar.d = bcgpVar.d;
                bcgnVar.e = bcgpVar.e;
                bcgnVar.f = bcgpVar.f;
                bcgnVar.g = bcgpVar.g;
                bcgnVar.h = bcgpVar.h;
                bcgnVar.i = bcgpVar.i;
                bcgnVar.j = bcgpVar.j;
                bcgnVar.k = bcgpVar.k;
                bcgnVar.l = bcgpVar.l;
                bcgnVar.m = bcgpVar.m;
                bcgnVar.n = bcgpVar.n;
                bcgnVar.o = bcgpVar.o;
                bcgnVar.p = bcgpVar.p;
                bcgnVar.q = bcgpVar.q;
                bcgnVar.r = bcgpVar.r;
                bcgnVar.cK = bcgpVar.aC();
                engrVar.h(bcgnVar);
            }
            i6++;
            engrVar2 = engrVar;
        }
        return engrVar2.g();
    }

    public final int g() {
        return getInt(cM(11, bcjh.a));
    }

    public final int h() {
        return getInt(cM(9, bcjh.a));
    }

    public final long i() {
        return getLong(cM(0, bcjh.a));
    }

    public final azsu j() {
        return azsv.a(getString(cM(1, bcjh.a)));
    }

    public final csgg k() {
        csgg[] values = csgg.values();
        int i = getInt(cM(17, bcjh.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String l() {
        return getString(cM(16, bcjh.a));
    }

    public final String m() {
        return getString(cM(12, bcjh.a));
    }

    public final String n() {
        return getString(cM(4, bcjh.a));
    }

    public final String o() {
        return getString(cM(5, bcjh.a));
    }

    public final String p() {
        return getString(cM(6, bcjh.a));
    }

    public final String q() {
        return getString(cM(2, bcjh.a));
    }

    public final String r() {
        return getString(cM(3, bcjh.a));
    }

    public final boolean s() {
        return getInt(cM(8, bcjh.a)) == 1;
    }

    public final boolean t() {
        return getInt(cM(7, bcjh.a)) == 1;
    }

    public final boolean u() {
        return getInt(cM(10, bcjh.a)) == 1;
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
