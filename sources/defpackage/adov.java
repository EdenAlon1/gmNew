package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adov extends ffhv implements ffjm {
    int a;
    final /* synthetic */ adpj b;
    final /* synthetic */ deoa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adov(adpj adpjVar, deoa deoaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = adpjVar;
        this.c = deoaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adov) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            lkv lkvVar = ((adoq) this.b.b.b()).a;
            lkvVar.getClass();
            deoa deoaVar = this.c;
            adpj adpjVar = this.b;
            lkj lkjVar = lkj.RESUMED;
            adou adouVar = new adou(deoaVar, adpjVar, null);
            this.a = 1;
            if (llo.a(lkvVar, lkjVar, adouVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new adov(this.b, this.c, ffguVar);
    }
}
