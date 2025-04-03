package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bywr extends dtsr implements bywo {
    @Deprecated
    public bywr(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, byww bywwVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, byxc.a, dtyoVar, dtvsVar, bywwVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bywf();
    }

    public final String c() {
        return getString(cM(1, byxc.a));
    }

    public final String e() {
        return getString(cM(0, byxc.a));
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
                String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, byxc.a))), new String[0]) : new String[]{e()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: bywp
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "sender_id:".concat(String.valueOf(bywr.this.getString(0)));
                    }
                });
                String[] strArr2 = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, byxc.a))), new String[0]) : new String[]{c()} : null;
                dtsr.dz(length, strArr2, new emyl() { // from class: bywq
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "brand_id:".concat(String.valueOf(bywr.this.getString(1)));
                    }
                });
                engr engrVar = new engr();
                for (int i = 0; i < length; i++) {
                    long j = dB[i];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i]));
                        bywg a = byxc.a();
                        a.aD();
                        long j2 = dB[i];
                        if (strArr != null) {
                            a.c(strArr[i]);
                        }
                        if (strArr2 != null) {
                            a.b(strArr2[i]);
                        }
                        engrVar.h(a.a());
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
