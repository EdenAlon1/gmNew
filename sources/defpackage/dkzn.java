package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkzn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dkzo b;
    final /* synthetic */ String c = "";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkzn(dkzo dkzoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dkzoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dkzn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dkzo dkzoVar = this.b;
            String str = this.c;
            this.a = 1;
            obj = dkzoVar.a(str, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        dkzs dkzsVar = (dkzs) obj;
        dkzsVar.getClass();
        return new dkzr(dkzsVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dkzn(this.b, ffguVar);
    }
}
