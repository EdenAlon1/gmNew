package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjdd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjdg b;
    final /* synthetic */ cjda c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjdd(cjdg cjdgVar, cjda cjdaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cjdgVar;
        this.c = cjdaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjdd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cjdg cjdgVar = this.b;
            ConversationId c = cjdgVar.b.c(this.c.c.I());
            if (!(c instanceof BugleConversationId)) {
                ensk g = cjdg.a.g();
                g.Y(ente.a, "Bugle");
                ((enrr) g.h("com/google/android/apps/messaging/shared/notification2o/unapprovedincomingmessage/UnapprovedIncomingMessageNotificationBlueprint$createNotificationCreationPackage$1", "invokeSuspend", 74, "UnapprovedIncomingMessageNotificationBlueprint.kt")).q("Cannot create unapproved incoming message notification. ConversationId is not an instance of BugleConversationId.");
                return null;
            }
            this.a = 1;
            obj = this.b.h((BugleConversationId) c, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return new cisv(engw.r(obj), Optional.empty());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjdd(this.b, this.c, ffguVar);
    }
}
