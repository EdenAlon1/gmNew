package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baoy {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/action/RcsFileTransferMetadataUpdater");
    public final ffbr b;
    public final ffbr c;
    private final Context d;
    private final coxk e;
    private final dtuu f;

    public baoy(Context context, ffbr ffbrVar, ffbr ffbrVar2, coxk coxkVar, dtuu dtuuVar) {
        this.d = context;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.e = coxkVar;
        this.f = dtuuVar;
    }

    public final MessageCoreData a(bdhg bdhgVar, String str, final long j) {
        if (bdhgVar.i()) {
            ensk i = a.i();
            i.Y(ente.a, "BugleDataModel");
            ((enrr) ((enrr) i).h("com/google/android/apps/messaging/shared/datamodel/action/RcsFileTransferMetadataUpdater", "updateFileTransferMetadata", 57, "RcsFileTransferMetadataUpdater.java")).q("Cannot update RCS File Transfer metadata. RCS message id is not set.");
            return null;
        }
        final MessageCoreData w = ((bdmq) this.b.b()).w(bdhgVar);
        if (w == null) {
            ensk i2 = a.i();
            i2.Y(ente.a, "BugleDataModel");
            ((enrr) ((enrr) i2).h("com/google/android/apps/messaging/shared/datamodel/action/RcsFileTransferMetadataUpdater", "updateFileTransferMetadata", 63, "RcsFileTransferMetadataUpdater.java")).q("Cannot update RCS File Transfer content uri. Message doesn't exist");
            return null;
        }
        final MessagePartCoreData G = w.G();
        if (G == null) {
            ensk i3 = a.i();
            i3.Y(ente.a, "BugleDataModel");
            ((enrr) ((enrr) i3).h("com/google/android/apps/messaging/shared/datamodel/action/RcsFileTransferMetadataUpdater", "updateFileTransferMetadata", 69, "RcsFileTransferMetadataUpdater.java")).q("Cannot update RCS File Transfer metadata. Message doesn't have any attachments");
            return null;
        }
        Uri parse = TextUtils.isEmpty(str) ? null : Uri.parse(str);
        ensk g = a.g();
        g.Y(ente.a, "BugleDataModel");
        enrr enrrVar = (enrr) g;
        enrrVar.Y(csux.f, bdhgVar);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/action/RcsFileTransferMetadataUpdater", "updateFileTransferMetadata", 82, "RcsFileTransferMetadataUpdater.java")).C("Update RCS File Transfer metadata. fallbackUri: %s, expiry: %s", parse, j);
        final Uri uri = parse;
        this.f.d("updateFileTransferMetadata", new Runnable() { // from class: baox
            @Override // java.lang.Runnable
            public final void run() {
                baoy baoyVar = baoy.this;
                MessageCoreData messageCoreData = w;
                if (messageCoreData.u() != null) {
                    long j2 = j;
                    bdmq bdmqVar = (bdmq) baoyVar.b.b();
                    ConversationIdType z = messageCoreData.z();
                    MessageIdType B = messageCoreData.B();
                    String[] strArr = MessagesTable.a;
                    buxr buxrVar = new buxr();
                    buxrVar.ap("updateExpiryInDb");
                    buxrVar.t(j2);
                    boolean U = bdmqVar.U(z, B, buxrVar);
                    ensk g2 = baoy.a.g();
                    g2.Y(ente.a, "BugleDataModel");
                    enrr enrrVar2 = (enrr) g2;
                    enrrVar2.Y(csux.f, messageCoreData.E());
                    ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/datamodel/action/RcsFileTransferMetadataUpdater", "updateExpiryInDb", 122, "RcsFileTransferMetadataUpdater.java")).G("update File Transfer expiry. updated: %s, rcsFtSessionId: %s", U, messageCoreData.n());
                }
                Uri uri2 = uri;
                if (uri2 != null) {
                    MessagePartCoreData messagePartCoreData = G;
                    bdpt bdptVar = (bdpt) baoyVar.c.b();
                    ConversationIdType A = messagePartCoreData.A();
                    MessageIdType B2 = messagePartCoreData.B();
                    String aa = messagePartCoreData.aa();
                    String[] strArr2 = PartsTable.a;
                    bwdi bwdiVar = new bwdi();
                    bwdiVar.ap("updateFallbackUriInDb");
                    bwdiVar.m(uri2);
                    boolean f = bdptVar.f(A, B2, aa, bwdiVar);
                    ensk g3 = baoy.a.g();
                    g3.Y(ente.a, "BugleDataModel");
                    enrr enrrVar3 = (enrr) g3;
                    enrrVar3.Y(csux.f, messageCoreData.E());
                    ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/datamodel/action/RcsFileTransferMetadataUpdater", "updateFallbackUriInDb", 142, "RcsFileTransferMetadataUpdater.java")).G("update fallback Uri in DB. updated: %s, rcsFtSessionId: %s", f, messageCoreData.n());
                    if (f) {
                        messagePartCoreData.ay(uri2);
                    }
                }
            }
        });
        Uri u = w.u();
        if (u != null) {
            this.e.af(this.d, u, j);
        }
        return w;
    }
}
