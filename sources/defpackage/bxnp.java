package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxnp extends dtsr implements bxnl {
    @Deprecated
    public bxnp(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bxnu bxnuVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bxny.a, dtyoVar, dtvsVar, bxnuVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bxna();
    }

    public final bxnz c() {
        bxnz[] values = bxnz.values();
        int i = getInt(cM(0, bxny.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final String e() {
        return getString(cM(1, bxny.a));
    }

    public final String f() {
        return getString(cM(2, bxny.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        bxnz[] bxnzVarArr;
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
        if (!di) {
            bxnzVarArr = null;
        } else if (z) {
            int[] dr = dr(getString(cM(0, bxny.a)));
            bxnz[] values = bxnz.values();
            int length2 = values.length;
            bxnz[] bxnzVarArr2 = new bxnz[dr.length];
            for (int i2 = 0; i2 < dr.length; i2++) {
                int i3 = dr[i2];
                if (i3 >= length2) {
                    throw new IllegalStateException();
                }
                bxnzVarArr2[i2] = values[i3];
            }
            bxnzVarArr = (bxnz[]) dtub.C(null, bxnzVarArr2, new bxnz[0]);
        } else {
            bxnzVarArr = new bxnz[]{c()};
        }
        dtsr.dz(length, bxnzVarArr, new emyl() { // from class: bxnm
            @Override // defpackage.emyl
            public final Object get() {
                return "key:".concat(String.valueOf(bxnp.this.getString(0)));
            }
        });
        String[] strArr = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, bxny.a))), new String[0]) : new String[]{e()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: bxnn
            @Override // defpackage.emyl
            public final Object get() {
                return "backup_id:".concat(String.valueOf(bxnp.this.getString(1)));
            }
        });
        String[] strArr2 = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, bxny.a))), new String[0]) : new String[]{f()} : null;
        dtsr.dz(length, strArr2, new emyl() { // from class: bxno
            @Override // defpackage.emyl
            public final Object get() {
                return "bugle_id:".concat(String.valueOf(bxnp.this.getString(2)));
            }
        });
        engr engrVar = new engr();
        for (int i4 = 0; i4 < length; i4++) {
            long j = dB[i4];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i4]));
                String[] strArr3 = bxny.a;
                bxnc bxncVar = new bxnc();
                bxncVar.aF();
                bxncVar.aD();
                long j2 = dB[i4];
                if (bxnzVarArr != null) {
                    bxnz bxnzVar = bxnzVarArr[i4];
                    bxncVar.aE(0);
                    bxncVar.a = bxnzVar;
                }
                if (strArr != null) {
                    String str = strArr[i4];
                    bxncVar.aE(1);
                    bxncVar.b = str;
                }
                if (strArr2 != null) {
                    String str2 = strArr2[i4];
                    bxncVar.aE(2);
                    bxncVar.c = str2;
                }
                bxna bxnaVar = new bxna();
                bxnaVar.aC(bxncVar.aB());
                bxnaVar.a = bxncVar.a;
                bxnaVar.b = bxncVar.b;
                bxnaVar.c = bxncVar.c;
                bxnaVar.cK = bxncVar.aC();
                engrVar.h(bxnaVar);
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
