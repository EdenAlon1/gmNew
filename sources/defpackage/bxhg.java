package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxhg extends dtsr implements bxhc {
    @Deprecated
    public bxhg(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bxhl bxhlVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bxhr.a, dtyoVar, dtvsVar, bxhlVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bxgr();
    }

    public final Instant c() {
        return bdgw.b(getLong(cM(2, bxhr.a)));
    }

    public final Instant e() {
        return bdgw.b(getLong(cM(1, bxhr.a)));
    }

    public final String f() {
        return getString(cM(0, bxhr.a));
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
                Instant[] instantArr2 = null;
                String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, bxhr.a))), new String[0]) : new String[]{f()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: bxhd
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "remote_user_id:".concat(String.valueOf(bxhg.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    instantArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(1, bxhr.a)));
                    int length2 = ds.length;
                    Instant[] instantArr3 = new Instant[length2];
                    for (int i = 0; i < length2; i++) {
                        instantArr3[i] = bdgw.b(ds[i]);
                    }
                    instantArr = (Instant[]) dtub.C(null, instantArr3, new Instant[0]);
                } else {
                    instantArr = new Instant[]{e()};
                }
                dtsr.dz(length, instantArr, new emyl() { // from class: bxhe
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "last_modified_timestamp:".concat(String.valueOf(bxhg.this.getString(1)));
                    }
                });
                if (di(2)) {
                    if (z) {
                        long[] ds2 = ds(getString(cM(2, bxhr.a)));
                        int length3 = ds2.length;
                        Instant[] instantArr4 = new Instant[length3];
                        for (int i2 = 0; i2 < length3; i2++) {
                            instantArr4[i2] = bdgw.b(ds2[i2]);
                        }
                        instantArr2 = (Instant[]) dtub.C(null, instantArr4, new Instant[0]);
                    } else {
                        instantArr2 = new Instant[]{c()};
                    }
                }
                dtsr.dz(length, instantArr2, new emyl() { // from class: bxhf
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "guaranteed_fresh_as_of_timestamp:".concat(String.valueOf(bxhg.this.getString(2)));
                    }
                });
                engr engrVar = new engr();
                for (int i3 = 0; i3 < length; i3++) {
                    long j = dB[i3];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i3]));
                        String[] strArr2 = bxhr.a;
                        bxgt bxgtVar = new bxgt();
                        bxgtVar.aF();
                        bxgtVar.aD();
                        long j2 = dB[i3];
                        if (strArr != null) {
                            bxgtVar.d(strArr[i3]);
                        }
                        if (instantArr != null) {
                            bxgtVar.c(instantArr[i3]);
                        }
                        if (instantArr2 != null) {
                            bxgtVar.b(instantArr2[i3]);
                        }
                        engrVar.h(bxgtVar.a());
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
