package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class llf extends llg {
    private final afc a;

    public llf() {
        this.a = new afc();
    }

    @Override // defpackage.lld
    protected void h() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((lle) ((aey) ((afa) it).next()).b).b();
        }
    }

    @Override // defpackage.lld
    protected void i() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((lle) ((aey) ((afa) it).next()).b).c();
        }
    }

    public final void p(lld lldVar, llh llhVar) {
        if (lldVar == null) {
            throw new NullPointerException("source cannot be null");
        }
        lle lleVar = new lle(lldVar, llhVar);
        lle lleVar2 = (lle) this.a.f(lldVar, lleVar);
        if (lleVar2 != null && lleVar2.b != llhVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (lleVar2 == null && n()) {
            lleVar.b();
        }
    }

    public final void q(lld lldVar) {
        lle lleVar = (lle) this.a.b(lldVar);
        if (lleVar != null) {
            lleVar.c();
        }
    }

    public llf(Object obj) {
        super(obj);
        this.a = new afc();
    }
}
