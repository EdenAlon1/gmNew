package defpackage;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjan implements cjam {
    private static final entd a = entd.c("BugleNotifications");
    private final Context b;
    private final ciwb c;
    private final Optional d;

    public cjan(Context context, ciwb ciwbVar, Optional optional) {
        this.b = context;
        this.c = ciwbVar;
        this.d = optional;
    }

    @Override // defpackage.cjam
    public final NotificationChannel a() {
        return this.c.d(Optional.of(c()), Optional.empty());
    }

    @Override // defpackage.cjam
    public final Intent b(String str, String str2, ConversationIdType conversationIdType) {
        String id;
        NotificationChannel a2;
        String id2;
        String id3;
        String group;
        String id4;
        if (ctid.d && !((csll) this.d.get()).k(str2)) {
            ensz enszVar = (ensz) a.j();
            enszVar.Y(cird.t, str2);
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageChannelManagerImpl", "createConversationChannelAndGetSettingIntent", 89, "IncomingMessageChannelManagerImpl.java")).q("Missing shortcut, won't create conversation notification channel");
            return null;
        }
        NotificationChannel a3 = a();
        ciwb ciwbVar = this.c;
        id = a3.getId();
        if (ctid.d) {
            a2 = ciwbVar.c(id, str2);
            if (a2 != null) {
                a2.setName(str);
                ciwbVar.i(a2);
            } else {
                NotificationChannel a4 = ciwbVar.b.a(id);
                if (a4 != null) {
                    String h = ciwb.h(id, str2);
                    group = a4.getGroup();
                    a2 = ciwbVar.a(h, str, a4, group);
                    a2.setConversationId(id, str2);
                    ciwbVar.i(a2);
                    ensk h2 = ciwb.a.h();
                    h2.Y(ente.a, "BugleNotifications");
                    enrr enrrVar = (enrr) h2;
                    ensn ensnVar = cird.k;
                    id4 = a2.getId();
                    enrrVar.Y(ensnVar, id4);
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "getOrCreateConversationChannelRPlus", 398, "NotificationChannelManager.java")).q("Creating R+ conversation channel");
                }
                a2 = null;
            }
        } else {
            NotificationChannel b = ciwbVar.b(conversationIdType);
            if (b != null) {
                b.setName(str);
                ciwbVar.i(b);
                a2 = b;
            } else {
                NotificationChannel a5 = ciwbVar.b.a(id);
                if (a5 != null) {
                    a2 = ciwbVar.a(conversationIdType.a(), str, a5, civv.CONVERSATIONS.c);
                    ciwbVar.i(a2);
                    ensk h3 = ciwb.a.h();
                    h3.Y(ente.a, "BugleNotifications");
                    enrr enrrVar2 = (enrr) h3;
                    ensn ensnVar2 = cird.k;
                    id2 = a2.getId();
                    enrrVar2.Y(ensnVar2, id2);
                    ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "getOrCreateConversationChannelPreR", 367, "NotificationChannelManager.java")).q("Creating pre-R conversation channel");
                }
                a2 = null;
            }
        }
        if (a2 == null) {
            return null;
        }
        Intent a6 = akuv.d("android.settings.CHANNEL_NOTIFICATION_SETTINGS").a();
        id3 = a2.getId();
        a6.putExtra("android.provider.extra.CHANNEL_ID", id3);
        a6.putExtra("android.provider.extra.APP_PACKAGE", this.b.getPackageName());
        return a6;
    }

    @Override // defpackage.cjam
    public final civu c() {
        Context context = this.b;
        String string = context.getString(R.string.im_notification_default_channel_id);
        String string2 = context.getString(R.string.im_notification_default_channel_name);
        civv civvVar = civv.DEFAULT_SETTINGS;
        Optional.empty();
        Optional.empty();
        Optional.empty();
        Optional.empty();
        Optional.empty();
        Optional.empty();
        if (string == null) {
            throw new NullPointerException("Null channelId");
        }
        if (string2 == null) {
            throw new NullPointerException("Null channelName");
        }
        Optional of = Optional.of(civvVar);
        Optional.of(false);
        Optional of2 = Optional.of(true);
        Optional of3 = Optional.of(true);
        Optional of4 = Optional.of(0);
        Optional empty = Optional.empty();
        Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
        if (uri != null) {
            return new cisu(string, string2, uri, Optional.of(true), of2, of3, empty, of4, of);
        }
        throw new NullPointerException("Null soundUri");
    }

    @Override // defpackage.cjam
    public final void d(ConversationIdType conversationIdType) {
        String id;
        if (this.d.isEmpty()) {
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageChannelManagerImpl", "deleteConversationChannel", 67, "IncomingMessageChannelManagerImpl.java")).q("Not deleting conversation channel because shortcutUtil missing");
            return;
        }
        String f = ((csll) this.d.get()).f(conversationIdType);
        ciwb ciwbVar = this.c;
        NotificationChannel c = ctid.d ? ciwbVar.c(this.b.getString(R.string.im_notification_default_channel_id), f) : ciwbVar.b(conversationIdType);
        if (c == null) {
            return;
        }
        ciwb ciwbVar2 = this.c;
        id = c.getId();
        ciwbVar2.j(id);
    }
}
