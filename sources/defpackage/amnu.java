package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amnu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amnx b;
    final /* synthetic */ BugleConversation c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amnu(amnx amnxVar, BugleConversation bugleConversation, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amnxVar;
        this.c = bugleConversation;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amnu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return null;
        }
        amnx amnxVar = this.b;
        BugleConversation bugleConversation = this.c;
        this.a = 1;
        if (amnxVar.c(bugleConversation, this) == ffhhVar) {
            return ffhhVar;
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amnu(this.b, this.c, ffguVar);
    }
}
