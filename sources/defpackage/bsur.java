package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsur extends dtsr implements bstt {
    @Deprecated
    public bsur(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bsux bsuxVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bsve.a, dtyoVar, dtvsVar, bsuxVar);
    }

    public final byte[] A() {
        return getBlob(cM(19, bsve.a));
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bsru();
    }

    @Override // defpackage.bstt
    public final long c() {
        return getLong(cM(22, bsve.a));
    }

    @Override // defpackage.bstt
    public final long e() {
        return getLong(cM(2, bsve.a));
    }

    @Override // defpackage.bstt
    public final long f() {
        return getLong(cM(3, bsve.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        int i;
        byte[][] bArr;
        long[] jArr;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        byte[][] bArr2;
        byte[][] bArr3;
        int[] iArr;
        byte[][] bArr4;
        boolean z;
        long[] jArr2;
        byzk[] byzkVarArr;
        byzk[] byzkVarArr2;
        boolean[] zArr;
        String[] strArr5;
        boolean[] zArr2;
        byyv[] byyvVarArr;
        byyv[] byyvVarArr2;
        byzd[] byzdVarArr;
        int i2;
        byte[][] bArr5;
        byzd[] byzdVarArr2;
        int i3;
        String[] strArr6;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length == 0 || (length == 1 && dB[0] == -1)) {
            int i4 = engw.d;
            return enou.a;
        }
        HashSet hashSet = new HashSet();
        dtvs dtvsVar = this.d;
        boolean di = di(0);
        boolean z2 = dtvsVar.b;
        long[] B = di ? z2 ? dtub.B(null, ds(getString(cM(0, bsve.a)))) : new long[]{q()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bstu
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bsur.this.getString(0)));
            }
        });
        String[] strArr7 = di(1) ? z2 ? (String[]) dtub.C(null, dt(getString(cM(1, bsve.a))), new String[0]) : new String[]{i()} : null;
        dtsr.dz(length, strArr7, new emyl() { // from class: bstw
            @Override // defpackage.emyl
            public final Object get() {
                return "desktop_id:".concat(String.valueOf(bsur.this.getString(1)));
            }
        });
        long[] B2 = di(2) ? z2 ? dtub.B(null, ds(getString(cM(2, bsve.a)))) : new long[]{e()} : null;
        dtsr.dy(length, B2, new emyl() { // from class: bsua
            @Override // defpackage.emyl
            public final Object get() {
                return "last_connection_time:".concat(String.valueOf(bsur.this.getString(2)));
            }
        });
        long[] B3 = di(3) ? z2 ? dtub.B(null, ds(getString(cM(3, bsve.a)))) : new long[]{f()} : null;
        dtsr.dy(length, B3, new emyl() { // from class: bsub
            @Override // defpackage.emyl
            public final Object get() {
                return "last_wakeup_time:".concat(String.valueOf(bsur.this.getString(3)));
            }
        });
        long[] B4 = di(4) ? z2 ? dtub.B(null, ds(getString(cM(4, bsve.a)))) : new long[]{r()} : null;
        dtsr.dy(length, B4, new emyl() { // from class: bsuc
            @Override // defpackage.emyl
            public final Object get() {
                return "wakeup_attempts_count:".concat(String.valueOf(bsur.this.getString(4)));
            }
        });
        String[] strArr8 = di(5) ? z2 ? (String[]) dtub.C(null, dt(getString(cM(5, bsve.a))), new String[0]) : new String[]{u()} : null;
        dtsr.dz(length, strArr8, new emyl() { // from class: bsud
            @Override // defpackage.emyl
            public final Object get() {
                return "fingerprint:".concat(String.valueOf(bsur.this.getString(5)));
            }
        });
        boolean[] D = di(6) ? z2 ? dtub.D(null, du(getString(cM(6, bsve.a)))) : new boolean[]{x()} : null;
        dtsr.dA(length, D, new emyl() { // from class: bsue
            @Override // defpackage.emyl
            public final Object get() {
                return "force_refresh:".concat(String.valueOf(bsur.this.getString(6)));
            }
        });
        if (!di(7)) {
            i = 0;
            bArr = null;
        } else if (z2) {
            i = 0;
            bArr = dtub.E(null, dC(getString(cM(7, bsve.a))));
        } else {
            i = 0;
            bArr = new byte[][]{z()};
        }
        dtsr.dz(length, bArr, new emyl() { // from class: bsug
            @Override // defpackage.emyl
            public final Object get() {
                return "client_info:".concat(String.valueOf(bsur.this.getString(7)));
            }
        });
        if (!di(8)) {
            jArr = dB;
            strArr = null;
        } else if (z2) {
            jArr = dB;
            strArr = (String[]) dtub.C(null, dt(getString(cM(8, bsve.a))), new String[i]);
        } else {
            jArr = dB;
            String[] strArr9 = new String[1];
            strArr9[i] = v();
            strArr = strArr9;
        }
        dtsr.dz(length, strArr, new emyl() { // from class: bsuh
            @Override // defpackage.emyl
            public final Object get() {
                return "operating_system:".concat(String.valueOf(bsur.this.getString(8)));
            }
        });
        if (!di(9)) {
            strArr2 = strArr;
            strArr3 = null;
        } else if (z2) {
            strArr2 = strArr;
            strArr3 = (String[]) dtub.C(null, dt(getString(cM(9, bsve.a))), new String[0]);
        } else {
            strArr2 = strArr;
            strArr3 = new String[]{w()};
        }
        dtsr.dz(length, strArr3, new emyl() { // from class: bsui
            @Override // defpackage.emyl
            public final Object get() {
                return "operating_system_version:".concat(String.valueOf(bsur.this.getString(9)));
            }
        });
        int[] z3 = di(10) ? z2 ? dtub.z(null, dr(getString(cM(10, bsve.a)))) : new int[]{o()} : null;
        dtsr.dx(length, z3, new emyl() { // from class: bsuf
            @Override // defpackage.emyl
            public final Object get() {
                return "browser_type:".concat(String.valueOf(bsur.this.getString(10)));
            }
        });
        byte[][] E = di(11) ? z2 ? dtub.E(null, dC(getString(cM(11, bsve.a)))) : new byte[][]{m()} : null;
        dtsr.dz(length, E, new emyl() { // from class: bsuj
            @Override // defpackage.emyl
            public final Object get() {
                return "encryption_key:".concat(String.valueOf(bsur.this.getString(11)));
            }
        });
        if (!di(12)) {
            strArr4 = strArr3;
            bArr2 = null;
        } else if (z2) {
            strArr4 = strArr3;
            bArr2 = dtub.E(null, dC(getString(cM(12, bsve.a))));
        } else {
            strArr4 = strArr3;
            bArr2 = new byte[][]{n()};
        }
        dtsr.dz(length, bArr2, new emyl() { // from class: bsuk
            @Override // defpackage.emyl
            public final Object get() {
                return "hmac_key:".concat(String.valueOf(bsur.this.getString(12)));
            }
        });
        if (!di(13)) {
            bArr3 = bArr2;
            iArr = z3;
            bArr4 = bArr;
            z = z2;
            jArr2 = B;
            byzkVarArr = null;
        } else if (z2) {
            bArr3 = bArr2;
            int[] dr = dr(getString(cM(13, bsve.a)));
            byzk[] values = byzk.values();
            iArr = z3;
            int length2 = values.length;
            bArr4 = bArr;
            byzk[] byzkVarArr3 = new byzk[dr.length];
            z = z2;
            jArr2 = B;
            for (int i5 = 0; i5 < dr.length; i5++) {
                int i6 = dr[i5];
                if (i6 >= length2) {
                    throw new IllegalStateException();
                }
                byzkVarArr3[i5] = values[i6];
            }
            byzkVarArr = (byzk[]) dtub.C(null, byzkVarArr3, new byzk[0]);
        } else {
            bArr3 = bArr2;
            iArr = z3;
            bArr4 = bArr;
            z = z2;
            jArr2 = B;
            byzkVarArr = new byzk[]{t()};
        }
        dtsr.dz(length, byzkVarArr, new emyl() { // from class: bsul
            @Override // defpackage.emyl
            public final Object get() {
                return "backend_type:".concat(String.valueOf(bsur.this.getString(13)));
            }
        });
        boolean[] D2 = di(14) ? z ? dtub.D(null, du(getString(cM(14, bsve.a)))) : new boolean[]{y()} : null;
        dtsr.dA(length, D2, new emyl() { // from class: bsum
            @Override // defpackage.emyl
            public final Object get() {
                return "is_active:".concat(String.valueOf(bsur.this.getString(14)));
            }
        });
        String[] strArr10 = di(15) ? z ? (String[]) dtub.C(null, dt(getString(cM(15, bsve.a))), new String[0]) : new String[]{k()} : null;
        dtsr.dz(length, strArr10, new emyl() { // from class: bsun
            @Override // defpackage.emyl
            public final Object get() {
                return "request_id:".concat(String.valueOf(bsur.this.getString(15)));
            }
        });
        boolean[] D3 = di(16) ? z ? dtub.D(null, du(getString(cM(16, bsve.a)))) : new boolean[]{l()} : null;
        dtsr.dA(length, D3, new emyl() { // from class: bsuo
            @Override // defpackage.emyl
            public final Object get() {
                return "is_persistent:".concat(String.valueOf(bsur.this.getString(16)));
            }
        });
        if (!di(17)) {
            byzkVarArr2 = byzkVarArr;
            zArr = D2;
            strArr5 = strArr10;
            zArr2 = D3;
            byyvVarArr = null;
        } else if (z) {
            int[] dr2 = dr(getString(cM(17, bsve.a)));
            byyv[] values2 = byyv.values();
            byzkVarArr2 = byzkVarArr;
            int length3 = values2.length;
            zArr = D2;
            byyv[] byyvVarArr3 = new byyv[dr2.length];
            strArr5 = strArr10;
            zArr2 = D3;
            for (int i7 = 0; i7 < dr2.length; i7++) {
                int i8 = dr2[i7];
                if (i8 >= length3) {
                    throw new IllegalStateException();
                }
                byyvVarArr3[i7] = values2[i8];
            }
            byyvVarArr = (byyv[]) dtub.C(null, byyvVarArr3, new byyv[0]);
        } else {
            byzkVarArr2 = byzkVarArr;
            zArr = D2;
            strArr5 = strArr10;
            zArr2 = D3;
            byyvVarArr = new byyv[]{g()};
        }
        dtsr.dz(length, byyvVarArr, new emyl() { // from class: bsup
            @Override // defpackage.emyl
            public final Object get() {
                return "desktop_type:".concat(String.valueOf(bsur.this.getString(17)));
            }
        });
        if (!di(18)) {
            byyvVarArr2 = byyvVarArr;
            byzdVarArr = null;
        } else if (z) {
            int[] dr3 = dr(getString(cM(18, bsve.a)));
            byzd[] values3 = byzd.values();
            int length4 = values3.length;
            byzd[] byzdVarArr3 = new byzd[dr3.length];
            byyvVarArr2 = byyvVarArr;
            for (int i9 = 0; i9 < dr3.length; i9++) {
                int i10 = dr3[i9];
                if (i10 >= length4) {
                    throw new IllegalStateException();
                }
                byzdVarArr3[i9] = values3[i10];
            }
            byzdVarArr = (byzd[]) dtub.C(null, byzdVarArr3, new byzd[0]);
        } else {
            byyvVarArr2 = byyvVarArr;
            byzdVarArr = new byzd[]{s()};
        }
        dtsr.dz(length, byzdVarArr, new emyl() { // from class: bsuq
            @Override // defpackage.emyl
            public final Object get() {
                return "pairing_type:".concat(String.valueOf(bsur.this.getString(18)));
            }
        });
        byte[][] E2 = di(19) ? z ? dtub.E(null, dC(getString(cM(19, bsve.a)))) : new byte[][]{A()} : null;
        dtsr.dz(length, E2, new emyl() { // from class: bstv
            @Override // defpackage.emyl
            public final Object get() {
                return "destination_registration_id:".concat(String.valueOf(bsur.this.getString(19)));
            }
        });
        String[] strArr11 = di(20) ? z ? (String[]) dtub.C(null, dt(getString(cM(20, bsve.a))), new String[0]) : new String[]{j()} : null;
        dtsr.dz(length, strArr11, new emyl() { // from class: bstx
            @Override // defpackage.emyl
            public final Object get() {
                return "gaia_email:".concat(String.valueOf(bsur.this.getString(20)));
            }
        });
        long[] B5 = di(21) ? z ? dtub.B(null, ds(getString(cM(21, bsve.a)))) : new long[]{p()} : null;
        dtsr.dy(length, B5, new emyl() { // from class: bsty
            @Override // defpackage.emyl
            public final Object get() {
                return "creation_time:".concat(String.valueOf(bsur.this.getString(21)));
            }
        });
        long[] B6 = di(22) ? z ? dtub.B(null, ds(getString(cM(22, bsve.a)))) : new long[]{c()} : null;
        dtsr.dy(length, B6, new emyl() { // from class: bstz
            @Override // defpackage.emyl
            public final Object get() {
                return "get_updates_request_time_millis:".concat(String.valueOf(bsur.this.getString(22)));
            }
        });
        engr engrVar = new engr();
        int i11 = 0;
        while (i11 < length) {
            long j = jArr[i11];
            if (j > 0) {
                i2 = i11;
                if (!hashSet.contains(Long.valueOf(j))) {
                    hashSet.add(Long.valueOf(jArr[i2]));
                    String[] strArr12 = bsve.a;
                    bsrw bsrwVar = new bsrw();
                    bsrwVar.aF();
                    bsrwVar.aD();
                    long j2 = jArr[i2];
                    bArr5 = E2;
                    byzdVarArr2 = byzdVarArr;
                    if (jArr2 != null) {
                        long j3 = jArr2[i2];
                        i3 = length;
                        bsrwVar.aE(0);
                        bsrwVar.a = j3;
                    } else {
                        i3 = length;
                    }
                    if (strArr7 != null) {
                        bsrwVar.e(strArr7[i2]);
                    }
                    if (B2 != null) {
                        long j4 = B2[i2];
                        bsrwVar.aE(2);
                        bsrwVar.c = j4;
                    }
                    if (B3 != null) {
                        long j5 = B3[i2];
                        bsrwVar.aE(3);
                        bsrwVar.d = j5;
                    }
                    if (B4 != null) {
                        long j6 = B4[i2];
                        bsrwVar.aE(4);
                        bsrwVar.e = j6;
                    }
                    if (strArr8 != null) {
                        String str = strArr8[i2];
                        bsrwVar.aE(5);
                        bsrwVar.f = str;
                    }
                    if (D != null) {
                        boolean z4 = D[i2];
                        bsrwVar.aE(6);
                        bsrwVar.g = z4;
                    }
                    if (bArr4 != null) {
                        bsrwVar.c(bArr4[i2]);
                    }
                    if (strArr2 != null) {
                        bsrwVar.l(strArr2[i2]);
                    }
                    if (strArr4 != null) {
                        bsrwVar.m(strArr4[i2]);
                    }
                    if (iArr != null) {
                        bsrwVar.b(iArr[i2]);
                    }
                    if (E != null) {
                        bsrwVar.h(E[i2]);
                    }
                    if (bArr3 != null) {
                        bsrwVar.j(bArr3[i2]);
                    }
                    if (byzkVarArr2 != null) {
                        byzk byzkVar = byzkVarArr2[i2];
                        int i12 = bsrwVar.aB;
                        if (i12 < 41010) {
                            dtub.w("backend_type", i12);
                        }
                        bsrwVar.aE(13);
                        bsrwVar.n = byzkVar;
                    }
                    if (zArr != null) {
                        boolean z5 = zArr[i2];
                        int i13 = bsrwVar.aB;
                        if (i13 < 58010) {
                            dtub.w("is_active", i13);
                        }
                        bsrwVar.aE(14);
                        bsrwVar.o = z5;
                    }
                    if (strArr5 != null) {
                        String str2 = strArr5[i2];
                        int i14 = bsrwVar.aB;
                        if (i14 < 58010) {
                            dtub.w("request_id", i14);
                        }
                        bsrwVar.aE(15);
                        bsrwVar.p = str2;
                    }
                    if (zArr2 != null) {
                        bsrwVar.k(zArr2[i2]);
                    }
                    if (byyvVarArr2 != null) {
                        bsrwVar.f(byyvVarArr2[i2]);
                    }
                    if (byzdVarArr2 != null) {
                        bsrwVar.n(byzdVarArr2[i2]);
                    }
                    if (bArr5 != null) {
                        bsrwVar.g(bArr5[i2]);
                    }
                    if (strArr11 != null) {
                        bsrwVar.i(strArr11[i2]);
                    }
                    if (B5 != null) {
                        bsrwVar.d(B5[i2]);
                    }
                    if (B6 != null) {
                        long j7 = B6[i2];
                        int i15 = bsrwVar.aB;
                        strArr6 = strArr11;
                        if (i15 < 60540) {
                            dtub.w("get_updates_request_time_millis", i15);
                        }
                        bsrwVar.aE(22);
                        bsrwVar.w = j7;
                    } else {
                        strArr6 = strArr11;
                    }
                    engrVar.h(bsrwVar.a());
                    i11 = i2 + 1;
                    byzdVarArr = byzdVarArr2;
                    E2 = bArr5;
                    length = i3;
                    strArr11 = strArr6;
                }
            } else {
                i2 = i11;
            }
            bArr5 = E2;
            byzdVarArr2 = byzdVarArr;
            i3 = length;
            strArr6 = strArr11;
            i11 = i2 + 1;
            byzdVarArr = byzdVarArr2;
            E2 = bArr5;
            length = i3;
            strArr11 = strArr6;
        }
        return engrVar.g();
    }

    @Override // defpackage.bstt
    public final byyv g() {
        byyv[] values = byyv.values();
        int i = getInt(cM(17, bsve.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.bstt
    public final engw h() {
        engr engrVar = new engr();
        while (moveToNext()) {
            if (i() != null) {
                engrVar.h(i());
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.bstt
    public final String i() {
        return getString(cM(1, bsve.a));
    }

    @Override // defpackage.bstt
    public final String j() {
        return getString(cM(20, bsve.a));
    }

    @Override // defpackage.bstt
    public final String k() {
        return getString(cM(15, bsve.a));
    }

    @Override // defpackage.bstt
    public final boolean l() {
        return getInt(cM(16, bsve.a)) == 1;
    }

    @Override // defpackage.bstt
    public final byte[] m() {
        return getBlob(cM(11, bsve.a));
    }

    @Override // defpackage.bstt
    public final byte[] n() {
        return getBlob(cM(12, bsve.a));
    }

    public final int o() {
        return getInt(cM(10, bsve.a));
    }

    public final long p() {
        return getLong(cM(21, bsve.a));
    }

    public final long q() {
        return getLong(cM(0, bsve.a));
    }

    public final long r() {
        return getLong(cM(4, bsve.a));
    }

    public final byzd s() {
        byzd[] values = byzd.values();
        int i = getInt(cM(18, bsve.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final byzk t() {
        byzk[] values = byzk.values();
        int i = getInt(cM(13, bsve.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String u() {
        return getString(cM(5, bsve.a));
    }

    public final String v() {
        return getString(cM(8, bsve.a));
    }

    public final String w() {
        return getString(cM(9, bsve.a));
    }

    public final boolean x() {
        return getInt(cM(6, bsve.a)) == 1;
    }

    public final boolean y() {
        return getInt(cM(14, bsve.a)) == 1;
    }

    public final byte[] z() {
        return getBlob(cM(7, bsve.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
