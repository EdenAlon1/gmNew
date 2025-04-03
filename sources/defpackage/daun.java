package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class daun extends cslh {
    final /* synthetic */ Activity a;
    final /* synthetic */ dauv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daun(dauv dauvVar, Activity activity) {
        super("Bugle.Async.DebugUtils.showNotificationChannelsInfo.Duration");
        this.a = activity;
        this.b = dauvVar;
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        List notificationChannels;
        CharSequence name;
        String id;
        String description;
        String group;
        Uri sound;
        int importance;
        boolean canShowBadge;
        boolean shouldVibrate;
        dauv dauvVar = this.b;
        NotificationManager notificationManager = (NotificationManager) dauvVar.x.getSystemService("notification");
        if (notificationManager == null) {
            return "Unable to retrieve notification manager.";
        }
        notificationChannels = notificationManager.getNotificationChannels();
        ArrayList arrayList = new ArrayList(notificationChannels);
        StringBuilder sb = new StringBuilder();
        sb.append("Found ");
        sb.append(arrayList.size());
        sb.append(" channel(s)");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            NotificationChannel m = akb$$ExternalSyntheticApiModelOutline0.m(arrayList.get(i));
            sb.append("\n");
            StringBuilder sb2 = new StringBuilder();
            name = m.getName();
            sb2.append(name.toString());
            id = m.getId();
            cuxt.g(sb2, "Id: ", id, "\n");
            cuxt.g(sb2, "Conversation: ", String.valueOf(((bczy) dauvVar.D.b()).J(bdgq.b(id))), "\n");
            description = m.getDescription();
            cuxt.g(sb2, "Description: ", description, "\n");
            group = m.getGroup();
            cuxt.g(sb2, "Group: ", group, "\n");
            sound = m.getSound();
            cuxt.g(sb2, "Sound: ", sound.toString(), "\n");
            importance = m.getImportance();
            cuxt.g(sb2, "Importance: ", String.valueOf(importance), "\n");
            canShowBadge = m.canShowBadge();
            cuxt.g(sb2, "Show badge: ", String.valueOf(canShowBadge), "\n");
            shouldVibrate = m.shouldVibrate();
            cuxt.g(sb2, "Vibration: ", String.valueOf(shouldVibrate), "\n");
            cuxt.f(sb, sb2.toString(), "\n");
        }
        return sb.toString();
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        new AlertDialog.Builder(this.a).setTitle("Notification channels").setMessage((String) obj).setCancelable(true).show();
    }
}
