package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvrw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dvrx b;
    final /* synthetic */ dvdp c;
    final /* synthetic */ dvqt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvrw(dvrx dvrxVar, dvdp dvdpVar, dvqt dvqtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dvrxVar;
        this.c = dvdpVar;
        this.d = dvqtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvrw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dvrx dvrxVar = this.b;
            dvdp dvdpVar = this.c;
            dvqt dvqtVar = this.d;
            this.a = 1;
            if (dvrxVar.a.b(dvdpVar, dvqtVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dvrw(this.b, this.c, this.d, ffguVar);
    }
}
