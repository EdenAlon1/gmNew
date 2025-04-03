package defpackage;

import android.net.Uri;
import android.provider.Telephony;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczx implements cpwf {
    private static final entd a = entd.c("BugleReactions");
    private final adaa b;
    private final auqn c;

    public aczx(adaa adaaVar, auqn auqnVar) {
        this.b = adaaVar;
        this.c = auqnVar;
    }

    @Override // defpackage.cpwf
    public final void c(MessagePartCoreData messagePartCoreData) {
        messagePartCoreData.getClass();
        if (ctjd.b()) {
            if (((ersq) ((aups) this.c).a.b()).a("bugle.do_not_process_text_parts_for_emotify_telephony") && messagePartCoreData.bA()) {
                return;
            }
            if (messagePartCoreData.aa() == null) {
                ((ensz) a.h()).q("Invoked telephony callback. Part does not have id yet");
                return;
            }
            Uri t = messagePartCoreData.t();
            if (t == null) {
                ((ensz) a.h()).q("Inserted part has no URI, not updating the database");
                return;
            }
            if (!ffkj.e(t.getAuthority(), Telephony.Mms.CONTENT_URI.getAuthority())) {
                ((ensz) a.h()).q("Ignoring on part inserted. It was not inserting to telephony.");
                return;
            }
            adaa adaaVar = this.b;
            MessageIdType B = messagePartCoreData.B();
            B.getClass();
            aczy aczyVar = (aczy) aczz.a.createBuilder();
            aczyVar.getClass();
            String b = B.b();
            b.getClass();
            aczyVar.copyOnWrite();
            ((aczz) aczyVar.instance).b = b;
            String uri = t.toString();
            uri.getClass();
            aczyVar.copyOnWrite();
            ((aczz) aczyVar.instance).c = uri;
            eyfy build = aczyVar.build();
            build.getClass();
            adaaVar.a.a(ceyr.g("EmotifyReactionDatabaseUpdateHandler", (aczz) build));
        }
    }

    @Override // defpackage.cpwf
    public final void a(ConversationIdType conversationIdType) {
    }

    @Override // defpackage.cpwf
    public final void d(String str) {
    }

    @Override // defpackage.cpwf
    public final void b(ConversationIdType conversationIdType, List list) {
    }
}
