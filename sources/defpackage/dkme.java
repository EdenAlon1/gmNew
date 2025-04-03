package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkme implements dkkr {
    public final diib a;
    public final dijk b;
    private final dipa c;
    private final errl d;

    public dkme(dipa dipaVar, diib diibVar, errl errlVar, dijk dijkVar) {
        this.c = dipaVar;
        this.a = diibVar;
        this.d = errlVar;
        this.b = dijkVar;
    }

    private final void a(String str) {
        this.c.l(str);
    }

    @Override // defpackage.dkkr
    public final void b(dkkj dkkjVar) {
        a(dkkjVar.z());
        this.b.v((dklp) dkkjVar);
    }

    @Override // defpackage.dkkr
    public final void c(dkkj dkkjVar) {
        a(dkkjVar.z());
        this.b.t((dklm) dkkjVar);
    }

    @Override // defpackage.dkkr
    public final void d(final dkkj dkkjVar) {
        a(dkkjVar.z());
        erqt.r(this.d.submit(new Callable() { // from class: dkma
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return dkkjVar.au(dkme.this.a);
            }
        }), new dkmd(this, dkkjVar), this.d);
    }

    @Override // defpackage.dkkr
    public final void e(final dkkj dkkjVar) {
        a(dkkjVar.z());
        erqt.r(this.d.submit(new Callable() { // from class: dkmb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return dkkjVar.au(dkme.this.a);
            }
        }), new dkmc(this, dkkjVar), this.d);
    }

    @Override // defpackage.dkkr
    public final void f(dkjt dkjtVar) {
        String str = dkjtVar.c;
        dijk dijkVar = this.b;
        String k = dkut.k(str, dijkVar.n);
        k.getClass();
        if (!dkut.w(k)) {
            k = dkut.n(dkjtVar.c, dijkVar.n);
            k.getClass();
        }
        dijkVar.m.l(k);
        try {
            dijkVar.q.a(dkjtVar, 0L, k);
        } catch (Exception e) {
            dkty.i(e, "Unable to process message %s", dkjtVar);
        }
    }
}
