package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaer extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ ajiy b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaer(ajiy ajiyVar, boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ajiyVar;
        this.c = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aaer) c((alxr) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        alxr alxrVar = (alxr) this.a;
        if (alxrVar == null) {
            ((enrr) aaex.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/metatext/MetatextClickHandlerImpl$onClick$unused$1$1$1$job$1$1", "invokeSuspend", 121, "MetatextClickHandlerImpl.kt")).q("Message is deleted, hiding bottom sheet");
            this.b.a();
            return false;
        }
        if (this.c || !zsr.w(alxrVar)) {
            return true;
        }
        ((enrr) aaex.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/metatext/MetatextClickHandlerImpl$onClick$unused$1$1$1$job$1$1", "invokeSuspend", 127, "MetatextClickHandlerImpl.kt")).q("Message is sent, hiding bottom sheet");
        this.b.a();
        return false;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aaer aaerVar = new aaer(this.b, this.c, ffguVar);
        aaerVar.a = obj;
        return aaerVar;
    }
}
