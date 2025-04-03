package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqnz extends dtsr implements bqnr {
    @Deprecated
    public bqnz(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bqog bqogVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bqon.a, dtyoVar, dtvsVar, bqogVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bqmw();
    }

    public final long c() {
        return getLong(cM(4, bqon.a));
    }

    public final long e() {
        return getLong(cM(5, bqon.a));
    }

    public final long f() {
        return getLong(cM(0, bqon.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
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
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bqon.a)))) : new long[]{f()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bqns
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bqnz.this.getString(0)));
            }
        });
        long[] B2 = di(1) ? z ? dtub.B(null, ds(getString(cM(1, bqon.a)))) : new long[]{i()} : null;
        dtsr.dy(length, B2, new emyl() { // from class: bqnt
            @Override // defpackage.emyl
            public final Object get() {
                return "table_type:".concat(String.valueOf(bqnz.this.getString(1)));
            }
        });
        long[] B3 = di(2) ? z ? dtub.B(null, ds(getString(cM(2, bqon.a)))) : new long[]{h()} : null;
        dtsr.dy(length, B3, new emyl() { // from class: bqnu
            @Override // defpackage.emyl
            public final Object get() {
                return "operation:".concat(String.valueOf(bqnz.this.getString(2)));
            }
        });
        String[] strArr = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, bqon.a))), new String[0]) : new String[]{j()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: bqnv
            @Override // defpackage.emyl
            public final Object get() {
                return "bugle_id:".concat(String.valueOf(bqnz.this.getString(3)));
            }
        });
        long[] B4 = di(4) ? z ? dtub.B(null, ds(getString(cM(4, bqon.a)))) : new long[]{c()} : null;
        dtsr.dy(length, B4, new emyl() { // from class: bqnw
            @Override // defpackage.emyl
            public final Object get() {
                return "attempt_count:".concat(String.valueOf(bqnz.this.getString(4)));
            }
        });
        long[] B5 = di(5) ? z ? dtub.B(null, ds(getString(cM(5, bqon.a)))) : new long[]{e()} : null;
        dtsr.dy(length, B5, new emyl() { // from class: bqnx
            @Override // defpackage.emyl
            public final Object get() {
                return "create_timestamp:".concat(String.valueOf(bqnz.this.getString(5)));
            }
        });
        long[] B6 = di(6) ? z ? dtub.B(null, ds(getString(cM(6, bqon.a)))) : new long[]{g()} : null;
        dtsr.dy(length, B6, new emyl() { // from class: bqny
            @Override // defpackage.emyl
            public final Object get() {
                return "last_attempt_timestamp:".concat(String.valueOf(bqnz.this.getString(6)));
            }
        });
        engr engrVar = new engr();
        int i2 = 0;
        while (i2 < length) {
            long j = dB[i2];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                jArr = dB;
            } else {
                hashSet.add(Long.valueOf(dB[i2]));
                String[] strArr2 = bqon.a;
                bqna bqnaVar = new bqna();
                bqnaVar.aF();
                bqnaVar.aD();
                long j2 = dB[i2];
                jArr = dB;
                if (B != null) {
                    long j3 = B[i2];
                    bqnaVar.aE(0);
                    bqnaVar.a = j3;
                }
                if (B2 != null) {
                    bqnaVar.i(B2[i2]);
                }
                if (B3 != null) {
                    bqnaVar.h(B3[i2]);
                }
                if (strArr != null) {
                    bqnaVar.e(strArr[i2]);
                }
                if (B4 != null) {
                    bqnaVar.d(B4[i2]);
                }
                if (B5 != null) {
                    bqnaVar.f(B5[i2]);
                }
                if (B6 != null) {
                    bqnaVar.g(B6[i2]);
                }
                engrVar.h(bqnaVar.a());
            }
            i2++;
            dB = jArr;
        }
        return engrVar.g();
    }

    public final long g() {
        return getLong(cM(6, bqon.a));
    }

    public final long h() {
        return getLong(cM(2, bqon.a));
    }

    public final long i() {
        return getLong(cM(1, bqon.a));
    }

    public final String j() {
        return getString(cM(3, bqon.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
