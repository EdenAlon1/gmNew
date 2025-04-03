package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwiy extends dtsr implements bwit {
    @Deprecated
    public bwiy(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bwjb bwjbVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bwjh.a, dtyoVar, dtvsVar, bwjbVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bwig();
    }

    @Override // defpackage.bwit
    public final String c() {
        return getString(cM(3, bwjh.a));
    }

    @Override // defpackage.bwit
    public final String e() {
        return getString(cM(2, bwjh.a));
    }

    public final long f() {
        return getLong(cM(0, bwjh.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        Instant[] instantArr;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length == 0 || (length == 1 && dB[0] == -1)) {
            int i = engw.d;
            return enou.a;
        }
        HashSet hashSet = new HashSet();
        dtvs dtvsVar = this.d;
        boolean di = di(0);
        boolean z = dtvsVar.b;
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bwjh.a)))) : new long[]{f()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bwiu
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bwiy.this.getString(0)));
            }
        });
        if (!di(1)) {
            instantArr = null;
        } else if (z) {
            long[] ds = ds(getString(cM(1, bwjh.a)));
            int length2 = ds.length;
            Instant[] instantArr2 = new Instant[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                instantArr2[i2] = bdgw.b(ds[i2]);
            }
            instantArr = (Instant[]) dtub.C(null, instantArr2, new Instant[0]);
        } else {
            instantArr = new Instant[]{g()};
        }
        dtsr.dz(length, instantArr, new emyl() { // from class: bwiv
            @Override // defpackage.emyl
            public final Object get() {
                return "timestamp:".concat(String.valueOf(bwiy.this.getString(1)));
            }
        });
        String[] strArr = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, bwjh.a))), new String[0]) : new String[]{e()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: bwiw
            @Override // defpackage.emyl
            public final Object get() {
                return "hash_value:".concat(String.valueOf(bwiy.this.getString(2)));
            }
        });
        String[] strArr2 = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, bwjh.a))), new String[0]) : new String[]{c()} : null;
        dtsr.dz(length, strArr2, new emyl() { // from class: bwix
            @Override // defpackage.emyl
            public final Object get() {
                return "hash_key:".concat(String.valueOf(bwiy.this.getString(3)));
            }
        });
        engr engrVar = new engr();
        for (int i3 = 0; i3 < length; i3++) {
            long j = dB[i3];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i3]));
                String[] strArr3 = bwjh.a;
                bwii bwiiVar = new bwii();
                bwiiVar.aF();
                bwiiVar.aD();
                long j2 = dB[i3];
                if (B != null) {
                    long j3 = B[i3];
                    bwiiVar.aE(0);
                    bwiiVar.a = j3;
                }
                if (instantArr != null) {
                    Instant instant = instantArr[i3];
                    bwiiVar.aE(1);
                    bwiiVar.b = instant;
                }
                if (strArr != null) {
                    bwiiVar.c(strArr[i3]);
                }
                if (strArr2 != null) {
                    bwiiVar.b(strArr2[i3]);
                }
                engrVar.h(bwiiVar.a());
            }
        }
        return engrVar.g();
    }

    public final Instant g() {
        return bdgw.b(getLong(cM(1, bwjh.a)));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
