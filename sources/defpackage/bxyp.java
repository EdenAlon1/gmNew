package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxyp extends dtsr implements bxyl {
    @Deprecated
    public bxyp(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bxys bxysVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bxyw.a, dtyoVar, dtvsVar, bxysVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bxya();
    }

    public final String c() {
        return getString(cM(1, bxyw.a));
    }

    public final String e() {
        return getString(cM(2, bxyw.a));
    }

    public final String f() {
        return getString(cM(0, bxyw.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, bxyw.a))), new String[0]) : new String[]{f()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: bxym
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "tbl:".concat(String.valueOf(bxyp.this.getString(0)));
                    }
                });
                String[] strArr2 = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, bxyw.a))), new String[0]) : new String[]{c()} : null;
                dtsr.dz(length, strArr2, new emyl() { // from class: bxyn
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "idx:".concat(String.valueOf(bxyp.this.getString(1)));
                    }
                });
                String[] strArr3 = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, bxyw.a))), new String[0]) : new String[]{e()} : null;
                dtsr.dz(length, strArr3, new emyl() { // from class: bxyo
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "stat:".concat(String.valueOf(bxyp.this.getString(2)));
                    }
                });
                engr engrVar = new engr();
                for (int i = 0; i < length; i++) {
                    long j = dB[i];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i]));
                        String[] strArr4 = bxyw.a;
                        bxyc bxycVar = new bxyc();
                        bxycVar.aF();
                        bxycVar.aD();
                        long j2 = dB[i];
                        if (strArr != null) {
                            bxycVar.d(strArr[i]);
                        }
                        if (strArr2 != null) {
                            bxycVar.b(strArr2[i]);
                        }
                        if (strArr3 != null) {
                            bxycVar.c(strArr3[i]);
                        }
                        engrVar.h(bxycVar.a());
                    }
                }
                return engrVar.g();
            }
        }
        int i2 = engw.d;
        return enou.a;
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
