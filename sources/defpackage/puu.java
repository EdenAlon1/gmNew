package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class puu implements prh {
    public static final String a = ppt.d("SystemAlarmDispatcher");
    final Context b;
    public final qba c;
    public final prv d;
    public final pte e;
    final puk f;
    final List g;
    Intent h;
    public pus i;
    final qbc j;
    public final ptc k;
    private final pse l;

    public puu(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        pse b = psc.b();
        this.l = b;
        pte m = pte.m(context);
        this.e = m;
        pqk pqkVar = m.d.l;
        this.f = new puk(applicationContext, b);
        this.c = new qba(m.d.e);
        prv prvVar = m.g;
        this.d = prvVar;
        qbc qbcVar = m.m;
        this.j = qbcVar;
        this.k = new ptc(prvVar, qbcVar);
        prvVar.c(this);
        this.g = new ArrayList();
        this.h = null;
    }

    public static final void e() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // defpackage.prh
    public final void a(pxs pxsVar, boolean z) {
        String str = puk.a;
        Intent intent = new Intent(this.b, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        puk.f(intent, pxsVar);
        this.j.d.execute(new pur(this, intent, 0));
    }

    public final void b() {
        ppt.c().a(a, "Destroying SystemAlarmDispatcher");
        this.d.d(this);
        this.i = null;
    }

    public final void c() {
        e();
        PowerManager.WakeLock a2 = qar.a(this.b, "ProcessCommand");
        try {
            a2.acquire();
            this.e.m.a(new puq(this));
        } finally {
            a2.release();
        }
    }

    public final void d(Intent intent, int i) {
        ppt c = ppt.c();
        String str = a;
        c.a(str, "Adding command " + intent + " (" + i + ")");
        e();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            ppt.c();
            Log.w(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            e();
            synchronized (this.g) {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        return;
                    }
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.g) {
            boolean isEmpty = this.g.isEmpty();
            this.g.add(intent);
            if (isEmpty) {
                c();
            }
        }
    }
}
