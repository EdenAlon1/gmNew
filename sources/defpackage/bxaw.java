package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxaw extends dtsr implements bxas {
    @Deprecated
    public bxaw(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bxay bxayVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bxba.a, dtyoVar, dtvsVar, bxayVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bxah();
    }

    public final long c() {
        return getLong(cM(0, bxba.a));
    }

    public final long e() {
        return getLong(cM(2, bxba.a));
    }

    public final String f() {
        return getString(cM(1, bxba.a));
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
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bxba.a)))) : new long[]{c()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bxat
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bxaw.this.getString(0)));
            }
        });
        String[] strArr = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, bxba.a))), new String[0]) : new String[]{f()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: bxau
            @Override // defpackage.emyl
            public final Object get() {
                return "sticker_id:".concat(String.valueOf(bxaw.this.getString(1)));
            }
        });
        long[] B2 = di(2) ? z ? dtub.B(null, ds(getString(cM(2, bxba.a)))) : new long[]{e()} : null;
        dtsr.dy(length, B2, new emyl() { // from class: bxav
            @Override // defpackage.emyl
            public final Object get() {
                return "last_used_timestamp:".concat(String.valueOf(bxaw.this.getString(2)));
            }
        });
        engr engrVar = new engr();
        for (int i2 = 0; i2 < length; i2++) {
            long j = dB[i2];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i2]));
                String[] strArr2 = bxba.a;
                bxaj bxajVar = new bxaj();
                bxajVar.aF();
                bxajVar.aD();
                long j2 = dB[i2];
                if (B != null) {
                    long j3 = B[i2];
                    bxajVar.aE(0);
                    bxajVar.a = j3;
                }
                if (strArr != null) {
                    String str = strArr[i2];
                    bxajVar.aE(1);
                    bxajVar.b = str;
                }
                if (B2 != null) {
                    long j4 = B2[i2];
                    bxajVar.aE(2);
                    bxajVar.c = j4;
                }
                bxah bxahVar = new bxah();
                bxahVar.aC(bxajVar.aB());
                bxahVar.a = bxajVar.a;
                bxahVar.b = bxajVar.b;
                bxahVar.c = bxajVar.c;
                bxahVar.cK = bxajVar.aC();
                engrVar.h(bxahVar);
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
