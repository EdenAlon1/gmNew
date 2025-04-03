package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class msn extends msa {
    private final HashMap d = new HashMap();
    private Handler e;
    private lxp f;

    protected msn() {
    }

    @Override // defpackage.msa
    protected final void g() {
        for (msm msmVar : this.d.values()) {
            msmVar.a.f(msmVar.b);
        }
    }

    @Override // defpackage.msa
    protected final void i() {
        for (msm msmVar : this.d.values()) {
            msmVar.a.h(msmVar.b);
        }
    }

    @Override // defpackage.msa
    protected void k(lxp lxpVar) {
        this.f = lxpVar;
        this.e = lvf.C();
    }

    @Override // defpackage.msa
    protected void n() {
        for (msm msmVar : this.d.values()) {
            msmVar.a.m(msmVar.b);
            msmVar.a.p(msmVar.c);
            msmVar.a.o(msmVar.c);
        }
        this.d.clear();
    }

    @Override // defpackage.mtn
    public void t() {
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((msm) it.next()).a.t();
        }
    }

    protected mtl x(Object obj, mtl mtlVar) {
        throw null;
    }

    protected abstract void y(Object obj, mtn mtnVar, lru lruVar);

    protected final void z(final Object obj, mtn mtnVar) {
        lti.a(!this.d.containsKey(obj));
        mtm mtmVar = new mtm() { // from class: msk
            @Override // defpackage.mtm
            public final void a(mtn mtnVar2, lru lruVar) {
                msn.this.y(obj, mtnVar2, lruVar);
            }
        };
        msl mslVar = new msl(this, obj);
        this.d.put(obj, new msm(mtnVar, mtmVar, mslVar));
        Handler handler = this.e;
        lti.f(handler);
        mtnVar.e(handler, mslVar);
        Handler handler2 = this.e;
        lti.f(handler2);
        mtnVar.d(handler2, mslVar);
        mtnVar.j(mtmVar, this.f, J());
        if (this.a.isEmpty()) {
            mtnVar.f(mtmVar);
        }
    }

    protected void A(Object obj) {
    }

    protected void B(Object obj) {
    }
}
