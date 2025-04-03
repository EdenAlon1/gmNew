package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ditq {
    public ditp a;
    private final BroadcastReceiver b = new dito(this);
    private final Context c;
    private final AlarmManager d;
    private final String e;
    private long f;

    protected ditq(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext;
        this.e = str;
        this.d = (AlarmManager) applicationContext.getSystemService("alarm");
    }

    public static ditq a(Context context, String str) {
        return new ditq(context, str.replaceAll("[(): ]", ""));
    }

    public final synchronized void b() {
        ditp ditpVar = this.a;
        if (ditpVar != null) {
            dkty.c("Cancelling task %s", ditpVar.a.getName());
            c();
        }
    }

    public final void c() {
        ditp ditpVar = this.a;
        if (ditpVar != null) {
            this.d.cancel(ditpVar.c);
            this.a = null;
            try {
                this.c.unregisterReceiver(this.b);
            } catch (Exception e) {
                dkty.i(e, "Error unregistering broadcast receiver", new Object[0]);
            }
        }
    }

    public final synchronized void d(Thread thread, long j) {
        if (thread == null) {
            throw new IllegalArgumentException("Task cannot be null!");
        }
        b();
        dkty.c("%s: Scheduling task \"%s\" for execution in %ds", this.e, thread.getName(), Long.valueOf(j));
        ditp ditpVar = new ditp();
        ditpVar.a = thread;
        ditpVar.b = this.e + "." + thread.getName().replace(' ', '.');
        ditpVar.c = PendingIntent.getBroadcast(this.c, 0, new Intent(ditpVar.b), 201326592);
        this.a = ditpVar;
        koa.g(this.c, this.b, new IntentFilter(ditpVar.b));
        ditp ditpVar2 = this.a;
        if (ditpVar2 != null && ditpVar2.c != null) {
            this.f = dkvj.a().longValue() + TimeUnit.SECONDS.toMillis(j);
            dkty.c("Setting alarm for post-M devices", new Object[0]);
            ditp ditpVar3 = this.a;
            if (ditpVar3 != null) {
                this.d.setExactAndAllowWhileIdle(0, this.f, ditpVar3.c);
                return;
            }
            return;
        }
        dkty.g("PendingIntent for task %s is null, alarm won't be set", ditpVar2.a);
    }

    public final synchronized boolean e() {
        return this.a != null;
    }
}
