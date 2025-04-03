package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxim extends dtsr implements bxij {
    @Deprecated
    public bxim(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bxir bxirVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bxiv.a, dtyoVar, dtvsVar, bxirVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bxhz();
    }

    @Override // defpackage.bxij
    public final String c() {
        return getString(cM(0, bxiv.a));
    }

    public final String e() {
        return getString(cM(1, bxiv.a));
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
                String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, bxiv.a))), new String[0]) : new String[]{c()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: bxik
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "remote_user_id:".concat(String.valueOf(bxim.this.getString(0)));
                    }
                });
                String[] strArr2 = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, bxiv.a))), new String[0]) : new String[]{e()} : null;
                dtsr.dz(length, strArr2, new emyl() { // from class: bxil
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "tachyon_registration_id:".concat(String.valueOf(bxim.this.getString(1)));
                    }
                });
                engr engrVar = new engr();
                for (int i = 0; i < length; i++) {
                    long j = dB[i];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i]));
                        String[] strArr3 = bxiv.a;
                        bxib bxibVar = new bxib();
                        bxibVar.aF();
                        bxibVar.aD();
                        long j2 = dB[i];
                        if (strArr != null) {
                            bxibVar.b(strArr[i]);
                        }
                        if (strArr2 != null) {
                            bxibVar.c(strArr2[i]);
                        }
                        engrVar.h(bxibVar.a());
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
