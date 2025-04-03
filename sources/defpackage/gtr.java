package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gtr extends ffhv implements ffjm {
    final /* synthetic */ gul a;
    final /* synthetic */ int b;
    final /* synthetic */ hzi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtr(gul gulVar, int i, hzi hziVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = gulVar;
        this.b = i;
        this.c = hziVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gtr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (guk.b(this.a.f(), this.b)) {
            this.c.b();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new gtr(this.a, this.b, this.c, ffguVar);
    }
}
