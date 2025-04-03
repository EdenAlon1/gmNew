package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feqa extends feip {
    final feaf a;
    final fdzv b;
    final fejh c;
    final feji d;
    List e;
    feoi f;
    boolean g;
    boolean h;
    fedr i;
    final /* synthetic */ feqc j;

    public feqa(feqc feqcVar, feaf feafVar) {
        this.j = feqcVar;
        this.e = feafVar.a;
        this.a = feafVar;
        fdzv b = fdzv.b("Subchannel", feqcVar.b());
        this.b = b;
        feji fejiVar = new feji(b, feqcVar.l.a(), "Subchannel for ".concat(feafVar.a.toString()));
        this.d = fejiVar;
        this.c = new fejh(fejiVar, feqcVar.l);
    }

    @Override // defpackage.fean
    public final void a() {
        this.j.m.d();
        emxf.m(this.g, "not started");
        this.f.a();
    }

    @Override // defpackage.fean
    public final void b() {
        fedr fedrVar;
        this.j.m.d();
        if (this.f == null) {
            this.h = true;
            return;
        }
        if (!this.h) {
            this.h = true;
        } else {
            if (!this.j.C || (fedrVar = this.i) == null) {
                return;
            }
            fedrVar.a();
            this.i = null;
        }
        feqc feqcVar = this.j;
        if (feqcVar.C) {
            this.f.g(feqc.b);
        } else {
            this.i = feqcVar.m.a(new feoq(new fepz(this)), 5L, TimeUnit.SECONDS, this.j.i.c());
        }
    }

    @Override // defpackage.fean
    public final void c(feap feapVar) {
        this.j.m.d();
        emxf.m(!this.g, "already started");
        emxf.m(!this.h, "already shutdown");
        emxf.m(!this.j.C, "Channel is being terminated");
        this.g = true;
        feqc feqcVar = this.j;
        String b = feqcVar.b();
        fejx fejxVar = feqcVar.i;
        ScheduledExecutorService c = fejxVar.c();
        fepy fepyVar = new fepy(this, feapVar);
        feqc feqcVar2 = this.j;
        feoi feoiVar = new feoi(this.a, b, feqcVar.r, fejxVar, c, feqcVar2.m, fepyVar, feqcVar2.I, feqcVar2.E.a(), this.b, this.c, feqcVar2.q);
        fdzm fdzmVar = new fdzm();
        fdzmVar.a = "Child Subchannel started";
        fdzmVar.b = fdzn.CT_INFO;
        fdzmVar.b(this.j.l.a());
        fdzmVar.c = feoiVar;
        this.j.G.b(fdzmVar.a());
        this.f = feoiVar;
        fdzq.b(this.j.I.e, feoiVar);
        this.j.w.add(feoiVar);
    }

    @Override // defpackage.fean
    public final void d(List list) {
        this.j.m.d();
        this.e = list;
        feoi feoiVar = this.f;
        list.getClass();
        feoi.j(list);
        emxf.b(!list.isEmpty(), "newAddressGroups is empty");
        feoiVar.g.execute(new fenu(feoiVar, DesugarCollections.unmodifiableList(new ArrayList(list))));
    }

    public final String toString() {
        return this.b.toString();
    }
}
