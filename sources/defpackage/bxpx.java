package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxpx extends dtsr implements bxps {
    @Deprecated
    public bxpx(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bxqc bxqcVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bxqg.a, dtyoVar, dtvsVar, bxqcVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bxpf();
    }

    public final long c() {
        return getLong(cM(2, bxqg.a));
    }

    public final long e() {
        return getLong(cM(3, bxqg.a));
    }

    public final byyn f() {
        byyn[] values = byyn.values();
        int i = getInt(cM(0, bxqg.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        byyn[] byynVarArr;
        int i;
        HashSet hashSet;
        dtyq dtyqVar = dtvnVar.a;
        int i2 = 1;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            int i3 = 0;
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet2 = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                if (!di) {
                    byynVarArr = null;
                } else if (z) {
                    int[] dr = dr(getString(cM(0, bxqg.a)));
                    byyn[] values = byyn.values();
                    int length2 = values.length;
                    byyn[] byynVarArr2 = new byyn[dr.length];
                    for (int i4 = 0; i4 < dr.length; i4++) {
                        int i5 = dr[i4];
                        if (i5 >= length2) {
                            throw new IllegalStateException();
                        }
                        byynVarArr2[i4] = values[i5];
                    }
                    byynVarArr = (byyn[]) dtub.C(null, byynVarArr2, new byyn[0]);
                } else {
                    byynVarArr = new byyn[]{f()};
                }
                dtsr.dz(length, byynVarArr, new emyl() { // from class: bxpt
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "which_database:".concat(String.valueOf(bxpx.this.getString(0)));
                    }
                });
                String[] strArr = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, bxqg.a))), new String[0]) : new String[]{g()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: bxpu
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(bxpx.this.getString(1)));
                    }
                });
                long[] B = di(2) ? z ? dtub.B(null, ds(getString(cM(2, bxqg.a)))) : new long[]{c()} : null;
                dtsr.dy(length, B, new emyl() { // from class: bxpv
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "timestamp_in_seconds:".concat(String.valueOf(bxpx.this.getString(2)));
                    }
                });
                long[] B2 = di(3) ? z ? dtub.B(null, ds(getString(cM(3, bxqg.a)))) : new long[]{e()} : null;
                dtsr.dy(length, B2, new emyl() { // from class: bxpw
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "timestamp_mod_1000:".concat(String.valueOf(bxpx.this.getString(3)));
                    }
                });
                engr engrVar = new engr();
                int i6 = 0;
                while (i6 < length) {
                    long j = dB[i6];
                    if (j <= 0 || hashSet2.contains(Long.valueOf(j))) {
                        i = length;
                        hashSet = hashSet2;
                    } else {
                        hashSet2.add(Long.valueOf(dB[i6]));
                        String[] strArr2 = bxqg.a;
                        bxph bxphVar = new bxph();
                        bxphVar.aF();
                        bxphVar.aD();
                        long j2 = dB[i6];
                        if (byynVarArr != null) {
                            byyn byynVar = byynVarArr[i6];
                            bxphVar.aE(i3);
                            bxphVar.a = byynVar;
                        }
                        if (strArr != null) {
                            String str = strArr[i6];
                            bxphVar.aE(i2);
                            bxphVar.b = str;
                        }
                        i = length;
                        if (B != null) {
                            long j3 = B[i6];
                            bxphVar.aE(2);
                            bxphVar.c = j3;
                        }
                        if (B2 != null) {
                            long j4 = B2[i6];
                            bxphVar.aE(3);
                            bxphVar.d = j4;
                        }
                        bxpf bxpfVar = new bxpf();
                        bxpfVar.aC(bxphVar.aB());
                        bxpfVar.a = bxphVar.a;
                        bxpfVar.b = bxphVar.b;
                        hashSet = hashSet2;
                        bxpfVar.c = bxphVar.c;
                        bxpfVar.d = bxphVar.d;
                        bxpfVar.cK = bxphVar.aC();
                        engrVar.h(bxpfVar);
                    }
                    i6++;
                    length = i;
                    hashSet2 = hashSet;
                    i2 = 1;
                    i3 = 0;
                }
                return engrVar.g();
            }
        }
        int i7 = engw.d;
        return enou.a;
    }

    public final String g() {
        return getString(cM(1, bxqg.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
