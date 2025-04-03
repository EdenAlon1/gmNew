package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyrp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cyrs b;
    final /* synthetic */ ResolvedRecipient c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyrp(cyrs cyrsVar, ResolvedRecipient resolvedRecipient, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cyrsVar;
        this.c = resolvedRecipient;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyrp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object a;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            a = obj;
        } else {
            cyrs cyrsVar = this.b;
            this.a = 1;
            a = fgbj.a(cyrsVar.c, this);
            if (a == ffhhVar) {
                return ffhhVar;
            }
        }
        ConversationId c = ((alxj) a).c();
        c.getClass();
        final cyrs cyrsVar2 = this.b;
        final ResolvedRecipient resolvedRecipient = this.c;
        final BugleConversationId bugleConversationId = (BugleConversationId) c;
        String string = cyrsVar2.a.getString(R.string.remove_user_dialog_message, cyrs.d(resolvedRecipient));
        string.getClass();
        String string2 = cyrsVar2.a.getString(android.R.string.ok);
        string2.getClass();
        doas doasVar = new doas(string2, new ffix() { // from class: cyrh
            @Override // defpackage.ffix
            public final Object invoke() {
                BugleConversationId bugleConversationId2 = bugleConversationId;
                ResolvedRecipient resolvedRecipient2 = resolvedRecipient;
                cyrs cyrsVar3 = cyrs.this;
                ekzm b = cyrsVar3.i.b("GroupMembersUiAdapterImpl: Remove user from group");
                try {
                    ((wcm) cyrsVar3.f.b()).a();
                    ((wcv) cyrsVar3.j.b()).a(bugleConversationId2.a, resolvedRecipient2.F());
                    ffig.a(b, null);
                    return ffcu.a;
                } finally {
                }
            }
        });
        String string3 = cyrsVar2.a.getString(android.R.string.cancel);
        string3.getClass();
        cyrsVar2.h.c(new dmve(string, null, null, null, false, false, doasVar, new doas(string3, new ffix() { // from class: cyri
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }), null, 318), false);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cyrp(this.b, this.c, ffguVar);
    }
}
