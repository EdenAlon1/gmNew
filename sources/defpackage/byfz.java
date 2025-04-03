package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byfz extends dtsr implements byfw {
    @Deprecated
    public byfz(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bygc bygcVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, byge.a, dtyoVar, dtvsVar, bygcVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new byfn();
    }

    public final byzn c() {
        return byzn.b(getInt(cM(0, byge.a)));
    }

    public final boolean e() {
        return getInt(cM(1, byge.a)) == 1;
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        byzn[] byznVarArr;
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
            byznVarArr = null;
        } else if (z) {
            int[] dr = dr(getString(cM(0, byge.a)));
            byzn[] byznVarArr2 = new byzn[dr.length];
            for (int i2 = 0; i2 < dr.length; i2++) {
                byzn b = byzn.b(dr[i2]);
                if (b == null) {
                    throw new IllegalStateException();
                }
                byznVarArr2[i2] = b;
            }
            byznVarArr = (byzn[]) dtub.C(null, byznVarArr2, new byzn[0]);
        } else {
            byznVarArr = new byzn[]{c()};
        }
        dtsr.dz(length, byznVarArr, new emyl() { // from class: byfx
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(byfz.this.getString(0)));
            }
        });
        boolean[] D = di(1) ? z ? dtub.D(null, du(getString(cM(1, byge.a)))) : new boolean[]{e()} : null;
        dtsr.dA(length, D, new emyl() { // from class: byfy
            @Override // defpackage.emyl
            public final Object get() {
                return "enabled:".concat(String.valueOf(byfz.this.getString(1)));
            }
        });
        engr engrVar = new engr();
        for (int i3 = 0; i3 < length; i3++) {
            long j = dB[i3];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i3]));
                String[] strArr = byge.a;
                byfp byfpVar = new byfp();
                byfpVar.aF();
                byfpVar.aD();
                long j2 = dB[i3];
                if (byznVarArr != null) {
                    byzn byznVar = byznVarArr[i3];
                    byfpVar.aE(0);
                    byfpVar.a = byznVar;
                }
                if (D != null) {
                    boolean z2 = D[i3];
                    byfpVar.aE(1);
                    byfpVar.b = z2;
                }
                byfn byfnVar = new byfn();
                byfnVar.aC(byfpVar.aB());
                byfnVar.a = byfpVar.a;
                byfnVar.b = byfpVar.b;
                byfnVar.cK = byfpVar.aC();
                engrVar.h(byfnVar);
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
