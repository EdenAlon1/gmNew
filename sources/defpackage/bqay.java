package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqay extends dtsr implements bqat {
    @Deprecated
    public bqay(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bqbb bqbbVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bqbh.a, dtyoVar, dtvsVar, bqbbVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bqaf();
    }

    public final long c() {
        return getLong(cM(0, bqbh.a));
    }

    public final cuef e() {
        return cuef.b(getInt(cM(2, bqbh.a)));
    }

    public final cuen f() {
        return cuen.b(getInt(cM(1, bqbh.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        cuen[] cuenVarArr;
        cuef[] cuefVarArr;
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
                long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bqbh.a)))) : new long[]{c()} : null;
                dtsr.dy(length, B, new emyl() { // from class: bqau
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "participant_id:".concat(String.valueOf(bqay.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    cuenVarArr = null;
                } else if (z) {
                    int[] dr = dr(getString(cM(1, bqbh.a)));
                    cuen[] cuenVarArr2 = new cuen[dr.length];
                    for (int i = 0; i < dr.length; i++) {
                        cuen b = cuen.b(dr[i]);
                        if (b == null) {
                            throw new IllegalStateException();
                        }
                        cuenVarArr2[i] = b;
                    }
                    cuenVarArr = (cuen[]) dtub.C(null, cuenVarArr2, new cuen[0]);
                } else {
                    cuenVarArr = new cuen[]{f()};
                }
                dtsr.dz(length, cuenVarArr, new emyl() { // from class: bqav
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "conversation_toolstone_state:".concat(String.valueOf(bqay.this.getString(1)));
                    }
                });
                if (!di(2)) {
                    cuefVarArr = null;
                } else if (z) {
                    int[] dr2 = dr(getString(cM(2, bqbh.a)));
                    cuef[] cuefVarArr2 = new cuef[dr2.length];
                    for (int i2 = 0; i2 < dr2.length; i2++) {
                        cuef b2 = cuef.b(dr2[i2]);
                        if (b2 == null) {
                            throw new IllegalStateException();
                        }
                        cuefVarArr2[i2] = b2;
                    }
                    cuefVarArr = (cuef[]) dtub.C(null, cuefVarArr2, new cuef[0]);
                } else {
                    cuefVarArr = new cuef[]{e()};
                }
                dtsr.dz(length, cuefVarArr, new emyl() { // from class: bqaw
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "conversation_subscription_state:".concat(String.valueOf(bqay.this.getString(2)));
                    }
                });
                if (di(3)) {
                    if (z) {
                        long[] ds = ds(getString(cM(3, bqbh.a)));
                        int length2 = ds.length;
                        Instant[] instantArr2 = new Instant[length2];
                        for (int i3 = 0; i3 < length2; i3++) {
                            instantArr2[i3] = bdgw.b(ds[i3]);
                        }
                        instantArr = (Instant[]) dtub.C(null, instantArr2, new Instant[0]);
                    } else {
                        instantArr = new Instant[]{g()};
                    }
                }
                dtsr.dz(length, instantArr, new emyl() { // from class: bqax
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "last_action_timestamp:".concat(String.valueOf(bqay.this.getString(3)));
                    }
                });
                engr engrVar = new engr();
                for (int i4 = 0; i4 < length; i4++) {
                    long j = dB[i4];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i4]));
                        String[] strArr = bqbh.a;
                        bqah bqahVar = new bqah();
                        bqahVar.aF();
                        bqahVar.aD();
                        long j2 = dB[i4];
                        if (B != null) {
                            bqahVar.e(B[i4]);
                        }
                        if (cuenVarArr != null) {
                            bqahVar.c(cuenVarArr[i4]);
                        }
                        if (cuefVarArr != null) {
                            bqahVar.b(cuefVarArr[i4]);
                        }
                        if (instantArr != null) {
                            bqahVar.d(instantArr[i4]);
                        }
                        engrVar.h(bqahVar.a());
                    }
                }
                return engrVar.g();
            }
        }
        int i5 = engw.d;
        return enou.a;
    }

    public final Instant g() {
        return bdgw.b(getLong(cM(3, bqbh.a)));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
