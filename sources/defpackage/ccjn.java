package defpackage;

import android.app.Notification;
import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccjn {
    private final cins a;
    private final Context b;

    public ccjn(cins cinsVar, Context context) {
        cinsVar.getClass();
        context.getClass();
        this.a = cinsVar;
        this.b = context;
    }

    public final Notification a() {
        return this.a.a(this.b.getString(R.string.cms_sync_foreground_notification_text));
    }
}
