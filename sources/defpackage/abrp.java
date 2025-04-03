package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abrp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ absj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abrp(absj absjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = absjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abrp) c((akzw) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            absj absjVar = this.b;
            this.a = 1;
            if (absjVar.a(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new abrp(this.b, ffguVar);
    }
}
