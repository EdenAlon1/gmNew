package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmqc extends ffhv implements ffjm {
    private /* synthetic */ Object a;

    public dmqc(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmqc) c((hij) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((hij) this.a).b(true);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dmqc dmqcVar = new dmqc(ffguVar);
        dmqcVar.a = obj;
        return dmqcVar;
    }
}
