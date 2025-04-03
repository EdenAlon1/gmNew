package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxos extends dtsr implements bxoo {
    @Deprecated
    public bxos(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bxox bxoxVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bxpb.a, dtyoVar, dtvsVar, bxoxVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bxod();
    }

    public final byyn c() {
        byyn[] values = byyn.values();
        int i = getInt(cM(0, bxpb.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String e() {
        return getString(cM(2, bxpb.a));
    }

    public final String f() {
        return getString(cM(1, bxpb.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        byyn[] byynVarArr;
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
        if (!di) {
            byynVarArr = null;
        } else if (z) {
            int[] dr = dr(getString(cM(0, bxpb.a)));
            byyn[] values = byyn.values();
            int length2 = values.length;
            byyn[] byynVarArr2 = new byyn[dr.length];
            for (int i2 = 0; i2 < dr.length; i2++) {
                int i3 = dr[i2];
                if (i3 >= length2) {
                    throw new IllegalStateException();
                }
                byynVarArr2[i2] = values[i3];
            }
            byynVarArr = (byyn[]) dtub.C(null, byynVarArr2, new byyn[0]);
        } else {
            byynVarArr = new byyn[]{c()};
        }
        dtsr.dz(length, byynVarArr, new emyl() { // from class: bxop
            @Override // defpackage.emyl
            public final Object get() {
                return "which_database:".concat(String.valueOf(bxos.this.getString(0)));
            }
        });
        String[] strArr = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, bxpb.a))), new String[0]) : new String[]{f()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: bxoq
            @Override // defpackage.emyl
            public final Object get() {
                return "participant_id:".concat(String.valueOf(bxos.this.getString(1)));
            }
        });
        String[] strArr2 = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, bxpb.a))), new String[0]) : new String[]{e()} : null;
        dtsr.dz(length, strArr2, new emyl() { // from class: bxor
            @Override // defpackage.emyl
            public final Object get() {
                return "destination_suffix:".concat(String.valueOf(bxos.this.getString(2)));
            }
        });
        engr engrVar = new engr();
        for (int i4 = 0; i4 < length; i4++) {
            long j = dB[i4];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i4]));
                String[] strArr3 = bxpb.a;
                bxof bxofVar = new bxof();
                bxofVar.aF();
                bxofVar.aD();
                long j2 = dB[i4];
                if (byynVarArr != null) {
                    byyn byynVar = byynVarArr[i4];
                    bxofVar.aE(0);
                    bxofVar.a = byynVar;
                }
                if (strArr != null) {
                    String str = strArr[i4];
                    bxofVar.aE(1);
                    bxofVar.b = str;
                }
                if (strArr2 != null) {
                    String str2 = strArr2[i4];
                    bxofVar.aE(2);
                    bxofVar.c = str2;
                }
                bxod bxodVar = new bxod();
                bxodVar.aC(bxofVar.aB());
                bxodVar.a = bxofVar.a;
                bxodVar.b = bxofVar.b;
                bxodVar.c = bxofVar.c;
                bxodVar.cK = bxofVar.aC();
                engrVar.h(bxodVar);
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
