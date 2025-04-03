package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fzl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ hho b;
    final /* synthetic */ ffji c;
    final /* synthetic */ hzi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzl(hho hhoVar, ffji ffjiVar, hzi hziVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = hhoVar;
        this.c = ffjiVar;
        this.d = hziVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fzl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            if (((CharSequence) this.b.a()).length() > 0) {
                this.c.invoke(null);
            }
            if (this.d != null) {
                this.a = 1;
                if (ffsw.c(300L, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
            return ffcu.a;
        }
        this.d.b();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fzl(this.b, this.c, this.d, ffguVar);
    }
}
