package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cght extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cghv b;
    final /* synthetic */ cgho c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cght(ffgu ffguVar, cghv cghvVar, cgho cghoVar) {
        super(2, ffguVar);
        this.b = cghvVar;
        this.c = cghoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cght) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            ((dtuu) this.b.f.b()).d("ParentAllowlistUpdateHandler#updateConversationAllowlistStatusInDb", new cghu(this.b, this.c));
            cghv cghvVar = this.b;
            cgho cghoVar = this.c;
            this.a = 1;
            if (cghvVar.k(cghoVar.a, cghoVar.b, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        cghv cghvVar2 = this.b;
        for (ConversationIdType conversationIdType : this.c.a) {
            ensk h = cghv.a.h();
            h.Y(ente.a, "BugleWearable");
            enrr enrrVar = (enrr) h;
            enrrVar.Y(csux.p, conversationIdType);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/kids/handler/ParentAllowlistUpdateHandler", "cancelDisallowedConversationsNotification", 345, "ParentAllowlistUpdateHandler.kt")).t("Conversation is disallowed. Canceling IM notification.", conversationIdType.a());
            ((cjbc) cghvVar2.i.b()).a(conversationIdType);
        }
        if (this.c.b.isEmpty() && this.c.a.isEmpty()) {
            ensk h2 = cghv.a.h();
            h2.Y(ente.a, "BugleWearable");
            ((enrr) h2.h("com/google/android/apps/messaging/shared/kids/handler/ParentAllowlistUpdateHandler$updateConversationAllowlistStatusInDb$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 292, "ParentAllowlistUpdateHandler.kt")).q("No DB update has been made from this Trusted Contact update.");
        } else {
            this.b.m();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cght cghtVar = new cght(ffguVar, this.b, this.c);
        cghtVar.d = obj;
        return cghtVar;
    }
}
