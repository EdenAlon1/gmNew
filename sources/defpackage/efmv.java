package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efmv {
    final /* synthetic */ efmx a;

    public efmv(efmx efmxVar) {
        this.a = efmxVar;
    }

    public final void a(efnc efncVar) {
        if (this.a.c.a(((efna) efncVar).a) != null) {
            this.a.e.a();
        }
    }

    public final void b() {
        efmx.b();
        long epochMilli = Instant.now().toEpochMilli();
        efmx efmxVar = this.a;
        efmxVar.k = epochMilli;
        efmh efmhVar = efmxVar.d;
        if (efmhVar != null) {
            efmhVar.a(efmxVar.e.a());
        }
    }

    public final void c(efnc efncVar) {
        efna efnaVar = (efna) efncVar;
        if (!efnaVar.b.equals(efnm.EMBEDDED)) {
            efmx.b();
        }
        efmx efmxVar = this.a;
        String str = efnaVar.a;
        efnm efnmVar = efnaVar.b;
        efmy efmyVar = efmxVar.c;
        efmh a = efmyVar.a(str);
        efnl b = efmyVar.b(str);
        if (efnmVar != efnm.EMBEDDED) {
            efmxVar.k = Instant.now().toEpochMilli();
        }
        if (a != null && b != null) {
            a.a(b.a());
        }
        efmy efmyVar2 = efmxVar.c;
        efmyVar2.f.remove(efnaVar.a);
    }

    public final void d() {
        efmx.c();
        efmx efmxVar = this.a;
        efmh efmhVar = efmxVar.d;
        if (efmhVar != null) {
            efmhVar.b(efmxVar.e.a());
        }
    }

    public final void e(efnc efncVar) {
        efna efnaVar = (efna) efncVar;
        if (!efnaVar.b.equals(efnm.EMBEDDED)) {
            efmx.c();
        }
        efmx efmxVar = this.a;
        String str = efnaVar.a;
        efmy efmyVar = efmxVar.c;
        efmh a = efmxVar.c.a(str);
        efnl b = efmyVar.b(str);
        if (a == null || b == null) {
            return;
        }
        a.b(b.a());
    }

    public final void f(efnc efncVar) {
        if (this.a.c.a(((efna) efncVar).a) != null) {
            this.a.e.a();
        }
    }

    public final void g(efnc efncVar) {
        if (this.a.c.a(((efna) efncVar).a) != null) {
            this.a.e.a();
        }
    }

    public final void h(efnc efncVar) {
        if (this.a.c.a(((efna) efncVar).a) != null) {
            this.a.e.a();
        }
    }

    public final void i(efnc efncVar) {
        if (this.a.c.a(((efna) efncVar).a) != null) {
            this.a.e.a();
        }
    }
}
