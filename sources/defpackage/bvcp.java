package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvcp extends dtsr implements bvcm {
    @Deprecated
    public bvcp(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bvcu bvcuVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bvcy.a, dtyoVar, dtvsVar, bvcuVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bvcb();
    }

    @Override // defpackage.bvcm
    public final emrk c() {
        if (isNull(cM(1, bvcy.a))) {
            throw new IllegalStateException("found null in cursor for column features");
        }
        byte[] blob = getBlob(cM(1, bvcy.a));
        if (blob == null) {
            return null;
        }
        try {
            return (emrk) eyfy.parseFrom(emrk.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return emrk.a;
        }
    }

    public final Instant e() {
        return bdgt.b(getLong(cM(0, bvcy.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        Instant[] instantArr;
        emrk emrkVar;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                emrk[] emrkVarArr = null;
                if (!di) {
                    instantArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(0, bvcy.a)));
                    int length2 = ds.length;
                    Instant[] instantArr2 = new Instant[length2];
                    for (int i = 0; i < length2; i++) {
                        instantArr2[i] = bdgt.b(ds[i]);
                    }
                    instantArr = (Instant[]) dtub.C(null, instantArr2, new Instant[0]);
                } else {
                    instantArr = new Instant[]{e()};
                }
                dtsr.dz(length, instantArr, new emyl() { // from class: bvcn
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "date:".concat(String.valueOf(bvcp.this.getString(0)));
                    }
                });
                if (di(1)) {
                    if (!z) {
                        emrkVarArr = new emrk[]{c()};
                    } else {
                        if (isNull(cM(1, bvcy.a))) {
                            throw new IllegalStateException("found null in cursor for column features");
                        }
                        List de = de(getString(cM(1, bvcy.a)));
                        emrk[] emrkVarArr2 = new emrk[de.size()];
                        Iterator it = de.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            try {
                                byte[] y = dtub.y((String) it.next());
                                int i3 = i2 + 1;
                                if (y == null) {
                                    emrkVar = null;
                                } else {
                                    try {
                                        emrkVar = (emrk) eyfy.parseFrom(emrk.a, y);
                                    } catch (Throwable unused) {
                                        i2 = i3;
                                        emrkVarArr2[i2] = null;
                                        i2++;
                                    }
                                }
                                emrkVarArr2[i2] = emrkVar;
                                i2 = i3;
                            } catch (Throwable unused2) {
                            }
                        }
                        emrkVarArr = (emrk[]) dtub.C(null, emrkVarArr2, new emrk[0]);
                    }
                }
                dtsr.dz(length, emrkVarArr, new emyl() { // from class: bvco
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "features:".concat(String.valueOf(bvcp.this.getString(1)));
                    }
                });
                engr engrVar = new engr();
                for (int i4 = 0; i4 < length; i4++) {
                    long j = dB[i4];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i4]));
                        String[] strArr = bvcy.a;
                        bvcf bvcfVar = new bvcf();
                        bvcfVar.aF();
                        bvcfVar.aD();
                        long j2 = dB[i4];
                        if (instantArr != null) {
                            bvcfVar.b(instantArr[i4]);
                        }
                        if (emrkVarArr != null) {
                            bvcfVar.c(emrkVarArr[i4]);
                        }
                        engrVar.h(bvcfVar.a(new Supplier() { // from class: bvcd
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new bvcb();
                            }
                        }));
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
