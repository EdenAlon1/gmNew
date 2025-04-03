package defpackage;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ejjo extends Service {
    public ejko a;

    /* compiled from: PG */
    public interface a {
        void gE(ejjo ejjoVar);
    }

    public final ejko a() {
        ejko ejkoVar = this.a;
        if (ejkoVar != null) {
            return ejkoVar;
        }
        ffkj.c("registry");
        return null;
    }

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.getClass();
        ejkn a2 = a().a(getClass());
        synchronized (a2.b) {
            Iterator it = a2.c.entrySet().iterator();
            while (it.hasNext()) {
                printWriter.println(((Map.Entry) it.next()).toString());
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((a) ekhw.a(this, a.class)).gE(this);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ejkn a2 = a().a(getClass());
        synchronized (a2.b) {
            if (intent == null) {
                if (a2.g == ejkm.STOPPED) {
                    stopSelf(i2);
                }
                return 2;
            }
            a2.h = this;
            a2.i = i2;
            a2.g = ejkm.STARTED;
            if (a2.c.isEmpty()) {
                a2.c(this, (Notification) intent.getParcelableExtra("fallback_notification"));
                a2.d();
            } else {
                a2.j = a2.a(a2.j);
                a2.c(this, a2.j.a);
            }
            return 2;
        }
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        ejkn a2 = a().a(getClass());
        synchronized (a2.b) {
            if (a2.g.ordinal() == 2) {
                a2.d();
                ejkl ejklVar = new ejkl();
                Collection v = a2.d.v();
                enin eninVar = new enin();
                Iterator it = v.iterator();
                while (it.hasNext()) {
                    eninVar.c(((elds) it.next()).a);
                }
                enip<elat> g = eninVar.g();
                eldx eldxVar = new eldx(ejklVar, new StackTraceElement[0]);
                enhd enhdVar = new enhd();
                for (elat elatVar : g) {
                    eldx eldxVar2 = new eldx(null, eldx.l(elatVar, null));
                    eldxVar.addSuppressed(eldxVar2);
                    enhdVar.k(elatVar, eldxVar2);
                }
                enhk c = enhdVar.c();
                eldx.h(c);
                eldx.f(c);
                ((enrr) ((enrr) ((enrr) ejkn.a.i()).g(eldxVar)).h("com/google/apps/tiktok/concurrent/ForegroundServiceTracker", "onTimeout", (char) 437, "ForegroundServiceTracker.java")).q("Timeout elapsed");
                a2.f.clear();
                a2.d.q();
            }
        }
    }
}
