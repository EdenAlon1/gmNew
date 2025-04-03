package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class bbaz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bbbd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbaz(bbbd bbbdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bbbdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bbaz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            bbbd bbbdVar = this.b;
            this.a = 1;
            if (bbbdVar.b(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        ensk g = bbbd.a.g();
        g.Y(ente.a, "Bugle");
        ((enrr) g.h("com/google/android/apps/messaging/shared/datamodel/action/WaitForRcsServiceConnectionAsyncAction$execute$2$1", "invokeSuspend", 47, "WaitForRcsServiceConnectionAsyncAction.kt")).q("Done waiting for Rcs services connection");
        return true;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bbaz(this.b, ffguVar);
    }
}
