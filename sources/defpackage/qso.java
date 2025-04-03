package defpackage;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qso implements rix, rif {
    public final qsu a;
    public volatile qsw b;
    public final List c;
    private volatile rib d;
    private volatile Object e;
    private final ffxe f;

    public qso(ffxe ffxeVar, qsu qsuVar) {
        ffxeVar.getClass();
        this.f = ffxeVar;
        this.a = qsuVar;
        this.c = new ArrayList();
        if (qsuVar instanceof qss) {
            this.b = ((qss) qsuVar).a;
        } else {
            if (!(qsuVar instanceof qsm)) {
                throw new ffcd();
            }
            ffqy.d(ffxeVar, null, null, new qsn(this, null), 3);
        }
    }

    @Override // defpackage.rix
    public final void a(Drawable drawable) {
        this.f.b(new qst(qsx.d, drawable));
    }

    @Override // defpackage.rif
    public final boolean b(Object obj, Object obj2, rix rixVar, qsy qsyVar, boolean z) {
        return false;
    }

    @Override // defpackage.rix
    public final void c(Object obj, rjh rjhVar) {
        this.e = obj;
        rib ribVar = this.d;
        this.f.b(new qsv((ribVar == null || !ribVar.l()) ? qsx.b : qsx.c, obj));
    }

    @Override // defpackage.rix
    public final rib d() {
        return this.d;
    }

    @Override // defpackage.rix
    public final void e(riw riwVar) {
        qsw qswVar = this.b;
        if (qswVar != null) {
            riwVar.g(qswVar.a, qswVar.b);
            return;
        }
        synchronized (this) {
            qsw qswVar2 = this.b;
            if (qswVar2 != null) {
                riwVar.g(qswVar2.a, qswVar2.b);
            } else {
                this.c.add(riwVar);
            }
        }
    }

    @Override // defpackage.rix
    public final void f(Drawable drawable) {
        this.e = null;
        this.f.b(new qst(qsx.a, drawable));
    }

    @Override // defpackage.rix
    public final void g(Drawable drawable) {
        this.e = null;
        this.f.b(new qst(qsx.b, drawable));
    }

    @Override // defpackage.rix
    public final void h(riw riwVar) {
        synchronized (this) {
            this.c.remove(riwVar);
        }
    }

    @Override // defpackage.rix
    public final void i(rib ribVar) {
        this.d = ribVar;
    }

    @Override // defpackage.rif
    public final boolean a(qwp qwpVar, Object obj, rix rixVar, boolean z) {
        Object obj2 = this.e;
        rib ribVar = this.d;
        if (obj2 == null || ribVar == null || ribVar.l() || ribVar.n()) {
            return false;
        }
        this.f.b(new qsv(qsx.d, obj2));
        return false;
    }

    @Override // defpackage.rgu
    public final void m() {
    }

    @Override // defpackage.rgu
    public final void n() {
    }

    @Override // defpackage.rgu
    public final void o() {
    }
}
