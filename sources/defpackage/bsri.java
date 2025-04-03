package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsri extends dtsr implements bsre {
    @Deprecated
    public bsri(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bsrl bsrlVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bsrn.a, dtyoVar, dtvsVar, bsrlVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bsqt();
    }

    public final long c() {
        return getLong(cM(2, bsrn.a));
    }

    public final long e() {
        return getLong(cM(0, bsrn.a));
    }

    public final String f() {
        return getString(cM(1, bsrn.a));
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
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bsrn.a)))) : new long[]{e()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bsrf
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bsri.this.getString(0)));
            }
        });
        String[] strArr = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, bsrn.a))), new String[0]) : new String[]{f()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: bsrg
            @Override // defpackage.emyl
            public final Object get() {
                return "phone_number:".concat(String.valueOf(bsri.this.getString(1)));
            }
        });
        long[] B2 = di(2) ? z ? dtub.B(null, ds(getString(cM(2, bsrn.a)))) : new long[]{c()} : null;
        dtsr.dy(length, B2, new emyl() { // from class: bsrh
            @Override // defpackage.emyl
            public final Object get() {
                return "data_size:".concat(String.valueOf(bsri.this.getString(2)));
            }
        });
        engr engrVar = new engr();
        for (int i2 = 0; i2 < length; i2++) {
            long j = dB[i2];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i2]));
                String[] strArr2 = bsrn.a;
                bsqv bsqvVar = new bsqv();
                bsqvVar.aF();
                bsqvVar.aD();
                long j2 = dB[i2];
                if (B != null) {
                    long j3 = B[i2];
                    bsqvVar.aE(0);
                    bsqvVar.a = j3;
                }
                if (strArr != null) {
                    String str = strArr[i2];
                    bsqvVar.aE(1);
                    bsqvVar.b = str;
                }
                if (B2 != null) {
                    long j4 = B2[i2];
                    bsqvVar.aE(2);
                    bsqvVar.c = j4;
                }
                bsqt bsqtVar = new bsqt();
                bsqtVar.aC(bsqvVar.aB());
                bsqtVar.a = bsqvVar.a;
                bsqtVar.b = bsqvVar.b;
                bsqtVar.c = bsqvVar.c;
                bsqtVar.cK = bsqvVar.aC();
                engrVar.h(bsqtVar);
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
