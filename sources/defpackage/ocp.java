package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ocp extends ffhv implements ffjm {
    /* synthetic */ Object a;

    public ocp(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ocp) c((ffes) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(((ffes) this.a) != null);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ocp ocpVar = new ocp(ffguVar);
        ocpVar.a = obj;
        return ocpVar;
    }
}
