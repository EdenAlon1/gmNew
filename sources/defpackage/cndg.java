package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cndg {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;

    public cndg(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
    }

    public final void a(fbvt fbvtVar, MessageCoreData messageCoreData) {
        ekzz f = eleg.f("ReactionMessageTranslator#alterFallbackMessage");
        try {
            Object b = this.b.b();
            b.getClass();
            cmrl a = cnee.a(fbvtVar, (cmrq) b, this.c);
            if (a == null) {
                ffig.a(f, null);
                return;
            }
            for (MessagePartCoreData messagePartCoreData : ((MessageData) messageCoreData).i) {
                if (messagePartCoreData.bA()) {
                    messagePartCoreData.aK(((cndj) this.a.b()).a(cnee.b(fbvtVar), a, new cmtf(fbvtVar.c)));
                }
            }
            ffig.a(f, null);
        } finally {
        }
    }
}
