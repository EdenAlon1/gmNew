package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drar extends ffhv implements ffjm {
    /* synthetic */ Object a;

    public drar(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drar) c((String) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return new drap((String) this.a);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        drar drarVar = new drar(ffguVar);
        drarVar.a = obj;
        return drarVar;
    }
}
