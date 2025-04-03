package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwhp extends dtsr implements bwhm {
    @Deprecated
    public bwhp(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bwhu bwhuVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bwhy.a, dtyoVar, dtvsVar, bwhuVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bwhd();
    }

    public final long c() {
        return getLong(cM(0, bwhy.a));
    }

    public final String e() {
        return getString(cM(1, bwhy.a));
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
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bwhy.a)))) : new long[]{c()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bwhn
            @Override // defpackage.emyl
            public final Object get() {
                return "guesser_id:".concat(String.valueOf(bwhp.this.getString(0)));
            }
        });
        String[] strArr = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, bwhy.a))), new String[0]) : new String[]{e()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: bwho
            @Override // defpackage.emyl
            public final Object get() {
                return "test_phone_number:".concat(String.valueOf(bwhp.this.getString(1)));
            }
        });
        engr engrVar = new engr();
        for (int i2 = 0; i2 < length; i2++) {
            long j = dB[i2];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i2]));
                String[] strArr2 = bwhy.a;
                bwhf bwhfVar = new bwhf();
                bwhfVar.aF();
                bwhfVar.aD();
                long j2 = dB[i2];
                if (B != null) {
                    long j3 = B[i2];
                    bwhfVar.aE(0);
                    bwhfVar.a = j3;
                }
                if (strArr != null) {
                    bwhfVar.b(strArr[i2]);
                }
                engrVar.h(bwhfVar.a());
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
