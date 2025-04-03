package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aald extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aalh b;
    final /* synthetic */ appq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aald(aalh aalhVar, appq appqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aalhVar;
        this.c = appqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aald) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aalh aalhVar = this.b;
            ConversationIdType conversationIdType = ((RbmConversationId) aalhVar.d).a;
            appq appqVar = this.c;
            ailj ailjVar = new ailj(2, appqVar.e(), appqVar.b(), bcqc.a(aalhVar.b, conversationIdType), 16);
            this.a = 1;
            obj = aalhVar.f.f(ailjVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ainw ainwVar = (ainw) obj;
        ensk h = aalh.a.h();
        h.Y(ente.a, "BugleRbmRichCard");
        ((enrr) h.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/richcards/RichCardBubbleUiAdapter$openImage$1", "invokeSuspend", 374, "RichCardBubbleUiAdapter.kt")).t("Rich Card bubble image MediaViewer result: %s", ainwVar);
        if (ainwVar != null) {
            this.b.c(ainwVar);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aald(this.b, this.c, ffguVar);
    }
}
