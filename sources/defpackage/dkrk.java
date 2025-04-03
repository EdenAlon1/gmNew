package defpackage;

import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkrk {
    public static final /* synthetic */ int f = 0;
    private static final long g = TimeUnit.MINUTES.toMillis(1);
    public final ditq a;
    public final dktn c;
    public Thread d;
    private final errm h;
    public final PriorityQueue b = new PriorityQueue();
    public final AtomicReference e = new AtomicReference();

    public dkrk(dktn dktnVar, ditq ditqVar, errm errmVar) {
        this.c = dktnVar.b("ImsRefreshableManager");
        this.a = ditqVar;
        this.h = errmVar;
    }

    private final void c() {
        if (ctid.d) {
            if (this.e.get() == null) {
                dkty.d(this.c, "Scheduling refresh task with ScheduledExecutor in: %ds", 900L);
                this.e.set(this.h.schedule(new Runnable() { // from class: dkrf
                    @Override // java.lang.Runnable
                    public final void run() {
                        dkrk.this.a();
                    }
                }, 900L, TimeUnit.SECONDS));
                return;
            }
            return;
        }
        if (this.d == null) {
            dkty.d(this.c, "Scheduling refresh task with AlarmTimer in: %ds", 900L);
            Thread b = dkwa.a().b("ims_refresh", new Runnable() { // from class: dkrg
                @Override // java.lang.Runnable
                public final void run() {
                    dkrk.this.a();
                }
            }, g);
            this.d = b;
            if (b != null) {
                this.a.d(b, 900L);
            } else {
                dkty.r(this.c, "Unable to schedule a refresh task with AlarmTimer", new Object[0]);
            }
        }
    }

    public final void a() {
        long currentTimeMillis = System.currentTimeMillis() + 900000;
        synchronized (this.b) {
            this.d = null;
            this.e.set(null);
            if (this.b.isEmpty()) {
                return;
            }
            dkrj dkrjVar = (dkrj) this.b.peek();
            while (dkrjVar != null && dkrjVar.a < currentTimeMillis) {
                ((dkrj) this.b.remove()).b.q(new dkri(this));
                if (this.b.isEmpty()) {
                    break;
                } else {
                    dkrjVar = (dkrj) this.b.peek();
                }
            }
            if (!this.b.isEmpty()) {
                c();
            }
        }
    }

    public final void b(dkre dkreVar) {
        dkty.d(this.c, "adding refreshable: %s", dkreVar);
        if (dkreVar.a() <= 900) {
            dkty.r(this.c, "Expires value below configured interval. Expected at least: %d was %d", 900L, Integer.valueOf(dkreVar.a()));
            return;
        }
        dkrj dkrjVar = new dkrj(dkreVar);
        synchronized (this.b) {
            if (this.b.add(dkrjVar)) {
                c();
            }
        }
    }
}
