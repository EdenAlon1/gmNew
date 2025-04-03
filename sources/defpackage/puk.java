package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class puk implements prh {
    public static final String a = ppt.d("CommandHandler");
    public final Context b;
    public final Map c = new HashMap();
    public final Object d = new Object();
    public final pse e;

    public puk(Context context, pse pseVar) {
        this.b = context;
        this.e = pseVar;
    }

    public static Intent b(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent c(Context context, pxs pxsVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        f(intent, pxsVar);
        return intent;
    }

    static Intent d(Context context, pxs pxsVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        f(intent, pxsVar);
        return intent;
    }

    static pxs e(Intent intent) {
        return new pxs(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void f(Intent intent, pxs pxsVar) {
        intent.putExtra("KEY_WORKSPEC_ID", pxsVar.a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", pxsVar.b);
    }

    @Override // defpackage.prh
    public final void a(pxs pxsVar, boolean z) {
        synchronized (this.d) {
            pup pupVar = (pup) this.c.remove(pxsVar);
            this.e.a(pxsVar);
            if (pupVar != null) {
                ppt.c().a(pup.a, "onExecuted " + pupVar.d + ", " + z);
                pupVar.a();
                if (z) {
                    pupVar.i.execute(new pur(pupVar.e, d(pupVar.b, pupVar.d), pupVar.c));
                }
                if (pupVar.k) {
                    pupVar.i.execute(new pur(pupVar.e, b(pupVar.b), pupVar.c));
                }
            }
        }
    }
}
