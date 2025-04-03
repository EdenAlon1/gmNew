package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwpx extends dtsr implements bwpq {
    @Deprecated
    public bwpx(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bwqc bwqcVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bwqg.a, dtyoVar, dtvsVar, bwqcVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bwoy();
    }

    public final axuf c() {
        axuf[] values = axuf.values();
        int i = getInt(cM(2, bwqg.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String e() {
        return getString(cM(3, bwqg.a));
    }

    public final String f() {
        return getString(cM(0, bwqg.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        axuf[] axufVarArr;
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
        String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, bwqg.a))), new String[0]) : new String[]{f()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: bwpr
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bwpx.this.getString(0)));
            }
        });
        String[] strArr2 = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, bwqg.a))), new String[0]) : new String[]{h()} : null;
        dtsr.dz(length, strArr2, new emyl() { // from class: bwps
            @Override // defpackage.emyl
            public final Object get() {
                return "rbm_bot_id:".concat(String.valueOf(bwpx.this.getString(1)));
            }
        });
        if (!di(2)) {
            axufVarArr = null;
        } else if (z) {
            int[] dr = dr(getString(cM(2, bwqg.a)));
            axuf[] values = axuf.values();
            int length2 = values.length;
            axuf[] axufVarArr2 = new axuf[dr.length];
            for (int i2 = 0; i2 < dr.length; i2++) {
                int i3 = dr[i2];
                if (i3 >= length2) {
                    throw new IllegalStateException();
                }
                axufVarArr2[i2] = values[i3];
            }
            axufVarArr = (axuf[]) dtub.C(null, axufVarArr2, new axuf[0]);
        } else {
            axufVarArr = new axuf[]{c()};
        }
        dtsr.dz(length, axufVarArr, new emyl() { // from class: bwpt
            @Override // defpackage.emyl
            public final Object get() {
                return "type:".concat(String.valueOf(bwpx.this.getString(2)));
            }
        });
        String[] strArr3 = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, bwqg.a))), new String[0]) : new String[]{e()} : null;
        dtsr.dz(length, strArr3, new emyl() { // from class: bwpu
            @Override // defpackage.emyl
            public final Object get() {
                return "header:".concat(String.valueOf(bwpx.this.getString(3)));
            }
        });
        String[] strArr4 = di(4) ? z ? (String[]) dtub.C(null, dt(getString(cM(4, bwqg.a))), new String[0]) : new String[]{i()} : null;
        dtsr.dz(length, strArr4, new emyl() { // from class: bwpv
            @Override // defpackage.emyl
            public final Object get() {
                return "subheader:".concat(String.valueOf(bwpx.this.getString(4)));
            }
        });
        String[] strArr5 = di(5) ? z ? (String[]) dtub.C(null, dt(getString(cM(5, bwqg.a))), new String[0]) : new String[]{g()} : null;
        dtsr.dz(length, strArr5, new emyl() { // from class: bwpw
            @Override // defpackage.emyl
            public final Object get() {
                return "property_value:".concat(String.valueOf(bwpx.this.getString(5)));
            }
        });
        engr engrVar = new engr();
        for (int i4 = 0; i4 < length; i4++) {
            long j = dB[i4];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i4]));
                String[] strArr6 = bwqg.a;
                bwpa bwpaVar = new bwpa();
                bwpaVar.aF();
                bwpaVar.aD();
                long j2 = dB[i4];
                if (strArr != null) {
                    String str = strArr[i4];
                    bwpaVar.aE(0);
                    bwpaVar.a = str;
                }
                if (strArr2 != null) {
                    bwpaVar.d(strArr2[i4]);
                }
                if (axufVarArr != null) {
                    bwpaVar.f(axufVarArr[i4]);
                }
                if (strArr3 != null) {
                    bwpaVar.b(strArr3[i4]);
                }
                if (strArr4 != null) {
                    bwpaVar.e(strArr4[i4]);
                }
                if (strArr5 != null) {
                    bwpaVar.c(strArr5[i4]);
                }
                engrVar.h(bwpaVar.a());
            }
        }
        return engrVar.g();
    }

    public final String g() {
        return getString(cM(5, bwqg.a));
    }

    public final String h() {
        return getString(cM(1, bwqg.a));
    }

    public final String i() {
        return getString(cM(4, bwqg.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
