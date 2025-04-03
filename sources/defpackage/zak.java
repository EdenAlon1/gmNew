package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zak extends ffhv implements ffjm {
    int a;
    final /* synthetic */ zao b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zak(zao zaoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = zaoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zak) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ahrq ahrqVar = (ahrq) this.b.f.b();
            ConversationIdType conversationIdType = ((BugleConversationId) this.b.d).a;
            this.a = 1;
            obj = ahrqVar.c(conversationIdType, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            ensk j = zao.a.j();
            j.Y(ente.a, "BugleSpam");
            ((enrr) j.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardUiAdapterImpl$dismissAlertCard$1", "invokeSuspend", 192, "PenpalScamAlertCardUiAdapterImpl.kt")).q("Penpal alert card failed to dismiss scam classification.");
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zak(this.b, ffguVar);
    }
}
