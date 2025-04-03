package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ejjq extends Service {
    private ListenableFuture a = erqt.i(null);
    private int b = -1;

    /* compiled from: PG */
    public interface a {
        ejka en();
    }

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = ((a) fazh.a(getApplicationContext(), a.class)).en().e.entrySet().iterator();
        while (it.hasNext()) {
            printWriter.println((String) ((Map.Entry) it.next()).getValue());
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        long j;
        if (this.a.isDone()) {
            return;
        }
        ejka en = ((a) fazh.a(getApplicationContext(), a.class)).en();
        int i = this.b;
        int b = ejka.b(en.c.get());
        if (i == b) {
            do {
                j = en.c.get();
                if (ejka.b(j) != b) {
                    return;
                }
            } while (!en.c.compareAndSet(j, ejka.c(0, r1 + 1)));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, final int i2) {
        ListenableFuture i3;
        if ((i & 2) == 0 && intent != null) {
            ejka en = ((a) fazh.a(getApplicationContext(), a.class)).en();
            emxf.f(intent.hasExtra("EXTRA_FUTURE_INDEX"), "Intent missing extra %s", intent);
            emxf.f(intent.hasExtra("EXTRA_PROCESS_UUID"), "Intent missing extra %s", intent);
            emxf.f(intent.hasExtra("EXTRA_PROCESS_UUID2"), "Intent missing extra %s", intent);
            UUID uuid = en.h;
            long longExtra = intent.getLongExtra("EXTRA_PROCESS_UUID", -1L);
            long longExtra2 = intent.getLongExtra("EXTRA_PROCESS_UUID2", -1L);
            if (uuid.getMostSignificantBits() == longExtra && en.h.getLeastSignificantBits() == longExtra2) {
                int intExtra = intent.getIntExtra("EXTRA_FUTURE_INDEX", -1);
                synchronized (en.d) {
                    i3 = (SettableFuture) en.f.get(intExtra);
                    i3.getClass();
                    if (i3 != ejka.b) {
                        en.g.put(intExtra, i3);
                    }
                    en.f.remove(intExtra);
                }
            } else {
                ((enrr) ((enrr) ejka.a.h()).h("com/google/apps/tiktok/concurrent/AndroidFuturesServiceCounter", "onStartCommand", 224, "AndroidFuturesServiceCounter.java")).u("Stopping service immediately, intent delivered from previous process. Old PID was %d but current PID is %d", intent.getIntExtra("EXTRA_PROCESS_PID", -1), Process.myPid());
                i3 = erqt.i(null);
            }
            this.a = i3;
            this.b = intent.getIntExtra("EXTRA_FUTURE_INDEX", -1);
        }
        this.a.b(new Runnable() { // from class: ejjp
            @Override // java.lang.Runnable
            public final void run() {
                ejjq.this.stopSelf(i2);
            }
        }, erpp.a);
        return 2;
    }
}
