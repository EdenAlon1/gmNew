package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqgx extends dtsr implements bqgs {
    @Deprecated
    public bqgx(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bqhc bqhcVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bqhg.a, dtyoVar, dtvsVar, bqhcVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bqgf();
    }

    public final long c() {
        return getLong(cM(2, bqhg.a));
    }

    public final long e() {
        return getLong(cM(1, bqhg.a));
    }

    public final long f() {
        return getLong(cM(0, bqhg.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
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
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bqhg.a)))) : new long[]{f()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bqgt
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bqgx.this.getString(0)));
            }
        });
        long[] B2 = di(1) ? z ? dtub.B(null, ds(getString(cM(1, bqhg.a)))) : new long[]{e()} : null;
        dtsr.dy(length, B2, new emyl() { // from class: bqgu
            @Override // defpackage.emyl
            public final Object get() {
                return "dependent_id:".concat(String.valueOf(bqgx.this.getString(1)));
            }
        });
        long[] B3 = di(2) ? z ? dtub.B(null, ds(getString(cM(2, bqhg.a)))) : new long[]{c()} : null;
        dtsr.dy(length, B3, new emyl() { // from class: bqgv
            @Override // defpackage.emyl
            public final Object get() {
                return "dependency_id:".concat(String.valueOf(bqgx.this.getString(2)));
            }
        });
        long[] B4 = di(3) ? z ? dtub.B(null, ds(getString(cM(3, bqhg.a)))) : new long[]{g()} : null;
        dtsr.dy(length, B4, new emyl() { // from class: bqgw
            @Override // defpackage.emyl
            public final Object get() {
                return "inserted_at_timestamp:".concat(String.valueOf(bqgx.this.getString(3)));
            }
        });
        engr engrVar = new engr();
        for (int i2 = 0; i2 < length; i2++) {
            long j = dB[i2];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i2]));
                String[] strArr = bqhg.a;
                bqgh bqghVar = new bqgh();
                bqghVar.aF();
                bqghVar.aD();
                long j2 = dB[i2];
                if (B != null) {
                    long j3 = B[i2];
                    bqghVar.aE(0);
                    bqghVar.a = j3;
                }
                if (B2 != null) {
                    bqghVar.c(B2[i2]);
                }
                if (B3 != null) {
                    bqghVar.b(B3[i2]);
                }
                if (B4 != null) {
                    bqghVar.d(B4[i2]);
                }
                engrVar.h(bqghVar.a());
            }
        }
        return engrVar.g();
    }

    public final long g() {
        return getLong(cM(3, bqhg.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
