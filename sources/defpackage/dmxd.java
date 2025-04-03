package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmxd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eylk b;
    final /* synthetic */ hho c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmxd(eylk eylkVar, hho hhoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eylkVar;
        this.c = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmxd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            long j = this.b.f;
            this.a = 1;
            if (ffsw.c(j, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.c.b(true);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dmxd(this.b, this.c, ffguVar);
    }
}
