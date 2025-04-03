package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aemn extends ffhv implements ffjm {
    final /* synthetic */ aemw a;
    final /* synthetic */ hkx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aemn(aemw aemwVar, hkx hkxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aemwVar;
        this.b = hkxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aemn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        try {
            cyxb b = aemq.b(this.b);
            if ((b != null ? b.c : null) == cyxc.e && !this.a.h) {
                ensk h = aemw.a.h();
                h.Y(ente.a, "BugleCdp");
                ((enrr) h.h("com/google/android/apps/messaging/home/minidetailspage/HomeMiniConversationDetailsFragmentPeer$onCreateView$1$2$1$1$1$1", "invokeSuspend", 114, "HomeMiniConversationDetailsFragmentPeer.kt")).q("Destroy Mini CDP fragment");
                cg cgVar = new cg(this.a.c.J());
                cgVar.n(this.a.c);
                cgVar.c();
            }
        } catch (Exception e) {
            ensk j = aemw.a.j();
            j.Y(ente.a, "BugleCdp");
            ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/home/minidetailspage/HomeMiniConversationDetailsFragmentPeer$onCreateView$1$2$1$1$1$1", "invokeSuspend", 122, "HomeMiniConversationDetailsFragmentPeer.kt")).q("Failed to remove Mini CDP fragment post state saved");
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aemn(this.a, this.b, ffguVar);
    }
}
