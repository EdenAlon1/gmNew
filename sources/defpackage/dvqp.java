package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvqp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dvqr b;
    final /* synthetic */ dvdp c;
    final /* synthetic */ evvt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvqp(dvqr dvqrVar, dvdp dvdpVar, evvt evvtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dvqrVar;
        this.c = dvdpVar;
        this.d = evvtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvqp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dvqr dvqrVar = this.b;
            dvdp dvdpVar = this.c;
            evvt evvtVar = this.d;
            this.a = 1;
            if (dvqrVar.a.a(dvdpVar, evvtVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dvqp(this.b, this.c, this.d, ffguVar);
    }
}
