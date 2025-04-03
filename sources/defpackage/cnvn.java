package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnvn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cnvp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnvn(cnvp cnvpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cnvpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnvn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cnvp cnvpVar = this.b;
        this.a = 1;
        Object j = cnvpVar.j(this);
        return j == ffhhVar ? ffhhVar : j;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cnvn(this.b, ffguVar);
    }
}
