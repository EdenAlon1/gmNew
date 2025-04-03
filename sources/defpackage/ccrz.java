package defpackage;

import android.app.Notification;
import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccrz {
    private static final cskc a = cskc.g("BugleCms", "CmsRestoreForegroundNotification");
    private final ffbr b;
    private final Context c;

    public ccrz(Context context, ffbr ffbrVar) {
        this.c = context;
        this.b = ffbrVar;
    }

    public final Notification a() {
        Context context = this.c;
        ffbr ffbrVar = this.b;
        Notification a2 = ((cins) ffbrVar.b()).a(context.getString(R.string.cms_sync_foreground_notification_text));
        if (a2 == null) {
            a.r("Cms restore notification is null!");
        }
        return a2;
    }
}
