package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekxu {
    public elds a;
    public elds b;
    private final ea c;
    private int d = 0;

    /* compiled from: PG */
    public interface a {
        elbx b();
    }

    public ekxu(ea eaVar) {
        this.c = eaVar;
    }

    private final elav m(String str) {
        if (ekyf.v()) {
            return eleg.f(str);
        }
        eg G = this.c.G();
        G.getClass();
        return elcb.a(G).b(str);
    }

    private final elav n(String str) {
        ekyf.s();
        final elav f = ekyf.v() ? eleg.f(str) : ((a) ekhw.a(this.c.z(), a.class)).b().b(str);
        final elav k = ekyf.k();
        return new elav() { // from class: ekxt
            @Override // defpackage.elav, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                elav.this.close();
                f.close();
                ekyf.q();
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void o(elds eldsVar, ea eaVar, boolean z) {
        if (eaVar.z() != null) {
            for (ea eaVar2 : eaVar.I().p()) {
                if (eaVar2 instanceof elar) {
                    ((elar) eaVar2).bd(eldsVar, z);
                } else {
                    o(eldsVar, eaVar2, z);
                }
            }
        }
    }

    public final elav a() {
        try {
            return b();
        } finally {
            this.a = null;
            this.b = null;
            this.d = 0;
        }
    }

    public final elav b() {
        elds eldsVar = this.b;
        if (eldsVar != null) {
            return eldsVar.a();
        }
        elds eldsVar2 = this.a;
        return eldsVar2 != null ? eldsVar2.a() : ekyf.j();
    }

    public final elav c() {
        elav j = ekyf.j();
        if (this.d > 0) {
            e(elds.b(), false);
        }
        return j;
    }

    public final void d() {
        ea eaVar = this.c;
        eaVar.I().s(new elbu(((a) ekhw.a(eaVar.z(), a.class)).b()));
    }

    public final void e(elds eldsVar, boolean z) {
        if (z) {
            if (eldsVar == null) {
                int i = this.d - 1;
                if (i < 0) {
                    i = 0;
                }
                this.d = i;
                if (i == 0) {
                    this.a = null;
                    return;
                }
                return;
            }
            this.d++;
        }
        this.a = eldsVar;
        o(eldsVar, this.c, z);
    }

    public final elav f() {
        return m("Fragment:onActivityResult");
    }

    public final elav g() {
        return n("DialogFragment:onCancel");
    }

    public final elav h(int i, int i2) {
        elav j = ekyf.j();
        if (i == 0 && i2 == 0) {
            return j;
        }
        e(elds.b(), true);
        return j;
    }

    public final elav i() {
        return n("DialogFragment:onDismiss");
    }

    public final elav j() {
        return m("Fragment:onOptionsItemSelected");
    }

    public final void k() {
        ekyf.A();
        if (this.d > 0) {
            e(elds.b(), false);
        }
    }

    public final void l() {
        e(elds.b(), true);
    }
}
