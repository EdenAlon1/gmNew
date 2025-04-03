package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mdc implements lsk {
    public final lsj a;
    public final Executor b;
    public volatile boolean c;
    public int d;
    private final Context e;
    private final lsg f;
    private final lpo g;
    private final lpr h;
    private final boolean i;
    private lsi j;
    private lrq k;
    private boolean l;

    public mdc(Context context, lsg lsgVar, lpo lpoVar, lsj lsjVar, lpr lprVar, Executor executor, lse lseVar, boolean z) {
        lti.d(lse.a.equals(lseVar), "SingleInputVideoGraph does not use VideoCompositor, and therefore cannot apply VideoCompositorSettings");
        this.e = context;
        this.f = lsgVar;
        this.g = lpoVar;
        this.a = lsjVar;
        this.h = lprVar;
        this.b = executor;
        this.i = z;
        this.d = -1;
    }

    public final lsi b(int i) {
        int i2 = this.d;
        boolean z = false;
        if (i2 != -1 && i2 == i) {
            z = true;
        }
        lti.a(z);
        lsi lsiVar = this.j;
        lti.g(lsiVar);
        return lsiVar;
    }

    @Override // defpackage.lsk
    public final void g() {
        if (this.l) {
            return;
        }
        lsi lsiVar = this.j;
        if (lsiVar != null) {
            lsiVar.d();
            this.j = null;
        }
        this.l = true;
    }

    @Override // defpackage.lsk
    public final void h(lrq lrqVar) {
        this.k = lrqVar;
        lsi lsiVar = this.j;
        if (lsiVar != null) {
            lsiVar.e(lrqVar);
        }
    }

    @Override // defpackage.lsk
    public final boolean i() {
        return this.c;
    }

    public final void j(int i) {
        lti.d(this.d == -1, "This VideoGraph supports only one input.");
        this.d = i;
        erpp erppVar = erpp.a;
        mdb mdbVar = new mdb(this);
        boolean z = this.i;
        lpo lpoVar = this.g;
        lsi a = this.f.a(this.e, this.h, lpoVar, z, erppVar, mdbVar);
        this.j = a;
        lrq lrqVar = this.k;
        if (lrqVar != null) {
            a.e(lrqVar);
        }
    }

    @Override // defpackage.lsk
    public final void f() {
    }
}
