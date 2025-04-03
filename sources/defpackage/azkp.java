package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azkp extends dtsr implements azkl {
    @Deprecated
    public azkp(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, azkt azktVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, azkv.a, dtyoVar, dtvsVar, azktVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new azjy();
    }

    public final int c() {
        return getInt(cM(1, azkv.a));
    }

    public final int e() {
        return getInt(cM(2, azkv.a));
    }

    public final String f() {
        return getString(cM(0, azkv.a));
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
        String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, azkv.a))), new String[0]) : new String[]{f()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: azkm
            @Override // defpackage.emyl
            public final Object get() {
                return "sim_serial_number:".concat(String.valueOf(azkp.this.getString(0)));
            }
        });
        int[] z2 = di(1) ? z ? dtub.z(null, dr(getString(cM(1, azkv.a)))) : new int[]{c()} : null;
        dtsr.dx(length, z2, new emyl() { // from class: azkn
            @Override // defpackage.emyl
            public final Object get() {
                return "active_sub_id:".concat(String.valueOf(azkp.this.getString(1)));
            }
        });
        int[] z3 = di(2) ? z ? dtub.z(null, dr(getString(cM(2, azkv.a)))) : new int[]{e()} : null;
        dtsr.dx(length, z3, new emyl() { // from class: azko
            @Override // defpackage.emyl
            public final Object get() {
                return "sim_slot_index:".concat(String.valueOf(azkp.this.getString(2)));
            }
        });
        engr engrVar = new engr();
        for (int i2 = 0; i2 < length; i2++) {
            long j = dB[i2];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i2]));
                String[] strArr2 = azkv.a;
                azka azkaVar = new azka();
                azkaVar.aF();
                azkaVar.aD();
                long j2 = dB[i2];
                if (strArr != null) {
                    String str = strArr[i2];
                    azkaVar.aE(0);
                    azkaVar.a = str;
                }
                if (z2 != null) {
                    int i3 = z2[i2];
                    azkaVar.aE(1);
                    azkaVar.b = i3;
                }
                if (z3 != null) {
                    int i4 = z3[i2];
                    azkaVar.aE(2);
                    azkaVar.c = i4;
                }
                azjy azjyVar = new azjy();
                azjyVar.aC(azkaVar.aB());
                azjyVar.a = azkaVar.a;
                azjyVar.b = azkaVar.b;
                azjyVar.c = azkaVar.c;
                azjyVar.cK = azkaVar.aC();
                engrVar.h(azjyVar);
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
