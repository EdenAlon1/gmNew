package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rat implements qud, quc {
    private final List a;
    private final kst b;
    private int c;
    private qqe d;
    private quc e;
    private List f;
    private boolean g;

    public rat(List list, kst kstVar) {
        this.b = kstVar;
        rkf.d(list);
        this.a = list;
        this.c = 0;
    }

    private final void h() {
        if (this.g) {
            return;
        }
        if (this.c < this.a.size() - 1) {
            this.c++;
            g(this.d, this.e);
        } else {
            rkf.f(this.f);
            this.e.f(new qwp("Fetch failed", new ArrayList(this.f)));
        }
    }

    @Override // defpackage.qud
    public final Class a() {
        return ((qud) this.a.get(0)).a();
    }

    @Override // defpackage.quc
    public final void c(Object obj) {
        if (obj != null) {
            this.e.c(obj);
        } else {
            h();
        }
    }

    @Override // defpackage.qud
    public final void d() {
        this.g = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((qud) it.next()).d();
        }
    }

    @Override // defpackage.qud
    public final void e() {
        List list = this.f;
        if (list != null) {
            this.b.b(list);
        }
        this.f = null;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((qud) it.next()).e();
        }
    }

    @Override // defpackage.qud
    public final qsy eV() {
        return ((qud) this.a.get(0)).eV();
    }

    @Override // defpackage.quc
    public final void f(Exception exc) {
        List list = this.f;
        rkf.f(list);
        list.add(exc);
        h();
    }

    @Override // defpackage.qud
    public final void g(qqe qqeVar, quc qucVar) {
        this.d = qqeVar;
        this.e = qucVar;
        this.f = (List) this.b.a();
        ((qud) this.a.get(this.c)).g(qqeVar, this);
        if (this.g) {
            d();
        }
    }
}
