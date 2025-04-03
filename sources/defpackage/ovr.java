package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ovr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ otb b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ ffji e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovr(otb otbVar, boolean z, boolean z2, ffji ffjiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = otbVar;
        this.c = z;
        this.d = z2;
        this.e = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ovr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        otb otbVar = this.b;
        ovq ovqVar = new ovq(this.d, this.c, otbVar, null, this.e);
        this.a = 1;
        Object w = otbVar.w(ovqVar, this);
        return w == ffhhVar ? ffhhVar : w;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ovr(this.b, this.c, this.d, this.e, ffguVar);
    }
}
