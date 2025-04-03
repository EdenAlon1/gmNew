package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nkk implements ncr {
    private final ncr a;
    private final nkh b;
    private final SparseArray c = new SparseArray();
    private boolean d;

    public nkk(ncr ncrVar, nkh nkhVar) {
        this.a = ncrVar;
        this.b = nkhVar;
    }

    @Override // defpackage.ncr
    public final ndu p(int i, int i2) {
        if (i2 != 3) {
            this.d = true;
            return this.a.p(i, i2);
        }
        nkm nkmVar = (nkm) this.c.get(i);
        if (nkmVar != null) {
            return nkmVar;
        }
        nkm nkmVar2 = new nkm(this.a.p(i, 3), this.b);
        this.c.put(i, nkmVar2);
        return nkmVar2;
    }

    @Override // defpackage.ncr
    public final void r() {
        this.a.r();
        if (this.d) {
            for (int i = 0; i < this.c.size(); i++) {
                ((nkm) this.c.valueAt(i)).d = true;
            }
        }
    }

    @Override // defpackage.ncr
    public final void w(ndn ndnVar) {
        this.a.w(ndnVar);
    }
}
