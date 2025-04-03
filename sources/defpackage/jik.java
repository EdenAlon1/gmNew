package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jik extends ffhv implements ffjm {
    int a;
    final /* synthetic */ jip b;
    final /* synthetic */ Runnable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jik(jip jipVar, Runnable runnable, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = jipVar;
        this.c = runnable;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jik) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            jip jipVar = this.b;
            this.a = 1;
            if (jipVar.b.c(0.0f, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.b.c.a(false);
        this.c.run();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new jik(this.b, this.c, ffguVar);
    }
}
