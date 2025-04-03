package defpackage;

import android.database.Cursor;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btdl extends dtsr implements btdg {
    @Deprecated
    public btdl(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, btdr btdrVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, btdw.a, dtyoVar, dtvsVar, btdrVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new btcr();
    }

    @Override // defpackage.btdg
    public final long c() {
        return getLong(cM(1, btdw.a));
    }

    @Override // defpackage.btdg
    public final aliq e() {
        return aliq.b(getInt(cM(2, btdw.a)));
    }

    @Override // defpackage.btdg
    public final String f() {
        return getString(cM(3, btdw.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        aliq[] aliqVarArr;
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
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, btdw.a)))) : new long[]{g()} : null;
        dtsr.dy(length, B, new emyl() { // from class: btdh
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(btdl.this.getString(0)));
            }
        });
        long[] B2 = di(1) ? z ? dtub.B(null, ds(getString(cM(1, btdw.a)))) : new long[]{c()} : null;
        dtsr.dy(length, B2, new emyl() { // from class: btdi
            @Override // defpackage.emyl
            public final Object get() {
                return "timestamp:".concat(String.valueOf(btdl.this.getString(1)));
            }
        });
        if (!di(2)) {
            aliqVarArr = null;
        } else if (z) {
            int[] dr = dr(getString(cM(2, btdw.a)));
            aliq[] aliqVarArr2 = new aliq[dr.length];
            for (int i2 = 0; i2 < dr.length; i2++) {
                aliq b = aliq.b(dr[i2]);
                if (b == null) {
                    throw new IllegalStateException();
                }
                aliqVarArr2[i2] = b;
            }
            aliqVarArr = (aliq[]) dtub.C(null, aliqVarArr2, new aliq[0]);
        } else {
            aliqVarArr = new aliq[]{e()};
        }
        dtsr.dz(length, aliqVarArr, new emyl() { // from class: btdj
            @Override // defpackage.emyl
            public final Object get() {
                return "event:".concat(String.valueOf(btdl.this.getString(2)));
            }
        });
        String[] strArr = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, btdw.a))), new String[0]) : new String[]{f()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: btdk
            @Override // defpackage.emyl
            public final Object get() {
                return "data:".concat(String.valueOf(btdl.this.getString(3)));
            }
        });
        engr engrVar = new engr();
        for (int i3 = 0; i3 < length; i3++) {
            long j = dB[i3];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i3]));
                String[] strArr2 = btdw.a;
                btcv btcvVar = new btcv();
                btcvVar.aF();
                btcvVar.aD();
                long j2 = dB[i3];
                if (B != null) {
                    long j3 = B[i3];
                    btcvVar.aE(0);
                    btcvVar.a = j3;
                }
                if (B2 != null) {
                    btcvVar.d(B2[i3]);
                }
                if (aliqVarArr != null) {
                    btcvVar.c(aliqVarArr[i3]);
                }
                if (strArr != null) {
                    btcvVar.b(strArr[i3]);
                }
                engrVar.h(btcvVar.a(new Supplier() { // from class: btct
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new btcr();
                    }
                }));
            }
        }
        return engrVar.g();
    }

    public final long g() {
        return getLong(cM(0, btdw.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
