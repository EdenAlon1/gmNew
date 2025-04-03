package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaev extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aaex b;
    final /* synthetic */ alxr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaev(aaex aaexVar, alxr alxrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aaexVar;
        this.c = alxrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aaev) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl D = this.b.d.D(this.c.b());
            D.getClass();
            this.a = 1;
            if (fgfz.c(D, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aaev(this.b, this.c, ffguVar);
    }
}
