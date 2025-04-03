package defpackage;

import android.database.Cursor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxmj extends dtsr implements bxmd {
    @Deprecated
    public bxmj(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bxmo bxmoVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bxmu.a, dtyoVar, dtvsVar, bxmoVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bxll();
    }

    public final long c() {
        return getLong(cM(0, bxmu.a));
    }

    public final long e() {
        return getLong(cM(1, bxmu.a));
    }

    public final akcg f() {
        byte[] blob = getBlob(cM(2, bxmu.a));
        if (blob == null) {
            return null;
        }
        try {
            return (akcg) eyfy.parseFrom(akcg.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return akcg.a;
        }
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        akcg[] akcgVarArr;
        bxmw[] bxmwVarArr;
        akcg akcgVar;
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
        bxmv[] bxmvVarArr = null;
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bxmu.a)))) : new long[]{c()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bxme
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bxmj.this.getString(0)));
            }
        });
        long[] B2 = di(1) ? z ? dtub.B(null, ds(getString(cM(1, bxmu.a)))) : new long[]{e()} : null;
        dtsr.dy(length, B2, new emyl() { // from class: bxmf
            @Override // defpackage.emyl
            public final Object get() {
                return "workflow_execution_id:".concat(String.valueOf(bxmj.this.getString(1)));
            }
        });
        if (!di(2)) {
            akcgVarArr = null;
        } else if (z) {
            List de = de(getString(cM(2, bxmu.a)));
            akcg[] akcgVarArr2 = new akcg[de.size()];
            Iterator it = de.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                try {
                    byte[] y = dtub.y((String) it.next());
                    int i3 = i2 + 1;
                    if (y == null) {
                        akcgVar = null;
                    } else {
                        try {
                            akcgVar = (akcg) eyfy.parseFrom(akcg.a, y);
                        } catch (Throwable unused) {
                            i2 = i3;
                            akcgVarArr2[i2] = null;
                            i2++;
                        }
                    }
                    akcgVarArr2[i2] = akcgVar;
                    i2 = i3;
                } catch (Throwable unused2) {
                }
            }
            akcgVarArr = (akcg[]) dtub.C(null, akcgVarArr2, new akcg[0]);
        } else {
            akcgVarArr = new akcg[]{f()};
        }
        dtsr.dz(length, akcgVarArr, new emyl() { // from class: bxmg
            @Override // defpackage.emyl
            public final Object get() {
                return "backup_file:".concat(String.valueOf(bxmj.this.getString(2)));
            }
        });
        if (!di(3)) {
            bxmwVarArr = null;
        } else if (z) {
            int[] dr = dr(getString(cM(3, bxmu.a)));
            bxmw[] values = bxmw.values();
            int length2 = values.length;
            bxmw[] bxmwVarArr2 = new bxmw[dr.length];
            for (int i4 = 0; i4 < dr.length; i4++) {
                int i5 = dr[i4];
                if (i5 >= length2) {
                    throw new IllegalStateException();
                }
                bxmwVarArr2[i4] = values[i5];
            }
            bxmwVarArr = (bxmw[]) dtub.C(null, bxmwVarArr2, new bxmw[0]);
        } else {
            bxmwVarArr = new bxmw[]{h()};
        }
        dtsr.dz(length, bxmwVarArr, new emyl() { // from class: bxmh
            @Override // defpackage.emyl
            public final Object get() {
                return "file_type:".concat(String.valueOf(bxmj.this.getString(3)));
            }
        });
        if (di(4)) {
            if (z) {
                int[] dr2 = dr(getString(cM(4, bxmu.a)));
                bxmv[] values2 = bxmv.values();
                int length3 = values2.length;
                bxmv[] bxmvVarArr2 = new bxmv[dr2.length];
                for (int i6 = 0; i6 < dr2.length; i6++) {
                    int i7 = dr2[i6];
                    if (i7 >= length3) {
                        throw new IllegalStateException();
                    }
                    bxmvVarArr2[i6] = values2[i7];
                }
                bxmvVarArr = (bxmv[]) dtub.C(null, bxmvVarArr2, new bxmv[0]);
            } else {
                bxmvVarArr = new bxmv[]{g()};
            }
        }
        dtsr.dz(length, bxmvVarArr, new emyl() { // from class: bxmi
            @Override // defpackage.emyl
            public final Object get() {
                return "status:".concat(String.valueOf(bxmj.this.getString(4)));
            }
        });
        engr engrVar = new engr();
        for (int i8 = 0; i8 < length; i8++) {
            long j = dB[i8];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i8]));
                String[] strArr = bxmu.a;
                bxlp bxlpVar = new bxlp();
                bxlpVar.aF();
                bxlpVar.aD();
                long j2 = dB[i8];
                if (B != null) {
                    long j3 = B[i8];
                    bxlpVar.aE(0);
                    bxlpVar.a = j3;
                }
                if (B2 != null) {
                    bxlpVar.f(B2[i8]);
                }
                if (akcgVarArr != null) {
                    bxlpVar.c(akcgVarArr[i8]);
                }
                if (bxmwVarArr != null) {
                    bxlpVar.d(bxmwVarArr[i8]);
                }
                if (bxmvVarArr != null) {
                    bxlpVar.e(bxmvVarArr[i8]);
                }
                engrVar.h(bxlpVar.a(new Supplier() { // from class: bxln
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new bxll();
                    }
                }));
            }
        }
        return engrVar.g();
    }

    public final bxmv g() {
        bxmv[] values = bxmv.values();
        int i = getInt(cM(4, bxmu.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final bxmw h() {
        bxmw[] values = bxmw.values();
        int i = getInt(cM(3, bxmu.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
