package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzqx extends ffhv implements ffjm {
    final /* synthetic */ bzqy a;
    final /* synthetic */ ConversationIdType b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzqx(bzqy bzqyVar, ConversationIdType conversationIdType, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = bzqyVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzqx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (((bczy) this.a.c.b()).c(this.b) == 0) {
            ensk h = bzqy.a.h();
            h.Y(ente.a, "BugleEtouffee");
            ((enrr) h.h("com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/E2eeConversationCreationListener$onCreated$1", "invokeSuspend", 46, "E2eeConversationCreationListener.kt")).t("Ensure encryption status for a newly created conversation: %s", this.b.a());
            ((bbab) this.a.b.b()).a(this.b).t();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzqx(this.a, this.b, ffguVar);
    }
}
