package defpackage;

import android.app.NotificationManager;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciur {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/notification2o/DittoNotificationChannelManager");
    public final Context b;
    public final ciwb c;
    public final cixm d;
    public final NotificationManager e;

    public ciur(Context context, ciwb ciwbVar, cixm cixmVar) {
        context.getClass();
        ciwbVar.getClass();
        this.b = context;
        this.c = ciwbVar;
        this.d = cixmVar;
        Object systemService = context.getSystemService("notification");
        systemService.getClass();
        this.e = (NotificationManager) systemService;
    }
}
