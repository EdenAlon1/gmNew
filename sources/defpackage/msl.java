package defpackage;

import j$.util.Objects;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class msl implements mtw, mpi {
    final /* synthetic */ msn a;
    private final Object b;
    private mtv c;
    private mph d;

    public msl(msn msnVar, Object obj) {
        this.a = msnVar;
        this.c = msnVar.c(null);
        this.d = msnVar.b(null);
        this.b = obj;
    }

    private final boolean k(mtl mtlVar) {
        mtl mtlVar2;
        if (mtlVar != null) {
            mtlVar2 = this.a.x(this.b, mtlVar);
            if (mtlVar2 == null) {
                return false;
            }
        } else {
            mtlVar2 = null;
        }
        this.a.A(this.b);
        mtv mtvVar = this.c;
        int i = mtvVar.a;
        mtl mtlVar3 = mtvVar.b;
        int i2 = lvf.a;
        if (!Objects.equals(mtlVar3, mtlVar2)) {
            this.c = this.a.b.g(mtlVar2);
        }
        mph mphVar = this.d;
        int i3 = mphVar.a;
        if (Objects.equals(mphVar.b, mtlVar2)) {
            return true;
        }
        this.d = this.a.c.f(mtlVar2);
        return true;
    }

    private final mth l(mth mthVar) {
        this.a.B(this.b);
        this.a.B(this.b);
        long j = mthVar.c;
        long j2 = mthVar.c;
        long j3 = mthVar.d;
        return (j == j2 && j3 == mthVar.d) ? mthVar : new mth(mthVar.a, mthVar.b, j, j3);
    }

    @Override // defpackage.mtw
    public final void eA(int i, mtl mtlVar, mth mthVar) {
        if (k(mtlVar)) {
            this.c.b(l(mthVar));
        }
    }

    @Override // defpackage.mtw
    public final void eB(int i, mtl mtlVar, mtc mtcVar, mth mthVar) {
        if (k(mtlVar)) {
            this.c.c(mtcVar, l(mthVar));
        }
    }

    @Override // defpackage.mtw
    public final void eC(int i, mtl mtlVar, mtc mtcVar, mth mthVar) {
        if (k(mtlVar)) {
            this.c.d(mtcVar, l(mthVar));
        }
    }

    @Override // defpackage.mtw
    public final void eD(int i, mtl mtlVar, mtc mtcVar, mth mthVar, IOException iOException, boolean z) {
        if (k(mtlVar)) {
            this.c.e(mtcVar, l(mthVar), iOException, z);
        }
    }

    @Override // defpackage.mtw
    public final void eE(int i, mtl mtlVar, mtc mtcVar, mth mthVar, int i2) {
        if (k(mtlVar)) {
            this.c.f(mtcVar, l(mthVar), i2);
        }
    }

    @Override // defpackage.mpi
    public final void eF(int i, mtl mtlVar) {
        if (k(mtlVar)) {
            this.d.a();
        }
    }

    @Override // defpackage.mpi
    public final void eG(int i, mtl mtlVar) {
        if (k(mtlVar)) {
            this.d.b();
        }
    }

    @Override // defpackage.mpi
    public final void eH(int i, mtl mtlVar, int i2) {
        if (k(mtlVar)) {
            this.d.c(i2);
        }
    }

    @Override // defpackage.mpi
    public final void eI(int i, mtl mtlVar, Exception exc) {
        if (k(mtlVar)) {
            this.d.d(exc);
        }
    }

    @Override // defpackage.mpi
    public final void eJ(int i, mtl mtlVar) {
        if (k(mtlVar)) {
            this.d.e();
        }
    }
}
