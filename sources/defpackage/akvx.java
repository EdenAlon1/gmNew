package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akvx {
    private final Context a;

    public akvx(Context context) {
        context.getClass();
        this.a = context;
    }

    public final PendingIntent a(Intent intent, akvt akvtVar) {
        intent.setType(akvtVar.c);
        intent.putExtra("com.google.android.apps.messaging.shared.alarm.task", akvtVar.d);
        PendingIntent d = eepf.d(this.a, 0, intent, ctie.a(0));
        d.getClass();
        return d;
    }
}
