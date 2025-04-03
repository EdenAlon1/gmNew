package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqsy extends dtsr implements bqsq {
    @Deprecated
    public bqsy(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bqtd bqtdVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bqth.a, dtyoVar, dtvsVar, bqtdVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bqrx();
    }

    public final long c() {
        return getLong(cM(1, bqth.a));
    }

    public final long e() {
        return getLong(cM(0, bqth.a));
    }

    public final long f() {
        return getLong(cM(6, bqth.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        eshn[] eshnVarArr;
        long[] jArr;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length == 0 || (length == 1 && dB[0] == -1)) {
            int i = engw.d;
            return enou.a;
        }
        HashSet hashSet = new HashSet();
        dtvs dtvsVar = this.d;
        boolean di = di(0);
        boolean z = dtvsVar.b;
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bqth.a)))) : new long[]{e()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bqsr
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bqsy.this.getString(0)));
            }
        });
        long[] B2 = di(1) ? z ? dtub.B(null, ds(getString(cM(1, bqth.a)))) : new long[]{c()} : null;
        dtsr.dy(length, B2, new emyl() { // from class: bqss
            @Override // defpackage.emyl
            public final Object get() {
                return "dependent_id:".concat(String.valueOf(bqsy.this.getString(1)));
            }
        });
        String[] strArr = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, bqth.a))), new String[0]) : new String[]{i()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: bqst
            @Override // defpackage.emyl
            public final Object get() {
                return "dependent_cms_id:".concat(String.valueOf(bqsy.this.getString(2)));
            }
        });
        String[] strArr2 = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, bqth.a))), new String[0]) : new String[]{h()} : null;
        dtsr.dz(length, strArr2, new emyl() { // from class: bqsu
            @Override // defpackage.emyl
            public final Object get() {
                return "dependency_cms_id:".concat(String.valueOf(bqsy.this.getString(3)));
            }
        });
        if (!di(4)) {
            eshnVarArr = null;
        } else if (z) {
            int[] dr = dr(getString(cM(4, bqth.a)));
            eshn[] eshnVarArr2 = new eshn[dr.length];
            for (int i2 = 0; i2 < dr.length; i2++) {
                eshn b = eshn.b(dr[i2]);
                if (b == null) {
                    throw new IllegalStateException();
                }
                eshnVarArr2[i2] = b;
            }
            eshnVarArr = (eshn[]) dtub.C(null, eshnVarArr2, new eshn[0]);
        } else {
            eshnVarArr = new eshn[]{g()};
        }
        dtsr.dz(length, eshnVarArr, new emyl() { // from class: bqsv
            @Override // defpackage.emyl
            public final Object get() {
                return "cms_data_provider_type:".concat(String.valueOf(bqsy.this.getString(4)));
            }
        });
        byte[][] E = di(5) ? z ? dtub.E(null, dC(getString(cM(5, bqth.a)))) : new byte[][]{j()} : null;
        dtsr.dz(length, E, new emyl() { // from class: bqsw
            @Override // defpackage.emyl
            public final Object get() {
                return "payload:".concat(String.valueOf(bqsy.this.getString(5)));
            }
        });
        long[] B3 = di(6) ? z ? dtub.B(null, ds(getString(cM(6, bqth.a)))) : new long[]{f()} : null;
        dtsr.dy(length, B3, new emyl() { // from class: bqsx
            @Override // defpackage.emyl
            public final Object get() {
                return "inserted_at_timestamp:".concat(String.valueOf(bqsy.this.getString(6)));
            }
        });
        engr engrVar = new engr();
        int i3 = 0;
        while (i3 < length) {
            long j = dB[i3];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                jArr = dB;
            } else {
                hashSet.add(Long.valueOf(dB[i3]));
                String[] strArr3 = bqth.a;
                bqrz bqrzVar = new bqrz();
                bqrzVar.aF();
                bqrzVar.aD();
                long j2 = dB[i3];
                jArr = dB;
                if (B != null) {
                    long j3 = B[i3];
                    bqrzVar.aE(0);
                    bqrzVar.a = j3;
                }
                if (B2 != null) {
                    bqrzVar.e(B2[i3]);
                }
                if (strArr != null) {
                    bqrzVar.d(strArr[i3]);
                }
                if (strArr2 != null) {
                    bqrzVar.c(strArr2[i3]);
                }
                if (eshnVarArr != null) {
                    bqrzVar.b(eshnVarArr[i3]);
                }
                if (E != null) {
                    bqrzVar.g(E[i3]);
                }
                if (B3 != null) {
                    bqrzVar.f(B3[i3]);
                }
                engrVar.h(bqrzVar.a());
            }
            i3++;
            dB = jArr;
        }
        return engrVar.g();
    }

    public final eshn g() {
        return eshn.b(getInt(cM(4, bqth.a)));
    }

    public final String h() {
        return getString(cM(3, bqth.a));
    }

    public final String i() {
        return getString(cM(2, bqth.a));
    }

    public final byte[] j() {
        return getBlob(cM(5, bqth.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
