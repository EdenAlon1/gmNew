package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqdp extends dtsr implements bqdj {
    @Deprecated
    public bqdp(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bqdu bqduVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bqea.a, dtyoVar, dtvsVar, bqduVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bqcu();
    }

    public final long c() {
        return getLong(cM(2, bqea.a));
    }

    public final long e() {
        return getLong(cM(3, bqea.a));
    }

    public final long f() {
        return getLong(cM(0, bqea.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        long[] jArr;
        int i;
        dtyq dtyqVar = dtvnVar.a;
        int i2 = 1;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length == 0 || (length == 1 && dB[0] == -1)) {
            int i3 = engw.d;
            return enou.a;
        }
        HashSet hashSet = new HashSet();
        dtvs dtvsVar = this.d;
        boolean di = di(0);
        boolean z = dtvsVar.b;
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bqea.a)))) : new long[]{f()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bqdk
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bqdp.this.getString(0)));
            }
        });
        String[] strArr = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, bqea.a))), new String[0]) : new String[]{h()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: bqdl
            @Override // defpackage.emyl
            public final Object get() {
                return "table_name:".concat(String.valueOf(bqdp.this.getString(1)));
            }
        });
        long[] B2 = di(2) ? z ? dtub.B(null, ds(getString(cM(2, bqea.a)))) : new long[]{c()} : null;
        dtsr.dy(length, B2, new emyl() { // from class: bqdm
            @Override // defpackage.emyl
            public final Object get() {
                return "backup_id:".concat(String.valueOf(bqdp.this.getString(2)));
            }
        });
        long[] B3 = di(3) ? z ? dtub.B(null, ds(getString(cM(3, bqea.a)))) : new long[]{e()} : null;
        dtsr.dy(length, B3, new emyl() { // from class: bqdn
            @Override // defpackage.emyl
            public final Object get() {
                return "bugle_id:".concat(String.valueOf(bqdp.this.getString(3)));
            }
        });
        long[] B4 = di(4) ? z ? dtub.B(null, ds(getString(cM(4, bqea.a)))) : new long[]{g()} : null;
        dtsr.dy(length, B4, new emyl() { // from class: bqdo
            @Override // defpackage.emyl
            public final Object get() {
                return "status:".concat(String.valueOf(bqdp.this.getString(4)));
            }
        });
        engr engrVar = new engr();
        int i4 = 0;
        while (i4 < length) {
            long j = dB[i4];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                jArr = B3;
                i = length;
            } else {
                hashSet.add(Long.valueOf(dB[i4]));
                String[] strArr2 = bqea.a;
                bqcw bqcwVar = new bqcw();
                bqcwVar.aF();
                bqcwVar.aD();
                long j2 = dB[i4];
                jArr = B3;
                if (B != null) {
                    long j3 = B[i4];
                    bqcwVar.aE(0);
                    bqcwVar.a = j3;
                }
                if (strArr != null) {
                    String str = strArr[i4];
                    bqcwVar.aE(i2);
                    bqcwVar.b = str;
                }
                if (B2 != null) {
                    long j4 = B2[i4];
                    bqcwVar.aE(2);
                    bqcwVar.c = j4;
                }
                if (jArr != null) {
                    long j5 = jArr[i4];
                    bqcwVar.aE(3);
                    bqcwVar.d = j5;
                }
                if (B4 != null) {
                    long j6 = B4[i4];
                    bqcwVar.aE(4);
                    bqcwVar.e = j6;
                }
                bqcu bqcuVar = new bqcu();
                bqcuVar.aC(bqcwVar.aB());
                i = length;
                bqcuVar.a = bqcwVar.a;
                bqcuVar.b = bqcwVar.b;
                bqcuVar.c = bqcwVar.c;
                bqcuVar.d = bqcwVar.d;
                bqcuVar.e = bqcwVar.e;
                bqcuVar.cK = bqcwVar.aC();
                engrVar.h(bqcuVar);
            }
            i4++;
            length = i;
            B3 = jArr;
            i2 = 1;
        }
        return engrVar.g();
    }

    public final long g() {
        return getLong(cM(4, bqea.a));
    }

    public final String h() {
        return getString(cM(1, bqea.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
