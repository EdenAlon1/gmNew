package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnux extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cnvb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnux(cnvb cnvbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cnvbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnux) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cnvb cnvbVar = this.b;
            this.a = 1;
            if (cnvbVar.b(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cnux(this.b, ffguVar);
    }
}
