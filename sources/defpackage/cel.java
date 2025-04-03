package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.car.app.AppInfo;
import androidx.car.app.CarAppBinder;
import androidx.car.app.SessionInfo;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cel extends Service {
    public final Map a = new HashMap();
    public cfd b;
    private AppInfo c;

    public abstract clu b();

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        if (strArr != null) {
            for (String str : strArr) {
                if ("AUTO_DRIVE".equals(str)) {
                    cls.b(new Runnable() { // from class: cej
                        @Override // java.lang.Runnable
                        public final void run() {
                            cel celVar = cel.this;
                            synchronized (celVar.a) {
                                for (CarAppBinder carAppBinder : celVar.a.values()) {
                                    if (Log.isLoggable("CarApp", 3)) {
                                        Log.d("CarApp", "Executing onAutoDriveEnabled for " + carAppBinder.getCurrentSessionInfo());
                                    }
                                    carAppBinder.onAutoDriveEnabled();
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    public cfp fg() {
        throw null;
    }

    public final AppInfo fh() {
        if (this.c == null) {
            this.c = AppInfo.create(this);
        }
        return this.c;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        CarAppBinder carAppBinder;
        SessionInfo a = cfq.b(intent) ? cfq.a(intent) : SessionInfo.DEFAULT_SESSION_INFO;
        synchronized (this.a) {
            if (!this.a.containsKey(a)) {
                this.a.put(a, new CarAppBinder(this, a));
            }
            carAppBinder = (CarAppBinder) this.a.get(a);
            carAppBinder.getClass();
        }
        return carAppBinder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        synchronized (this.a) {
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((CarAppBinder) it.next()).destroy();
            }
            this.a.clear();
        }
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        if (Log.isLoggable("CarApp", 3)) {
            Objects.toString(intent);
            Log.d("CarApp", "onUnbind intent: ".concat(String.valueOf(intent)));
        }
        final SessionInfo a = cfq.b(intent) ? cfq.a(intent) : SessionInfo.DEFAULT_SESSION_INFO;
        cls.b(new Runnable() { // from class: cek
            @Override // java.lang.Runnable
            public final void run() {
                cel celVar = cel.this;
                Map map = celVar.a;
                SessionInfo sessionInfo = a;
                synchronized (map) {
                    CarAppBinder carAppBinder = (CarAppBinder) celVar.a.remove(sessionInfo);
                    if (carAppBinder != null) {
                        carAppBinder.onDestroyLifecycle();
                    }
                }
            }
        });
        if (!Log.isLoggable("CarApp", 3)) {
            return true;
        }
        Log.d("CarApp", "onUnbind completed");
        return true;
    }
}
