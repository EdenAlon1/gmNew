package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awqb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ awqc b;
    final /* synthetic */ BugleConversationId c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awqb(awqc awqcVar, BugleConversationId bugleConversationId, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = awqcVar;
        this.c = bugleConversationId;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awqb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return null;
        }
        awqc awqcVar = this.b;
        BugleConversationId bugleConversationId = this.c;
        this.a = 1;
        Object c = fgfz.c(((amii) awqcVar.a.b()).a(bugleConversationId), this);
        if (c != ffhh.a) {
            c = ffcu.a;
        }
        if (c == obj2) {
            return obj2;
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new awqb(this.b, this.c, ffguVar);
    }
}
