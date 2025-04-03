package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqhz extends dtsr implements bqhv {
    @Deprecated
    public bqhz(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bqie bqieVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bqii.a, dtyoVar, dtvsVar, bqieVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bqhk();
    }

    @Override // defpackage.bqhv
    public final String c() {
        return getString(cM(2, bqii.a));
    }

    public final long e() {
        return getLong(cM(0, bqii.a));
    }

    public final String f() {
        return getString(cM(1, bqii.a));
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
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bqii.a)))) : new long[]{e()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bqhw
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bqhz.this.getString(0)));
            }
        });
        String[] strArr = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, bqii.a))), new String[0]) : new String[]{f()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: bqhx
            @Override // defpackage.emyl
            public final Object get() {
                return "message_id:".concat(String.valueOf(bqhz.this.getString(1)));
            }
        });
        String[] strArr2 = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, bqii.a))), new String[0]) : new String[]{c()} : null;
        dtsr.dz(length, strArr2, new emyl() { // from class: bqhy
            @Override // defpackage.emyl
            public final Object get() {
                return "blob_id:".concat(String.valueOf(bqhz.this.getString(2)));
            }
        });
        engr engrVar = new engr();
        for (int i2 = 0; i2 < length; i2++) {
            long j = dB[i2];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i2]));
                String[] strArr3 = bqii.a;
                bqhm bqhmVar = new bqhm();
                bqhmVar.aF();
                bqhmVar.aD();
                long j2 = dB[i2];
                if (B != null) {
                    long j3 = B[i2];
                    bqhmVar.aE(0);
                    bqhmVar.a = j3;
                }
                if (strArr != null) {
                    String str = strArr[i2];
                    bqhmVar.aE(1);
                    bqhmVar.b = str;
                }
                if (strArr2 != null) {
                    String str2 = strArr2[i2];
                    bqhmVar.aE(2);
                    bqhmVar.c = str2;
                }
                bqhk bqhkVar = new bqhk();
                bqhkVar.aC(bqhmVar.aB());
                bqhkVar.a = bqhmVar.a;
                bqhkVar.b = bqhmVar.b;
                bqhkVar.c = bqhmVar.c;
                bqhkVar.cK = bqhmVar.aC();
                engrVar.h(bqhkVar);
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
