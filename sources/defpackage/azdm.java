package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azdm extends dtsr implements azdi {
    @Deprecated
    public azdm(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, azdp azdpVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, azdt.a, dtyoVar, dtvsVar, azdpVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new azcx();
    }

    public final azcg c() {
        azcg[] values = azcg.values();
        int i = getInt(cM(2, azdt.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final azcr e() {
        return azcs.a(getString(cM(0, azdt.a)));
    }

    public final String f() {
        return getString(cM(1, azdt.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        azcr[] azcrVarArr;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                azcg[] azcgVarArr = null;
                if (!di) {
                    azcrVarArr = null;
                } else if (z) {
                    String[] dt = dt(getString(cM(0, azdt.a)));
                    int length2 = dt.length;
                    azcr[] azcrVarArr2 = new azcr[length2];
                    for (int i = 0; i < length2; i++) {
                        azcrVarArr2[i] = azcs.a(dt[i]);
                    }
                    azcrVarArr = (azcr[]) dtub.C(null, azcrVarArr2, new azcr[0]);
                } else {
                    azcrVarArr = new azcr[]{e()};
                }
                dtsr.dz(length, azcrVarArr, new emyl() { // from class: azdj
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "token:".concat(String.valueOf(azdm.this.getString(0)));
                    }
                });
                String[] strArr = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, azdt.a))), new String[0]) : new String[]{f()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: azdk
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "address:".concat(String.valueOf(azdm.this.getString(1)));
                    }
                });
                if (di(2)) {
                    if (z) {
                        int[] dr = dr(getString(cM(2, azdt.a)));
                        azcg[] values = azcg.values();
                        int length3 = values.length;
                        azcg[] azcgVarArr2 = new azcg[dr.length];
                        for (int i2 = 0; i2 < dr.length; i2++) {
                            int i3 = dr[i2];
                            if (i3 >= length3) {
                                throw new IllegalStateException();
                            }
                            azcgVarArr2[i2] = values[i3];
                        }
                        azcgVarArr = (azcg[]) dtub.C(null, azcgVarArr2, new azcg[0]);
                    } else {
                        azcgVarArr = new azcg[]{c()};
                    }
                }
                dtsr.dz(length, azcgVarArr, new emyl() { // from class: azdl
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "address_type:".concat(String.valueOf(azdm.this.getString(2)));
                    }
                });
                engr engrVar = new engr();
                for (int i4 = 0; i4 < length; i4++) {
                    long j = dB[i4];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i4]));
                        String[] strArr2 = azdt.a;
                        azcz azczVar = new azcz();
                        azczVar.aF();
                        azczVar.aD();
                        long j2 = dB[i4];
                        if (azcrVarArr != null) {
                            azczVar.d(azcrVarArr[i4]);
                        }
                        if (strArr != null) {
                            azczVar.b(strArr[i4]);
                        }
                        if (azcgVarArr != null) {
                            azczVar.c(azcgVarArr[i4]);
                        }
                        engrVar.h(azczVar.a());
                    }
                }
                return engrVar.g();
            }
        }
        int i5 = engw.d;
        return enou.a;
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
