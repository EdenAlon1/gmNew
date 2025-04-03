package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcer extends dtsr implements bcen {
    @Deprecated
    public bcer(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bcew bcewVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bcfa.a, dtyoVar, dtvsVar, bcewVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bcea();
    }

    public final int c() {
        return getInt(cM(1, bcfa.a));
    }

    public final Instant e() {
        return bdgw.b(getLong(cM(0, bcfa.a)));
    }

    public final String f() {
        return getString(cM(2, bcfa.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        Instant[] instantArr;
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
                    instantArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(0, bcfa.a)));
                    int length2 = ds.length;
                    Instant[] instantArr2 = new Instant[length2];
                    for (int i = 0; i < length2; i++) {
                        instantArr2[i] = bdgw.b(ds[i]);
                    }
                    instantArr = (Instant[]) dtub.C(null, instantArr2, new Instant[0]);
                } else {
                    instantArr = new Instant[]{e()};
                }
                dtsr.dz(length, instantArr, new emyl() { // from class: bceo
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "created_timestamp:".concat(String.valueOf(bcer.this.getString(0)));
                    }
                });
                int[] z2 = di(1) ? z ? dtub.z(null, dr(getString(cM(1, bcfa.a)))) : new int[]{c()} : null;
                dtsr.dx(length, z2, new emyl() { // from class: bcep
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "schema_version:".concat(String.valueOf(bcer.this.getString(1)));
                    }
                });
                String[] strArr = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, bcfa.a))), new String[0]) : new String[]{f()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: bceq
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "backup_id:".concat(String.valueOf(bcer.this.getString(2)));
                    }
                });
                engr engrVar = new engr();
                for (int i2 = 0; i2 < length; i2++) {
                    long j = dB[i2];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i2]));
                        String[] strArr2 = bcfa.a;
                        bcee bceeVar = new bcee();
                        bceeVar.aF();
                        bceeVar.aD();
                        long j2 = dB[i2];
                        if (instantArr != null) {
                            bceeVar.c(instantArr[i2]);
                        }
                        if (z2 != null) {
                            bceeVar.d(z2[i2]);
                        }
                        if (strArr != null) {
                            bceeVar.b(strArr[i2]);
                        }
                        engrVar.h(bceeVar.a(new Supplier() { // from class: bceb
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new bcea();
                            }
                        }));
                    }
                }
                return engrVar.g();
            }
        }
        int i3 = engw.d;
        return enou.a;
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
