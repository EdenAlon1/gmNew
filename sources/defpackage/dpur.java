package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpur extends ffhv implements ffjm {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ hho c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpur(boolean z, hho hhoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = z;
        this.c = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpur) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            if (!this.b) {
                dput.b(this.c, false);
            }
            if (this.b && !dput.c(this.c)) {
                dput.b(this.c, true);
                this.a = 1;
                if (ffsw.c(2750L, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
            return ffcu.a;
        }
        dput.b(this.c, false);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpur(this.b, this.c, ffguVar);
    }
}
