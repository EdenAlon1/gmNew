package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwau extends ffhv implements ffjm {
    final /* synthetic */ cwav a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwau(cwav cwavVar, String str, String str2, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cwavVar;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwau) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ayvm a = ((ayvn) this.a.d.b()).a();
        String str = ((ayhf) a.a(this.b)).a;
        String str2 = ((ayhf) a.a(this.c)).a;
        ensk h = cwav.a.h();
        h.Y(ente.a, "BugleContacts");
        ((enrr) h.h("com/google/android/apps/messaging/startchat/logger/StartChatEventLogger$onContactSuggestionResultClick$1", "invokeSuspend", 171, "StartChatEventLogger.kt")).D("onContactSuggestionResultClick. destination: %s, input: %s", str, str2);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cwau(this.a, this.b, this.c, ffguVar);
    }
}
