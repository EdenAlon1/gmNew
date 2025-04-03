package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wuj extends ffhv implements ffjm {
    final /* synthetic */ wut a;
    final /* synthetic */ alxj b;
    final /* synthetic */ alxs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wuj(wut wutVar, alxj alxjVar, alxs alxsVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = wutVar;
        this.b = alxjVar;
        this.c = alxsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wuj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ensk h = wut.a.h();
        h.Y(ente.a, "BugleConversation");
        ((enrr) h.h("com/google/android/apps/messaging/conversation2/actions/details/ConversationDetailsActionPlugin$onClick$1", "invokeSuspend", 163, "ConversationDetailsActionPlugin.kt")).q("Open conversation details from conversation detail action plugin.");
        this.a.d.h(new aijq(this.b, this.c, 3, 2));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wuj(this.a, this.b, this.c, ffguVar);
    }
}
