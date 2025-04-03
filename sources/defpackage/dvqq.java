package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvqq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dvqr b;
    final /* synthetic */ dvdp c;
    final /* synthetic */ dvqt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvqq(dvqr dvqrVar, dvdp dvdpVar, dvqt dvqtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dvqrVar;
        this.c = dvdpVar;
        this.d = dvqtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvqq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dvqr dvqrVar = this.b;
            dvdp dvdpVar = this.c;
            dvqt dvqtVar = this.d;
            this.a = 1;
            if (dvqrVar.a.b(dvdpVar, dvqtVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dvqq(this.b, this.c, this.d, ffguVar);
    }
}
