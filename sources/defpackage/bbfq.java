package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.ProcessPendingRevocationsAction;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbfq {
    private static final cskc a = cskc.g("BugleDataModel", "ProcessPendingRevocationsActionScheduler");
    private static final Random b = new Random();
    private static long c = 0;
    private static int d = 0;
    private final cqoh e;
    private final bany f;

    public bbfq(cqoh cqohVar, bany banyVar) {
        this.e = cqohVar;
        this.f = banyVar;
    }

    public static synchronized void c() {
        synchronized (bbfq.class) {
            c = 0L;
            d = 0;
        }
    }

    private final synchronized void d(boolean z) {
        long j;
        long epochMilli = this.e.f().toEpochMilli();
        long j2 = c;
        if (epochMilli <= j2) {
            csjb c2 = a.c();
            c2.I("deferred.");
            c2.z("next action remaining seconds", (epochMilli - j2) / 1000);
            c2.r();
            return;
        }
        if (z) {
            int i = d;
            long longValue = ((Long) dimn.E().h().a()).longValue();
            long longValue2 = ((Long) dimn.E().i().a()).longValue();
            long j3 = longValue << i;
            if (j3 <= longValue2) {
                d = i + 1;
                longValue2 = j3;
            }
            j = Math.max((longValue2 / 2) + b.nextInt((int) r7), longValue);
        } else {
            j = 0;
        }
        c = epochMilli + j;
        bany banyVar = this.f;
        bbfq bbfqVar = (bbfq) banyVar.b.b();
        bbfqVar.getClass();
        new ProcessPendingRevocationsAction(banyVar.a, bbfqVar, banyVar.c, banyVar.d).G(j);
        csjb c3 = a.c();
        c3.I("scheduled next action.");
        c3.z("back off seconds", j / 1000);
        c3.r();
    }

    public final void a() {
        d(false);
    }

    public final void b() {
        d(true);
    }
}
