package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byyc extends dtsr implements byxx {
    @Deprecated
    public byyc(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, byyf byyfVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, VmtTable.a, dtyoVar, dtvsVar, byyfVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new byxj();
    }

    @Override // defpackage.byxx
    public final String c() {
        if (isNull(cM(0, VmtTable.a))) {
            throw new IllegalStateException("found null in cursor for column part_id");
        }
        return getString(cM(0, VmtTable.a));
    }

    public final ardn e() {
        return ardn.b(getInt(cM(1, VmtTable.a)));
    }

    public final String f() {
        return getString(cM(3, VmtTable.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        String[] strArr;
        ardn[] ardnVarArr;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                if (!di) {
                    strArr = null;
                } else if (!z) {
                    strArr = new String[]{c()};
                } else {
                    if (isNull(cM(0, VmtTable.a))) {
                        throw new IllegalStateException("found null in cursor for column part_id");
                    }
                    strArr = (String[]) dtub.C(null, dt(getString(cM(0, VmtTable.a))), new String[0]);
                }
                dtsr.dz(length, strArr, new emyl() { // from class: byxy
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "part_id:".concat(String.valueOf(byyc.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    ardnVarArr = null;
                } else if (z) {
                    int[] dr = dr(getString(cM(1, VmtTable.a)));
                    ardn[] ardnVarArr2 = new ardn[dr.length];
                    for (int i = 0; i < dr.length; i++) {
                        ardn b = ardn.b(dr[i]);
                        if (b == null) {
                            throw new IllegalStateException();
                        }
                        ardnVarArr2[i] = b;
                    }
                    ardnVarArr = (ardn[]) dtub.C(null, ardnVarArr2, new ardn[0]);
                } else {
                    ardnVarArr = new ardn[]{e()};
                }
                dtsr.dz(length, ardnVarArr, new emyl() { // from class: byxz
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "vmt_status:".concat(String.valueOf(byyc.this.getString(1)));
                    }
                });
                String[] strArr2 = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, VmtTable.a))), new String[0]) : new String[]{g()} : null;
                dtsr.dz(length, strArr2, new emyl() { // from class: byya
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "text:".concat(String.valueOf(byyc.this.getString(2)));
                    }
                });
                String[] strArr3 = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, VmtTable.a))), new String[0]) : new String[]{f()} : null;
                dtsr.dz(length, strArr3, new emyl() { // from class: byyb
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "locale:".concat(String.valueOf(byyc.this.getString(3)));
                    }
                });
                engr engrVar = new engr();
                for (int i2 = 0; i2 < length; i2++) {
                    long j = dB[i2];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i2]));
                        byxk a = VmtTable.a();
                        a.aD();
                        long j2 = dB[i2];
                        if (strArr != null) {
                            a.c(strArr[i2]);
                        }
                        if (ardnVarArr != null) {
                            a.e(ardnVarArr[i2]);
                        }
                        if (strArr2 != null) {
                            a.d(strArr2[i2]);
                        }
                        if (strArr3 != null) {
                            a.b(strArr3[i2]);
                        }
                        engrVar.h(a.a());
                    }
                }
                return engrVar.g();
            }
        }
        int i3 = engw.d;
        return enou.a;
    }

    public final String g() {
        return getString(cM(2, VmtTable.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
