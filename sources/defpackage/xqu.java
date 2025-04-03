package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xqu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ xra b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqu(xra xraVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = xraVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xqu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            xra xraVar = this.b;
            this.a = 1;
            obj = xraVar.a(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        xrc xrcVar = (xrc) obj;
        ((akzt) this.b.d.b()).e("Bugle.DirectSend.FastImageSending.Dismissed.Count", xrd.a(xrcVar, xrcVar) - 1);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xqu(this.b, ffguVar);
    }
}
