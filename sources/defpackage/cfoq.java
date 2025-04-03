package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfoq extends dtsr implements cfom {
    @Deprecated
    public cfoq(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, cfou cfouVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, cfow.a, dtyoVar, dtvsVar, cfouVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new cfob();
    }

    public final String c() {
        return getString(cM(1, cfow.a));
    }

    public final String e() {
        return getString(cM(0, cfow.a));
    }

    public final byte[] f() {
        return getBlob(cM(2, cfow.a));
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
        String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, cfow.a))), new String[0]) : new String[]{e()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: cfon
            @Override // defpackage.emyl
            public final Object get() {
                return "identity_id:".concat(String.valueOf(cfoq.this.getString(0)));
            }
        });
        String[] strArr2 = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, cfow.a))), new String[0]) : new String[]{c()} : null;
        dtsr.dz(length, strArr2, new emyl() { // from class: cfoo
            @Override // defpackage.emyl
            public final Object get() {
                return "group_id:".concat(String.valueOf(cfoq.this.getString(1)));
            }
        });
        byte[][] E = di(2) ? z ? dtub.E(null, dC(getString(cM(2, cfow.a)))) : new byte[][]{f()} : null;
        dtsr.dz(length, E, new emyl() { // from class: cfop
            @Override // defpackage.emyl
            public final Object get() {
                return "epoch_data:".concat(String.valueOf(cfoq.this.getString(2)));
            }
        });
        engr engrVar = new engr();
        for (int i2 = 0; i2 < length; i2++) {
            long j = dB[i2];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i2]));
                String[] strArr3 = cfow.a;
                cfod cfodVar = new cfod();
                cfodVar.aF();
                cfodVar.aD();
                long j2 = dB[i2];
                if (strArr != null) {
                    String str = strArr[i2];
                    cfodVar.aE(0);
                    cfodVar.a = str;
                }
                if (strArr2 != null) {
                    String str2 = strArr2[i2];
                    cfodVar.aE(1);
                    cfodVar.b = str2;
                }
                if (E != null) {
                    byte[] bArr = E[i2];
                    cfodVar.aE(2);
                    cfodVar.c = bArr;
                }
                cfob cfobVar = new cfob();
                cfobVar.aC(cfodVar.aB());
                cfobVar.a = cfodVar.a;
                cfobVar.b = cfodVar.b;
                cfobVar.c = cfodVar.c;
                cfobVar.cK = cfodVar.aC();
                engrVar.h(cfobVar);
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
