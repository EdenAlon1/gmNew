package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bame extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bamw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bame(bamw bamwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bamwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bame) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        bamw bamwVar = this.b;
        this.a = 1;
        Object e = bamwVar.e(this);
        return e == ffhhVar ? ffhhVar : e;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bame(this.b, ffguVar);
    }
}
