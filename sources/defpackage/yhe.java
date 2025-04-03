package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yhe implements ffji {
    final /* synthetic */ ffkx a;
    final /* synthetic */ yhr b;
    final /* synthetic */ MessageId c;

    public yhe(ffkx ffkxVar, yhr yhrVar, MessageId messageId) {
        this.a = ffkxVar;
        this.b = yhrVar;
        this.c = messageId;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        xhu xhuVar = (xhu) obj;
        xhuVar.getClass();
        if (xhuVar.g == null) {
            return (!((Boolean) this.b.h.b()).booleanValue() || xhuVar.f == null) ? xhu.c(xhuVar, null, null, null, false, this.c, null, false, 0, 1007) : xhu.c(xhuVar, null, null, null, false, this.c, null, false, 0, 974);
        }
        ensk e = yhr.a.e();
        e.Y(ente.a, "BugleComposeRow2");
        ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/replies/DraftReplyUiAdapterImpl$setReplyTo$2$oldDraftData$1", "invoke", 102, "DraftReplyUiAdapterImpl.kt")).q("Don't allow to schedule a reply message.");
        this.a.a = true;
        return xhuVar;
    }
}
