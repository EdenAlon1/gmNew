package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djyq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ djyt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djyq(djyt djytVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = djytVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djyq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            djyt djytVar = this.b;
            this.a = 1;
            Object a = ffra.a(ekxi.a(djytVar.i), new djyp(null, djytVar), this);
            if (a != ffhh.a) {
                a = ffcu.a;
            }
            if (a == obj2) {
                return obj2;
            }
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new djyq(this.b, ffguVar);
    }
}
