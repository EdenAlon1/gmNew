package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djge {
    public final dlpw b;
    final /* synthetic */ djgi c;
    public final ArrayDeque a = new ArrayDeque();
    private final AtomicBoolean d = new AtomicBoolean();

    public djge(djgi djgiVar, dlpw dlpwVar) {
        this.c = djgiVar;
        this.b = dlpwVar;
    }

    public final void a() {
        this.d.set(false);
        b();
    }

    public final void b() {
        if (this.d.compareAndSet(false, true)) {
            djgh djghVar = (djgh) this.a.poll();
            if (djghVar == null) {
                this.d.set(false);
                return;
            }
            djghVar.c(this.b.f());
            clqe clqeVar = djghVar.b;
            int i = clqeVar.c;
            if (i == 2) {
                clpn clpnVar = (clpn) ((fbbb) this.c.c).a;
                erqt.r(ffat.a(clpnVar.a.a(clpq.d(), clpnVar.b), (clqm) clqeVar.d), new djgg(this, djghVar), this.c.a);
                return;
            }
            if (i == 3) {
                clpn clpnVar2 = (clpn) ((fbbb) this.c.c).a;
                erqt.r(ffat.a(clpnVar2.a.a(clpq.c(), clpnVar2.b), (clqi) clqeVar.d), new djgf(this, djghVar), this.c.a);
            }
        }
    }

    public final boolean c(djgh djghVar) {
        if (djghVar.b.h >= 3) {
            return false;
        }
        this.a.offerFirst(djghVar);
        this.d.set(false);
        djgi djgiVar = this.c;
        djgiVar.a.schedule(new Runnable() { // from class: djgd
            @Override // java.lang.Runnable
            public final void run() {
                djge.this.b();
            }
        }, 5L, TimeUnit.SECONDS);
        return true;
    }
}
