package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dour extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dovc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dour(dovc dovcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dovcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dour) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dovc dovcVar = this.b;
            this.a = 1;
            if (dovcVar.p(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dour(this.b, ffguVar);
    }
}
