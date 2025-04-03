package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spn extends ffhv implements ffjm {
    private /* synthetic */ Object a;

    public spn(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((spn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bcex a = bcfa.a();
        a.z("getMetadataInternal");
        return ((bcen) a.b().o()).cT();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        spn spnVar = new spn(ffguVar);
        spnVar.a = obj;
        return spnVar;
    }
}
