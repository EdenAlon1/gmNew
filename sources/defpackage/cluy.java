package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cluy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ clva c;
    final /* synthetic */ awui d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cluy(ConversationIdType conversationIdType, clva clvaVar, awui awuiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = conversationIdType;
        this.c = clvaVar;
        this.d = awuiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cluy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ensk h = clva.a.h();
            h.Y(ente.a, "Bugle");
            ((enrr) h.h("com/google/android/apps/messaging/shared/rcs/participant/ConversationDraftingUpdater$scheduleIsOnlineCheck$1$1", "invokeSuspend", 169, "ConversationDraftingUpdater.kt")).t("Scheduling is online check for conversationId %s", this.b.a());
            azcn azcnVar = (azcn) this.c.d.b();
            awui awuiVar = this.d;
            this.a = 1;
            obj = azcnVar.b(awuiVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        clva clvaVar = this.c;
        clve clveVar = (clve) clvf.a.createBuilder();
        ConversationIdType conversationIdType = this.b;
        clveVar.copyOnWrite();
        clvf clvfVar = (clvf) clveVar.instance;
        clvfVar.b |= 2;
        clvfVar.d = conversationIdType.a;
        azee b = azcp.b((azcr) obj);
        clveVar.copyOnWrite();
        clvf clvfVar2 = (clvf) clveVar.instance;
        clvfVar2.c = b;
        clvfVar2.b |= 1;
        clvf clvfVar3 = (clvf) clveVar.build();
        cetp cetpVar = new cetp();
        Object b2 = this.c.h.a.b();
        b2.getClass();
        Duration ofSeconds = Duration.ofSeconds(((Number) b2).longValue());
        ofSeconds.getClass();
        cetpVar.c = ofSeconds;
        ((cevh) clvaVar.f.a.b()).a(ceyr.h("conversation_latcher", clvfVar3, cetpVar.a()));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cluy(this.b, this.c, this.d, ffguVar);
    }
}
