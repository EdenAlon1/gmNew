package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqpn extends dtsr implements bqpi {
    @Deprecated
    public bqpn(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bqps bqpsVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bqpw.a, dtyoVar, dtvsVar, bqpsVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bqov();
    }

    @Override // defpackage.bqpi
    public final csfy c() {
        csfy[] values = csfy.values();
        int i = getInt(cM(3, bqpw.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.bqpi
    public final String e() {
        return getString(cM(2, bqpw.a));
    }

    public final long f() {
        return getLong(cM(0, bqpw.a));
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
        csfy[] csfyVarArr = null;
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bqpw.a)))) : new long[]{f()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bqpj
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bqpn.this.getString(0)));
            }
        });
        String[] strArr = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, bqpw.a))), new String[0]) : new String[]{g()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: bqpk
            @Override // defpackage.emyl
            public final Object get() {
                return "message_cms_id:".concat(String.valueOf(bqpn.this.getString(1)));
            }
        });
        String[] strArr2 = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, bqpw.a))), new String[0]) : new String[]{e()} : null;
        dtsr.dz(length, strArr2, new emyl() { // from class: bqpl
            @Override // defpackage.emyl
            public final Object get() {
                return "blob_id:".concat(String.valueOf(bqpn.this.getString(2)));
            }
        });
        if (di(3)) {
            if (z) {
                int[] dr = dr(getString(cM(3, bqpw.a)));
                csfy[] values = csfy.values();
                int length2 = values.length;
                csfy[] csfyVarArr2 = new csfy[dr.length];
                for (int i2 = 0; i2 < dr.length; i2++) {
                    int i3 = dr[i2];
                    if (i3 >= length2) {
                        throw new IllegalStateException();
                    }
                    csfyVarArr2[i2] = values[i3];
                }
                csfyVarArr = (csfy[]) dtub.C(null, csfyVarArr2, new csfy[0]);
            } else {
                csfyVarArr = new csfy[]{c()};
            }
        }
        dtsr.dz(length, csfyVarArr, new emyl() { // from class: bqpm
            @Override // defpackage.emyl
            public final Object get() {
                return "blob_type:".concat(String.valueOf(bqpn.this.getString(3)));
            }
        });
        engr engrVar = new engr();
        for (int i4 = 0; i4 < length; i4++) {
            long j = dB[i4];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i4]));
                String[] strArr3 = bqpw.a;
                bqox bqoxVar = new bqox();
                bqoxVar.aF();
                bqoxVar.aD();
                long j2 = dB[i4];
                if (B != null) {
                    long j3 = B[i4];
                    bqoxVar.aE(0);
                    bqoxVar.a = j3;
                }
                if (strArr != null) {
                    bqoxVar.d(strArr[i4]);
                }
                if (strArr2 != null) {
                    bqoxVar.b(strArr2[i4]);
                }
                if (csfyVarArr != null) {
                    bqoxVar.c(csfyVarArr[i4]);
                }
                engrVar.h(bqoxVar.a());
            }
        }
        return engrVar.g();
    }

    public final String g() {
        return getString(cM(1, bqpw.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
