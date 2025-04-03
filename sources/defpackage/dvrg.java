package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvrg extends ffhv implements ffjm {
    final /* synthetic */ evvt a;
    final /* synthetic */ dvri b;
    final /* synthetic */ dvdp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvrg(evvt evvtVar, dvri dvriVar, dvdp dvdpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = evvtVar;
        this.b = dvriVar;
        this.c = dvdpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvrg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        evvt evvtVar = this.a;
        if (evvtVar != null) {
            dvri dvriVar = this.b;
            dvriVar.i.c(this.c, evvtVar);
        }
        this.b.d(this.c);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dvrg(this.a, this.b, this.c, ffguVar);
    }
}
