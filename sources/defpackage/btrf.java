package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btrf extends dtsr implements btrd {
    @Deprecated
    public btrf(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, btrk btrkVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, btro.a, dtyoVar, dtvsVar, btrkVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new btqw();
    }

    @Override // defpackage.btrd
    public final int c() {
        return getInt(cM(0, btro.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                int[] z = di(0) ? this.d.b ? dtub.z(null, dr(getString(cM(0, btro.a)))) : new int[]{c()} : null;
                dtsr.dx(length, z, new emyl() { // from class: btre
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "account_id:".concat(String.valueOf(btrf.this.getString(0)));
                    }
                });
                engr engrVar = new engr();
                for (int i = 0; i < length; i++) {
                    long j = dB[i];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i]));
                        String[] strArr = btro.a;
                        btqy btqyVar = new btqy();
                        btqyVar.aF();
                        btqyVar.aD();
                        long j2 = dB[i];
                        if (z != null) {
                            btqyVar.b(z[i]);
                        }
                        engrVar.h(btqyVar.a());
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
