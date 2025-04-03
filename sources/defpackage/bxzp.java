package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxzp extends dtsr implements bxzl {
    @Deprecated
    public bxzp(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bxzr bxzrVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bxzt.a, dtyoVar, dtvsVar, bxzrVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bxyz();
    }

    public final String c() {
        return getString(cM(2, bxzt.a));
    }

    public final String e() {
        return getString(cM(1, bxzt.a));
    }

    public final String f() {
        return getString(cM(0, bxzt.a));
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
        String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, bxzt.a))), new String[0]) : new String[]{f()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: bxzm
            @Override // defpackage.emyl
            public final Object get() {
                return "sticker_set_id:".concat(String.valueOf(bxzp.this.getString(0)));
            }
        });
        String[] strArr2 = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, bxzt.a))), new String[0]) : new String[]{e()} : null;
        dtsr.dz(length, strArr2, new emyl() { // from class: bxzn
            @Override // defpackage.emyl
            public final Object get() {
                return "locale:".concat(String.valueOf(bxzp.this.getString(1)));
            }
        });
        String[] strArr3 = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, bxzt.a))), new String[0]) : new String[]{c()} : null;
        dtsr.dz(length, strArr3, new emyl() { // from class: bxzo
            @Override // defpackage.emyl
            public final Object get() {
                return "display_name:".concat(String.valueOf(bxzp.this.getString(2)));
            }
        });
        engr engrVar = new engr();
        for (int i2 = 0; i2 < length; i2++) {
            long j = dB[i2];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i2]));
                String[] strArr4 = bxzt.a;
                bxzb bxzbVar = new bxzb();
                bxzbVar.aF();
                bxzbVar.aD();
                long j2 = dB[i2];
                if (strArr != null) {
                    String str = strArr[i2];
                    bxzbVar.aE(0);
                    bxzbVar.a = str;
                }
                if (strArr2 != null) {
                    String str2 = strArr2[i2];
                    bxzbVar.aE(1);
                    bxzbVar.b = str2;
                }
                if (strArr3 != null) {
                    String str3 = strArr3[i2];
                    bxzbVar.aE(2);
                    bxzbVar.c = str3;
                }
                bxyz bxyzVar = new bxyz();
                bxyzVar.aC(bxzbVar.aB());
                bxyzVar.a = bxzbVar.a;
                bxyzVar.b = bxzbVar.b;
                bxyzVar.c = bxzbVar.c;
                bxyzVar.cK = bxzbVar.aC();
                engrVar.h(bxyzVar);
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
