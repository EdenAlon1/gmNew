package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pww implements pvi, prh {
    public static final String a = ppt.d("SystemFgDispatcher");
    public static final /* synthetic */ int k = 0;
    public final pte b;
    final Object c = new Object();
    pxs d;
    final Map e;
    final Map f;
    final Map g;
    final pvn h;
    public pwv i;
    public final qbc j;
    private final Context l;

    public pww(Context context) {
        this.l = context;
        pte m = pte.m(context);
        this.b = m;
        this.j = m.m;
        this.d = null;
        this.e = new LinkedHashMap();
        this.g = new HashMap();
        this.f = new HashMap();
        this.h = new pvn(m.l);
        m.g.c(this);
    }

    @Override // defpackage.prh
    public final void a(pxs pxsVar, boolean z) {
        Map.Entry entry;
        synchronized (this.c) {
            ffud ffudVar = ((pyj) this.f.remove(pxsVar)) != null ? (ffud) this.g.remove(pxsVar) : null;
            if (ffudVar != null) {
                ffudVar.t(null);
            }
        }
        ppb ppbVar = (ppb) this.e.remove(pxsVar);
        if (pxsVar.equals(this.d)) {
            if (this.e.size() > 0) {
                Iterator it = this.e.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.d = (pxs) entry.getKey();
                if (this.i != null) {
                    ppb ppbVar2 = (ppb) entry.getValue();
                    this.i.c(ppbVar2.a, ppbVar2.b, ppbVar2.c);
                    this.i.a(ppbVar2.a);
                }
            } else {
                this.d = null;
            }
        }
        pwv pwvVar = this.i;
        if (ppbVar == null || pwvVar == null) {
            return;
        }
        ppt.c().a(a, "Removing Notification (id: " + ppbVar.a + ", workSpecId: " + pxsVar + ", notificationType: " + ppbVar.b);
        pwvVar.a(ppbVar.a);
    }

    public final void b(Intent intent) {
        if (this.i == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        pxs pxsVar = new pxs(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        ppt.c().a(a, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        ppb ppbVar = new ppb(intExtra, notification, intExtra2);
        this.e.put(pxsVar, ppbVar);
        ppb ppbVar2 = (ppb) this.e.get(this.d);
        if (ppbVar2 == null) {
            this.d = pxsVar;
        } else {
            this.i.b(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = this.e.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((ppb) ((Map.Entry) it.next()).getValue()).b;
                }
                ppbVar = new ppb(ppbVar2.a, ppbVar2.c, i);
            } else {
                ppbVar = ppbVar2;
            }
        }
        this.i.c(ppbVar.a, ppbVar.b, ppbVar.c);
    }

    public final void c() {
        this.i = null;
        synchronized (this.c) {
            Iterator it = this.g.values().iterator();
            while (it.hasNext()) {
                ((ffud) it.next()).t(null);
            }
        }
        this.b.g.d(this);
    }

    public final void d(int i) {
        ppt.c();
        Log.i(a, a.h(i, "Foreground service timed out, FGS type: "));
        for (Map.Entry entry : this.e.entrySet()) {
            if (((ppb) entry.getValue()).b == i) {
                this.b.q((pxs) entry.getKey(), -128);
            }
        }
        pwv pwvVar = this.i;
        if (pwvVar != null) {
            pwvVar.d();
        }
    }

    @Override // defpackage.pvi
    public final void e(pyj pyjVar, pva pvaVar) {
        if (pvaVar instanceof puz) {
            ppt.c().a(a, "Constraints unmet for WorkSpec ".concat(pyjVar.c));
            this.b.q(pzh.a(pyjVar), ((puz) pvaVar).a);
        }
    }
}
