package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xqz extends ffhv implements ffjm {
    final /* synthetic */ xra a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqz(xra xraVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = xraVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xqz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((akzt) this.a.d.b()).c("Bugle.DirectSend.FastImageSending.TuneButtonClick.Count");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xqz(this.a, ffguVar);
    }
}
