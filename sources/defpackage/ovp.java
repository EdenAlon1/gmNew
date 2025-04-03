package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ovp extends ffhv implements ffjm {
    final /* synthetic */ ffji a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovp(ffgu ffguVar, ffji ffjiVar) {
        super(2, ffguVar);
        this.a = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ovp) c((ovc) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ovc ovcVar = (ovc) this.b;
        ovcVar.getClass();
        return this.a.invoke(ovcVar.d());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ovp ovpVar = new ovp(ffguVar, this.a);
        ovpVar.b = obj;
        return ovpVar;
    }
}
