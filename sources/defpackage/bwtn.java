package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwtn extends dtsr implements bwti {
    @Deprecated
    public bwtn(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bwts bwtsVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bwty.a, dtyoVar, dtvsVar, bwtsVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bwsv();
    }

    public final String c() {
        return getString(cM(0, bwty.a));
    }

    public final String e() {
        return getString(cM(3, bwty.a));
    }

    public final String f() {
        return getString(cM(2, bwty.a));
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
                String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, bwty.a))), new String[0]) : new String[]{c()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: bwtj
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "verifier_id:".concat(String.valueOf(bwtn.this.getString(0)));
                    }
                });
                String[] strArr2 = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, bwty.a))), new String[0]) : new String[]{g()} : null;
                dtsr.dz(length, strArr2, new emyl() { // from class: bwtk
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "verifier_name:".concat(String.valueOf(bwtn.this.getString(1)));
                    }
                });
                String[] strArr3 = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, bwty.a))), new String[0]) : new String[]{f()} : null;
                dtsr.dz(length, strArr3, new emyl() { // from class: bwtl
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "verifier_logo_image_remote_url:".concat(String.valueOf(bwtn.this.getString(2)));
                    }
                });
                String[] strArr4 = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, bwty.a))), new String[0]) : new String[]{e()} : null;
                dtsr.dz(length, strArr4, new emyl() { // from class: bwtm
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "verifier_logo_image_local_uri:".concat(String.valueOf(bwtn.this.getString(3)));
                    }
                });
                engr engrVar = new engr();
                for (int i = 0; i < length; i++) {
                    long j = dB[i];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i]));
                        String[] strArr5 = bwty.a;
                        bwsx bwsxVar = new bwsx();
                        bwsxVar.aF();
                        bwsxVar.aD();
                        long j2 = dB[i];
                        if (strArr != null) {
                            bwsxVar.b(strArr[i]);
                        }
                        if (strArr2 != null) {
                            bwsxVar.e(strArr2[i]);
                        }
                        if (strArr3 != null) {
                            bwsxVar.d(strArr3[i]);
                        }
                        if (strArr4 != null) {
                            bwsxVar.c(strArr4[i]);
                        }
                        engrVar.h(bwsxVar.a());
                    }
                }
                return engrVar.g();
            }
        }
        int i2 = engw.d;
        return enou.a;
    }

    public final String g() {
        return getString(cM(1, bwty.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
