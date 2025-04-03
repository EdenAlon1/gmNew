package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azgt extends dtsr implements azgq {
    @Deprecated
    public azgt(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, azgy azgyVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, azhc.a, dtyoVar, dtvsVar, azgyVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new azgf();
    }

    public final azcr c() {
        return azcs.a(getString(cM(1, azhc.a)));
    }

    public final azcr e() {
        return azcs.a(getString(cM(0, azhc.a)));
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
                azcr[] azcrVarArr2 = null;
                if (!di) {
                    azcrVarArr = null;
                } else if (z) {
                    String[] dt = dt(getString(cM(0, azhc.a)));
                    int length2 = dt.length;
                    azcr[] azcrVarArr3 = new azcr[length2];
                    for (int i = 0; i < length2; i++) {
                        azcrVarArr3[i] = azcs.a(dt[i]);
                    }
                    azcrVarArr = (azcr[]) dtub.C(null, azcrVarArr3, new azcr[0]);
                } else {
                    azcrVarArr = new azcr[]{e()};
                }
                dtsr.dz(length, azcrVarArr, new emyl() { // from class: azgr
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "group_token:".concat(String.valueOf(azgt.this.getString(0)));
                    }
                });
                if (di(1)) {
                    if (z) {
                        String[] dt2 = dt(getString(cM(1, azhc.a)));
                        int length3 = dt2.length;
                        azcr[] azcrVarArr4 = new azcr[length3];
                        for (int i2 = 0; i2 < length3; i2++) {
                            azcrVarArr4[i2] = azcs.a(dt2[i2]);
                        }
                        azcrVarArr2 = (azcr[]) dtub.C(null, azcrVarArr4, new azcr[0]);
                    } else {
                        azcrVarArr2 = new azcr[]{c()};
                    }
                }
                dtsr.dz(length, azcrVarArr2, new emyl() { // from class: azgs
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "destination_token:".concat(String.valueOf(azgt.this.getString(1)));
                    }
                });
                engr engrVar = new engr();
                for (int i3 = 0; i3 < length; i3++) {
                    long j = dB[i3];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i3]));
                        String[] strArr = azhc.a;
                        azgh azghVar = new azgh();
                        azghVar.aF();
                        azghVar.aD();
                        long j2 = dB[i3];
                        if (azcrVarArr != null) {
                            azghVar.c(azcrVarArr[i3]);
                        }
                        if (azcrVarArr2 != null) {
                            azghVar.b(azcrVarArr2[i3]);
                        }
                        engrVar.h(azghVar.a());
                    }
                }
                return engrVar.g();
            }
        }
        int i4 = engw.d;
        return enou.a;
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
