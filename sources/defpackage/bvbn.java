package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvbn extends dtsr implements bvbj {
    @Deprecated
    public bvbn(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bvbq bvbqVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bvbu.a, dtyoVar, dtvsVar, bvbqVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bvay();
    }

    public final bdhk c() {
        return new bdhk(getLong(cM(0, bvbu.a)));
    }

    public final bdhl e() {
        return bdhl.a(getString(cM(1, bvbu.a)));
    }

    public final Instant f() {
        return bdgt.b(getLong(cM(2, bvbu.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        bdhk[] bdhkVarArr;
        bdhl[] bdhlVarArr;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                Instant[] instantArr = null;
                if (!di) {
                    bdhkVarArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(0, bvbu.a)));
                    int length2 = ds.length;
                    bdhk[] bdhkVarArr2 = new bdhk[length2];
                    for (int i = 0; i < length2; i++) {
                        bdhkVarArr2[i] = new bdhk(ds[i]);
                    }
                    bdhkVarArr = (bdhk[]) dtub.C(null, bdhkVarArr2, new bdhk[0]);
                } else {
                    bdhkVarArr = new bdhk[]{c()};
                }
                dtsr.dz(length, bdhkVarArr, new emyl() { // from class: bvbk
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "feature_id:".concat(String.valueOf(bvbn.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    bdhlVarArr = null;
                } else if (z) {
                    String[] dt = dt(getString(cM(1, bvbu.a)));
                    int length3 = dt.length;
                    bdhl[] bdhlVarArr2 = new bdhl[length3];
                    for (int i2 = 0; i2 < length3; i2++) {
                        bdhlVarArr2[i2] = bdhl.a(dt[i2]);
                    }
                    bdhlVarArr = (bdhl[]) dtub.C(null, bdhlVarArr2, new bdhl[0]);
                } else {
                    bdhlVarArr = new bdhl[]{e()};
                }
                dtsr.dz(length, bdhlVarArr, new emyl() { // from class: bvbl
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "feature:".concat(String.valueOf(bvbn.this.getString(1)));
                    }
                });
                if (di(2)) {
                    if (z) {
                        long[] ds2 = ds(getString(cM(2, bvbu.a)));
                        int length4 = ds2.length;
                        Instant[] instantArr2 = new Instant[length4];
                        for (int i3 = 0; i3 < length4; i3++) {
                            instantArr2[i3] = bdgt.b(ds2[i3]);
                        }
                        instantArr = (Instant[]) dtub.C(null, instantArr2, new Instant[0]);
                    } else {
                        instantArr = new Instant[]{f()};
                    }
                }
                dtsr.dz(length, instantArr, new emyl() { // from class: bvbm
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "start_date:".concat(String.valueOf(bvbn.this.getString(2)));
                    }
                });
                engr engrVar = new engr();
                for (int i4 = 0; i4 < length; i4++) {
                    long j = dB[i4];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i4]));
                        String[] strArr = bvbu.a;
                        bvba bvbaVar = new bvba();
                        bvbaVar.aF();
                        bvbaVar.aD();
                        long j2 = dB[i4];
                        if (bdhkVarArr != null) {
                            bvbaVar.c(bdhkVarArr[i4]);
                        }
                        if (bdhlVarArr != null) {
                            bvbaVar.b(bdhlVarArr[i4]);
                        }
                        if (instantArr != null) {
                            bvbaVar.d(instantArr[i4]);
                        }
                        engrVar.h(bvbaVar.a());
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
