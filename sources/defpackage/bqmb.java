package defpackage;

import android.database.Cursor;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqmb extends dtsr implements bqlv {
    @Deprecated
    public bqmb(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bqmh bqmhVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bqmm.a, dtyoVar, dtvsVar, bqmhVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bqle();
    }

    @Override // defpackage.bqlv
    public final engw c() {
        engr engrVar = new engr();
        while (moveToNext()) {
            g();
            engrVar.h(Long.valueOf(g()));
        }
        return engrVar.g();
    }

    public final long e() {
        return getLong(cM(2, bqmm.a));
    }

    public final long f() {
        return getLong(cM(4, bqmm.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        bqmn[] bqmnVarArr;
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
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bqmm.a)))) : new long[]{g()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bqlw
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bqmb.this.getString(0)));
            }
        });
        long[] B2 = di(1) ? z ? dtub.B(null, ds(getString(cM(1, bqmm.a)))) : new long[]{h()} : null;
        dtsr.dy(length, B2, new emyl() { // from class: bqlx
            @Override // defpackage.emyl
            public final Object get() {
                return "message_id:".concat(String.valueOf(bqmb.this.getString(1)));
            }
        });
        long[] B3 = di(2) ? z ? dtub.B(null, ds(getString(cM(2, bqmm.a)))) : new long[]{e()} : null;
        dtsr.dy(length, B3, new emyl() { // from class: bqly
            @Override // defpackage.emyl
            public final Object get() {
                return "conversation_id:".concat(String.valueOf(bqmb.this.getString(2)));
            }
        });
        if (!di(3)) {
            bqmnVarArr = null;
        } else if (z) {
            int[] dr = dr(getString(cM(3, bqmm.a)));
            bqmn[] values = bqmn.values();
            int length2 = values.length;
            bqmn[] bqmnVarArr2 = new bqmn[dr.length];
            for (int i2 = 0; i2 < dr.length; i2++) {
                int i3 = dr[i2];
                if (i3 >= length2) {
                    throw new IllegalStateException();
                }
                bqmnVarArr2[i2] = values[i3];
            }
            bqmnVarArr = (bqmn[]) dtub.C(null, bqmnVarArr2, new bqmn[0]);
        } else {
            bqmnVarArr = new bqmn[]{i()};
        }
        dtsr.dz(length, bqmnVarArr, new emyl() { // from class: bqlz
            @Override // defpackage.emyl
            public final Object get() {
                return "message_deletion_reason:".concat(String.valueOf(bqmb.this.getString(3)));
            }
        });
        long[] B4 = di(4) ? z ? dtub.B(null, ds(getString(cM(4, bqmm.a)))) : new long[]{f()} : null;
        dtsr.dy(length, B4, new emyl() { // from class: bqma
            @Override // defpackage.emyl
            public final Object get() {
                return "deletion_timestamp:".concat(String.valueOf(bqmb.this.getString(4)));
            }
        });
        engr engrVar = new engr();
        for (int i4 = 0; i4 < length; i4++) {
            long j = dB[i4];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i4]));
                String[] strArr = bqmm.a;
                bqli bqliVar = new bqli();
                bqliVar.aF();
                bqliVar.aD();
                long j2 = dB[i4];
                if (B != null) {
                    long j3 = B[i4];
                    bqliVar.aE(0);
                    bqliVar.a = j3;
                }
                if (B2 != null) {
                    bqliVar.d(B2[i4]);
                }
                if (B3 != null) {
                    long j4 = B3[i4];
                    bqliVar.aE(2);
                    bqliVar.c = j4;
                }
                if (bqmnVarArr != null) {
                    bqliVar.c(bqmnVarArr[i4]);
                }
                if (B4 != null) {
                    bqliVar.b(B4[i4]);
                }
                engrVar.h(bqliVar.a(new Supplier() { // from class: bqlg
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new bqle();
                    }
                }));
            }
        }
        return engrVar.g();
    }

    public final long g() {
        return getLong(cM(0, bqmm.a));
    }

    public final long h() {
        return getLong(cM(1, bqmm.a));
    }

    public final bqmn i() {
        bqmn[] values = bqmn.values();
        int i = getInt(cM(3, bqmm.a));
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
