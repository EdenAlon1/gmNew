package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byua extends dtsr implements byty {
    @Deprecated
    public byua(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, byud byudVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, byuf.a, dtyoVar, dtvsVar, byudVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bytr();
    }

    public final String c() {
        return getString(cM(0, byuf.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                String[] strArr = di(0) ? this.d.b ? (String[]) dtub.C(null, dt(getString(cM(0, byuf.a))), new String[0]) : new String[]{c()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: bytz
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "sender_id:".concat(String.valueOf(byua.this.getString(0)));
                    }
                });
                engr engrVar = new engr();
                for (int i = 0; i < length; i++) {
                    long j = dB[i];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i]));
                        String[] strArr2 = byuf.a;
                        bytt byttVar = new bytt();
                        byttVar.aF();
                        byttVar.aD();
                        long j2 = dB[i];
                        if (strArr != null) {
                            byttVar.b(strArr[i]);
                        }
                        engrVar.h(byttVar.a());
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
