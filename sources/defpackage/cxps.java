package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cxps extends wr implements lkr {
    protected final lkk s;
    private List t;

    public cxps(lkk lkkVar, View view) {
        super(view);
        this.s = lkkVar;
    }

    public final void C(Object obj) {
        csix.g();
        csix.g();
        if (this.t == null) {
            this.t = new ArrayList();
        }
        List list = this.t;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((lld) it.next()).l(this);
        }
        list.clear();
        E(obj);
    }

    protected final void D(lld lldVar, llh llhVar) {
        csix.g();
        lldVar.f(this, llhVar);
        this.t.add(lldVar);
    }

    protected abstract void E(Object obj);

    @Override // defpackage.lkr
    public final lkk P() {
        return this.s;
    }
}
