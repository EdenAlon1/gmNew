package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class msa implements mtn {
    private Looper e;
    private lru f;
    private mlu g;
    private final ArrayList d = new ArrayList(1);
    public final HashSet a = new HashSet(1);
    public final mtv b = new mtv(new CopyOnWriteArrayList(), null);
    public final mph c = new mph(new CopyOnWriteArrayList(), null);

    protected final mlu J() {
        mlu mluVar = this.g;
        lti.g(mluVar);
        return mluVar;
    }

    protected final mph b(mtl mtlVar) {
        return this.c.f(mtlVar);
    }

    protected final mtv c(mtl mtlVar) {
        return this.b.g(mtlVar);
    }

    @Override // defpackage.mtn
    public final void d(Handler handler, mpi mpiVar) {
        this.c.c.add(new mpg(handler, mpiVar));
    }

    @Override // defpackage.mtn
    public final void e(Handler handler, mtw mtwVar) {
        this.b.c.add(new mtu(handler, mtwVar));
    }

    @Override // defpackage.mtn
    public final void f(mtm mtmVar) {
        boolean isEmpty = this.a.isEmpty();
        this.a.remove(mtmVar);
        if (isEmpty || !this.a.isEmpty()) {
            return;
        }
        g();
    }

    @Override // defpackage.mtn
    public final void h(mtm mtmVar) {
        lti.f(this.e);
        HashSet hashSet = this.a;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(mtmVar);
        if (isEmpty) {
            i();
        }
    }

    @Override // defpackage.mtn
    public final void j(mtm mtmVar, lxp lxpVar, mlu mluVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        boolean z = true;
        if (looper != null && looper != myLooper) {
            z = false;
        }
        lti.a(z);
        this.g = mluVar;
        lru lruVar = this.f;
        this.d.add(mtmVar);
        if (this.e == null) {
            this.e = myLooper;
            this.a.add(mtmVar);
            k(lxpVar);
        } else if (lruVar != null) {
            h(mtmVar);
            mtmVar.a(this, lruVar);
        }
    }

    protected abstract void k(lxp lxpVar);

    protected final void l(lru lruVar) {
        this.f = lruVar;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((mtm) arrayList.get(i)).a(this, lruVar);
        }
    }

    @Override // defpackage.mtn
    public final void m(mtm mtmVar) {
        this.d.remove(mtmVar);
        if (!this.d.isEmpty()) {
            f(mtmVar);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.a.clear();
        n();
    }

    protected abstract void n();

    @Override // defpackage.mtn
    public final void o(mpi mpiVar) {
        mph mphVar = this.c;
        Iterator it = mphVar.c.iterator();
        while (it.hasNext()) {
            mpg mpgVar = (mpg) it.next();
            if (mpgVar.b == mpiVar) {
                mphVar.c.remove(mpgVar);
            }
        }
    }

    @Override // defpackage.mtn
    public final void p(mtw mtwVar) {
        mtv mtvVar = this.b;
        Iterator it = mtvVar.c.iterator();
        while (it.hasNext()) {
            mtu mtuVar = (mtu) it.next();
            if (mtuVar.b == mtwVar) {
                mtvVar.c.remove(mtuVar);
            }
        }
    }

    protected void g() {
    }

    protected void i() {
    }

    @Override // defpackage.mtn
    public /* synthetic */ void r() {
    }

    @Override // defpackage.mtn
    public /* synthetic */ void s() {
    }

    @Override // defpackage.mtn
    public /* synthetic */ void q(lqw lqwVar) {
    }
}
