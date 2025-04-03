package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvry extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dvrz b;
    final /* synthetic */ dvdp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvry(dvrz dvrzVar, dvdp dvdpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dvrzVar;
        this.c = dvdpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvry) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dvrz dvrzVar = this.b;
            dvdp dvdpVar = this.c;
            dvqt dvqtVar = dvqt.FAILED_UNSUPPORTED_UI;
            this.a = 1;
            if (dvrzVar.a.b(dvdpVar, dvqtVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dvry(this.b, this.c, ffguVar);
    }
}
