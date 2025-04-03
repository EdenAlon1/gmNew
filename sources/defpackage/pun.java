package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class pun implements Runnable {
    public final /* synthetic */ pup a;

    public /* synthetic */ pun(pup pupVar) {
        this.a = pupVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pup pupVar = this.a;
        int i = pupVar.g;
        String str = pupVar.d.a;
        if (i >= 2) {
            ppt.c().a(pup.a, "Already stopped work for ".concat(str));
            return;
        }
        pupVar.g = 2;
        ppt.c().a(pup.a, "Stopping work for WorkSpec ".concat(str));
        Context context = pupVar.b;
        pxs pxsVar = pupVar.d;
        String str2 = puk.a;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        puk.f(intent, pxsVar);
        pupVar.i.execute(new pur(pupVar.e, intent, pupVar.c));
        if (!pupVar.e.d.f(pupVar.d.a)) {
            ppt.c().a(pup.a, a.a(str, "Processor does not have WorkSpec ", ". No need to reschedule"));
            return;
        }
        ppt.c().a(pup.a, a.a(str, "WorkSpec ", " needs to be rescheduled"));
        Context context2 = pupVar.b;
        pxs pxsVar2 = pupVar.d;
        pupVar.i.execute(new pur(pupVar.e, puk.d(context2, pxsVar2), pupVar.c));
    }
}
