package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwwp extends dtsr implements bwwm {
    @Deprecated
    public bwwp(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bwws bwwsVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bwwu.a, dtyoVar, dtvsVar, bwwsVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bwwd();
    }

    public final bdhg c() {
        return bdhg.a(getString(cM(0, bwwu.a)));
    }

    public final String e() {
        return getString(cM(1, bwwu.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        bdhg[] bdhgVarArr;
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
            bdhgVarArr = null;
        } else if (z) {
            String[] dt = dt(getString(cM(0, bwwu.a)));
            int length2 = dt.length;
            bdhg[] bdhgVarArr2 = new bdhg[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                bdhgVarArr2[i2] = bdhg.a(dt[i2]);
            }
            bdhgVarArr = (bdhg[]) dtub.C(null, bdhgVarArr2, new bdhg[0]);
        } else {
            bdhgVarArr = new bdhg[]{c()};
        }
        dtsr.dz(length, bdhgVarArr, new emyl() { // from class: bwwn
            @Override // defpackage.emyl
            public final Object get() {
                return "rcs_message_id:".concat(String.valueOf(bwwp.this.getString(0)));
            }
        });
        String[] strArr = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, bwwu.a))), new String[0]) : new String[]{e()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: bwwo
            @Override // defpackage.emyl
            public final Object get() {
                return "self_msisdn:".concat(String.valueOf(bwwp.this.getString(1)));
            }
        });
        engr engrVar = new engr();
        for (int i3 = 0; i3 < length; i3++) {
            long j = dB[i3];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i3]));
                String[] strArr2 = bwwu.a;
                bwwf bwwfVar = new bwwf();
                bwwfVar.aF();
                bwwfVar.aD();
                long j2 = dB[i3];
                if (bdhgVarArr != null) {
                    bdhg bdhgVar = bdhgVarArr[i3];
                    bwwfVar.aE(0);
                    bwwfVar.a = bdhgVar;
                }
                if (strArr != null) {
                    String str = strArr[i3];
                    bwwfVar.aE(1);
                    bwwfVar.b = str;
                }
                bwwd bwwdVar = new bwwd();
                bwwdVar.aC(bwwfVar.aB());
                bwwdVar.a = bwwfVar.a;
                bwwdVar.b = bwwfVar.b;
                bwwdVar.cK = bwwfVar.aC();
                engrVar.h(bwwdVar);
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
