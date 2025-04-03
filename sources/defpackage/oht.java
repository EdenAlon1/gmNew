package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oht extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffwm b;
    final /* synthetic */ oia c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oht(ffwm ffwmVar, oia oiaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffwmVar;
        this.c = oiaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oht) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.d;
            ffxr ffxrVar = new ffxr(this.b);
            ohs ohsVar = new ohs(this.c, ffskVar);
            this.a = 1;
            if (ffxrVar.a(ohsVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        oht ohtVar = new oht(this.b, this.c, ffguVar);
        ohtVar.d = obj;
        return ohtVar;
    }
}
