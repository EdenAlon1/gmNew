package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bszd extends dtsr implements bsyx {
    @Deprecated
    public bszd(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bszg bszgVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bszm.a, dtyoVar, dtvsVar, bszgVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bsyi();
    }

    public final long c() {
        return getLong(cM(4, bszm.a));
    }

    public final aplf e() {
        aplf[] values = aplf.values();
        int i = getInt(cM(1, bszm.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final Instant f() {
        return bdgw.b(getLong(cM(3, bszm.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        aplf[] aplfVarArr;
        Instant[] instantArr;
        Instant[] instantArr2;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, bszm.a))), new String[0]) : new String[]{h()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: bsyy
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "emergency_destination:".concat(String.valueOf(bszd.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    aplfVarArr = null;
                } else if (z) {
                    int[] dr = dr(getString(cM(1, bszm.a)));
                    aplf[] values = aplf.values();
                    int length2 = values.length;
                    aplf[] aplfVarArr2 = new aplf[dr.length];
                    for (int i = 0; i < dr.length; i++) {
                        int i2 = dr[i];
                        if (i2 >= length2) {
                            throw new IllegalStateException();
                        }
                        aplfVarArr2[i] = values[i2];
                    }
                    aplfVarArr = (aplf[]) dtub.C(null, aplfVarArr2, new aplf[0]);
                } else {
                    aplfVarArr = new aplf[]{e()};
                }
                dtsr.dz(length, aplfVarArr, new emyl() { // from class: bsyz
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "type:".concat(String.valueOf(bszd.this.getString(1)));
                    }
                });
                if (!di(2)) {
                    instantArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(2, bszm.a)));
                    int length3 = ds.length;
                    Instant[] instantArr3 = new Instant[length3];
                    for (int i3 = 0; i3 < length3; i3++) {
                        instantArr3[i3] = bdgw.b(ds[i3]);
                    }
                    instantArr = (Instant[]) dtub.C(null, instantArr3, new Instant[0]);
                } else {
                    instantArr = new Instant[]{g()};
                }
                dtsr.dz(length, instantArr, new emyl() { // from class: bsza
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "start_timestamp:".concat(String.valueOf(bszd.this.getString(2)));
                    }
                });
                if (!di(3)) {
                    instantArr2 = null;
                } else if (z) {
                    long[] ds2 = ds(getString(cM(3, bszm.a)));
                    int length4 = ds2.length;
                    Instant[] instantArr4 = new Instant[length4];
                    for (int i4 = 0; i4 < length4; i4++) {
                        instantArr4[i4] = bdgw.b(ds2[i4]);
                    }
                    instantArr2 = (Instant[]) dtub.C(null, instantArr4, new Instant[0]);
                } else {
                    instantArr2 = new Instant[]{f()};
                }
                dtsr.dz(length, instantArr2, new emyl() { // from class: bszb
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "end_timestamp:".concat(String.valueOf(bszd.this.getString(3)));
                    }
                });
                long[] B = di(4) ? z ? dtub.B(null, ds(getString(cM(4, bszm.a)))) : new long[]{c()} : null;
                dtsr.dy(length, B, new emyl() { // from class: bszc
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "refill_duration_ms:".concat(String.valueOf(bszd.this.getString(4)));
                    }
                });
                engr engrVar = new engr();
                for (int i5 = 0; i5 < length; i5++) {
                    long j = dB[i5];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i5]));
                        String[] strArr2 = bszm.a;
                        bsyk bsykVar = new bsyk();
                        bsykVar.aF();
                        bsykVar.aD();
                        long j2 = dB[i5];
                        if (strArr != null) {
                            bsykVar.b(strArr[i5]);
                        }
                        if (aplfVarArr != null) {
                            bsykVar.f(aplfVarArr[i5]);
                        }
                        if (instantArr != null) {
                            bsykVar.e(instantArr[i5]);
                        }
                        if (instantArr2 != null) {
                            bsykVar.c(instantArr2[i5]);
                        }
                        if (B != null) {
                            bsykVar.d(B[i5]);
                        }
                        engrVar.h(bsykVar.a());
                    }
                }
                return engrVar.g();
            }
        }
        int i6 = engw.d;
        return enou.a;
    }

    public final Instant g() {
        return bdgw.b(getLong(cM(2, bszm.a)));
    }

    public final String h() {
        return getString(cM(0, bszm.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
