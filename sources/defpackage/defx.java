package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class defx extends ffhv implements ffjm {
    final /* synthetic */ degd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public defx(degd degdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = degdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((defx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((akzt) ((defd) this.a.c.b()).a.b()).c("Bugle.Wear.Phone.LoadConversation.Timeout");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new defx(this.a, ffguVar);
    }
}
