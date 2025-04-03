package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnid implements csic {
    final fazb a;
    public final Executor b;
    boolean c = false;
    boolean d = false;

    public cnid(fazb fazbVar, errl errlVar) {
        this.a = fazbVar;
        this.b = new ersb(errlVar);
    }

    @Override // defpackage.csic
    public final void a() {
        axnw.h(elfo.f(new Runnable() { // from class: cnic
            @Override // java.lang.Runnable
            public final void run() {
                cnid cnidVar = cnid.this;
                cnidVar.d = true;
                if (cnidVar.c) {
                    ((cnjq) cnidVar.a.b()).a();
                }
            }
        }, this.b));
    }

    @Override // defpackage.csic
    public final void b() {
        axnw.h(elfo.f(new Runnable() { // from class: cnhz
            @Override // java.lang.Runnable
            public final void run() {
                cnid cnidVar = cnid.this;
                cnidVar.d = false;
                if (cnidVar.c) {
                    ((cnjq) cnidVar.a.b()).b();
                }
            }
        }, this.b));
    }
}
