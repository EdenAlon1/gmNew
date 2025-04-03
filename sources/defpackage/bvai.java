package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvai extends dtsr implements bvae {
    @Deprecated
    public bvai(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bvam bvamVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bvar.a, dtyoVar, dtvsVar, bvamVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new buzq();
    }

    public final float c() {
        return getFloat(cM(2, bvar.a));
    }

    public final bdhk e() {
        return new bdhk(getLong(cM(0, bvar.a)));
    }

    public final Instant f() {
        return bdgt.b(getLong(cM(1, bvar.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        bdhk[] bdhkVarArr;
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
                    bdhkVarArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(0, bvar.a)));
                    int length2 = ds.length;
                    bdhk[] bdhkVarArr2 = new bdhk[length2];
                    for (int i = 0; i < length2; i++) {
                        bdhkVarArr2[i] = new bdhk(ds[i]);
                    }
                    bdhkVarArr = (bdhk[]) dtub.C(null, bdhkVarArr2, new bdhk[0]);
                } else {
                    bdhkVarArr = new bdhk[]{e()};
                }
                dtsr.dz(length, bdhkVarArr, new emyl() { // from class: bvaf
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "feature_id:".concat(String.valueOf(bvai.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    instantArr = null;
                } else if (z) {
                    long[] ds2 = ds(getString(cM(1, bvar.a)));
                    int length3 = ds2.length;
                    Instant[] instantArr2 = new Instant[length3];
                    for (int i2 = 0; i2 < length3; i2++) {
                        instantArr2[i2] = bdgt.b(ds2[i2]);
                    }
                    instantArr = (Instant[]) dtub.C(null, instantArr2, new Instant[0]);
                } else {
                    instantArr = new Instant[]{f()};
                }
                dtsr.dz(length, instantArr, new emyl() { // from class: bvag
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "date:".concat(String.valueOf(bvai.this.getString(1)));
                    }
                });
                float[] H = di(2) ? z ? dtub.H(dq(getString(cM(2, bvar.a)))) : new float[]{c()} : null;
                dtsr.dw(length, H, new emyl() { // from class: bvah
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "feature_value:".concat(String.valueOf(bvai.this.getString(2)));
                    }
                });
                engr engrVar = new engr();
                for (int i3 = 0; i3 < length; i3++) {
                    long j = dB[i3];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i3]));
                        String[] strArr = bvar.a;
                        buzu buzuVar = new buzu();
                        buzuVar.aF();
                        buzuVar.aD();
                        long j2 = dB[i3];
                        if (bdhkVarArr != null) {
                            buzuVar.c(bdhkVarArr[i3]);
                        }
                        if (instantArr != null) {
                            buzuVar.b(instantArr[i3]);
                        }
                        if (H != null) {
                            buzuVar.d(H[i3]);
                        }
                        engrVar.h(buzuVar.a(new Supplier() { // from class: buzs
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new buzq();
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

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
