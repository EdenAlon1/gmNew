package defpackage;

import android.database.Cursor;
import android.net.Uri;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqzj extends dtsr implements bqyp {
    @Deprecated
    public bqzj(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bqzq bqzqVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bqzv.a, dtyoVar, dtvsVar, bqzqVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bqwy();
    }

    @Override // defpackage.bqyp
    public final long c() {
        return getLong(cM(1, bqzv.a));
    }

    @Override // defpackage.bqyp
    public final Uri e() {
        String string = getString(cM(7, bqzv.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.bqyp
    public final String f() {
        return getString(cM(4, bqzv.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        Uri[] uriArr;
        long[] jArr;
        Uri[] uriArr2;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        Uri[] uriArr3;
        Instant[] instantArr;
        Instant[] instantArr2;
        String[] strArr4;
        String[] strArr5;
        long[] jArr2;
        long[] jArr3;
        String[] strArr6;
        String[] strArr7;
        String[] strArr8;
        String[] strArr9;
        String[] strArr10;
        int i;
        int i2;
        long[] jArr4;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            int i3 = 0;
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bqzv.a)))) : new long[]{j()} : null;
                dtsr.dy(length, B, new emyl() { // from class: bqyq
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "cp2_id:".concat(String.valueOf(bqzj.this.getString(0)));
                    }
                });
                long[] B2 = di(1) ? z ? dtub.B(null, ds(getString(cM(1, bqzv.a)))) : new long[]{c()} : null;
                dtsr.dy(length, B2, new emyl() { // from class: bqyr
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "contact_id:".concat(String.valueOf(bqzj.this.getString(1)));
                    }
                });
                String[] strArr11 = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, bqzv.a))), new String[0]) : new String[]{g()} : null;
                dtsr.dz(length, strArr11, new emyl() { // from class: bqys
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "lookup_key:".concat(String.valueOf(bqzj.this.getString(2)));
                    }
                });
                String[] strArr12 = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, bqzv.a))), new String[0]) : new String[]{t()} : null;
                dtsr.dz(length, strArr12, new emyl() { // from class: bqyt
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "phone_number:".concat(String.valueOf(bqzj.this.getString(3)));
                    }
                });
                String[] strArr13 = di(4) ? z ? (String[]) dtub.C(null, dt(getString(cM(4, bqzv.a))), new String[0]) : new String[]{f()} : null;
                dtsr.dz(length, strArr13, new emyl() { // from class: bqyu
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "display_name:".concat(String.valueOf(bqzj.this.getString(4)));
                    }
                });
                String[] strArr14 = di(5) ? z ? (String[]) dtub.C(null, dt(getString(cM(5, bqzv.a))), new String[0]) : new String[]{s()} : null;
                dtsr.dz(length, strArr14, new emyl() { // from class: bqyv
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "given_name:".concat(String.valueOf(bqzj.this.getString(5)));
                    }
                });
                String[] strArr15 = di(6) ? z ? (String[]) dtub.C(null, dt(getString(cM(6, bqzv.a))), new String[0]) : new String[]{r()} : null;
                dtsr.dz(length, strArr15, new emyl() { // from class: bqyw
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "family_name:".concat(String.valueOf(bqzj.this.getString(6)));
                    }
                });
                if (!di(7)) {
                    uriArr = null;
                } else if (z) {
                    String[] dt = dt(getString(cM(7, bqzv.a)));
                    int length2 = dt.length;
                    Uri[] uriArr4 = new Uri[length2];
                    int i4 = 0;
                    while (i3 < length2) {
                        String str = dt[i3];
                        int i5 = i4 + 1;
                        uriArr4[i4] = (str == null || str.length() == 0) ? null : Uri.parse(str);
                        i3++;
                        i4 = i5;
                    }
                    uriArr = (Uri[]) dtub.C(null, uriArr4, new Uri[0]);
                } else {
                    uriArr = new Uri[]{e()};
                }
                dtsr.dz(length, uriArr, new emyl() { // from class: bqyx
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "photo:".concat(String.valueOf(bqzj.this.getString(7)));
                    }
                });
                if (!di(8)) {
                    jArr = dB;
                    uriArr2 = null;
                } else if (z) {
                    String[] dt2 = dt(getString(cM(8, bqzv.a)));
                    int length3 = dt2.length;
                    Uri[] uriArr5 = new Uri[length3];
                    jArr = dB;
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < length3) {
                        String str2 = dt2[i6];
                        int i8 = i7 + 1;
                        uriArr5[i7] = (str2 == null || str2.length() == 0) ? null : Uri.parse(str2);
                        i6++;
                        i7 = i8;
                    }
                    uriArr2 = (Uri[]) dtub.C(null, uriArr5, new Uri[0]);
                } else {
                    jArr = dB;
                    uriArr2 = new Uri[]{l()};
                }
                dtsr.dz(length, uriArr2, new emyl() { // from class: bqyy
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "thumbnail:".concat(String.valueOf(bqzj.this.getString(8)));
                    }
                });
                String[] strArr16 = di(9) ? z ? (String[]) dtub.C(null, dt(getString(cM(9, bqzv.a))), new String[0]) : new String[]{o()} : null;
                dtsr.dz(length, strArr16, new emyl() { // from class: bqyz
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "birthday:".concat(String.valueOf(bqzj.this.getString(9)));
                    }
                });
                if (!di(10)) {
                    strArr = strArr16;
                    strArr2 = null;
                } else if (z) {
                    strArr = strArr16;
                    strArr2 = (String[]) dtub.C(null, dt(getString(cM(10, bqzv.a))), new String[0]);
                } else {
                    strArr = strArr16;
                    strArr2 = new String[]{n()};
                }
                dtsr.dz(length, strArr2, new emyl() { // from class: bqza
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "anniversary:".concat(String.valueOf(bqzj.this.getString(10)));
                    }
                });
                if (!di(11)) {
                    strArr3 = strArr2;
                    uriArr3 = uriArr2;
                    instantArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(11, bqzv.a)));
                    int length4 = ds.length;
                    strArr3 = strArr2;
                    Instant[] instantArr3 = new Instant[length4];
                    uriArr3 = uriArr2;
                    for (int i9 = 0; i9 < length4; i9++) {
                        instantArr3[i9] = bdgw.b(ds[i9]);
                    }
                    instantArr = (Instant[]) dtub.C(null, instantArr3, new Instant[0]);
                } else {
                    strArr3 = strArr2;
                    uriArr3 = uriArr2;
                    instantArr = new Instant[]{m()};
                }
                dtsr.dz(length, instantArr, new emyl() { // from class: bqzb
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "last_updated_timestamp:".concat(String.valueOf(bqzj.this.getString(11)));
                    }
                });
                String[] strArr17 = di(12) ? z ? (String[]) dtub.C(null, dt(getString(cM(12, bqzv.a))), new String[0]) : new String[]{u()} : null;
                dtsr.dz(length, strArr17, new emyl() { // from class: bqzc
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "sort_key:".concat(String.valueOf(bqzj.this.getString(12)));
                    }
                });
                if (!di(13)) {
                    instantArr2 = instantArr;
                    strArr4 = null;
                } else if (z) {
                    instantArr2 = instantArr;
                    strArr4 = (String[]) dtub.C(null, dt(getString(cM(13, bqzv.a))), new String[0]);
                } else {
                    instantArr2 = instantArr;
                    strArr4 = new String[]{h()};
                }
                dtsr.dz(length, strArr4, new emyl() { // from class: bqzd
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "phonebook_label:".concat(String.valueOf(bqzj.this.getString(13)));
                    }
                });
                long[] B3 = di(14) ? z ? dtub.B(null, ds(getString(cM(14, bqzv.a)))) : new long[]{k()} : null;
                dtsr.dy(length, B3, new emyl() { // from class: bqze
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "phonebook_bucket:".concat(String.valueOf(bqzj.this.getString(14)));
                    }
                });
                if (!di(15)) {
                    strArr5 = strArr4;
                    jArr2 = null;
                } else if (z) {
                    strArr5 = strArr4;
                    jArr2 = dtub.B(null, ds(getString(cM(15, bqzv.a))));
                } else {
                    strArr5 = strArr4;
                    jArr2 = new long[]{i()};
                }
                dtsr.dy(length, jArr2, new emyl() { // from class: bqzf
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "contact_type:".concat(String.valueOf(bqzj.this.getString(15)));
                    }
                });
                if (!di(16)) {
                    jArr3 = jArr2;
                    strArr6 = strArr17;
                    strArr7 = null;
                } else if (z) {
                    jArr3 = jArr2;
                    strArr6 = strArr17;
                    strArr7 = (String[]) dtub.C(null, dt(getString(cM(16, bqzv.a))), new String[0]);
                } else {
                    jArr3 = jArr2;
                    strArr6 = strArr17;
                    strArr7 = new String[]{v()};
                }
                dtsr.dz(length, strArr7, new emyl() { // from class: bqzg
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "type_label:".concat(String.valueOf(bqzj.this.getString(16)));
                    }
                });
                if (!di(17)) {
                    strArr8 = strArr7;
                    strArr9 = null;
                } else if (z) {
                    strArr8 = strArr7;
                    strArr9 = (String[]) dtub.C(null, dt(getString(cM(17, bqzv.a))), new String[0]);
                } else {
                    strArr8 = strArr7;
                    strArr9 = new String[]{q()};
                }
                dtsr.dz(length, strArr9, new emyl() { // from class: bqzh
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "display_destination:".concat(String.valueOf(bqzj.this.getString(17)));
                    }
                });
                if (!di(18)) {
                    strArr10 = null;
                    i = 0;
                } else if (z) {
                    i = 0;
                    strArr10 = (String[]) dtub.C(null, dt(getString(cM(18, bqzv.a))), new String[0]);
                } else {
                    i = 0;
                    strArr10 = new String[]{p()};
                }
                dtsr.dz(length, strArr10, new emyl() { // from class: bqzi
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "contact_fingerprint:".concat(String.valueOf(bqzj.this.getString(18)));
                    }
                });
                engr engrVar = new engr();
                int i10 = i;
                while (i10 < length) {
                    try {
                        long j = jArr[i10];
                        if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                            hashSet.add(Long.valueOf(jArr[i10]));
                            String[] strArr18 = bqzv.a;
                            bqxa bqxaVar = new bqxa();
                            bqxaVar.aF();
                            bqxaVar.aD();
                            long j2 = jArr[i10];
                            if (B != null) {
                                i2 = length;
                                jArr4 = B3;
                                bqxaVar.g(B[i10]);
                            } else {
                                i2 = length;
                                jArr4 = B3;
                            }
                            if (B2 != null) {
                                bqxaVar.e(B2[i10]);
                            }
                            if (strArr11 != null) {
                                bqxaVar.m(strArr11[i10]);
                            }
                            if (strArr12 != null) {
                                bqxaVar.n(strArr12[i10]);
                            }
                            if (strArr13 != null) {
                                bqxaVar.i(strArr13[i10]);
                            }
                            if (strArr14 != null) {
                                bqxaVar.k(strArr14[i10]);
                            }
                            if (strArr15 != null) {
                                bqxaVar.j(strArr15[i10]);
                            }
                            if (uriArr != null) {
                                bqxaVar.q(uriArr[i10]);
                            }
                            if (uriArr3 != null) {
                                bqxaVar.s(uriArr3[i10]);
                            }
                            if (strArr != null) {
                                bqxaVar.c(strArr[i10]);
                            }
                            if (strArr3 != null) {
                                bqxaVar.b(strArr3[i10]);
                            }
                            if (instantArr2 != null) {
                                bqxaVar.l(instantArr2[i10]);
                            }
                            if (strArr6 != null) {
                                bqxaVar.r(strArr6[i10]);
                            }
                            if (strArr5 != null) {
                                bqxaVar.p(strArr5[i10]);
                            }
                            if (jArr4 != null) {
                                bqxaVar.o(jArr4[i10]);
                            }
                            if (jArr3 != null) {
                                bqxaVar.f(jArr3[i10]);
                            }
                            if (strArr8 != null) {
                                bqxaVar.t(strArr8[i10]);
                            }
                            if (strArr9 != null) {
                                bqxaVar.h(strArr9[i10]);
                            }
                            if (strArr10 != null) {
                                bqxaVar.d(strArr10[i10]);
                            }
                            engrVar.h(bqxaVar.a());
                            i10++;
                            length = i2;
                            B3 = jArr4;
                        }
                        i2 = length;
                        jArr4 = B3;
                        i10++;
                        length = i2;
                        B3 = jArr4;
                    } catch (dtqp unused) {
                    }
                }
                return engrVar.g();
            }
        }
        int i11 = engw.d;
        return enou.a;
    }

    @Override // defpackage.bqyp
    public final String g() {
        return getString(cM(2, bqzv.a));
    }

    @Override // defpackage.bqyp
    public final String h() {
        return getString(cM(13, bqzv.a));
    }

    public final long i() {
        return getLong(cM(15, bqzv.a));
    }

    public final long j() {
        return getLong(cM(0, bqzv.a));
    }

    public final long k() {
        return getLong(cM(14, bqzv.a));
    }

    public final Uri l() {
        String string = getString(cM(8, bqzv.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Instant m() {
        return bdgw.b(getLong(cM(11, bqzv.a)));
    }

    public final String n() {
        return getString(cM(10, bqzv.a));
    }

    public final String o() {
        return getString(cM(9, bqzv.a));
    }

    public final String p() {
        return getString(cM(18, bqzv.a));
    }

    public final String q() {
        return getString(cM(17, bqzv.a));
    }

    public final String r() {
        return getString(cM(6, bqzv.a));
    }

    public final String s() {
        return getString(cM(5, bqzv.a));
    }

    public final String t() {
        return getString(cM(3, bqzv.a));
    }

    public final String u() {
        return getString(cM(12, bqzv.a));
    }

    public final String v() {
        return getString(cM(16, bqzv.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
