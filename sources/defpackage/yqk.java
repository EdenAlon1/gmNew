package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yqk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yqq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqk(yqq yqqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = yqqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yqk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            yqq yqqVar = this.b;
            this.a = 1;
            obj = fgbj.a(yqqVar.d, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        alxj alxjVar = (alxj) obj;
        if ((alxjVar instanceof amfx) && ((amfx) alxjVar).D() == ckte.j && !crnx.j(this.b.b)) {
            ((adsd) this.b.f.b()).a(42);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new yqk(this.b, ffguVar);
    }
}
