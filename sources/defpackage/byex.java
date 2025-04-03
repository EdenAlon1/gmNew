package defpackage;

import android.database.Cursor;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byex extends dtsr implements byet {
    @Deprecated
    public byex(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, byfc byfcVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, byfi.a, dtyoVar, dtvsVar, byfcVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new byeg();
    }

    @Override // defpackage.byet
    public final engw c() {
        engr engrVar = new engr();
        while (moveToNext()) {
            e();
            engrVar.h(Integer.valueOf(e()));
        }
        return engrVar.g();
    }

    public final int e() {
        return getInt(cM(0, byfi.a));
    }

    public final byfj f() {
        byfj[] values = byfj.values();
        int i = getInt(cM(2, byfi.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
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
                byfj[] byfjVarArr = null;
                int[] z2 = di ? z ? dtub.z(null, dr(getString(cM(0, byfi.a)))) : new int[]{e()} : null;
                dtsr.dx(length, z2, new emyl() { // from class: byeu
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "_id:".concat(String.valueOf(byex.this.getString(0)));
                    }
                });
                String[] strArr = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, byfi.a))), new String[0]) : new String[]{g()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: byev
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "name:".concat(String.valueOf(byex.this.getString(1)));
                    }
                });
                if (di(2)) {
                    if (z) {
                        int[] dr = dr(getString(cM(2, byfi.a)));
                        byfj[] values = byfj.values();
                        int length2 = values.length;
                        byfj[] byfjVarArr2 = new byfj[dr.length];
                        for (int i = 0; i < dr.length; i++) {
                            int i2 = dr[i];
                            if (i2 >= length2) {
                                throw new IllegalStateException();
                            }
                            byfjVarArr2[i] = values[i2];
                        }
                        byfjVarArr = (byfj[]) dtub.C(null, byfjVarArr2, new byfj[0]);
                    } else {
                        byfjVarArr = new byfj[]{f()};
                    }
                }
                dtsr.dz(length, byfjVarArr, new emyl() { // from class: byew
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "status:".concat(String.valueOf(byex.this.getString(2)));
                    }
                });
                engr engrVar = new engr();
                for (int i3 = 0; i3 < length; i3++) {
                    long j = dB[i3];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i3]));
                        String[] strArr2 = byfi.a;
                        byek byekVar = new byek();
                        byekVar.aF();
                        byekVar.aD();
                        long j2 = dB[i3];
                        if (z2 != null) {
                            byekVar.c(z2[i3]);
                        }
                        if (strArr != null) {
                            byekVar.d(strArr[i3]);
                        }
                        if (byfjVarArr != null) {
                            byekVar.e(byfjVarArr[i3]);
                        }
                        engrVar.h(byekVar.a(new Supplier() { // from class: byeh
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new byeg();
                            }
                        }));
                    }
                }
                return engrVar.g();
            }
        }
        int i4 = engw.d;
        return enou.a;
    }

    public final String g() {
        return getString(cM(1, byfi.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
