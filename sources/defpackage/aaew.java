package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaew extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aaex b;
    final /* synthetic */ alxr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaew(aaex aaexVar, alxr alxrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aaexVar;
        this.c = alxrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aaew) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl C = this.b.d.C(this.c.b());
            C.getClass();
            this.a = 1;
            if (fgfz.c(C, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aaew(this.b, this.c, ffguVar);
    }
}
