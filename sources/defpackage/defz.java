package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class defz extends ffhv implements ffjm {
    final /* synthetic */ degd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public defz(degd degdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = degdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((defz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((akzt) ((defd) this.a.c.b()).a.b()).c("Bugle.Wear.Phone.LoadConversation.Error");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new defz(this.a, ffguVar);
    }
}
