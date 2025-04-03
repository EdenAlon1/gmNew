package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kmf {
    static Notification.BubbleMetadata a(kmi kmiVar) {
        Notification.BubbleMetadata.Builder icon;
        Notification.BubbleMetadata.Builder intent;
        Notification.BubbleMetadata.Builder deleteIntent;
        Notification.BubbleMetadata.Builder autoExpandBubble;
        Notification.BubbleMetadata.Builder suppressNotification;
        Notification.BubbleMetadata build;
        if (kmiVar.a == null) {
            return null;
        }
        icon = new Notification.BubbleMetadata.Builder().setIcon(kmiVar.c.c());
        intent = icon.setIntent(kmiVar.a);
        deleteIntent = intent.setDeleteIntent(kmiVar.b);
        autoExpandBubble = deleteIntent.setAutoExpandBubble(kmiVar.a());
        suppressNotification = autoExpandBubble.setSuppressNotification(kmiVar.b());
        int i = kmiVar.d;
        if (i != 0) {
            suppressNotification.setDesiredHeight(i);
        }
        int i2 = kmiVar.e;
        if (i2 != 0) {
            suppressNotification.setDesiredHeightResId(i2);
        }
        build = suppressNotification.build();
        return build;
    }

    static kmi b(Notification.BubbleMetadata bubbleMetadata) {
        PendingIntent intent;
        PendingIntent intent2;
        Icon icon;
        boolean autoExpandBubble;
        PendingIntent deleteIntent;
        boolean isNotificationSuppressed;
        int desiredHeight;
        int desiredHeightResId;
        int desiredHeightResId2;
        int desiredHeight2;
        intent = bubbleMetadata.getIntent();
        if (intent == null) {
            return null;
        }
        intent2 = bubbleMetadata.getIntent();
        icon = bubbleMetadata.getIcon();
        kmh kmhVar = new kmh(intent2, kqk.e(icon));
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
