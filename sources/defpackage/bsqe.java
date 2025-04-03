package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsqe extends dtsr implements bsqb {
    @Deprecated
    public bsqe(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bsqj bsqjVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bsqp.a, dtyoVar, dtvsVar, bsqjVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bsps();
    }

    public final long c() {
        return getLong(cM(1, bsqp.a));
    }

    public final byys e() {
        return byys.b(getInt(cM(0, bsqp.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        byys[] byysVarArr;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                if (!di) {
                    byysVarArr = null;
                } else if (z) {
                    int[] dr = dr(getString(cM(0, bsqp.a)));
                    byys[] byysVarArr2 = new byys[dr.length];
                    for (int i = 0; i < dr.length; i++) {
                        byys b = byys.b(dr[i]);
                        if (b == null) {
                            throw new IllegalStateException();
                        }
                        byysVarArr2[i] = b;
                    }
                    byysVarArr = (byys[]) dtub.C(null, byysVarArr2, new byys[0]);
                } else {
                    byysVarArr = new byys[]{e()};
                }
                dtsr.dz(length, byysVarArr, new emyl() { // from class: bsqc
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "_id:".concat(String.valueOf(bsqe.this.getString(0)));
                    }
                });
                long[] B = di(1) ? z ? dtub.B(null, ds(getString(cM(1, bsqp.a)))) : new long[]{c()} : null;
                dtsr.dy(length, B, new emyl() { // from class: bsqd
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "last_update_version:".concat(String.valueOf(bsqe.this.getString(1)));
                    }
                });
                engr engrVar = new engr();
                for (int i2 = 0; i2 < length; i2++) {
                    long j = dB[i2];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i2]));
                        String[] strArr = bsqp.a;
                        bspu bspuVar = new bspu();
                        bspuVar.aF();
                        bspuVar.aD();
                        long j2 = dB[i2];
                        if (byysVarArr != null) {
                            bspuVar.b(byysVarArr[i2]);
                        }
                        if (B != null) {
                            bspuVar.c(B[i2]);
                        }
                        engrVar.h(bspuVar.a());
                    }
                }
                return engrVar.g();
            }
        }
        int i3 = engw.d;
        return enou.a;
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
