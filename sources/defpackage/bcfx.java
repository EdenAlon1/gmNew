package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcfx extends dtsr implements bcfs {
    @Deprecated
    public bcfx(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bcgd bcgdVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bcgh.a, dtyoVar, dtvsVar, bcgdVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bcff();
    }

    public final azon c() {
        azon[] values = azon.values();
        int i = getInt(cM(1, bcgh.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final azsu e() {
        return azsv.a(getString(cM(0, bcgh.a)));
    }

    public final String f() {
        return getString(cM(2, bcgh.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        azsu[] azsuVarArr;
        azon[] azonVarArr;
        dtyq dtyqVar = dtvnVar.a;
        int i = 1;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length == 0 || (length == 1 && dB[0] == -1)) {
            int i2 = engw.d;
            return enou.a;
        }
        HashSet hashSet = new HashSet();
        dtvs dtvsVar = this.d;
        boolean di = di(0);
        boolean z = dtvsVar.b;
        if (!di) {
            azsuVarArr = null;
        } else if (z) {
            String[] dt = dt(getString(cM(0, bcgh.a)));
            int length2 = dt.length;
            azsu[] azsuVarArr2 = new azsu[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                azsuVarArr2[i3] = azsv.a(dt[i3]);
            }
            azsuVarArr = (azsu[]) dtub.C(null, azsuVarArr2, new azsu[0]);
        } else {
            azsuVarArr = new azsu[]{e()};
        }
        dtsr.dz(length, azsuVarArr, new emyl() { // from class: bcft
            @Override // defpackage.emyl
            public final Object get() {
                return "token:".concat(String.valueOf(bcfx.this.getString(0)));
            }
        });
        if (!di(1)) {
            azonVarArr = null;
        } else if (z) {
            int[] dr = dr(getString(cM(1, bcgh.a)));
            azon[] values = azon.values();
            int length3 = values.length;
            azon[] azonVarArr2 = new azon[dr.length];
            for (int i4 = 0; i4 < dr.length; i4++) {
                int i5 = dr[i4];
                if (i5 >= length3) {
                    throw new IllegalStateException();
                }
                azonVarArr2[i4] = values[i5];
            }
            azonVarArr = (azon[]) dtub.C(null, azonVarArr2, new azon[0]);
        } else {
            azonVarArr = new azon[]{c()};
        }
        dtsr.dz(length, azonVarArr, new emyl() { // from class: bcfu
            @Override // defpackage.emyl
            public final Object get() {
                return "address_type:".concat(String.valueOf(bcfx.this.getString(1)));
            }
        });
        String[] strArr = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, bcgh.a))), new String[0]) : new String[]{f()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: bcfv
            @Override // defpackage.emyl
            public final Object get() {
                return "phone_number:".concat(String.valueOf(bcfx.this.getString(2)));
            }
        });
        String[] strArr2 = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, bcgh.a))), new String[0]) : new String[]{g()} : null;
        dtsr.dz(length, strArr2, new emyl() { // from class: bcfw
            @Override // defpackage.emyl
            public final Object get() {
                return "display_name:".concat(String.valueOf(bcfx.this.getString(3)));
            }
        });
        engr engrVar = new engr();
        int i6 = 0;
        while (i6 < length) {
            long j = dB[i6];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i6]));
                String[] strArr3 = bcgh.a;
                bcfh bcfhVar = new bcfh();
                bcfhVar.aF();
                bcfhVar.aD();
                long j2 = dB[i6];
                if (azsuVarArr != null) {
                    azsu azsuVar = azsuVarArr[i6];
                    bcfhVar.aE(0);
                    bcfhVar.a = azsuVar;
                }
                if (azonVarArr != null) {
                    azon azonVar = azonVarArr[i6];
                    bcfhVar.aE(i);
                    bcfhVar.b = azonVar;
                }
                if (strArr != null) {
                    String str = strArr[i6];
                    bcfhVar.aE(2);
                    bcfhVar.c = str;
                }
                if (strArr2 != null) {
                    String str2 = strArr2[i6];
                    bcfhVar.aE(3);
                    bcfhVar.d = str2;
                }
                bcff bcffVar = new bcff();
                bcffVar.aC(bcfhVar.aB());
                bcffVar.a = bcfhVar.a;
                bcffVar.b = bcfhVar.b;
                bcffVar.c = bcfhVar.c;
                bcffVar.d = bcfhVar.d;
                bcffVar.cK = bcfhVar.aC();
                engrVar.h(bcffVar);
            }
            i6++;
            i = 1;
        }
        return engrVar.g();
    }

    public final String g() {
        return getString(cM(3, bcgh.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
