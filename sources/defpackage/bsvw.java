package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsvw extends dtsr implements bsvt {
    @Deprecated
    public bsvw(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bswb bswbVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bswf.a, dtyoVar, dtvsVar, bswbVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bsvk();
    }

    public final String c() {
        return getString(cM(0, bswf.a));
    }

    public final String e() {
        return getString(cM(1, bswf.a));
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
                String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, bswf.a))), new String[0]) : new String[]{c()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: bsvu
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "lookup_key:".concat(String.valueOf(bsvw.this.getString(0)));
                    }
                });
                String[] strArr2 = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, bswf.a))), new String[0]) : new String[]{e()} : null;
                dtsr.dz(length, strArr2, new emyl() { // from class: bsvv
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "normalized_destination:".concat(String.valueOf(bsvw.this.getString(1)));
                    }
                });
                engr engrVar = new engr();
                for (int i = 0; i < length; i++) {
                    long j = dB[i];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i]));
                        String[] strArr3 = bswf.a;
                        bsvm bsvmVar = new bsvm();
                        bsvmVar.aF();
                        bsvmVar.aD();
                        long j2 = dB[i];
                        if (strArr != null) {
                            bsvmVar.b(strArr[i]);
                        }
                        if (strArr2 != null) {
                            bsvmVar.c(strArr2[i]);
                        }
                        engrVar.h(bsvmVar.a());
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
