package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class bbga {
    public static Action a(bbgc bbgcVar, MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        if (!messageCoreData.cY() && !messageCoreData.dh()) {
            ensk e = bbgb.a.e();
            e.Y(ente.a, "BugleDataModel");
            enrr enrrVar = (enrr) e;
            enrrVar.Y(csux.f, messageCoreData.E());
            enrrVar.Y(csux.b, messageCoreData.B());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/actionfactories/ResumeRcsFileTransferActionFactory", "prepareToResume", 46, "ResumeRcsFileTransferActionFactory.java")).q("Message is not a File Transfer.");
            return null;
        }
        if (messageCoreData.ch() || messageCoreData.cj() || messageCoreData.ck()) {
            return bbgcVar.a(messageCoreData.B());
        }
        ensk e2 = bbgb.a.e();
        e2.Y(ente.a, "BugleDataModel");
        enrr enrrVar2 = (enrr) e2;
        enrrVar2.Y(csux.f, messageCoreData.E());
        enrrVar2.Y(csux.b, messageCoreData.B());
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/datamodel/actionfactories/ResumeRcsFileTransferActionFactory", "prepareToResume", 57, "ResumeRcsFileTransferActionFactory.java")).t("Message is not ready to resume. Message status: %s", messageCoreData.aC());
        return null;
    }
}
