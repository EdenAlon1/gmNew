package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kmg {
    static Notification.BubbleMetadata a(kmi kmiVar) {
        Notification.BubbleMetadata.Builder deleteIntent;
        Notification.BubbleMetadata.Builder autoExpandBubble;
        Notification.BubbleMetadata build;
        String str = kmiVar.g;
        Notification.BubbleMetadata.Builder builder = str != null ? new Notification.BubbleMetadata.Builder(str) : new Notification.BubbleMetadata.Builder(kmiVar.a, kmiVar.c.c());
        deleteIntent = builder.setDeleteIntent(kmiVar.b);
        autoExpandBubble = deleteIntent.setAutoExpandBubble(kmiVar.a());
        autoExpandBubble.setSuppressNotification(kmiVar.b());
        int i = kmiVar.d;
        if (i != 0) {
            builder.setDesiredHeight(i);
        }
        int i2 = kmiVar.e;
        if (i2 != 0) {
            builder.setDesiredHeightResId(i2);
        }
        build = builder.build();
        return build;
    }

    static kmi b(Notification.BubbleMetadata bubbleMetadata) {
        String shortcutId;
        kmh kmhVar;
        PendingIntent intent;
        Icon icon;
        boolean autoExpandBubble;
        PendingIntent deleteIntent;
        boolean isNotificationSuppressed;
        int desiredHeight;
        int desiredHeightResId;
        int desiredHeightResId2;
        int desiredHeight2;
        String shortcutId2;
        shortcutId = bubbleMetadata.getShortcutId();
        if (shortcutId != null) {
            shortcutId2 = bubbleMetadata.getShortcutId();
            kmhVar = new kmh(shortcutId2);
        } else {
            intent = bubbleMetadata.getIntent();
            icon = bubbleMetadata.getIcon();
            kmhVar = new kmh(intent, kqk.e(icon));
        }
        autoExpandBubble = bubbleMetadata.getAutoExpandBubble();
        kmhVar.b(autoExpandBubble);
        deleteIntent = bubbleMetadata.getDeleteIntent();
        kmhVar.a = deleteIntent;
        isNotificationSuppressed = bubbleMetadata.isNotificationSuppressed();
        kmhVar.e(isNotificationSuppressed);
        desiredHeight = bubbleMetadata.getDesiredHeight();
        if (desiredHeight != 0) {
            desiredHeight2 = bubbleMetadata.getDesiredHeight();
            kmhVar.c(desiredHeight2);
        }
        desiredHeightResId = bubbleMetadata.getDesiredHeightResId();
        if (desiredHeightResId != 0) {
            desiredHeightResId2 = bubbleMetadata.getDesiredHeightResId();
            kmhVar.d(desiredHeightResId2);
        }
        return kmhVar.a();
    }
}
