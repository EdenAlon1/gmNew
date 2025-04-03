package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deiz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ deji b;
    final /* synthetic */ deoa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deiz(deji dejiVar, deoa deoaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dejiVar;
        this.c = deoaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((deiz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            lkv lkvVar = ((deiv) this.b.b.b()).a;
            lkvVar.getClass();
            deoa deoaVar = this.c;
            deji dejiVar = this.b;
            lkj lkjVar = lkj.RESUMED;
            deiy deiyVar = new deiy(deoaVar, dejiVar, null);
            this.a = 1;
            if (llo.a(lkvVar, lkjVar, deiyVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new deiz(this.b, this.c, ffguVar);
    }
}
