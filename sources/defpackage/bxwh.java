package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxwh extends dtsr implements bxwb {
    @Deprecated
    public bxwh(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bxwm bxwmVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bxws.a, dtyoVar, dtvsVar, bxwmVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bxvm();
    }

    public final long c() {
        return getLong(cM(0, bxws.a));
    }

    public final long e() {
        return getLong(cM(4, bxws.a));
    }

    public final String f() {
        return getString(cM(1, bxws.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
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
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bxws.a)))) : new long[]{c()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bxwc
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bxwh.this.getString(0)));
            }
        });
        String[] strArr = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, bxws.a))), new String[0]) : new String[]{f()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: bxwd
            @Override // defpackage.emyl
            public final Object get() {
                return "key:".concat(String.valueOf(bxwh.this.getString(1)));
            }
        });
        String[] strArr2 = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, bxws.a))), new String[0]) : new String[]{g()} : null;
        dtsr.dz(length, strArr2, new emyl() { // from class: bxwe
            @Override // defpackage.emyl
            public final Object get() {
                return "sub_key:".concat(String.valueOf(bxwh.this.getString(2)));
            }
        });
        byte[][] E = di(3) ? z ? dtub.E(null, dC(getString(cM(3, bxws.a)))) : new byte[][]{h()} : null;
        dtsr.dz(length, E, new emyl() { // from class: bxwf
            @Override // defpackage.emyl
            public final Object get() {
                return "data:".concat(String.valueOf(bxwh.this.getString(3)));
            }
        });
        long[] B2 = di(4) ? z ? dtub.B(null, ds(getString(cM(4, bxws.a)))) : new long[]{e()} : null;
        dtsr.dy(length, B2, new emyl() { // from class: bxwg
            @Override // defpackage.emyl
            public final Object get() {
                return "last_modified_timestamp:".concat(String.valueOf(bxwh.this.getString(4)));
            }
        });
        engr engrVar = new engr();
        for (int i2 = 0; i2 < length; i2++) {
            long j = dB[i2];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i2]));
                String[] strArr3 = bxws.a;
                bxvo bxvoVar = new bxvo();
                bxvoVar.aF();
                bxvoVar.aD();
                long j2 = dB[i2];
                if (B != null) {
                    long j3 = B[i2];
                    bxvoVar.aE(0);
                    bxvoVar.a = j3;
                }
                if (strArr != null) {
                    bxvoVar.c(strArr[i2]);
                }
                if (strArr2 != null) {
                    bxvoVar.d(strArr2[i2]);
                }
                if (E != null) {
                    bxvoVar.b(E[i2]);
                }
                if (B2 != null) {
                    long j4 = B2[i2];
                    bxvoVar.aE(4);
                    bxvoVar.e = j4;
                }
                engrVar.h(bxvoVar.a());
            }
        }
        return engrVar.g();
    }

    public final String g() {
        return getString(cM(2, bxws.a));
    }

    public final byte[] h() {
        return getBlob(cM(3, bxws.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
