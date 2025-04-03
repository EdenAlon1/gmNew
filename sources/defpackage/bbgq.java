package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbgq {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/actionhelpers/PendingMessageChannels");
    private final ffbr b;
    private final bbfw c;

    public bbgq(ffbr ffbrVar, bbfw bbfwVar) {
        this.b = ffbrVar;
        this.c = bbfwVar;
    }

    public static int b(MessageCoreData messageCoreData) {
        emxf.a(!messageCoreData.cK());
        if (messageCoreData.df()) {
            return 0;
        }
        if (messageCoreData.cP()) {
            return 1;
        }
        if (messageCoreData.cw()) {
            return 6;
        }
        if (messageCoreData.cY()) {
            return 4;
        }
        if (messageCoreData.cX()) {
            return 3;
        }
        ensk j = a.j();
        j.Y(ente.a, "BugleDataModel");
        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/PendingMessageChannels", "getChannelForSendMessage", 82, "PendingMessageChannels.java")).t("Invalid channel for send msg protocol: %s", new ecgk(messageCoreData.W()));
        throw new IllegalStateException("ProcessingPendingMessagesAction: invalid channel for send msg, protocol = ".concat(String.valueOf(messageCoreData.aw())));
    }

    public static boolean f(int i) {
        return i >= 0 && i < 8;
    }

    public final int a(MessageCoreData messageCoreData, cniz cnizVar) {
        MessageIdType B = messageCoreData.B();
        enru enruVar = a;
        ensk e = enruVar.e();
        e.Y(ente.a, "BugleDataModel");
        enrr enrrVar = (enrr) e;
        enrrVar.Y(csux.b, B);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/PendingMessageChannels", "getChannelForDownloadMessage", 94, "PendingMessageChannels.java")).q("getChannelForDownloadMessage");
        emxf.a(messageCoreData.cK());
        if (messageCoreData.cR()) {
            ensk e2 = enruVar.e();
            e2.Y(ente.a, "BugleDataModel");
            enrr enrrVar2 = (enrr) e2;
            enrrVar2.Y(csux.b, B);
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/PendingMessageChannels", "getChannelForDownloadMessage", 97, "PendingMessageChannels.java")).q("Message is Mms Notification");
            return 2;
        }
        if (messageCoreData.cw()) {
            ensk e3 = enruVar.e();
            e3.Y(ente.a, "BugleDataModel");
            enrr enrrVar3 = (enrr) e3;
            enrrVar3.Y(csux.b, B);
            ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/PendingMessageChannels", "getChannelForDownloadMessage", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "PendingMessageChannels.java")).q("Message is cloud sync");
            return 7;
        }
        if (messageCoreData.cX()) {
            ensk e4 = enruVar.e();
            e4.Y(ente.a, "BugleDataModel");
            enrr enrrVar4 = (enrr) e4;
            enrrVar4.Y(csux.b, B);
            ((enrr) enrrVar4.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/PendingMessageChannels", "getChannelForDownloadMessage", 105, "PendingMessageChannels.java")).q("Message is RCS");
            return 5;
        }
        if (!messageCoreData.cP()) {
            ensk j = enruVar.j();
            j.Y(ente.a, "BugleDataModel");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/PendingMessageChannels", "getChannelForDownloadMessage", 119, "PendingMessageChannels.java")).D("Invalid channel for download msg protocol: %s, autoDownload: %b", new ecgk(messageCoreData.W()), new ecgh(messageCoreData.cs()));
            throw new IllegalStateException("ProcessingPendingMessagesAction: invalid channel for download msg, protocol = ".concat(String.valueOf(messageCoreData.aw())));
        }
        ensk j2 = enruVar.j();
        j2.Y(ente.a, "BugleDataModel");
        ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/PendingMessageChannels", "getChannelForDownloadMessage", 113, "PendingMessageChannels.java")).t("Message is not an MMS notification but still in pending queue. status: %s", messageCoreData.aC());
        bdmq bdmqVar = (bdmq) this.b.b();
        ConversationIdType z = messageCoreData.z();
        MessageIdType B2 = messageCoreData.B();
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.ap("prepareFailRcsFtOrMmsDownload");
        buxrVar.U(106);
        bdmqVar.Q(z, B2, buxrVar);
        bbfv bbfvVar = new bbfv(this.c);
        bbfvVar.b();
        bbfvVar.c();
        bbfvVar.a().r(cnizVar);
        return -1;
    }

    public final int c(MessageCoreData messageCoreData, cniz cnizVar) {
        if (messageCoreData.cW()) {
            return b(messageCoreData);
        }
        if (messageCoreData.cV() || messageCoreData.ct()) {
            return a(messageCoreData, cnizVar);
        }
        return -1;
    }

    public final int d(MessageCoreData messageCoreData, cniz cnizVar) {
        if (messageCoreData.dd()) {
            return b(messageCoreData);
        }
        if (messageCoreData.cz()) {
            return a(messageCoreData, cnizVar);
        }
        return -1;
    }

    public final int e(MessageCoreData messageCoreData, cniz cnizVar) {
        int d = d(messageCoreData, cnizVar);
        return d == -1 ? c(messageCoreData, cnizVar) : d;
    }
}
