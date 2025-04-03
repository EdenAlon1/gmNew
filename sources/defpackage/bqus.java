package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqus extends dtsr implements bquj {
    @Deprecated
    public bqus(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bqux bquxVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bqvb.a, dtyoVar, dtvsVar, bquxVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bqto();
    }

    public final long c() {
        return getLong(cM(7, bqvb.a));
    }

    public final long e() {
        return getLong(cM(0, bqvb.a));
    }

    public final long f() {
        return getLong(cM(1, bqvb.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        axue[] axueVarArr;
        long[] jArr;
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
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bqvb.a)))) : new long[]{e()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bquk
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bqus.this.getString(0)));
            }
        });
        long[] B2 = di(1) ? z ? dtub.B(null, ds(getString(cM(1, bqvb.a)))) : new long[]{f()} : null;
        dtsr.dy(length, B2, new emyl() { // from class: bqul
            @Override // defpackage.emyl
            public final Object get() {
                return "table_type:".concat(String.valueOf(bqus.this.getString(1)));
            }
        });
        String[] strArr = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, bqvb.a))), new String[0]) : new String[]{j()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: bqum
            @Override // defpackage.emyl
            public final Object get() {
                return "item_id:".concat(String.valueOf(bqus.this.getString(2)));
            }
        });
        String[] strArr2 = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, bqvb.a))), new String[0]) : new String[]{i()} : null;
        dtsr.dz(length, strArr2, new emyl() { // from class: bqun
            @Override // defpackage.emyl
            public final Object get() {
                return "cms_id:".concat(String.valueOf(bqus.this.getString(3)));
            }
        });
        long[] B3 = di(4) ? z ? dtub.B(null, ds(getString(cM(4, bqvb.a)))) : new long[]{g()} : null;
        dtsr.dy(length, B3, new emyl() { // from class: bquo
            @Override // defpackage.emyl
            public final Object get() {
                return "timestamp:".concat(String.valueOf(bqus.this.getString(4)));
            }
        });
        if (!di(5)) {
            axueVarArr = null;
        } else if (z) {
            int[] dr = dr(getString(cM(5, bqvb.a)));
            axue[] values = axue.values();
            int length2 = values.length;
            axue[] axueVarArr2 = new axue[dr.length];
            for (int i2 = 0; i2 < dr.length; i2++) {
                int i3 = dr[i2];
                if (i3 >= length2) {
                    throw new IllegalStateException();
                }
                axueVarArr2[i2] = values[i3];
            }
            axueVarArr = (axue[]) dtub.C(null, axueVarArr2, new axue[0]);
        } else {
            axueVarArr = new axue[]{h()};
        }
        dtsr.dz(length, axueVarArr, new emyl() { // from class: bqup
            @Override // defpackage.emyl
            public final Object get() {
                return "event_type:".concat(String.valueOf(bqus.this.getString(5)));
            }
        });
        String[] strArr3 = di(6) ? z ? (String[]) dtub.C(null, dt(getString(cM(6, bqvb.a))), new String[0]) : new String[]{k()} : null;
        dtsr.dz(length, strArr3, new emyl() { // from class: bquq
            @Override // defpackage.emyl
            public final Object get() {
                return "status:".concat(String.valueOf(bqus.this.getString(6)));
            }
        });
        long[] B4 = di(7) ? z ? dtub.B(null, ds(getString(cM(7, bqvb.a)))) : new long[]{c()} : null;
        dtsr.dy(length, B4, new emyl() { // from class: bqur
            @Override // defpackage.emyl
            public final Object get() {
                return "attempt_number:".concat(String.valueOf(bqus.this.getString(7)));
            }
        });
        engr engrVar = new engr();
        int i4 = 0;
        while (i4 < length) {
            long j = dB[i4];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                jArr = dB;
            } else {
                hashSet.add(Long.valueOf(dB[i4]));
                String[] strArr4 = bqvb.a;
                bqtq bqtqVar = new bqtq();
                bqtqVar.aF();
                bqtqVar.aD();
                long j2 = dB[i4];
                jArr = dB;
                if (B != null) {
                    long j3 = B[i4];
                    bqtqVar.aE(0);
                    bqtqVar.a = j3;
                }
                if (B2 != null) {
                    bqtqVar.g(B2[i4]);
                }
                if (strArr != null) {
                    bqtqVar.e(strArr[i4]);
                }
                if (strArr2 != null) {
                    bqtqVar.c(strArr2[i4]);
                }
                if (B3 != null) {
                    bqtqVar.h(B3[i4]);
                }
                if (axueVarArr != null) {
                    bqtqVar.d(axueVarArr[i4]);
                }
                if (strArr3 != null) {
                    bqtqVar.f(strArr3[i4]);
                }
                if (B4 != null) {
                    bqtqVar.b(B4[i4]);
                }
                engrVar.h(bqtqVar.a());
            }
            i4++;
            dB = jArr;
        }
        return engrVar.g();
    }

    public final long g() {
        return getLong(cM(4, bqvb.a));
    }

    public final axue h() {
        axue[] values = axue.values();
        int i = getInt(cM(5, bqvb.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String i() {
        return getString(cM(3, bqvb.a));
    }

    public final String j() {
        return getString(cM(2, bqvb.a));
    }

    public final String k() {
        return getString(cM(6, bqvb.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
