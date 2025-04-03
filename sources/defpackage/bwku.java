package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwku extends dtsr implements bwkl {
    @Deprecated
    public bwku(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bwkz bwkzVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bwlg.a, dtyoVar, dtvsVar, bwkzVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bwjo();
    }

    public final long c() {
        return getLong(cM(4, bwlg.a));
    }

    public final cjkh e() {
        return cjll.b(getLong(cM(1, bwlg.a)));
    }

    public final cjli f() {
        cjli[] values = cjli.values();
        int i = getInt(cM(5, bwlg.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        cjlk[] cjlkVarArr;
        cjkh[] cjkhVarArr;
        Instant[] instantArr;
        cjli[] cjliVarArr;
        int i;
        byte[][] bArr;
        long[] jArr;
        String[] strArr;
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
        if (!di) {
            cjlkVarArr = null;
        } else if (z) {
            String[] dt = dt(getString(cM(0, bwlg.a)));
            int length2 = dt.length;
            cjlk[] cjlkVarArr2 = new cjlk[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                cjlkVarArr2[i3] = cjlv.a(dt[i3]);
            }
            cjlkVarArr = (cjlk[]) dtub.C(null, cjlkVarArr2, new cjlk[0]);
        } else {
            cjlkVarArr = new cjlk[]{g()};
        }
        dtsr.dz(length, cjlkVarArr, new emyl() { // from class: bwkm
            @Override // defpackage.emyl
            public final Object get() {
                return "work_id:".concat(String.valueOf(bwku.this.getString(0)));
            }
        });
        if (!di(1)) {
            cjkhVarArr = null;
        } else if (z) {
            long[] ds = ds(getString(cM(1, bwlg.a)));
            int length3 = ds.length;
            cjkh[] cjkhVarArr2 = new cjkh[length3];
            for (int i4 = 0; i4 < length3; i4++) {
                cjkhVarArr2[i4] = cjll.b(ds[i4]);
            }
            cjkhVarArr = (cjkh[]) dtub.C(null, cjkhVarArr2, new cjkh[0]);
        } else {
            cjkhVarArr = new cjkh[]{e()};
        }
        dtsr.dz(length, cjkhVarArr, new emyl() { // from class: bwkn
            @Override // defpackage.emyl
            public final Object get() {
                return "pipeline_type:".concat(String.valueOf(bwku.this.getString(1)));
            }
        });
        String[] strArr2 = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, bwlg.a))), new String[0]) : new String[]{j()} : null;
        dtsr.dz(length, strArr2, new emyl() { // from class: bwko
            @Override // defpackage.emyl
            public final Object get() {
                return "sequencing_key:".concat(String.valueOf(bwku.this.getString(2)));
            }
        });
        if (!di(3)) {
            instantArr = null;
        } else if (z) {
            long[] ds2 = ds(getString(cM(3, bwlg.a)));
            int length4 = ds2.length;
            Instant[] instantArr2 = new Instant[length4];
            for (int i5 = 0; i5 < length4; i5++) {
                instantArr2[i5] = bdgw.b(ds2[i5]);
            }
            instantArr = (Instant[]) dtub.C(null, instantArr2, new Instant[0]);
        } else {
            instantArr = new Instant[]{h()};
        }
        dtsr.dz(length, instantArr, new emyl() { // from class: bwkp
            @Override // defpackage.emyl
            public final Object get() {
                return "insertion_timestamp:".concat(String.valueOf(bwku.this.getString(3)));
            }
        });
        long[] B = di(4) ? z ? dtub.B(null, ds(getString(cM(4, bwlg.a)))) : new long[]{c()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bwkq
            @Override // defpackage.emyl
            public final Object get() {
                return "execution_attempt_count:".concat(String.valueOf(bwku.this.getString(4)));
            }
        });
        if (!di(5)) {
            cjliVarArr = null;
        } else if (z) {
            int[] dr = dr(getString(cM(5, bwlg.a)));
            cjli[] values = cjli.values();
            int length5 = values.length;
            cjli[] cjliVarArr2 = new cjli[dr.length];
            for (int i6 = 0; i6 < dr.length; i6++) {
                int i7 = dr[i6];
                if (i7 >= length5) {
                    throw new IllegalStateException();
                }
                cjliVarArr2[i6] = values[i7];
            }
            cjliVarArr = (cjli[]) dtub.C(null, cjliVarArr2, new cjli[0]);
        } else {
            cjliVarArr = new cjli[]{f()};
        }
        dtsr.dz(length, cjliVarArr, new emyl() { // from class: bwkr
            @Override // defpackage.emyl
            public final Object get() {
                return "execution_state:".concat(String.valueOf(bwku.this.getString(5)));
            }
        });
        String[] strArr3 = di(6) ? z ? (String[]) dtub.C(null, dt(getString(cM(6, bwlg.a))), new String[0]) : new String[]{i()} : null;
        dtsr.dz(length, strArr3, new emyl() { // from class: bwks
            @Override // defpackage.emyl
            public final Object get() {
                return "client_supplied_id:".concat(String.valueOf(bwku.this.getString(6)));
            }
        });
        if (!di(7)) {
            i = 0;
            bArr = null;
        } else if (z) {
            bArr = dtub.E(null, dC(getString(cM(7, bwlg.a))));
            i = 0;
        } else {
            i = 0;
            bArr = new byte[][]{k()};
        }
        dtsr.dz(length, bArr, new emyl() { // from class: bwkt
            @Override // defpackage.emyl
            public final Object get() {
                return "payload:".concat(String.valueOf(bwku.this.getString(7)));
            }
        });
        engr engrVar = new engr();
        int i8 = i;
        while (i8 < length) {
            long j = dB[i8];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                jArr = dB;
                strArr = strArr3;
            } else {
                hashSet.add(Long.valueOf(dB[i8]));
                String[] strArr4 = bwlg.a;
                bwjs bwjsVar = new bwjs();
                bwjsVar.aF();
                bwjsVar.aD();
                long j2 = dB[i8];
                if (cjlkVarArr != null) {
                    bwjsVar.h(cjlkVarArr[i8]);
                }
                if (cjkhVarArr != null) {
                    bwjsVar.f(cjkhVarArr[i8]);
                }
                if (strArr2 != null) {
                    bwjsVar.g(strArr2[i8]);
                }
                if (instantArr != null) {
                    bwjsVar.d(instantArr[i8]);
                }
                jArr = dB;
                if (B != null) {
                    long j3 = B[i8];
                    strArr = strArr3;
                    bwjsVar.aE(4);
                    bwjsVar.e = j3;
                } else {
                    strArr = strArr3;
                }
                if (cjliVarArr != null) {
                    bwjsVar.c(cjliVarArr[i8]);
                }
                if (strArr != null) {
                    bwjsVar.b(strArr[i8]);
                }
                if (bArr != null) {
                    bwjsVar.e(bArr[i8]);
                }
                engrVar.h(bwjsVar.a(new Supplier() { // from class: bwjq
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new bwjo();
                    }
                }));
            }
            i8++;
            dB = jArr;
            strArr3 = strArr;
        }
        return engrVar.g();
    }

    public final cjlk g() {
        return cjlv.a(getString(cM(0, bwlg.a)));
    }

    public final Instant h() {
        return bdgw.b(getLong(cM(3, bwlg.a)));
    }

    public final String i() {
        return getString(cM(6, bwlg.a));
    }

    public final String j() {
        return getString(cM(2, bwlg.a));
    }

    public final byte[] k() {
        return getBlob(cM(7, bwlg.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
