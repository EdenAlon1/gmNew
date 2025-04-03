package defpackage;

import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpes {
    public final long a;
    public final akzo b;
    final /* synthetic */ cpev c;
    private final ecri d;
    private final Set e = enpw.i();
    private final int f;

    public cpes(cpev cpevVar) {
        this.c = cpevVar;
        this.d = cpevVar.o.d();
        this.a = cpevVar.p.a();
        this.f = cpevVar.s.incrementAndGet();
        this.b = akzn.a(cpevVar.p);
    }

    public final void a(ecda ecdaVar) {
        b(ecdaVar, null);
    }

    final void b(ecda ecdaVar, fgmh fgmhVar) {
        if (((Boolean) cpev.j.e()).booleanValue()) {
            if (!this.e.add(ecdaVar.a)) {
                ((enrr) ((enrr) cpev.b.g()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics$MessageSendingTracker", "logTimer", 984, "MessageLatencyAnalytics.java")).t("Timer was already logged, timer_name=%s", new evhq(evhp.NO_USER_DATA, ecdaVar.a));
                return;
            }
            csjb a = cpev.c.a();
            int i = this.f;
            a.I(String.format(Locale.US, "Timer%d[ms] %s=%d", Integer.valueOf(i), ecdaVar, Long.valueOf(this.c.p.a() - this.a)));
            a.r();
            this.c.o.f(new ecri(this.d.b.a), ecdaVar, fgmhVar, ecrh.SUCCESS);
        }
    }
}
