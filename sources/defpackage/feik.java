package defpackage;

import io.grpc.Status;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class feik extends feio implements fejs, feqy {
    public static final Logger q = Logger.getLogger(feik.class.getName());
    private final femu a;
    private febo b;
    private volatile boolean c;
    public final fevw r;
    public final boolean s;

    protected feik(fevy fevyVar, fevo fevoVar, fevw fevwVar, febo feboVar, fdxj fdxjVar) {
        fevwVar.getClass();
        this.r = fevwVar;
        this.s = fend.j(fdxjVar);
        this.a = new feqz(this, fevyVar, fevoVar);
        this.b = feboVar;
    }

    @Override // defpackage.fejs
    public final void b(fenl fenlVar) {
        fenlVar.b("remote_addr", a().a(fdzi.a));
    }

    @Override // defpackage.fejs
    public final void c(Status status) {
        emxf.b(!status.f(), "Should not cancel with OK status");
        this.c = true;
        p().a(status);
    }

    @Override // defpackage.fejs
    public final void e() {
        if (q().m) {
            return;
        }
        q().m = true;
        feqz feqzVar = (feqz) u();
        if (feqzVar.i) {
            return;
        }
        feqzVar.i = true;
        fevx fevxVar = feqzVar.b;
        if (fevxVar != null && fevxVar.a() == 0 && feqzVar.b != null) {
            feqzVar.b = null;
        }
        feqzVar.b(true, true);
    }

    @Override // defpackage.fejs
    public final void i(fdys fdysVar) {
        this.b.e(fend.b);
        this.b.g(fend.b, Long.valueOf(Math.max(0L, fdysVar.b(TimeUnit.NANOSECONDS))));
    }

    @Override // defpackage.fejs
    public final void j(fdyv fdyvVar) {
        feij q2 = q();
        emxf.m(q2.k == null, "Already called start");
        fdyvVar.getClass();
        q2.l = fdyvVar;
    }

    @Override // defpackage.fejs
    public final void k(int i) {
        ((feqv) q().o).b = i;
    }

    @Override // defpackage.fejs
    public final void l(int i) {
        feqz feqzVar = (feqz) this.a;
        emxf.m(feqzVar.a == -1, "max size already set");
        feqzVar.a = i;
    }

    @Override // defpackage.fejs
    public final void m(feju fejuVar) {
        feij q2 = q();
        emxf.m(q2.k == null, "Already called setListener");
        q2.k = fejuVar;
        p().c(this.b);
        this.b = null;
    }

    @Override // defpackage.feio, defpackage.fevp
    public final boolean o() {
        return r().n() && !this.c;
    }

    protected abstract feih p();

    protected abstract feij q();

    @Override // defpackage.feio
    protected /* bridge */ /* synthetic */ fein r() {
        throw null;
    }

    @Override // defpackage.feio
    protected final femu u() {
        return this.a;
    }

    @Override // defpackage.feqy
    public final void v(fevx fevxVar, boolean z, boolean z2, int i) {
        boolean z3 = true;
        if (fevxVar == null && !z) {
            z3 = false;
        }
        emxf.b(z3, "null frame before EOS");
        p().b(fevxVar, z, z2, i);
    }
}
