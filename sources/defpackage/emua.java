package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emua implements ljv {
    final /* synthetic */ emud a;
    private boolean b = false;

    public emua(emud emudVar) {
        this.a = emudVar;
    }

    @Override // defpackage.ljv
    public final void d(lkr lkrVar) {
        ((emun) this.a.c.get()).e((fr) this.a.a.get());
        if (this.b) {
            return;
        }
        lkrVar.P().c(new emuc(this.a));
        this.b = true;
    }

    @Override // defpackage.ljv
    public final void f(lkr lkrVar) {
        emun emunVar = (emun) this.a.c.get();
        Object obj = this.a.a.get();
        emxf.a(obj != null);
        fr frVar = emunVar.c;
        if (frVar != null) {
            emxf.l(obj == frVar);
            emunVar.c = null;
            cmi cmiVar = new cmi((cmj) emunVar.b);
            while (cmiVar.hasNext()) {
                ((emur) cmiVar.next()).b(null);
            }
        }
    }

    @Override // defpackage.ljv
    public final void ff(lkr lkrVar) {
        emun emunVar = (emun) this.a.c.get();
        emxf.l(emunVar.c == null);
        int c = emunVar.a.c();
        while (true) {
            c--;
            if (c < 0) {
                emunVar.f = false;
                return;
            }
            cpo cpoVar = emunVar.a;
            if (cpoVar.a) {
                cpp.b(cpoVar);
            }
            cpoVar.c[c] = null;
        }
    }

    @Override // defpackage.ljv
    public final void ha(lkr lkrVar) {
        ((emun) this.a.c.get()).e((fr) this.a.a.get());
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void gZ(lkr lkrVar) {
    }
}
