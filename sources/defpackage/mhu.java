package defpackage;

import android.util.Pair;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mhu implements mtw, mpi {
    final /* synthetic */ mhy a;
    private final mhw b;

    public mhu(mhy mhyVar, mhw mhwVar) {
        this.a = mhyVar;
        this.b = mhwVar;
    }

    private final Pair k(mtl mtlVar) {
        mtl mtlVar2;
        mtl mtlVar3 = null;
        if (mtlVar != null) {
            mhw mhwVar = this.b;
            int i = 0;
            while (true) {
                if (i >= mhwVar.c.size()) {
                    mtlVar2 = null;
                    break;
                }
                if (((mtl) mhwVar.c.get(i)).d == mtlVar.d) {
                    Object obj = mtlVar.a;
                    Object obj2 = mhwVar.b;
                    int i2 = mif.e;
                    mtlVar2 = mtlVar.a(Pair.create(obj2, obj));
                    break;
                }
                i++;
            }
            if (mtlVar2 == null) {
                return null;
            }
            mtlVar3 = mtlVar2;
        }
        return Pair.create(Integer.valueOf(this.b.d), mtlVar3);
    }

    @Override // defpackage.mtw
    public final void eA(int i, mtl mtlVar, final mth mthVar) {
        final Pair k = k(mtlVar);
        if (k != null) {
            mhy mhyVar = this.a;
            mhyVar.h.b(new Runnable() { // from class: mho
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = k;
                    mhu.this.a.g.eA(((Integer) pair.first).intValue(), (mtl) pair.second, mthVar);
                }
            });
        }
    }

    @Override // defpackage.mtw
    public final void eB(int i, mtl mtlVar, final mtc mtcVar, final mth mthVar) {
        final Pair k = k(mtlVar);
        if (k != null) {
            mhy mhyVar = this.a;
            mhyVar.h.b(new Runnable() { // from class: mhm
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = k;
                    mhu.this.a.g.eB(((Integer) pair.first).intValue(), (mtl) pair.second, mtcVar, mthVar);
                }
            });
        }
    }

    @Override // defpackage.mtw
    public final void eC(int i, mtl mtlVar, final mtc mtcVar, final mth mthVar) {
        final Pair k = k(mtlVar);
        if (k != null) {
            mhy mhyVar = this.a;
            mhyVar.h.b(new Runnable() { // from class: mhr
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = k;
                    mhu.this.a.g.eC(((Integer) pair.first).intValue(), (mtl) pair.second, mtcVar, mthVar);
                }
            });
        }
    }

    @Override // defpackage.mtw
    public final void eD(int i, mtl mtlVar, final mtc mtcVar, final mth mthVar, final IOException iOException, final boolean z) {
        final Pair k = k(mtlVar);
        if (k != null) {
            mhy mhyVar = this.a;
            mhyVar.h.b(new Runnable() { // from class: mhl
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = k;
                    mhu.this.a.g.eD(((Integer) pair.first).intValue(), (mtl) pair.second, mtcVar, mthVar, iOException, z);
                }
            });
        }
    }

    @Override // defpackage.mtw
    public final void eE(int i, mtl mtlVar, final mtc mtcVar, final mth mthVar, final int i2) {
        final Pair k = k(mtlVar);
        if (k != null) {
            mhy mhyVar = this.a;
            mhyVar.h.b(new Runnable() { // from class: mhk
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = k;
                    mhu.this.a.g.eE(((Integer) pair.first).intValue(), (mtl) pair.second, mtcVar, mthVar, i2);
                }
            });
        }
    }

    @Override // defpackage.mpi
    public final void eF(int i, mtl mtlVar) {
        final Pair k = k(mtlVar);
        if (k != null) {
            mhy mhyVar = this.a;
            mhyVar.h.b(new Runnable() { // from class: mht
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = k;
                    mhu.this.a.g.eF(((Integer) pair.first).intValue(), (mtl) pair.second);
                }
            });
        }
    }

    @Override // defpackage.mpi
    public final void eG(int i, mtl mtlVar) {
        final Pair k = k(mtlVar);
        if (k != null) {
            mhy mhyVar = this.a;
            mhyVar.h.b(new Runnable() { // from class: mhp
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = k;
                    mhu.this.a.g.eG(((Integer) pair.first).intValue(), (mtl) pair.second);
                }
            });
        }
    }

    @Override // defpackage.mpi
    public final void eH(int i, mtl mtlVar, final int i2) {
        final Pair k = k(mtlVar);
        if (k != null) {
            mhy mhyVar = this.a;
            mhyVar.h.b(new Runnable() { // from class: mhs
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = k;
                    mhu.this.a.g.eH(((Integer) pair.first).intValue(), (mtl) pair.second, i2);
                }
            });
        }
    }

    @Override // defpackage.mpi
    public final void eI(int i, mtl mtlVar, final Exception exc) {
        final Pair k = k(mtlVar);
        if (k != null) {
            mhy mhyVar = this.a;
            mhyVar.h.b(new Runnable() { // from class: mhn
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = k;
                    mhu.this.a.g.eI(((Integer) pair.first).intValue(), (mtl) pair.second, exc);
                }
            });
        }
    }

    @Override // defpackage.mpi
    public final void eJ(int i, mtl mtlVar) {
        final Pair k = k(mtlVar);
        if (k != null) {
            mhy mhyVar = this.a;
            mhyVar.h.b(new Runnable() { // from class: mhq
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = k;
                    mhu.this.a.g.eJ(((Integer) pair.first).intValue(), (mtl) pair.second);
                }
            });
        }
    }
}
