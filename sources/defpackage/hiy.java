package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hiy extends ffhv implements ffjm {
    /* synthetic */ Object a;

    public hiy(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hiy) c((hiu) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(((hiu) this.a) == hiu.a);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        hiy hiyVar = new hiy(ffguVar);
        hiyVar.a = obj;
        return hiyVar;
    }
}
