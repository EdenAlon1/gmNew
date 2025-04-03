package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class haj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ gvi b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public haj(gvi gviVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = gviVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((haj) c((ild) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            hai haiVar = new hai((ild) this.c, this.b, null);
            this.a = 1;
            if (ffsl.a(haiVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        haj hajVar = new haj(this.b, ffguVar);
        hajVar.c = obj;
        return hajVar;
    }
}
