package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkpz implements dkpl {
    public Context a;
    public volatile dkpk b;
    public int c;
    private volatile Handler d;
    private final dkpi e;
    private final AtomicBoolean f = new AtomicBoolean(true);
    private final Runnable g = new Runnable() { // from class: dkpy
        @Override // java.lang.Runnable
        public final void run() {
            dkpk dkpkVar;
            Context context;
            dkpz dkpzVar = dkpz.this;
            synchronized (dkpzVar) {
                dkty.k("delay time out, reset attempts %d and process SIM event", Integer.valueOf(dkpzVar.c));
                dkpzVar.c = 0;
                dkpkVar = dkpzVar.b;
                context = dkpzVar.a;
            }
            if (dkpkVar == null || context == null) {
                return;
            }
            Intent intent = null;
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.SIM_STATE_CHANGED"));
            if (registerReceiver == null) {
                dkty.k("No SIM state found", new Object[0]);
            } else {
                intent = registerReceiver;
            }
            if (intent != null) {
                dkpkVar.a(context, intent);
                dkpzVar.d();
            }
        }
    };

    public dkpz(dkpi dkpiVar) {
        this.e = dkpiVar;
    }

    @Override // defpackage.dkpl
    public final synchronized void a(Context context, dkpk dkpkVar, Handler handler) {
        this.a = context;
        this.b = dkpkVar;
        this.d = handler;
        this.c = 0;
    }

    @Override // defpackage.dkpl
    public final synchronized void b() {
        this.a = null;
        this.d = null;
        this.b = null;
        this.c = 0;
    }

    @Override // defpackage.dkpl
    public final boolean c(int i) {
        if (this.f.compareAndSet(true, false)) {
            dkty.k("do not delay first event", new Object[0]);
            return false;
        }
        Long l = (Long) djam.a().a.b.a();
        long longValue = l.longValue();
        Long l2 = (Long) djam.a().a.a.a();
        long longValue2 = l2.longValue();
        Long l3 = (Long) djam.a().a.c.a();
        long longValue3 = l3.longValue();
        if (this.a == null) {
            return false;
        }
        if (i > 1) {
            longValue2 = longValue3;
        }
        if (longValue2 <= 0) {
            dkty.k("SIM delay is not enabled", new Object[0]);
            return false;
        }
        synchronized (this) {
            Integer valueOf = Integer.valueOf(this.c);
            Long valueOf2 = Long.valueOf(longValue2);
            dkty.k("SIM state event delay enabled: attempts %d, maxAttempts %d, delaySeconds %d MSIM delayseconds %d, effective delay seconds %d", valueOf, l, l2, l3, valueOf2);
            Handler handler = this.d;
            if (handler == null) {
                return false;
            }
            if (this.c >= longValue) {
                dkty.k("reached max delay attempts, do not reschedule ", new Object[0]);
                return true;
            }
            handler.removeCallbacks(this.g);
            this.c++;
            if (!handler.postDelayed(this.g, TimeUnit.SECONDS.toMillis(longValue2))) {
                dkty.g("SIM state event delay failed", new Object[0]);
                return false;
            }
            dkty.k("posted simEventProcessTask to handler with delay %d", valueOf2);
            eyxr eyxrVar = (eyxr) eyxs.a.createBuilder();
            int i2 = this.c;
            eyxrVar.copyOnWrite();
            eyxs eyxsVar = (eyxs) eyxrVar.instance;
            eyxsVar.b |= 1;
            eyxsVar.c = i2;
            dkpi dkpiVar = this.e;
            if (dkpiVar != null) {
                dkpiVar.a((eyxs) eyxrVar.build());
            }
            return true;
        }
    }

    public final synchronized void d() {
        eyxr eyxrVar = (eyxr) eyxs.a.createBuilder();
        eyxrVar.copyOnWrite();
        eyxs eyxsVar = (eyxs) eyxrVar.instance;
        eyxsVar.b |= 2;
        eyxsVar.d = true;
        dkpi dkpiVar = this.e;
        if (dkpiVar != null) {
            dkpiVar.a((eyxs) eyxrVar.build());
        }
    }
}
